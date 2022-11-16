package controllers


import com.mongodb.client.model.Aggregates.{limit, skip, sort}
import model.Helpers.GenericObservable
import org.mongodb.scala.bson.ObjectId
import org.mongodb.scala.model.Filters
import org.mongodb.scala.model.Filters.{and, equal}
import org.mongodb.scala.model.Indexes.ascending
import org.mongodb.scala.model.Updates.{combine, set}
import org.mongodb.scala.{Document, MongoClient, MongoCollection, MongoDatabase}
import play.api.libs.json.Format.GenericFormat
import play.api.libs.json.OFormat.oFormatFromReadsAndOWrites
import play.api.libs.json.{JsValue, Json, Writes}
import play.api.mvc.{AbstractController, Action, AnyContent, ControllerComponents, MessagesRequest, Request}

import javax.inject.{Inject, Singleton}
import scala.collection.Map
import scala.collection.mutable.ArrayBuffer
import scala.collection.mutable.{ArrayBuffer, ListBuffer}

case class AdmissionStudent(_id : Option[Map[String,String]], aadhar: Option[String], name :Option[Map[String,String]], branch: Option[String], year: Option[String])
case class ExamStudent(_id : Option[Map[String,String]], prn: Option[String], name: Option[Map[String,String]], branch: Option[String])
case class StudentBasic(_id : Option[Map[String,String]], aadhar: Option[Map[String, String]], name: Option[Map[String,String]], studentDOB: Option[Map[String,String]])
case class StudentInstitute(_id : Option[Map[String,String]],studentName: Option[Map[String, String]], studentId: Option[String], prevInstituteCode: Option[Map[String, String]],currInstituteCode: Option[Map[String, String]])

@Singleton
class Application @Inject()(cc:ControllerComponents) extends AbstractController (cc) {

  def login=Action{ implicit request=>

    Ok(views.html.login1())
  }


  def index1()=Action{
    Ok(views.html.index1())
  }

  def viewbutton()=Action{
    Ok(views.html.viewbutton())
  }

  def index() = Action { implicit request: Request[AnyContent] =>
    var demo:Predef.Map[String, Any]=Map(" "->" ").toMap
    //var demo1:Predef.Map[Int, Any]=Map(" "->" ").toMap
    demo = demo.empty
    val n:String=null
    val m:Int=0
    //demo1=demo1.empty
    Ok(views.html.index(demo,demo,m,demo,n,m,n))
  }

  def cancel()=Action{
//    var demo:Predef.Map[String, Any]=Map(" "->" ").toMap
//    //var demo1:Predef.Map[Int, Any]=Map(" "->" ").toMap
//    demo = demo.empty
//    val n:String=null
//    val m:Int=0
    //demo1=demo1.empty
    Ok(views.html.viewbutton())
   // Ok(views.html.index(id,name,prn,prev_exam,branch,mobileno,emailid))
    //Ok(views.html.index())
  }


  def getExamCollection() ={
    val uri: String = "mongodb://localhost:27017"
    val mongoClient = MongoClient(uri)
    val db: MongoDatabase = mongoClient.getDatabase("studentInfo")
    println("Connection created successfully...")
    val collection: MongoCollection[Document] = db.getCollection("studentExamDetails")
    collection
  }

  def examStudentList(examCurrentPage:Int) = Action{
    val resultsPerPage = 10
    val offset: Int = examCurrentPage * resultsPerPage

    val collection = getExamCollection()

    val data = collection.aggregate(List(skip(offset), limit(resultsPerPage))).results()

    var jsonMap = data.map( d => {
      org.json4s.jackson.JsonMethods.parse(d.toJson()).values.asInstanceOf[Map[String,Any]]
    })

    var students = new ArrayBuffer[ExamStudent]()

    jsonMap.foreach(stu => {
      students.append((ExamStudent(
        stu.get("_id").asInstanceOf[Option[Map[String,String]]],
        stu.get("prn").asInstanceOf[Option[String]],
        stu.get("name").asInstanceOf[Option[Map[String,String]]],
        stu.get("branch").asInstanceOf[Option[String]]
      )))
    })
    val totalItems = collection.countDocuments().results()

    Ok(views.html.examList(Paginator(students.toSeq, examCurrentPage, offset, totalItems(0).toInt)))

  }

  def examSearch() = Action{ implicit request =>
    val search_text = request.getQueryString("q").get

    val collection = getExamCollection()

    val data = collection.find(Filters.text(search_text)).results()
    //    val data = collection.find(equal("aadhar_card_no", search_text)).results()

    val jsonMap = data.map(d => {
      org.json4s.jackson.JsonMethods.parse(d.toJson()).values.asInstanceOf[Map[String, Any]]
    })

    val students = new ArrayBuffer[ExamStudent]()

    jsonMap.foreach(stu => {
      students.append((ExamStudent(
        stu.get("_id").asInstanceOf[Option[Map[String, String]]],
        stu.get("prn").asInstanceOf[Option[String]],
        stu.get("name").asInstanceOf[Option[Map[String, String]]],
        stu.get("branch").asInstanceOf[Option[String]]
//        stu.get("admission_year").asInstanceOf[Option[String]]
      )))
    })

    // create json response
    implicit val studentWrite = new Writes[ExamStudent] {
      def writes(s: ExamStudent): JsValue = {
        Json.obj("id" -> s._id,
          "prn" -> s.prn.toString,
          "name" -> s.name,
          "branch" -> s.branch)
//          "year" -> s.year.toString) // Bug: removing toString causes classCastException
      }
    }

    Ok(Json.toJson(students))
  }



//  View

def view(p:Int)=Action{
  val uri: String = "mongodb://localhost:27017"
  //   //    System.setProperty("org.mongodb.async.type", "netty")
  val mongoClient = MongoClient(uri)
  val db: MongoDatabase = mongoClient.getDatabase("student")

  val collection: MongoCollection[Document] = db.getCollection("studentExamDetails")
  val ch = collection.find(equal("prn",p)).headResult().toJson()
  val jsonMap =org.json4s.jackson.JsonMethods.parse(ch).values.asInstanceOf[Map[String,Any]]

  val id=jsonMap("_id").asInstanceOf[Map[String,String]].toMap
  val name=jsonMap("name").asInstanceOf[Map[String,String]].toMap
  val prn=jsonMap("prn").toString.toInt
  val branch=jsonMap("branch").toString
  val mobileno=jsonMap("mobileno").toString.toInt
  val emailid=jsonMap("emailid").toString
  val prev_exam=jsonMap("prev_exam").asInstanceOf[Map[String,String]].toMap

 // val stud_parents=jsonMap("student_parents_details").asInstanceOf[Map[String,String]].toMap
  //val mobileno=jsonMap("mobileno").asInstanceOf[Map[Int,Int]]
 //val emailid=jsonMap("emailid").asInstanceOf[Map[String,String]].toMap
 // val emailid="abc@gmail.com"
 // val branch1
  //println(branch1)
  //println(emailid)
  println(jsonMap)
  Ok(views.html.index(id,name,prn,prev_exam,branch,mobileno,emailid))

}


  //Delete


def deleterecord(prn:String)=Action{


    val uri: String = "mongodb://localhost:27017"

    val mongoClient= MongoClient(uri)
    val db: MongoDatabase = mongoClient.getDatabase("student")

    println("Connection created successfully...")
    val collection: MongoCollection[Document] =db.getCollection("studentExamDetails")
  val ch = collection.countDocuments(equal("prn",prn)).headResult()

  if(ch==1)
    {
      collection.deleteOne(equal("prn",prn)).printHeadResult("Delete Result: ")
    Ok("Done with Deletion...")
  }
  else{
    Ok("Incorrect")
  }
}

//CheckLogin

  def loginConnection()={
    val uri: String = "mongodb://localhost:27017"
    val mongoClient = MongoClient(uri)
    val db: MongoDatabase = mongoClient.getDatabase("studentInfo")
    println("login connection created successfully")
    val collection: MongoCollection[Document] = db.getCollection("login")
    collection
  }

  def validatelogin(username:String, password:String)=Action{ implicit request=>

    val ch = loginConnection().countDocuments(and(equal("userName", username), equal("password", password))).headResult()

    if(ch == 1) {

      Redirect(routes.Application.index1()).withSession("username" -> username)
    }
    else{
      Redirect(routes.Application.login).flashing("error"->"Invalid username/password")
    }
  }

  //Logout

  def logout=Action{
    Redirect(routes.Application.login).withNewSession
  }
  //  def logout = authenticatedUserAction { implicit request: Request[AnyContent] =>
  //    // docs: “withNewSession ‘discards the whole (old) session’”
  //    Redirect(routes.UserController.showLoginForm)
  //      .flashing("info" -> "You are logged out.")
  //      .withNewSession
  //  }



//val name1=jsonMap("name")

  var p: Int=0

  //Insert details

  def getValues(firstname:String ,middlename:String,lastname:String,prn:Int,branch:String,
                acad_year:Int,result:String,score:Int,mobileno:Long,emailid:String) =Action{


    val uri: String = "mongodb://localhost:27017"
    //   //    System.setProperty("org.mongodb.async.type", "netty")
    val mongoClient = MongoClient(uri)
    val db: MongoDatabase = mongoClient.getDatabase("student")


    println("Connection created successfully...")
    println(branch)
    val collection: MongoCollection[Document] = db.getCollection("studentExamDetails");

    val details = Document("firstname" -> firstname, "middlename" -> middlename, "lastname" -> lastname)
    //val branch1=Document("branch"->branch)
    val prev_year=Document("acad_year"->acad_year,"result"->result,"score"->score)
   // val prev_year=Document("acad_year"->acad_year, "result"->result, "score"->score)
    val student_details=Document("name"->details,"prn"->prn,"branch"->branch,"prev_exam"->prev_year
    ,"mobileno"->mobileno,"emailid"->emailid)//"prev_exam"->prev_year


    if(prn>0){
      collection.updateOne(equal("prn", p), combine(set("name", details), set("prn",prn),
        set("branch",branch),set("prev_exam",prev_year),set("mobileno",mobileno),set("emailid",emailid))).printResults()
    }
    else
   // if("_id" != null)
    //code to update
    //else
    //insert
    {

      var str = collection.insertOne(student_details).results()
    }


   Ok(s"Its done $firstname")

    //OR
    // Ok(views.html.next_html_page())

  }

  //Update

  def updatevalues(prn:Int)=Action{ implicit request=>
    val uri: String = "mongodb://localhost:27017"
    //   //    System.setProperty("org.mongodb.async.type", "netty")
    val mongoClient = MongoClient(uri)
    val db: MongoDatabase = mongoClient.getDatabase("student")


    println("Connection created successfully...")

    val collection: MongoCollection[Document] = db.getCollection("studentExamDetails")

    // var demo:Int = collection.find({"prn" : {$exists: true}
    //    collection.updateOne(equal("prn", p)),
    //      combine(set("stars", 1), set("contact.phone", "228-555-9999"), currentDate("lastModified")))           .printResults()
    //    val r=collection.find(equal("details.prn",p))

    //collection.updateOne(equal("prn",p)),combine(set("details.name","divyesh"),set("details.age",32))
    //collection.updateOne(equal("prn",434),set("name","divyesh"))
    // r.printResults()
    // Ok(s"$p")
    println(".....................................................................")
    //    var j=collection.find(equal("prn",p)).printResults()
    //    var i = j.toString
    println(".....................................................................")
    val ch = collection.countDocuments(equal("prn", prn)).headResult()
    if(ch==1) {
   var demo:Predef.Map[String, Any]=Map(" "->" ").toMap
//     // var demo1:Predef.Map[Int ,Any]=Map(" "->" ").toMap
//      //var demo1:Predef.Map[Int, Any]=Map(" "->" ").toMap
//      demo = demo.empty
//     // demo1=demo1.empty
//      Ok(views.html.finalUpdate(demo,demo,demo))


      demo = demo.empty
      val n:String=null
      val m:Int=0
      //demo1=demo1.empty
      Ok(views.html.index(demo,demo,m,demo,n,m,n))

    }else{
      //JOptionPane.showMessageDialog(null,"Error")
      Redirect(routes.Application.updatepage())
        .flashing("error"->"Check PRN")
   // Ok("INVALID PRN! KINDLY REVERT BACK AND ENTER THE CORRECT ONE")
    }


  }
  def updatepage()=Action{ implicit request=>
    Ok(views.html.update())
  }
//
//

  def finalUpdate(firstname:String ,middlename:String,lastname:String,prn:Int,branch:String,
                  acad_year:Int,result:String,score:Int,mobileno:Long,emailid:String) =Action{
    val uri: String = "mongodb://localhost:27017"
    //   //    System.setProperty("org.mongodb.async.type", "netty")
    val mongoClient = MongoClient(uri)
    val db: MongoDatabase = mongoClient.getDatabase("student")


    println("Connection created successfully...")

    val collection: MongoCollection[Document] = db.getCollection("studentExamDetails")

    // collection.updateOne({"prn"->prn},{$set: {"name"->}})
    //    if(collection.find(exists("p",true)))
    //      {
    //
    //      }

    //    collection.updateOne(equal("prn", p), combine(set("name", name), set("age", age)))
    //collection.find({"prn":p})



    //    if(t.eq(true)) {
    //      collection.updateOne(equal("prn", p), combine(set("name", name), set("age", age))).printResults()
    //    }
    //    else{
    //      Ok("sorry")
    //    }
    //}
    // else
    //{
    //    Ok("sorry")
    // }
    //collection.countDocuments()
    //    val j=collection.find(equal("prn",p)).printResults()
    //    print(j)
   val details = Document("firstname" -> firstname, "middlename" -> middlename, "lastname" -> lastname)
    //val branch1=Document("branch"->branch)
    val prev_year=Document("acad_year"->acad_year,"result"->result,"score"->score)
    collection.updateOne(equal("prn", p), combine(set("name", details), set("prn",prn),
      set("branch",branch),set("prev_exam",prev_year),set("mobileno",mobileno),set("emailid",emailid))).printResults()
    Ok("done")
  }







//  *************** Admission Details ***************


  def getAdmissionCollection() = {
    val uri: String = "mongodb://localhost:27017"
    val mongoClient = MongoClient(uri)
    val db: MongoDatabase = mongoClient.getDatabase("studentInfo")
    println("Connection created successfully...")
    val collection: MongoCollection[Document] = db.getCollection("studentAdmissionDetails")
    collection
  }

  def admissionIndex() = Action{ implicit request =>
    var action = request.getQueryString("action")
    var demo: Predef.Map[String, Any] = Map(" " -> " ").toMap
    demo = demo.empty
    var m: String = null
    var n: Int = 0
    var updateView = false
    Ok(views.html.admissionIndex(demo,demo,m,demo,demo,demo,demo,demo,demo,m,m,m,n,demo, updateView))
  }

  def admissionGetValues(stu_firstname:String ,stu_middlename:String,stu_lastname:String,
                         stu_per_l1:String, stu_per_l2:String,stu_per_city:String,stu_per_district:String, stu_per_state:String,stu_per_country:String,stu_per_pin:Int,
                         stu_curr_l1:String,stu_curr_l2:String,stu_curr_city:String,stu_curr_district:String,stu_curr_state:String,stu_curr_country:String,stu_curr_pin:Int,
                         pre_college:String,pre_grade:String,pre_rollNo:Int,pass_year:Int,
                         gua_firstName:String,gua_mid_name:String,gua_last_name:String,gua_mob_no:String,gua_email:String,
                         gua_add_l1:String,gua_add_l2:String,gua_add_city:String,gua_add_district:String,gua_add_state:String,gua_add_country:String,gua_add_pin:Int,
                         branch:String,
                         stu_aadhar_no:String,
                         fee_total:Int,
                         fee_paid:Int,
                         stu_category:String,
                         admission_year:Int,
                         hostel_need:String
                        ) =Action{

    val uri: String = "mongodb://localhost:27017"
    val mongoClient = MongoClient(uri)
    val db: MongoDatabase = mongoClient.getDatabase("studentInfo")
    println("Connection created successfully...")
    val collection: MongoCollection[Document] = db.getCollection("studentAdmissionDetails");

    //name details
    val name :Document = Document("first_name" -> stu_firstname, "middle_name" -> stu_middlename, "last_name" -> stu_lastname)

    //address details
    val perAddress :Document = Document("line1"->stu_per_l1, "line2"->stu_per_l2, "city"->stu_per_city, "district"->stu_per_district, "state"->stu_per_state, "country"->stu_per_country, "pin-code"->stu_per_pin)
    val currAddress :Document = Document("line1"->stu_curr_l1, "line2"->stu_curr_l2, "city"->stu_curr_city, "district"->stu_curr_district,"state"->stu_curr_state, "country"->stu_curr_country, "pin-code"->stu_curr_pin)
    val address :Document = Document("permanent_address"->perAddress, "current_address"->currAddress)

    //education details
    val education :Document = Document("college_name"->pre_college, "grade"->pre_grade, "passing_year"->pass_year, "prev_rollno"->pre_rollNo)

    //guardian details
    val guaName : Document = Document("first_name"->gua_firstName, "middle_name"->gua_mid_name, "last_name"->gua_last_name)
    val guaAddress : Document = Document("line1"->gua_add_l1, "line2"->gua_add_l2, "city"->gua_add_city, "district"->gua_add_district,"state"->gua_add_state, "country"->gua_add_country, "pin-code"->gua_add_pin)
    val local_gua : Document = Document("name"->guaName, "address"->guaAddress, "contactno"->gua_mob_no, "emailid"->gua_email)

    //fee details
    var rem = fee_total-fee_paid;
    val fee :Document = Document("amount"->fee_total, "paid"->fee_paid, "remaining"->rem)

    //combined document
    val student_details=Document("student_name"->name,
      "student_address"->address,
      "previous_edu"->education,
      "local_guardian"->local_gua,
      "fee_currentyear"->fee,
      "branch"->branch,
      "admission_year"->admission_year,
      "aadhar_card_no"->stu_aadhar_no,
      "category"->stu_category,
      "need_of_hostel"->hostel_need
    )
    var str = collection.insertOne(student_details).results()

    Ok(s"Student admission details added successfully!!!")
  }

//  def admissionDelete()=Action{
//    Ok(views.html.admissionDelete())
//  }


  def admissionFinalDelete(student_aadhaar:String) =Action {
    //implicit request =>
    val uri: String = "mongodb://localhost:27017"
    val mongoClient = MongoClient(uri)
    val db: MongoDatabase = mongoClient.getDatabase("studentInfo")
    println("Connection created successfully...")
    val collection: MongoCollection[Document] = db.getCollection("studentAdmissionDetails");

    val ch = collection.countDocuments(equal("aadhar_card_no", student_aadhaar)).headResult()
    //    println(ch)

    if (ch == 1) {
      collection.deleteOne(equal("aadhar_card_no", student_aadhaar)).printHeadResult()
      Ok("Deleted Successfully!")
    }
    else {
      Ok("Enter correct Aadhar card no")
    }
  }

  def admissionView(student_aadhaar: String)=Action{

    val uri: String = "mongodb://localhost:27017"
    val mongoClient = MongoClient(uri)
    val db: MongoDatabase = mongoClient.getDatabase("studentInfo")
    println("Connection created successfully...")
    val collection: MongoCollection[Document] = db.getCollection("studentAdmissionDetails");

    var collection_data =collection.find(equal("aadhar_card_no",student_aadhaar)).headResult().toJson()

    val jsonMap =org.json4s.jackson.JsonMethods.parse(collection_data).values.asInstanceOf[Map[String,Any]]
    println(jsonMap)

    val stu_id =jsonMap("_id").asInstanceOf[Map[String, String]].toMap
    val stu_name = jsonMap("student_name").asInstanceOf[Map[String, String]].toMap
    val stu_address = jsonMap("student_address").asInstanceOf[Map[String, String]].toMap
    val stu_per_address = stu_address("permanent_address").asInstanceOf[Map[String,String]].toMap
    val stu_curr_address = stu_address("current_address").asInstanceOf[Map[String,String]].toMap

    val stu_preEdu = jsonMap("previous_edu").asInstanceOf[Map[String, String]].toMap

    val stu_local = jsonMap("local_guardian").asInstanceOf[Map[String, String]].toMap
    val stu_local_name = stu_local("name").asInstanceOf[Map[String, String]].toMap
    val stu_local_address = stu_local("address").asInstanceOf[Map[String, String]].toMap

    val stu_branch = jsonMap("branch").toString
    val stu_fee = jsonMap("fee_currentyear").asInstanceOf[Map[String, String]].toMap
    val stu_category = jsonMap("category").toString
    val stu_hostel = jsonMap("need_of_hostel").toString
    val stu_year = jsonMap("admission_year").toString.toInt
    val stu_aadhar = jsonMap("aadhar_card_no").toString

    var updateView = true

    Ok(views.html.admissionIndex(stu_id,stu_name,stu_aadhar,stu_per_address,stu_curr_address,stu_preEdu,stu_local_name,stu_local_address,stu_local,stu_branch,stu_category,stu_hostel,stu_year,stu_fee, updateView))

  }

  def admissionUpdate(stu_firstname:String ,stu_middlename:String,stu_lastname:String,
                      stu_per_l1:String, stu_per_l2:String,stu_per_city:String,stu_per_district:String, stu_per_state:String,stu_per_country:String,stu_per_pin:Int,
                      stu_curr_l1:String,stu_curr_l2:String,stu_curr_city:String,stu_curr_district:String,stu_curr_state:String,stu_curr_country:String,stu_curr_pin:Int,
                      pre_college:String,pre_grade:String,pre_rollNo:Int,pass_year:Int,
                      gua_firstName:String,gua_mid_name:String,gua_last_name:String,gua_mob_no:String,gua_email:String,
                      gua_add_l1:String,gua_add_l2:String,gua_add_city:String,gua_add_district:String,gua_add_state:String,gua_add_country:String,gua_add_pin:Int,
                      branch:String,
                      //stu_aadhar_no:String,
                      fee_total:Int,
                      fee_paid:Int,
                      stu_category:String,
                      admission_year:Int,
                      hostel_need:String,
                      student_id:String
                     ) = Action{


    println("Id: " + student_id)

    println(">>>>> "+ stu_category +"<<<<<<<<<")

    val uri: String = "mongodb://localhost:27017"
    val mongoClient = MongoClient(uri)
    val db: MongoDatabase = mongoClient.getDatabase("studentInfo")
    println("Connection created successfully...")
    val collection: MongoCollection[Document] = db.getCollection("studentAdmissionDetails");

    //name details
    val name :Document = Document("first_name" -> stu_firstname, "middle_name" -> stu_middlename, "last_name" -> stu_lastname)

    //address details
    val perAddress :Document = Document("line1"->stu_per_l1, "line2"->stu_per_l2, "city"->stu_per_city, "district"->stu_per_district, "state"->stu_per_state, "country"->stu_per_country, "pin-code"->stu_per_pin)
    val currAddress :Document = Document("line1"->stu_curr_l1, "line2"->stu_curr_l2, "city"->stu_curr_city, "district"->stu_curr_district,"state"->stu_curr_state, "country"->stu_curr_country, "pin-code"->stu_curr_pin)
    val address :Document = Document("permanent_address"->perAddress, "current_address"->currAddress)

    //education details
    val education :Document = Document("college_name"->pre_college, "grade"->pre_grade, "passing_year"->pass_year, "prev_rollno"->pre_rollNo)

    //guardian details
    val guaName : Document = Document("first_name"->gua_firstName, "middle_name"->gua_mid_name, "last_name"->gua_last_name)
    val guaAddress : Document = Document("line1"->gua_add_l1, "line2"->gua_add_l2, "city"->gua_add_city, "district"->gua_add_district,"state"->gua_add_state, "country"->gua_add_country, "pin-code"->gua_add_pin)
    val local_gua : Document = Document("name"->guaName, "address"->guaAddress, "contactno"->gua_mob_no, "emailid"->gua_email)

    //fee details
    var rem = fee_total-fee_paid;
    val fee :Document = Document("amount"->fee_total, "paid"->fee_paid, "remaining"->rem)

    //combined document
    val student_details=Document("student_name"->name,
      "student_address"->address,
      "previous_edu"->education,
      "local_guardian"->local_gua,
      "fee_currentyear"->fee,
      "branch"->branch,
      "admission_year"->admission_year,
      //"aadhar_card_no"->stu_aadhar_no,
      "category"->stu_category,
      "need_of_hostel"->hostel_need
    )

    collection.updateOne((equal("_id",new ObjectId(student_id))), combine(set("student_name",name),
      set("student_address",address),
      set("previous_edu",education),
      set("local_guardian",local_gua),
      set("fee_currentyear",fee),
      set("branch", branch),
      set("admission_year",admission_year),
      //set("aadhar_card_no",admission_year),
      set("category",stu_category),
      set("need_of_hostel",hostel_need)
    )).printHeadResult("Update Result: ")


    Ok("done")
  }

  def admissionStudentList(currentPage: Int) = Action{
    val resultsPerPage = 10
    val offset: Int = currentPage * resultsPerPage

    val collection = getAdmissionCollection()

    val data = collection.aggregate(List(skip(offset), limit(resultsPerPage), sort(ascending("admission_year")))).results()

    var jsonMap = data.map( d => {
      org.json4s.jackson.JsonMethods.parse(d.toJson()).values.asInstanceOf[Map[String,Any]]
    })

    var students = new ArrayBuffer[AdmissionStudent]()

    jsonMap.foreach(stu => {
      students.append((AdmissionStudent(
        stu.get("_id").asInstanceOf[Option[Map[String,String]]],
        stu.get("aadhar_card_no").asInstanceOf[Option[String]],
        stu.get("student_name").asInstanceOf[Option[Map[String,String]]],
        stu.get("branch").asInstanceOf[Option[String]],
        stu.get("admission_year").asInstanceOf[Option[String]]
      )))
    })
    val totalItems = collection.countDocuments().results()

    Ok(views.html.admissionList(Paginator(students.toSeq, currentPage, offset, totalItems(0).toInt)))
  }

  def admissionSearch() = Action{ implicit request =>
    val search_text = request.getQueryString("q").get

    val collection = getAdmissionCollection()

    val data = collection.find(Filters.text(search_text)).results()
    //    val data = collection.find(equal("aadhar_card_no", search_text)).results()

    val jsonMap = data.map(d => {
      org.json4s.jackson.JsonMethods.parse(d.toJson()).values.asInstanceOf[Map[String, Any]]
    })

    val students = new ArrayBuffer[AdmissionStudent]()

    jsonMap.foreach(stu => {
      students.append((AdmissionStudent(
        stu.get("_id").asInstanceOf[Option[Map[String, String]]],
        stu.get("aadhar_card_no").asInstanceOf[Option[String]],
        stu.get("student_name").asInstanceOf[Option[Map[String, String]]],
        stu.get("branch").asInstanceOf[Option[String]],
        stu.get("admission_year").asInstanceOf[Option[String]]
      )))
    })

    // create json response
    implicit val studentWrite = new Writes[AdmissionStudent] {
      def writes(s: AdmissionStudent): JsValue = {
        Json.obj("id" -> s._id,
          "aadhar" -> s.aadhar,
          "name" -> s.name,
          "branch" -> s.branch,
          "year" -> s.year.toString) // Bug: removing toString causes classCastException
      }
    }

    Ok(Json.toJson(students))
  }





















//  *************** Student Basic Details ***************

  def getStudentCollection() = {
    val uri: String = "mongodb://localhost:27017"
    val mongoClient = MongoClient(uri)
    val db: MongoDatabase = mongoClient.getDatabase("studentInfo")
    println("Connection created successfully...")
    val collection: MongoCollection[Document] = db.getCollection("studentBasicDetails")
    collection
  }

  def studentIndex() = Action {
    var demo:Predef.Map[String, Any]=Map(" "->" ").toMap
    demo = demo.empty
    var updateViewStu = false;
    Ok(views.html.studentIndex(demo,demo,demo,demo,demo,demo,demo,demo,updateViewStu))
  }

  def studentGetValues(student_first_name:String ,student_mid_name:String,student_last_name:String,
                line1:String, line2:String, city:String, district:String, state:String, country:String, pincode:String,
                student_dob:String, student_mob_no:String, student_email:String,
                father_first_name:String, father_mid_name:String, father_last_name:String, father_mob_no:String, father_email:String,
                mother_first_name:String, mother_mob_no:String, mother_email:String,
                student_govt_id:String
               )= Action {


    val uri: String = "mongodb://localhost:27017"
    val mongoClient= MongoClient(uri)
    val db: MongoDatabase = mongoClient.getDatabase("studentInfo")

    println("Connection created successfully...")
    val collection: MongoCollection[Document] =db.getCollection("studentBasicDetails");

    val stud_name:Document=Document("first_name"->student_first_name,"middle_name"->student_mid_name,"last_name"->student_last_name)
    val peramanant_address:Document=Document("line1"->line1,
      "line2"->line2,
      "city"->city,
      "district"->district,
      "state"->state,
      "country"->country,
      "pincode"->pincode
    )
    val stud_address:Document=Document("permanent"->peramanant_address,"corresponding"->peramanant_address)

    val stud_contact_details:Document=Document(
      "student_mob_no"->student_mob_no,
      "student_email_id"->student_email
    )

    val student_DOB:Document=Document("student_DOB"->student_dob)

    val father_details:Document=Document(
      "first_name"->father_first_name,
      "middle_name"->father_mid_name,
      "last_name"->father_last_name,
      "father_mob_no"->father_mob_no,
      "father_email_id"->father_email
    )
    val mother_details:Document=Document(
      "first_name"->mother_first_name,
      "mother_mob_no"->mother_mob_no,
      "mother_email_id"->mother_email
    )

    val stud_parents_details:Document=Document("father"->father_details,"mother"->mother_details)

    val govt_id_details:Document=Document(
      "aadhar_no"->student_govt_id
    )


    val final_stud_details:Document=Document("student_name"->stud_name,
      "student_address"->stud_address,
      "student_contact_details"->stud_contact_details,
      "student_DOB"->student_DOB,
      "student_parents_details"->stud_parents_details,
      "student_govt_id"->govt_id_details
    )
    var str=collection.insertOne(final_stud_details).printHeadResult()

    Ok("Done...")

  }

  def studentRedirectDelete()= Action {
    Ok(views.html.studentDelete())
  }

  def studentValuesDelete(govt_id:String)= Action {

    val uri: String = "mongodb://localhost:27017"
    val mongoClient= MongoClient(uri)
    val db: MongoDatabase = mongoClient.getDatabase("studentInfo")

    println("Connection created successfully...")
    val collection: MongoCollection[Document] =db.getCollection("studentBasicDetails");

    val ch = collection.countDocuments(equal("student_govt_id.aadhar_no", govt_id)).headResult()

    if(ch==1) {
      collection.deleteOne(equal("student_govt_id.aadhar_no",govt_id)).printHeadResult("Delete Result: ")
      Ok("Done with Deletion...")
    } else {
      Ok("check")
    }

  }

  def studentView(govt_id:String)= Action{

    val uri: String = "mongodb://localhost:27017"
    val mongoClient= MongoClient(uri)
    val db: MongoDatabase = mongoClient.getDatabase("studentInfo")
    println("Connection created successfully...")
    val collection: MongoCollection[Document] =db.getCollection("studentBasicDetails");
    //collection.find(equal("student_name.first_name","Dnyanesh")).headResult().toJson()

//    var s=collection.find(equal("student_govt_id.aadhar_no",govt_id)).headResult().toJson()
//
//    val jsonMap =org.json4s.jackson.JsonMethods.parse(s).values.asInstanceOf[Map[String,Any]]
//    println(jsonMap)


    var collection_data =collection.find(equal("student_govt_id.aadhar_no", govt_id)).headResult().toJson()

    val jsonMap =org.json4s.jackson.JsonMethods.parse(collection_data).values.asInstanceOf[Map[String,Any]]
    println(jsonMap)

//    val json: JsValue = Json.parse(s)
//
//    var jsonList:String=""
//    jsonMap.foreach
//    {
//      case (key, value) => jsonList+= (key + " -> " + value)
//    }
//    println("List"+jsonList)
//    val immutableMap = jsonMap.toMap

    val stud_id=jsonMap("_id").asInstanceOf[Map[String,String]].toMap
    val stud_name=jsonMap("student_name").asInstanceOf[Map[String,String]].toMap
    val stud_contact_details=jsonMap("student_contact_details").asInstanceOf[Map[String,String]].toMap
    val stud_DOB=jsonMap("student_DOB").asInstanceOf[Map[String,String]].toMap
    val stud_address=jsonMap("student_address").asInstanceOf[Map[String,String]].toMap
    val stud_per_address=stud_address("permanent").asInstanceOf[Map[String,String]].toMap

    val stud_parents=jsonMap("student_parents_details").asInstanceOf[Map[String,String]].toMap
    val father_details=stud_parents("father").asInstanceOf[Map[String,String]].toMap
    val mother_details=stud_parents("mother").asInstanceOf[Map[String,String]].toMap
    val aadhar_id=jsonMap("student_govt_id").asInstanceOf[Map[String,String]].toMap
    println(stud_per_address)
    //("permanent").asInstanceOf[Map[String,Map[String,Any]]].toMap
    println("Students Name" + stud_name)
    //Ok(views.html.myView(immutableMap))

    var updateViewStu = true

    Ok(views.html.studentIndex(stud_id,stud_name,stud_DOB,stud_contact_details,stud_per_address,father_details,mother_details,aadhar_id,updateViewStu))
  }

  def studentUpdate(student_first_name:String,
                    student_middle_name:String,
                    student_last_name:String,
                    student_id:String
                   )= Action{ //implicit request =>

    println("Id :" + student_id)
    val uri: String = "mongodb://localhost:27017"
    val mongoClient= MongoClient(uri)
    val db: MongoDatabase = mongoClient.getDatabase("studentInfo")

    println("Connection created successfully...")
    val collection: MongoCollection[Document] =db.getCollection("studentBasicDetails");


    collection.updateOne((equal("_id",new ObjectId(student_id))),combine(set("student_name.first_name",student_first_name),set("student_name.middle_name",student_middle_name),set("student_name.last_name",student_last_name))).printHeadResult("Update Result: ")
    Ok("Updated The Values..." )

  }

//  def studentUpdateContact(student_mob:String,
//                    student_email:String,
//                    student_id:String
//                   )= Action{ //implicit request =>
//
//    //val stud_mid_name=request.session.get("up_student_middle_name")
//    //println("Middle :"+stud_mid_name)
//    println("Id :" + student_id)
//    val uri: String = "mongodb://localhost:27017"
//
//    val mongoClient= MongoClient(uri)
//    val db: MongoDatabase = mongoClient.getDatabase("studentInfo")
//
//    println("Connection created successfully...")
//    val collection: MongoCollection[Document] =db.getCollection("studentBasicDetails");
//
//
//
//
//    collection.updateOne((equal("_id",new ObjectId(student_id))),combine(set("student_contact_details.student_mob_no",student_mob),set("student_contact_details.student_email_id",student_email))).printHeadResult("Update Result: ")
//    Ok("Updated The Values..." )
//
//  }

  def studentUpdateData(student_first_name:String,
                     student_middle_name:String,
                     student_last_name:String,
                     line1:String,
                     line2:String,
                     city:String,
                     district:String,
                     state:String,
                     country:String,
                     pincode:String,
                     student_mob:String,
                     student_email:String,
                     student_dob:String,
                     father_first_name:String,
                     father_mid_name:String,
                     father_last_name:String,
                     father_mob_no:String,
                     father_email:String,
                     mother_first_name:String,
                     mother_mob_no:String,
                     mother_email:String,
                     student_govt_id:String,
                     student_id:String) = Action{

    println("Id :" + student_id)
    val uri: String = "mongodb://localhost:27017"

    val mongoClient= MongoClient(uri)
    val db: MongoDatabase = mongoClient.getDatabase("studentInfo")

    println("Connection created successfully...")
    val collection: MongoCollection[Document] =db.getCollection("studentBasicDetails");

    val stud_name:Document=Document("first_name"->student_first_name,
      "middle_name"->student_middle_name,
      "last_name"->student_last_name)





    val peramanant_address:Document=Document("line1"->line1,
      "line2"->line2,
      "city"->city,
      "district"->district,
      "state"->state,
      "country"->country,
      "pincode"->pincode
    )


    val stud_contact_details:Document=Document(
      "student_mob_no"->("+91"+student_mob),
      "student_email_id"->student_email
    )


    val student_DOB:Document=Document("student_DOB"->student_dob)

    val father_details:Document=Document(
      "first_name"->father_first_name,
      "middle_name"->father_mid_name,
      "last_name"->father_last_name,
      "father_mob_no"->("+91"+father_mob_no),
      "father_email_id"->father_email
    )
    val mother_details:Document=Document(
      "first_name"->mother_first_name,
      "mother_mob_no"->("+91"+mother_mob_no),
      "mother_email_id"->mother_email
    )

    val stud_parents_details:Document=Document("father"->father_details,"mother"->mother_details)

    val govt_id_details:Document=Document(
      "aadhar_no"->student_govt_id
    )
    collection.updateOne((equal("_id",new ObjectId(student_id))),combine(set("student_name",stud_name),
      set("student_address.permanent",peramanant_address),
      set("student_contact_details",stud_contact_details),
      set("student_parents_details",stud_parents_details),
      set("student_DOB",student_DOB),
      set("student_govt_id",govt_id_details),
    )).printHeadResult("Update Result: ")


    Ok("Updated the Values...")

  }
  def studentList(currentPage: Int) = Action{
    val resultsPerPage = 10
    val offset: Int = currentPage * resultsPerPage

    val collection = getStudentCollection()

    val data = collection.aggregate(List(skip(offset), limit(resultsPerPage), sort(ascending("student_DOB")))).results()

    var jsonMap = data.map( d => {
      org.json4s.jackson.JsonMethods.parse(d.toJson()).values.asInstanceOf[Map[String,Any]]
    })

    var students = new ArrayBuffer[StudentBasic]()

    jsonMap.foreach(stu => {
      students.append((StudentBasic(
        stu.get("_id").asInstanceOf[Option[Map[String,String]]],
        stu.get("student_govt_id").asInstanceOf[Option[Map[String,String]]],
        stu.get("student_name").asInstanceOf[Option[Map[String,String]]],
        stu.get("student_DOB").asInstanceOf[Option[Map[String,String]]]
      )))
    })
    val totalItems = collection.countDocuments().results()

    Ok(views.html.studentList(Paginator(students.toSeq, currentPage, offset, totalItems(0).toInt)))
  }

  def studentSearch() = Action{ implicit request =>
    val search_text = request.getQueryString("q").get

    val collection = getStudentCollection()

    val data = collection.find(Filters.text(search_text)).results()
    //    val data = collection.find(equal("aadhar_card_no", search_text)).results()

    val jsonMap = data.map(d => {
      org.json4s.jackson.JsonMethods.parse(d.toJson()).values.asInstanceOf[Map[String, Any]]
    })

    val students = new ArrayBuffer[StudentBasic]()

    jsonMap.foreach(stu => {
      students.append((StudentBasic(
        stu.get("_id").asInstanceOf[Option[Map[String, String]]],
        stu.get("student_govt_id").asInstanceOf[Option[Map[String,String]]],
        stu.get("student_name").asInstanceOf[Option[Map[String, String]]],
        stu.get("student_DOB").asInstanceOf[Option[Map[String,String]]]
      )))
    })

    // create json response
    implicit val studentWrite = new Writes[StudentBasic] {
      def writes(s: StudentBasic): JsValue = {
        Json.obj("id" -> s._id,
          "aadhar" -> s.aadhar,
          "name" -> s.name,
          "studentDOB" -> s.studentDOB) // Bug: removing toString causes classCastException
      }
    }

    Ok(Json.toJson(students))
  }















//  *************** Institute Details ***************

  def getInstituteCollection() = {
    val uri: String = "mongodb://localhost:27017"
    val mongoClient = MongoClient(uri)
    val db: MongoDatabase = mongoClient.getDatabase("studentInfo")
    println("Connection created successfully...")
    val collection: MongoCollection[Document] = db.getCollection("studentInstituteDetails")
    collection
  }

  def instituteIndex(): Action[AnyContent] = Action {
    var demo:Predef.Map[String, Any]=Map(" "->" ").toMap
    demo = demo.empty
    var n: Int = 0
    var updateView = false
    Ok(views.html.instituteIndex(demo,demo,n,demo,demo,demo,demo,updateView))

  }

  def instituteGetValues(student_first_name:String,student_mid_name:String,student_last_name:String,stu_registration_id:Int,
                         prev_name: String, prev_code: String, prev_email: String, prev_contact: String, prev_line1: String, prev_line2: String, prev_city: String, prev_district: String, prev_state: String, prev_country: String, prev_pin: String, prev_year: String,
                         current_name: String, current_code: String, current_email: String, current_contact: String, current_line1: String, current_line2: String, current_city: String, current_district: String, current_state: String, current_country: String, current_pin: String
                        ): Action[AnyContent] = Action {
    val uri: String = "mongodb://localhost:27017"
    val mongoClient = MongoClient(uri)
    val database: MongoDatabase = mongoClient.getDatabase("studentInfo")
    val collection: MongoCollection[Document] = database.getCollection("studentInstituteDetails")
    var c=collection.estimatedDocumentCount().headResult().toInt
    println("connected")
    c = c+1
    val stuName: Document = Document("first_name"->student_first_name, "middle_name"-> student_mid_name, "last_name"->student_last_name)
    val stuRegistrationId: Document = Document("stu_registration_id"->stu_registration_id)
    val pin = prev_pin.toInt
    val add: Document = Document("Line 1" -> prev_line1, "Line 2" -> prev_line2, "City" -> prev_city, "District" -> prev_district, "State" -> prev_state, "Country" -> prev_country, "Pin-code" -> pin)
    val prev_doc: Document = Document("Name" -> prev_name, "Unique Code" -> prev_code, "Email ID" -> prev_email, "Contact Number" -> prev_contact, "Address" -> add, "Passing year" -> prev_year)
    val current_pin1 = current_pin.toInt
    val current_add: Document = Document("Line 1" -> current_line1, "Line 2" -> current_line2, "City" -> current_city, "District" -> current_district, "State" -> current_state, "Country" -> current_country, "Pin-code" -> current_pin1)
    val current_doc: Document = Document("Name" -> current_name, "Unique Code" -> current_code, "Email ID" -> current_email, "Contact Number" -> current_contact, "Address" -> current_add)
    val doc: Document = Document("student_name"->stuName,"stu_registration_id"->stuRegistrationId,"Previous Institute Details" -> prev_doc, "Current Institute Details" -> current_doc, "Count" -> c)
    collection.insertOne(doc).results()

    println("inserted....")
    Ok("Done...")
  }


  def instituteUpdate(student_first_name:String,student_mid_name:String,student_last_name:String,stu_registration_id:Int,
                      prev_name: String, prev_code: String, prev_email: String, prev_contact: String, prev_line1: String, prev_line2: String, prev_city: String, prev_district: String, prev_state: String, prev_country: String, prev_pin: String, prev_year: String,
                      current_name: String, current_code: String, current_email: String, current_contact: String, current_line1: String, current_line2: String, current_city: String, current_district: String, current_state: String, current_country: String, current_pin: String, institute_id:String) = Action{
    val uri: String = "mongodb://localhost:27017"
    val mongoClient = MongoClient(uri)
    val database: MongoDatabase = mongoClient.getDatabase("studentInfo")
    val collection: MongoCollection[Document] = database.getCollection("studentInstituteDetails")
    var c=collection.estimatedDocumentCount().headResult().toInt
    println("connected")
    c = c+1
    val stuName: Document = Document("first_name"->student_first_name, "middle_name"-> student_mid_name, "last_name"->student_last_name)
    val stuRegistrationId: Document = Document("stu_registration_id"->stu_registration_id)

    val pin = prev_pin.toInt
    val add: Document = Document("Line 1" -> prev_line1, "Line 2" -> prev_line2, "City" -> prev_city, "District" -> prev_district, "State" -> prev_state, "Country" -> prev_country, "Pin-code" -> pin)
    val prev_doc: Document = Document("Name" -> prev_name, "Unique Code" -> prev_code, "Email ID" -> prev_email, "Contact Number" -> prev_contact, "Address" -> add, "Passing year" -> prev_year)
    val current_pin1 = current_pin.toInt
    val current_add: Document = Document("Line 1" -> current_line1, "Line 2" -> current_line2, "City" -> current_city, "District" -> current_district, "State" -> current_state, "Country" -> current_country, "Pin-code" -> current_pin1)
    val current_doc: Document = Document("Name" -> current_name, "Unique Code" -> current_code, "Email ID" -> current_email, "Contact Number" -> current_contact, "Address" -> current_add)

    collection.updateOne(equal("stu_registration_Id",stuRegistrationId),combine(set("student_name",stuName),set("stu_registration_Id",stuRegistrationId),set("Previous Institute Details",prev_doc),
      set("Current Institute Details",current_doc))).printHeadResult("Update Result: ")


    Ok("Updated the Values...")

  }

  def instituteDelete(stu_registration_id:Int ): Action[AnyContent] = Action {
    val uri: String = "mongodb://localhost:27017"
    val mongoClient = MongoClient(uri)
    val database: MongoDatabase = mongoClient.getDatabase("studentInfo")
    val collection: MongoCollection[Document] = database.getCollection("studentInstituteDetails")
    val ch = collection.countDocuments(equal("stu_registration_Id", stu_registration_id)).headResult()
    //    println(ch)

    if (ch == 1) {
      collection.deleteOne(equal("stu_registration_Id", stu_registration_id)).printHeadResult()
      Ok("Deleted Successfully!")
    }
    else {
      Ok("Enter correct Aadhar card no")
    }
  }
  def instituteView(stu_registration_id:Int): Action[AnyContent] = Action {
    val uri: String = "mongodb://localhost:27017"
    val mongoClient = MongoClient(uri)
    val database: MongoDatabase = mongoClient.getDatabase("studentInfo")
    val collection: MongoCollection[Document] = database.getCollection("studentInstituteDetails")
    println("connected")

    var collection_data =collection.find(equal("stu_registration_Id",stu_registration_id)).headResult().toJson()

    val jsonMap =org.json4s.jackson.JsonMethods.parse(collection_data).values.asInstanceOf[Map[String,Any]]
    println(jsonMap)

    val stud_id=jsonMap("_id").asInstanceOf[Map[String,String]].toMap
    val stu_name = jsonMap("student_name").asInstanceOf[Map[String, String]].toMap
    val stu_id = jsonMap("stu_registration_Id").toString.toInt
    val prev_name = jsonMap("Previous Institute Details").asInstanceOf[Map[String, String]].toMap
    val curr_name = jsonMap("Current Institute Details").asInstanceOf[Map[String, String]].toMap
    val curr_add=curr_name("Address").asInstanceOf[Map[String, String]].toMap
    val prev_add=prev_name("Address").asInstanceOf[Map[String, String]].toMap
    println(curr_add)
    println(stud_id)

    var updateView = true

    Ok(views.html.instituteIndex(stud_id,stu_name,stu_id,prev_name, curr_name, curr_add, prev_add,updateView ))
  }

  def instituteList(currentPage: Int) = Action{
    val resultsPerPage = 10
    val offset: Int = currentPage * resultsPerPage

    val collection = getInstituteCollection()

    val data = collection.aggregate(List(skip(offset), limit(resultsPerPage), sort(ascending("student_DOB")))).results()

    var jsonMap = data.map( d => {
      org.json4s.jackson.JsonMethods.parse(d.toJson()).values.asInstanceOf[Map[String,Any]]
    })

    var students = new ArrayBuffer[StudentInstitute]()

    jsonMap.foreach(stu => {
      students.append((StudentInstitute(
        stu.get("_id").asInstanceOf[Option[Map[String,String]]],
        stu.get("student_name").asInstanceOf[Option[Map[String,String]]],
        stu.get("stu_registration_Id").asInstanceOf[Option[String]],
        stu.get("Previous Institute Details").asInstanceOf[Option[Map[String,String]]],
        stu.get("Current Institute Details").asInstanceOf[Option[Map[String,String]]]
      )))
    })
    val totalItems = collection.countDocuments().results()

    Ok(views.html.instituteList(Paginator(students.toSeq, currentPage, offset, totalItems(0).toInt)))
  }

  def instituteSearch() = Action{ implicit request =>
    val search_text = request.getQueryString("q").get

    val collection = getInstituteCollection()

    val data = collection.find(Filters.text(search_text)).results()
    //    val data = collection.find(equal("aadhar_card_no", search_text)).results()

    val jsonMap = data.map(d => {
      org.json4s.jackson.JsonMethods.parse(d.toJson()).values.asInstanceOf[Map[String, Any]]
    })

    val students = new ArrayBuffer[StudentInstitute]()

    jsonMap.foreach(stu => {
      students.append((StudentInstitute(
        stu.get("_id").asInstanceOf[Option[Map[String,String]]],
        stu.get("student_name").asInstanceOf[Option[Map[String,String]]],
        stu.get("stu_registration_Id").asInstanceOf[Option[String]],
        stu.get("Previous Institute Details").asInstanceOf[Option[Map[String,String]]],
        stu.get("Current Institute Details").asInstanceOf[Option[Map[String,String]]]
      )))
    })

    // create json response
    implicit val studentWrite = new Writes[StudentInstitute] {
      def writes(s: StudentInstitute): JsValue = {
        Json.obj("id" -> s._id,
          "studentName" -> s.studentName, // Bug: removing toString causes classCastException
          "studentId" -> s.studentId,
          "preInstituteCode" -> s.prevInstituteCode,
          "currInstituteCode" -> s.currInstituteCode
        )
      }
    }

    Ok(Json.toJson(students))
  }




}

case class Paginator[A](items: Seq[A], page: Int, offset: Int, total: Int) {
  lazy val prevPage: Option[Int] = Option(page - 1).filter(_ >= 0)
  lazy val nextPage: Option[Int] = Option(page + 1).filter(_ => (offset + items.size) < total)
  lazy val resultPerPage = 10
  lazy val bound = 5
  lazy val lowbound = (page / bound) * bound
  lazy val high = {
    if(offset + items.size < total)
      lowbound + (total / resultPerPage) / bound
    else
      lowbound
  }
}
