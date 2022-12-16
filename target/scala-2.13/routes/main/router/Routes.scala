// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:7
  Application_0: controllers.Application,
  // @LINE:83
  Assets_1: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:7
    Application_0: controllers.Application,
    // @LINE:83
    Assets_1: controllers.Assets
  ) = this(errorHandler, Application_0, Assets_1, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Application_0, Assets_1, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.Application.login"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """index1""", """controllers.Application.index1()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """insertExamStudent""", """controllers.Application.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """viewbutton""", """controllers.Application.viewbutton()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """form""", """controllers.Application.getValues(firstname:String, middlename:String, lastname:String, prn:Int, branch:String, acad_year:Int, result:String, score:Int, mobileno:Int, emailid:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """update""", """controllers.Application.updatepage()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """cancel""", """controllers.Application.cancel()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """update1""", """controllers.Application.getValues(firstname:String, middlename:String, lastname:String, prn:Int, branch:String, acad_year:Int, result:String, score:Int, mobileno:Int, emailid:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateExam""", """controllers.Application.examDetailUpdate(prn:String ?= "", acad_year:String ?= "")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateExam""", """controllers.Application.examDetailUpdate(prn:String, acad_year:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """deleteExamStudent""", """controllers.Application.deleteExamRecord(prn:String, acad_year:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login1""", """controllers.Application.login()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """validate1""", """controllers.Application.validatelogin(username:String, password:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """logout1""", """controllers.Application.logout()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """examList""", """controllers.Application.examStudentList(currentPage:Int ?= 0)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """examList/""" + "$" + """currentPage<[^/]+>""", """controllers.Application.examStudentList(currentPage:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """examSearch""", """controllers.Application.examSearch()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """fetchStudent""", """controllers.Application.fetchStudent()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """fetchExamStudent""", """controllers.Application.fetchExamStudent()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """insertExamDetail""", """controllers.Application.insertExamDetail()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admissionIndex""", """controllers.Application.admissionIndex()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admissionForm""", """controllers.Application.admissionGetValues(stu_firstname:String, stu_middlename:String, stu_lastname:String, stu_per_l1:String, stu_per_l2:String, stu_per_city:String, stu_per_district:String, stu_per_state:String, stu_per_country:String, stu_per_pin:Int, stu_curr_l1:String, stu_curr_l2:String, stu_curr_city:String, stu_curr_district:String, stu_curr_state:String, stu_curr_country:String, stu_curr_pin:Int, pre_college:String, pre_grade:String, pre_rollNo:Int, pass_year:Int, gua_firstName:String, gua_mid_name:String, gua_last_name:String, gua_mob_no:String, gua_email:String, gua_add_l1:String, gua_add_l2:String, gua_add_city:String, gua_add_district:String, gua_add_state:String, gua_add_country:String, gua_add_pin:Int, branch:String, stu_aadhar_no:String, fee_total:Int, fee_paid:Int, stu_category:String, admission_year:Int, hostel_need:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admissionDelete""", """controllers.Application.admissionFinalDelete(student_aadhaar:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admissionFinalDelete""", """controllers.Application.admissionFinalDelete(student_aadhaar:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admissionView""", """controllers.Application.admissionView(student_aadhaar:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admissionUpdateData""", """controllers.Application.admissionUpdate(stu_firstname:String, stu_middlename:String, stu_lastname:String, stu_per_l1:String, stu_per_l2:String, stu_per_city:String, stu_per_district:String, stu_per_state:String, stu_per_country:String, stu_per_pin:Int, stu_curr_l1:String, stu_curr_l2:String, stu_curr_city:String, stu_curr_district:String, stu_curr_state:String, stu_curr_country:String, stu_curr_pin:Int, pre_college:String, pre_grade:String, pre_rollNo:Int, pass_year:Int, gua_firstName:String, gua_mid_name:String, gua_last_name:String, gua_mob_no:String, gua_email:String, gua_add_l1:String, gua_add_l2:String, gua_add_city:String, gua_add_district:String, gua_add_state:String, gua_add_country:String, gua_add_pin:Int, branch:String, fee_total:Int, fee_paid:Int, stu_category:String, admission_year:Int, hostel_need:String, student_id:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admissionList""", """controllers.Application.admissionStudentList(currentPage:Int ?= 0)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admissionList/""" + "$" + """currentPage<[^/]+>""", """controllers.Application.admissionStudentList(currentPage:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admissionSearch""", """controllers.Application.admissionSearch()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """studentIndex""", """controllers.Application.studentIndex()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """studentForm""", """controllers.Application.studentGetValues(student_first_name:String, student_middle_name:String, student_last_name:String, line1:String, line2:String, city:String, district:String, state:String, country:String, pincode:String, student_dob:String, student_mob_no:String, student_email:String, father_first_name:String, father_mid_name:String, father_last_name:String, father_mob_no:String, father_email:String, mother_first_name:String, mother_mid_name:String, mother_last_name:String, mother_mob_no:String, mother_email:String, govt_id:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """studentDeletePage""", """controllers.Application.studentRedirectDelete()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """studentDeleteValues""", """controllers.Application.studentValuesDelete(govt_id:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """studentViewPage""", """controllers.Application.studentView(govt_id:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """studentUpdateFullData""", """controllers.Application.studentUpdateData(student_first_name:String, student_middle_name:String, student_last_name:String, line1:String, line2:String, city:String, district:String, state:String, country:String, pincode:String, student_mob_no:String, student_email:String, student_dob:String, father_first_name:String, father_mid_name:String, father_last_name:String, father_mob_no:String, father_email:String, mother_first_name:String, mother_mid_name:String, mother_last:String, mother_mob_no:String, mother_email:String, govt_id:String, student_id:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """studentList""", """controllers.Application.studentList(currentPage:Int ?= 0)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """studentList/""" + "$" + """currentPage<[^/]+>""", """controllers.Application.studentList(currentPage:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """studentSearch""", """controllers.Application.studentSearch()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """instituteIndex""", """controllers.Application.instituteIndex()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """instituteForm""", """controllers.Application.instituteGetValues(institute_name:String, institute_code:String, institute_email:String, institute_contact:String, institute_line1:String, institute_line2:String, institute_city:String, institute_district:String, institute_state:String, institute_country:String, institute_pin:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """instituteDelete""", """controllers.Application.instituteDelete(institute_code:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """instituteView""", """controllers.Application.instituteView(institute_code:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """instituteUpdate""", """controllers.Application.instituteUpdate(institute_name:String, institute_code:String, institute_email:String, institute_contact:String, institute_line1:String, institute_line2:String, institute_city:String, institute_district:String, institute_state:String, institute_country:String, institute_pin:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """instituteList""", """controllers.Application.instituteList(currentPage:Int ?= 0)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """instituteList/""" + "$" + """currentPage<[^/]+>""", """controllers.Application.instituteList(currentPage:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """instituteSearch""", """controllers.Application.instituteSearch()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:7
  private[this] lazy val controllers_Application_login0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_Application_login0_invoker = createInvoker(
    Application_0.login,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "login",
      Nil,
      "GET",
      this.prefix + """""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_Application_index11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("index1")))
  )
  private[this] lazy val controllers_Application_index11_invoker = createInvoker(
    Application_0.index1(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "index1",
      Nil,
      "GET",
      this.prefix + """index1""",
      """""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_Application_index2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("insertExamStudent")))
  )
  private[this] lazy val controllers_Application_index2_invoker = createInvoker(
    Application_0.index(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "index",
      Nil,
      "GET",
      this.prefix + """insertExamStudent""",
      """""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_Application_viewbutton3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("viewbutton")))
  )
  private[this] lazy val controllers_Application_viewbutton3_invoker = createInvoker(
    Application_0.viewbutton(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "viewbutton",
      Nil,
      "GET",
      this.prefix + """viewbutton""",
      """""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_Application_getValues4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("form")))
  )
  private[this] lazy val controllers_Application_getValues4_invoker = createInvoker(
    Application_0.getValues(fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[Int], fakeValue[String], fakeValue[Int], fakeValue[String], fakeValue[Int], fakeValue[Int], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "getValues",
      Seq(classOf[String], classOf[String], classOf[String], classOf[Int], classOf[String], classOf[Int], classOf[String], classOf[Int], classOf[Int], classOf[String]),
      "GET",
      this.prefix + """form""",
      """""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_Application_updatepage5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("update")))
  )
  private[this] lazy val controllers_Application_updatepage5_invoker = createInvoker(
    Application_0.updatepage(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "updatepage",
      Nil,
      "GET",
      this.prefix + """update""",
      """""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_Application_cancel6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("cancel")))
  )
  private[this] lazy val controllers_Application_cancel6_invoker = createInvoker(
    Application_0.cancel(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "cancel",
      Nil,
      "GET",
      this.prefix + """cancel""",
      """""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_Application_getValues7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("update1")))
  )
  private[this] lazy val controllers_Application_getValues7_invoker = createInvoker(
    Application_0.getValues(fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[Int], fakeValue[String], fakeValue[Int], fakeValue[String], fakeValue[Int], fakeValue[Int], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "getValues",
      Seq(classOf[String], classOf[String], classOf[String], classOf[Int], classOf[String], classOf[Int], classOf[String], classOf[Int], classOf[Int], classOf[String]),
      "GET",
      this.prefix + """update1""",
      """""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_Application_examDetailUpdate8_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateExam")))
  )
  private[this] lazy val controllers_Application_examDetailUpdate8_invoker = createInvoker(
    Application_0.examDetailUpdate(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "examDetailUpdate",
      Seq(classOf[String], classOf[String]),
      "POST",
      this.prefix + """updateExam""",
      """""",
      Seq("""nocsrf""")
    )
  )

  // @LINE:17
  private[this] lazy val controllers_Application_examDetailUpdate9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateExam")))
  )
  private[this] lazy val controllers_Application_examDetailUpdate9_invoker = createInvoker(
    Application_0.examDetailUpdate(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "examDetailUpdate",
      Seq(classOf[String], classOf[String]),
      "GET",
      this.prefix + """updateExam""",
      """""",
      Seq()
    )
  )

  // @LINE:18
  private[this] lazy val controllers_Application_deleteExamRecord10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deleteExamStudent")))
  )
  private[this] lazy val controllers_Application_deleteExamRecord10_invoker = createInvoker(
    Application_0.deleteExamRecord(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "deleteExamRecord",
      Seq(classOf[String], classOf[String]),
      "GET",
      this.prefix + """deleteExamStudent""",
      """""",
      Seq()
    )
  )

  // @LINE:20
  private[this] lazy val controllers_Application_login11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login1")))
  )
  private[this] lazy val controllers_Application_login11_invoker = createInvoker(
    Application_0.login(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "login",
      Nil,
      "GET",
      this.prefix + """login1""",
      """GET /examStudentUpdate                             controllers.Application.examStudentUpdate(id: String)""",
      Seq()
    )
  )

  // @LINE:21
  private[this] lazy val controllers_Application_validatelogin12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("validate1")))
  )
  private[this] lazy val controllers_Application_validatelogin12_invoker = createInvoker(
    Application_0.validatelogin(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "validatelogin",
      Seq(classOf[String], classOf[String]),
      "GET",
      this.prefix + """validate1""",
      """""",
      Seq()
    )
  )

  // @LINE:23
  private[this] lazy val controllers_Application_logout13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout1")))
  )
  private[this] lazy val controllers_Application_logout13_invoker = createInvoker(
    Application_0.logout(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "logout",
      Nil,
      "GET",
      this.prefix + """logout1""",
      """GET /popup                              controllers.Application.popup()""",
      Seq()
    )
  )

  // @LINE:29
  private[this] lazy val controllers_Application_examStudentList14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("examList")))
  )
  private[this] lazy val controllers_Application_examStudentList14_invoker = createInvoker(
    Application_0.examStudentList(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "examStudentList",
      Seq(classOf[Int]),
      "GET",
      this.prefix + """examList""",
      """GET /view                                 controllers.Application.view(prn:Int)
GET  /form                      controllers.Application.updatevalues(firstname)
GET  /                                      controllers.HomeController.main()
GET     /explore                            controllers.HomeController.explore()
GET     /tutorial                           controllers.HomeController.tutorial()""",
      Seq()
    )
  )

  // @LINE:30
  private[this] lazy val controllers_Application_examStudentList15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("examList/"), DynamicPart("currentPage", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Application_examStudentList15_invoker = createInvoker(
    Application_0.examStudentList(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "examStudentList",
      Seq(classOf[Int]),
      "GET",
      this.prefix + """examList/""" + "$" + """currentPage<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:31
  private[this] lazy val controllers_Application_examSearch16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("examSearch")))
  )
  private[this] lazy val controllers_Application_examSearch16_invoker = createInvoker(
    Application_0.examSearch(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "examSearch",
      Nil,
      "GET",
      this.prefix + """examSearch""",
      """""",
      Seq()
    )
  )

  // @LINE:32
  private[this] lazy val controllers_Application_fetchStudent17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("fetchStudent")))
  )
  private[this] lazy val controllers_Application_fetchStudent17_invoker = createInvoker(
    Application_0.fetchStudent(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "fetchStudent",
      Nil,
      "GET",
      this.prefix + """fetchStudent""",
      """""",
      Seq()
    )
  )

  // @LINE:33
  private[this] lazy val controllers_Application_fetchExamStudent18_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("fetchExamStudent")))
  )
  private[this] lazy val controllers_Application_fetchExamStudent18_invoker = createInvoker(
    Application_0.fetchExamStudent(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "fetchExamStudent",
      Nil,
      "GET",
      this.prefix + """fetchExamStudent""",
      """""",
      Seq()
    )
  )

  // @LINE:35
  private[this] lazy val controllers_Application_insertExamDetail19_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("insertExamDetail")))
  )
  private[this] lazy val controllers_Application_insertExamDetail19_invoker = createInvoker(
    Application_0.insertExamDetail(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "insertExamDetail",
      Nil,
      "POST",
      this.prefix + """insertExamDetail""",
      """""",
      Seq("""nocsrf""")
    )
  )

  // @LINE:41
  private[this] lazy val controllers_Application_admissionIndex20_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admissionIndex")))
  )
  private[this] lazy val controllers_Application_admissionIndex20_invoker = createInvoker(
    Application_0.admissionIndex(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "admissionIndex",
      Nil,
      "GET",
      this.prefix + """admissionIndex""",
      """GET     /admissionList                 controllers.Application.admissionStudentList()""",
      Seq()
    )
  )

  // @LINE:42
  private[this] lazy val controllers_Application_admissionGetValues21_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admissionForm")))
  )
  private[this] lazy val controllers_Application_admissionGetValues21_invoker = createInvoker(
    Application_0.admissionGetValues(fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[Int], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[Int], fakeValue[String], fakeValue[String], fakeValue[Int], fakeValue[Int], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[Int], fakeValue[String], fakeValue[String], fakeValue[Int], fakeValue[Int], fakeValue[String], fakeValue[Int], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "admissionGetValues",
      Seq(classOf[String], classOf[String], classOf[String], classOf[String], classOf[String], classOf[String], classOf[String], classOf[String], classOf[String], classOf[Int], classOf[String], classOf[String], classOf[String], classOf[String], classOf[String], classOf[String], classOf[Int], classOf[String], classOf[String], classOf[Int], classOf[Int], classOf[String], classOf[String], classOf[String], classOf[String], classOf[String], classOf[String], classOf[String], classOf[String], classOf[String], classOf[String], classOf[String], classOf[Int], classOf[String], classOf[String], classOf[Int], classOf[Int], classOf[String], classOf[Int], classOf[String]),
      "GET",
      this.prefix + """admissionForm""",
      """""",
      Seq()
    )
  )

  // @LINE:43
  private[this] lazy val controllers_Application_admissionFinalDelete22_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admissionDelete")))
  )
  private[this] lazy val controllers_Application_admissionFinalDelete22_invoker = createInvoker(
    Application_0.admissionFinalDelete(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "admissionFinalDelete",
      Seq(classOf[String]),
      "GET",
      this.prefix + """admissionDelete""",
      """""",
      Seq()
    )
  )

  // @LINE:44
  private[this] lazy val controllers_Application_admissionFinalDelete23_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admissionFinalDelete")))
  )
  private[this] lazy val controllers_Application_admissionFinalDelete23_invoker = createInvoker(
    Application_0.admissionFinalDelete(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "admissionFinalDelete",
      Seq(classOf[String]),
      "GET",
      this.prefix + """admissionFinalDelete""",
      """""",
      Seq()
    )
  )

  // @LINE:45
  private[this] lazy val controllers_Application_admissionView24_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admissionView")))
  )
  private[this] lazy val controllers_Application_admissionView24_invoker = createInvoker(
    Application_0.admissionView(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "admissionView",
      Seq(classOf[String]),
      "GET",
      this.prefix + """admissionView""",
      """""",
      Seq()
    )
  )

  // @LINE:46
  private[this] lazy val controllers_Application_admissionUpdate25_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admissionUpdateData")))
  )
  private[this] lazy val controllers_Application_admissionUpdate25_invoker = createInvoker(
    Application_0.admissionUpdate(fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[Int], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[Int], fakeValue[String], fakeValue[String], fakeValue[Int], fakeValue[Int], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[Int], fakeValue[String], fakeValue[Int], fakeValue[Int], fakeValue[String], fakeValue[Int], fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "admissionUpdate",
      Seq(classOf[String], classOf[String], classOf[String], classOf[String], classOf[String], classOf[String], classOf[String], classOf[String], classOf[String], classOf[Int], classOf[String], classOf[String], classOf[String], classOf[String], classOf[String], classOf[String], classOf[Int], classOf[String], classOf[String], classOf[Int], classOf[Int], classOf[String], classOf[String], classOf[String], classOf[String], classOf[String], classOf[String], classOf[String], classOf[String], classOf[String], classOf[String], classOf[String], classOf[Int], classOf[String], classOf[Int], classOf[Int], classOf[String], classOf[Int], classOf[String], classOf[String]),
      "GET",
      this.prefix + """admissionUpdateData""",
      """""",
      Seq()
    )
  )

  // @LINE:48
  private[this] lazy val controllers_Application_admissionStudentList26_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admissionList")))
  )
  private[this] lazy val controllers_Application_admissionStudentList26_invoker = createInvoker(
    Application_0.admissionStudentList(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "admissionStudentList",
      Seq(classOf[Int]),
      "GET",
      this.prefix + """admissionList""",
      """""",
      Seq()
    )
  )

  // @LINE:49
  private[this] lazy val controllers_Application_admissionStudentList27_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admissionList/"), DynamicPart("currentPage", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Application_admissionStudentList27_invoker = createInvoker(
    Application_0.admissionStudentList(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "admissionStudentList",
      Seq(classOf[Int]),
      "GET",
      this.prefix + """admissionList/""" + "$" + """currentPage<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:50
  private[this] lazy val controllers_Application_admissionSearch28_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admissionSearch")))
  )
  private[this] lazy val controllers_Application_admissionSearch28_invoker = createInvoker(
    Application_0.admissionSearch(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "admissionSearch",
      Nil,
      "GET",
      this.prefix + """admissionSearch""",
      """""",
      Seq()
    )
  )

  // @LINE:56
  private[this] lazy val controllers_Application_studentIndex29_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("studentIndex")))
  )
  private[this] lazy val controllers_Application_studentIndex29_invoker = createInvoker(
    Application_0.studentIndex(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "studentIndex",
      Nil,
      "GET",
      this.prefix + """studentIndex""",
      """""",
      Seq()
    )
  )

  // @LINE:57
  private[this] lazy val controllers_Application_studentGetValues30_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("studentForm")))
  )
  private[this] lazy val controllers_Application_studentGetValues30_invoker = createInvoker(
    Application_0.studentGetValues(fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "studentGetValues",
      Seq(classOf[String], classOf[String], classOf[String], classOf[String], classOf[String], classOf[String], classOf[String], classOf[String], classOf[String], classOf[String], classOf[String], classOf[String], classOf[String], classOf[String], classOf[String], classOf[String], classOf[String], classOf[String], classOf[String], classOf[String], classOf[String], classOf[String], classOf[String], classOf[String]),
      "GET",
      this.prefix + """studentForm""",
      """""",
      Seq()
    )
  )

  // @LINE:58
  private[this] lazy val controllers_Application_studentRedirectDelete31_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("studentDeletePage")))
  )
  private[this] lazy val controllers_Application_studentRedirectDelete31_invoker = createInvoker(
    Application_0.studentRedirectDelete(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "studentRedirectDelete",
      Nil,
      "GET",
      this.prefix + """studentDeletePage""",
      """""",
      Seq()
    )
  )

  // @LINE:59
  private[this] lazy val controllers_Application_studentValuesDelete32_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("studentDeleteValues")))
  )
  private[this] lazy val controllers_Application_studentValuesDelete32_invoker = createInvoker(
    Application_0.studentValuesDelete(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "studentValuesDelete",
      Seq(classOf[String]),
      "GET",
      this.prefix + """studentDeleteValues""",
      """""",
      Seq()
    )
  )

  // @LINE:60
  private[this] lazy val controllers_Application_studentView33_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("studentViewPage")))
  )
  private[this] lazy val controllers_Application_studentView33_invoker = createInvoker(
    Application_0.studentView(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "studentView",
      Seq(classOf[String]),
      "GET",
      this.prefix + """studentViewPage""",
      """""",
      Seq()
    )
  )

  // @LINE:61
  private[this] lazy val controllers_Application_studentUpdateData34_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("studentUpdateFullData")))
  )
  private[this] lazy val controllers_Application_studentUpdateData34_invoker = createInvoker(
    Application_0.studentUpdateData(fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "studentUpdateData",
      Seq(classOf[String], classOf[String], classOf[String], classOf[String], classOf[String], classOf[String], classOf[String], classOf[String], classOf[String], classOf[String], classOf[String], classOf[String], classOf[String], classOf[String], classOf[String], classOf[String], classOf[String], classOf[String], classOf[String], classOf[String], classOf[String], classOf[String], classOf[String], classOf[String], classOf[String]),
      "GET",
      this.prefix + """studentUpdateFullData""",
      """""",
      Seq()
    )
  )

  // @LINE:63
  private[this] lazy val controllers_Application_studentList35_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("studentList")))
  )
  private[this] lazy val controllers_Application_studentList35_invoker = createInvoker(
    Application_0.studentList(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "studentList",
      Seq(classOf[Int]),
      "GET",
      this.prefix + """studentList""",
      """""",
      Seq()
    )
  )

  // @LINE:64
  private[this] lazy val controllers_Application_studentList36_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("studentList/"), DynamicPart("currentPage", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Application_studentList36_invoker = createInvoker(
    Application_0.studentList(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "studentList",
      Seq(classOf[Int]),
      "GET",
      this.prefix + """studentList/""" + "$" + """currentPage<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:65
  private[this] lazy val controllers_Application_studentSearch37_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("studentSearch")))
  )
  private[this] lazy val controllers_Application_studentSearch37_invoker = createInvoker(
    Application_0.studentSearch(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "studentSearch",
      Nil,
      "GET",
      this.prefix + """studentSearch""",
      """""",
      Seq()
    )
  )

  // @LINE:71
  private[this] lazy val controllers_Application_instituteIndex38_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("instituteIndex")))
  )
  private[this] lazy val controllers_Application_instituteIndex38_invoker = createInvoker(
    Application_0.instituteIndex(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "instituteIndex",
      Nil,
      "GET",
      this.prefix + """instituteIndex""",
      """""",
      Seq()
    )
  )

  // @LINE:72
  private[this] lazy val controllers_Application_instituteGetValues39_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("instituteForm")))
  )
  private[this] lazy val controllers_Application_instituteGetValues39_invoker = createInvoker(
    Application_0.instituteGetValues(fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "instituteGetValues",
      Seq(classOf[String], classOf[String], classOf[String], classOf[String], classOf[String], classOf[String], classOf[String], classOf[String], classOf[String], classOf[String], classOf[Int]),
      "GET",
      this.prefix + """instituteForm""",
      """""",
      Seq()
    )
  )

  // @LINE:73
  private[this] lazy val controllers_Application_instituteDelete40_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("instituteDelete")))
  )
  private[this] lazy val controllers_Application_instituteDelete40_invoker = createInvoker(
    Application_0.instituteDelete(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "instituteDelete",
      Seq(classOf[String]),
      "GET",
      this.prefix + """instituteDelete""",
      """""",
      Seq()
    )
  )

  // @LINE:74
  private[this] lazy val controllers_Application_instituteView41_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("instituteView")))
  )
  private[this] lazy val controllers_Application_instituteView41_invoker = createInvoker(
    Application_0.instituteView(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "instituteView",
      Seq(classOf[String]),
      "GET",
      this.prefix + """instituteView""",
      """""",
      Seq()
    )
  )

  // @LINE:75
  private[this] lazy val controllers_Application_instituteUpdate42_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("instituteUpdate")))
  )
  private[this] lazy val controllers_Application_instituteUpdate42_invoker = createInvoker(
    Application_0.instituteUpdate(fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "instituteUpdate",
      Seq(classOf[String], classOf[String], classOf[String], classOf[String], classOf[String], classOf[String], classOf[String], classOf[String], classOf[String], classOf[String], classOf[Int]),
      "GET",
      this.prefix + """instituteUpdate""",
      """""",
      Seq()
    )
  )

  // @LINE:77
  private[this] lazy val controllers_Application_instituteList43_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("instituteList")))
  )
  private[this] lazy val controllers_Application_instituteList43_invoker = createInvoker(
    Application_0.instituteList(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "instituteList",
      Seq(classOf[Int]),
      "GET",
      this.prefix + """instituteList""",
      """""",
      Seq()
    )
  )

  // @LINE:78
  private[this] lazy val controllers_Application_instituteList44_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("instituteList/"), DynamicPart("currentPage", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Application_instituteList44_invoker = createInvoker(
    Application_0.instituteList(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "instituteList",
      Seq(classOf[Int]),
      "GET",
      this.prefix + """instituteList/""" + "$" + """currentPage<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:79
  private[this] lazy val controllers_Application_instituteSearch45_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("instituteSearch")))
  )
  private[this] lazy val controllers_Application_instituteSearch45_invoker = createInvoker(
    Application_0.instituteSearch(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "instituteSearch",
      Nil,
      "GET",
      this.prefix + """instituteSearch""",
      """""",
      Seq()
    )
  )

  // @LINE:83
  private[this] lazy val controllers_Assets_versioned46_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned46_invoker = createInvoker(
    Assets_1.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:7
    case controllers_Application_login0_route(params@_) =>
      call { 
        controllers_Application_login0_invoker.call(Application_0.login)
      }
  
    // @LINE:8
    case controllers_Application_index11_route(params@_) =>
      call { 
        controllers_Application_index11_invoker.call(Application_0.index1())
      }
  
    // @LINE:9
    case controllers_Application_index2_route(params@_) =>
      call { 
        controllers_Application_index2_invoker.call(Application_0.index())
      }
  
    // @LINE:10
    case controllers_Application_viewbutton3_route(params@_) =>
      call { 
        controllers_Application_viewbutton3_invoker.call(Application_0.viewbutton())
      }
  
    // @LINE:11
    case controllers_Application_getValues4_route(params@_) =>
      call(params.fromQuery[String]("firstname", None), params.fromQuery[String]("middlename", None), params.fromQuery[String]("lastname", None), params.fromQuery[Int]("prn", None), params.fromQuery[String]("branch", None), params.fromQuery[Int]("acad_year", None), params.fromQuery[String]("result", None), params.fromQuery[Int]("score", None), params.fromQuery[Int]("mobileno", None), params.fromQuery[String]("emailid", None)) { (firstname, middlename, lastname, prn, branch, acad_year, result, score, mobileno, emailid) =>
        controllers_Application_getValues4_invoker.call(Application_0.getValues(firstname, middlename, lastname, prn, branch, acad_year, result, score, mobileno, emailid))
      }
  
    // @LINE:12
    case controllers_Application_updatepage5_route(params@_) =>
      call { 
        controllers_Application_updatepage5_invoker.call(Application_0.updatepage())
      }
  
    // @LINE:13
    case controllers_Application_cancel6_route(params@_) =>
      call { 
        controllers_Application_cancel6_invoker.call(Application_0.cancel())
      }
  
    // @LINE:14
    case controllers_Application_getValues7_route(params@_) =>
      call(params.fromQuery[String]("firstname", None), params.fromQuery[String]("middlename", None), params.fromQuery[String]("lastname", None), params.fromQuery[Int]("prn", None), params.fromQuery[String]("branch", None), params.fromQuery[Int]("acad_year", None), params.fromQuery[String]("result", None), params.fromQuery[Int]("score", None), params.fromQuery[Int]("mobileno", None), params.fromQuery[String]("emailid", None)) { (firstname, middlename, lastname, prn, branch, acad_year, result, score, mobileno, emailid) =>
        controllers_Application_getValues7_invoker.call(Application_0.getValues(firstname, middlename, lastname, prn, branch, acad_year, result, score, mobileno, emailid))
      }
  
    // @LINE:16
    case controllers_Application_examDetailUpdate8_route(params@_) =>
      call(params.fromQuery[String]("prn", Some("")), params.fromQuery[String]("acad_year", Some(""))) { (prn, acad_year) =>
        controllers_Application_examDetailUpdate8_invoker.call(Application_0.examDetailUpdate(prn, acad_year))
      }
  
    // @LINE:17
    case controllers_Application_examDetailUpdate9_route(params@_) =>
      call(params.fromQuery[String]("prn", None), params.fromQuery[String]("acad_year", None)) { (prn, acad_year) =>
        controllers_Application_examDetailUpdate9_invoker.call(Application_0.examDetailUpdate(prn, acad_year))
      }
  
    // @LINE:18
    case controllers_Application_deleteExamRecord10_route(params@_) =>
      call(params.fromQuery[String]("prn", None), params.fromQuery[String]("acad_year", None)) { (prn, acad_year) =>
        controllers_Application_deleteExamRecord10_invoker.call(Application_0.deleteExamRecord(prn, acad_year))
      }
  
    // @LINE:20
    case controllers_Application_login11_route(params@_) =>
      call { 
        controllers_Application_login11_invoker.call(Application_0.login())
      }
  
    // @LINE:21
    case controllers_Application_validatelogin12_route(params@_) =>
      call(params.fromQuery[String]("username", None), params.fromQuery[String]("password", None)) { (username, password) =>
        controllers_Application_validatelogin12_invoker.call(Application_0.validatelogin(username, password))
      }
  
    // @LINE:23
    case controllers_Application_logout13_route(params@_) =>
      call { 
        controllers_Application_logout13_invoker.call(Application_0.logout())
      }
  
    // @LINE:29
    case controllers_Application_examStudentList14_route(params@_) =>
      call(params.fromQuery[Int]("currentPage", Some(0))) { (currentPage) =>
        controllers_Application_examStudentList14_invoker.call(Application_0.examStudentList(currentPage))
      }
  
    // @LINE:30
    case controllers_Application_examStudentList15_route(params@_) =>
      call(params.fromPath[Int]("currentPage", None)) { (currentPage) =>
        controllers_Application_examStudentList15_invoker.call(Application_0.examStudentList(currentPage))
      }
  
    // @LINE:31
    case controllers_Application_examSearch16_route(params@_) =>
      call { 
        controllers_Application_examSearch16_invoker.call(Application_0.examSearch())
      }
  
    // @LINE:32
    case controllers_Application_fetchStudent17_route(params@_) =>
      call { 
        controllers_Application_fetchStudent17_invoker.call(Application_0.fetchStudent())
      }
  
    // @LINE:33
    case controllers_Application_fetchExamStudent18_route(params@_) =>
      call { 
        controllers_Application_fetchExamStudent18_invoker.call(Application_0.fetchExamStudent())
      }
  
    // @LINE:35
    case controllers_Application_insertExamDetail19_route(params@_) =>
      call { 
        controllers_Application_insertExamDetail19_invoker.call(Application_0.insertExamDetail())
      }
  
    // @LINE:41
    case controllers_Application_admissionIndex20_route(params@_) =>
      call { 
        controllers_Application_admissionIndex20_invoker.call(Application_0.admissionIndex())
      }
  
    // @LINE:42
    case controllers_Application_admissionGetValues21_route(params@_) =>
      call(List(params.fromQuery[String]("stu_firstname", None), params.fromQuery[String]("stu_middlename", None), params.fromQuery[String]("stu_lastname", None), params.fromQuery[String]("stu_per_l1", None), params.fromQuery[String]("stu_per_l2", None), params.fromQuery[String]("stu_per_city", None), params.fromQuery[String]("stu_per_district", None), params.fromQuery[String]("stu_per_state", None), params.fromQuery[String]("stu_per_country", None), params.fromQuery[Int]("stu_per_pin", None), params.fromQuery[String]("stu_curr_l1", None), params.fromQuery[String]("stu_curr_l2", None), params.fromQuery[String]("stu_curr_city", None), params.fromQuery[String]("stu_curr_district", None), params.fromQuery[String]("stu_curr_state", None), params.fromQuery[String]("stu_curr_country", None), params.fromQuery[Int]("stu_curr_pin", None), params.fromQuery[String]("pre_college", None), params.fromQuery[String]("pre_grade", None), params.fromQuery[Int]("pre_rollNo", None), params.fromQuery[Int]("pass_year", None), params.fromQuery[String]("gua_firstName", None), params.fromQuery[String]("gua_mid_name", None), params.fromQuery[String]("gua_last_name", None), params.fromQuery[String]("gua_mob_no", None), params.fromQuery[String]("gua_email", None), params.fromQuery[String]("gua_add_l1", None), params.fromQuery[String]("gua_add_l2", None), params.fromQuery[String]("gua_add_city", None), params.fromQuery[String]("gua_add_district", None), params.fromQuery[String]("gua_add_state", None), params.fromQuery[String]("gua_add_country", None), params.fromQuery[Int]("gua_add_pin", None), params.fromQuery[String]("branch", None), params.fromQuery[String]("stu_aadhar_no", None), params.fromQuery[Int]("fee_total", None), params.fromQuery[Int]("fee_paid", None), params.fromQuery[String]("stu_category", None), params.fromQuery[Int]("admission_year", None), params.fromQuery[String]("hostel_need", None))) { case (stu_firstname: String):: (stu_middlename: String):: (stu_lastname: String):: (stu_per_l1: String):: (stu_per_l2: String):: (stu_per_city: String):: (stu_per_district: String):: (stu_per_state: String):: (stu_per_country: String):: (stu_per_pin: Int):: (stu_curr_l1: String):: (stu_curr_l2: String):: (stu_curr_city: String):: (stu_curr_district: String):: (stu_curr_state: String):: (stu_curr_country: String):: (stu_curr_pin: Int):: (pre_college: String):: (pre_grade: String):: (pre_rollNo: Int):: (pass_year: Int):: (gua_firstName: String):: (gua_mid_name: String):: (gua_last_name: String):: (gua_mob_no: String):: (gua_email: String):: (gua_add_l1: String):: (gua_add_l2: String):: (gua_add_city: String):: (gua_add_district: String):: (gua_add_state: String):: (gua_add_country: String):: (gua_add_pin: Int):: (branch: String):: (stu_aadhar_no: String):: (fee_total: Int):: (fee_paid: Int):: (stu_category: String):: (admission_year: Int):: (hostel_need: String) :: Nil =>
        controllers_Application_admissionGetValues21_invoker.call(Application_0.admissionGetValues(stu_firstname, stu_middlename, stu_lastname, stu_per_l1, stu_per_l2, stu_per_city, stu_per_district, stu_per_state, stu_per_country, stu_per_pin, stu_curr_l1, stu_curr_l2, stu_curr_city, stu_curr_district, stu_curr_state, stu_curr_country, stu_curr_pin, pre_college, pre_grade, pre_rollNo, pass_year, gua_firstName, gua_mid_name, gua_last_name, gua_mob_no, gua_email, gua_add_l1, gua_add_l2, gua_add_city, gua_add_district, gua_add_state, gua_add_country, gua_add_pin, branch, stu_aadhar_no, fee_total, fee_paid, stu_category, admission_year, hostel_need))
      }
  
    // @LINE:43
    case controllers_Application_admissionFinalDelete22_route(params@_) =>
      call(params.fromQuery[String]("student_aadhaar", None)) { (student_aadhaar) =>
        controllers_Application_admissionFinalDelete22_invoker.call(Application_0.admissionFinalDelete(student_aadhaar))
      }
  
    // @LINE:44
    case controllers_Application_admissionFinalDelete23_route(params@_) =>
      call(params.fromQuery[String]("student_aadhaar", None)) { (student_aadhaar) =>
        controllers_Application_admissionFinalDelete23_invoker.call(Application_0.admissionFinalDelete(student_aadhaar))
      }
  
    // @LINE:45
    case controllers_Application_admissionView24_route(params@_) =>
      call(params.fromQuery[String]("student_aadhaar", None)) { (student_aadhaar) =>
        controllers_Application_admissionView24_invoker.call(Application_0.admissionView(student_aadhaar))
      }
  
    // @LINE:46
    case controllers_Application_admissionUpdate25_route(params@_) =>
      call(List(params.fromQuery[String]("stu_firstname", None), params.fromQuery[String]("stu_middlename", None), params.fromQuery[String]("stu_lastname", None), params.fromQuery[String]("stu_per_l1", None), params.fromQuery[String]("stu_per_l2", None), params.fromQuery[String]("stu_per_city", None), params.fromQuery[String]("stu_per_district", None), params.fromQuery[String]("stu_per_state", None), params.fromQuery[String]("stu_per_country", None), params.fromQuery[Int]("stu_per_pin", None), params.fromQuery[String]("stu_curr_l1", None), params.fromQuery[String]("stu_curr_l2", None), params.fromQuery[String]("stu_curr_city", None), params.fromQuery[String]("stu_curr_district", None), params.fromQuery[String]("stu_curr_state", None), params.fromQuery[String]("stu_curr_country", None), params.fromQuery[Int]("stu_curr_pin", None), params.fromQuery[String]("pre_college", None), params.fromQuery[String]("pre_grade", None), params.fromQuery[Int]("pre_rollNo", None), params.fromQuery[Int]("pass_year", None), params.fromQuery[String]("gua_firstName", None), params.fromQuery[String]("gua_mid_name", None), params.fromQuery[String]("gua_last_name", None), params.fromQuery[String]("gua_mob_no", None), params.fromQuery[String]("gua_email", None), params.fromQuery[String]("gua_add_l1", None), params.fromQuery[String]("gua_add_l2", None), params.fromQuery[String]("gua_add_city", None), params.fromQuery[String]("gua_add_district", None), params.fromQuery[String]("gua_add_state", None), params.fromQuery[String]("gua_add_country", None), params.fromQuery[Int]("gua_add_pin", None), params.fromQuery[String]("branch", None), params.fromQuery[Int]("fee_total", None), params.fromQuery[Int]("fee_paid", None), params.fromQuery[String]("stu_category", None), params.fromQuery[Int]("admission_year", None), params.fromQuery[String]("hostel_need", None), params.fromQuery[String]("student_id", None))) { case (stu_firstname: String):: (stu_middlename: String):: (stu_lastname: String):: (stu_per_l1: String):: (stu_per_l2: String):: (stu_per_city: String):: (stu_per_district: String):: (stu_per_state: String):: (stu_per_country: String):: (stu_per_pin: Int):: (stu_curr_l1: String):: (stu_curr_l2: String):: (stu_curr_city: String):: (stu_curr_district: String):: (stu_curr_state: String):: (stu_curr_country: String):: (stu_curr_pin: Int):: (pre_college: String):: (pre_grade: String):: (pre_rollNo: Int):: (pass_year: Int):: (gua_firstName: String):: (gua_mid_name: String):: (gua_last_name: String):: (gua_mob_no: String):: (gua_email: String):: (gua_add_l1: String):: (gua_add_l2: String):: (gua_add_city: String):: (gua_add_district: String):: (gua_add_state: String):: (gua_add_country: String):: (gua_add_pin: Int):: (branch: String):: (fee_total: Int):: (fee_paid: Int):: (stu_category: String):: (admission_year: Int):: (hostel_need: String):: (student_id: String) :: Nil =>
        controllers_Application_admissionUpdate25_invoker.call(Application_0.admissionUpdate(stu_firstname, stu_middlename, stu_lastname, stu_per_l1, stu_per_l2, stu_per_city, stu_per_district, stu_per_state, stu_per_country, stu_per_pin, stu_curr_l1, stu_curr_l2, stu_curr_city, stu_curr_district, stu_curr_state, stu_curr_country, stu_curr_pin, pre_college, pre_grade, pre_rollNo, pass_year, gua_firstName, gua_mid_name, gua_last_name, gua_mob_no, gua_email, gua_add_l1, gua_add_l2, gua_add_city, gua_add_district, gua_add_state, gua_add_country, gua_add_pin, branch, fee_total, fee_paid, stu_category, admission_year, hostel_need, student_id))
      }
  
    // @LINE:48
    case controllers_Application_admissionStudentList26_route(params@_) =>
      call(params.fromQuery[Int]("currentPage", Some(0))) { (currentPage) =>
        controllers_Application_admissionStudentList26_invoker.call(Application_0.admissionStudentList(currentPage))
      }
  
    // @LINE:49
    case controllers_Application_admissionStudentList27_route(params@_) =>
      call(params.fromPath[Int]("currentPage", None)) { (currentPage) =>
        controllers_Application_admissionStudentList27_invoker.call(Application_0.admissionStudentList(currentPage))
      }
  
    // @LINE:50
    case controllers_Application_admissionSearch28_route(params@_) =>
      call { 
        controllers_Application_admissionSearch28_invoker.call(Application_0.admissionSearch())
      }
  
    // @LINE:56
    case controllers_Application_studentIndex29_route(params@_) =>
      call { 
        controllers_Application_studentIndex29_invoker.call(Application_0.studentIndex())
      }
  
    // @LINE:57
    case controllers_Application_studentGetValues30_route(params@_) =>
      call(List(params.fromQuery[String]("student_first_name", None), params.fromQuery[String]("student_middle_name", None), params.fromQuery[String]("student_last_name", None), params.fromQuery[String]("line1", None), params.fromQuery[String]("line2", None), params.fromQuery[String]("city", None), params.fromQuery[String]("district", None), params.fromQuery[String]("state", None), params.fromQuery[String]("country", None), params.fromQuery[String]("pincode", None), params.fromQuery[String]("student_dob", None), params.fromQuery[String]("student_mob_no", None), params.fromQuery[String]("student_email", None), params.fromQuery[String]("father_first_name", None), params.fromQuery[String]("father_mid_name", None), params.fromQuery[String]("father_last_name", None), params.fromQuery[String]("father_mob_no", None), params.fromQuery[String]("father_email", None), params.fromQuery[String]("mother_first_name", None), params.fromQuery[String]("mother_mid_name", None), params.fromQuery[String]("mother_last_name", None), params.fromQuery[String]("mother_mob_no", None), params.fromQuery[String]("mother_email", None), params.fromQuery[String]("govt_id", None))) { case (student_first_name: String):: (student_middle_name: String):: (student_last_name: String):: (line1: String):: (line2: String):: (city: String):: (district: String):: (state: String):: (country: String):: (pincode: String):: (student_dob: String):: (student_mob_no: String):: (student_email: String):: (father_first_name: String):: (father_mid_name: String):: (father_last_name: String):: (father_mob_no: String):: (father_email: String):: (mother_first_name: String):: (mother_mid_name: String):: (mother_last_name: String):: (mother_mob_no: String):: (mother_email: String):: (govt_id: String) :: Nil =>
        controllers_Application_studentGetValues30_invoker.call(Application_0.studentGetValues(student_first_name, student_middle_name, student_last_name, line1, line2, city, district, state, country, pincode, student_dob, student_mob_no, student_email, father_first_name, father_mid_name, father_last_name, father_mob_no, father_email, mother_first_name, mother_mid_name, mother_last_name, mother_mob_no, mother_email, govt_id))
      }
  
    // @LINE:58
    case controllers_Application_studentRedirectDelete31_route(params@_) =>
      call { 
        controllers_Application_studentRedirectDelete31_invoker.call(Application_0.studentRedirectDelete())
      }
  
    // @LINE:59
    case controllers_Application_studentValuesDelete32_route(params@_) =>
      call(params.fromQuery[String]("govt_id", None)) { (govt_id) =>
        controllers_Application_studentValuesDelete32_invoker.call(Application_0.studentValuesDelete(govt_id))
      }
  
    // @LINE:60
    case controllers_Application_studentView33_route(params@_) =>
      call(params.fromQuery[String]("govt_id", None)) { (govt_id) =>
        controllers_Application_studentView33_invoker.call(Application_0.studentView(govt_id))
      }
  
    // @LINE:61
    case controllers_Application_studentUpdateData34_route(params@_) =>
      call(List(params.fromQuery[String]("student_first_name", None), params.fromQuery[String]("student_middle_name", None), params.fromQuery[String]("student_last_name", None), params.fromQuery[String]("line1", None), params.fromQuery[String]("line2", None), params.fromQuery[String]("city", None), params.fromQuery[String]("district", None), params.fromQuery[String]("state", None), params.fromQuery[String]("country", None), params.fromQuery[String]("pincode", None), params.fromQuery[String]("student_mob_no", None), params.fromQuery[String]("student_email", None), params.fromQuery[String]("student_dob", None), params.fromQuery[String]("father_first_name", None), params.fromQuery[String]("father_mid_name", None), params.fromQuery[String]("father_last_name", None), params.fromQuery[String]("father_mob_no", None), params.fromQuery[String]("father_email", None), params.fromQuery[String]("mother_first_name", None), params.fromQuery[String]("mother_mid_name", None), params.fromQuery[String]("mother_last", None), params.fromQuery[String]("mother_mob_no", None), params.fromQuery[String]("mother_email", None), params.fromQuery[String]("govt_id", None), params.fromQuery[String]("student_id", None))) { case (student_first_name: String):: (student_middle_name: String):: (student_last_name: String):: (line1: String):: (line2: String):: (city: String):: (district: String):: (state: String):: (country: String):: (pincode: String):: (student_mob_no: String):: (student_email: String):: (student_dob: String):: (father_first_name: String):: (father_mid_name: String):: (father_last_name: String):: (father_mob_no: String):: (father_email: String):: (mother_first_name: String):: (mother_mid_name: String):: (mother_last: String):: (mother_mob_no: String):: (mother_email: String):: (govt_id: String):: (student_id: String) :: Nil =>
        controllers_Application_studentUpdateData34_invoker.call(Application_0.studentUpdateData(student_first_name, student_middle_name, student_last_name, line1, line2, city, district, state, country, pincode, student_mob_no, student_email, student_dob, father_first_name, father_mid_name, father_last_name, father_mob_no, father_email, mother_first_name, mother_mid_name, mother_last, mother_mob_no, mother_email, govt_id, student_id))
      }
  
    // @LINE:63
    case controllers_Application_studentList35_route(params@_) =>
      call(params.fromQuery[Int]("currentPage", Some(0))) { (currentPage) =>
        controllers_Application_studentList35_invoker.call(Application_0.studentList(currentPage))
      }
  
    // @LINE:64
    case controllers_Application_studentList36_route(params@_) =>
      call(params.fromPath[Int]("currentPage", None)) { (currentPage) =>
        controllers_Application_studentList36_invoker.call(Application_0.studentList(currentPage))
      }
  
    // @LINE:65
    case controllers_Application_studentSearch37_route(params@_) =>
      call { 
        controllers_Application_studentSearch37_invoker.call(Application_0.studentSearch())
      }
  
    // @LINE:71
    case controllers_Application_instituteIndex38_route(params@_) =>
      call { 
        controllers_Application_instituteIndex38_invoker.call(Application_0.instituteIndex())
      }
  
    // @LINE:72
    case controllers_Application_instituteGetValues39_route(params@_) =>
      call(params.fromQuery[String]("institute_name", None), params.fromQuery[String]("institute_code", None), params.fromQuery[String]("institute_email", None), params.fromQuery[String]("institute_contact", None), params.fromQuery[String]("institute_line1", None), params.fromQuery[String]("institute_line2", None), params.fromQuery[String]("institute_city", None), params.fromQuery[String]("institute_district", None), params.fromQuery[String]("institute_state", None), params.fromQuery[String]("institute_country", None), params.fromQuery[Int]("institute_pin", None)) { (institute_name, institute_code, institute_email, institute_contact, institute_line1, institute_line2, institute_city, institute_district, institute_state, institute_country, institute_pin) =>
        controllers_Application_instituteGetValues39_invoker.call(Application_0.instituteGetValues(institute_name, institute_code, institute_email, institute_contact, institute_line1, institute_line2, institute_city, institute_district, institute_state, institute_country, institute_pin))
      }
  
    // @LINE:73
    case controllers_Application_instituteDelete40_route(params@_) =>
      call(params.fromQuery[String]("institute_code", None)) { (institute_code) =>
        controllers_Application_instituteDelete40_invoker.call(Application_0.instituteDelete(institute_code))
      }
  
    // @LINE:74
    case controllers_Application_instituteView41_route(params@_) =>
      call(params.fromQuery[String]("institute_code", None)) { (institute_code) =>
        controllers_Application_instituteView41_invoker.call(Application_0.instituteView(institute_code))
      }
  
    // @LINE:75
    case controllers_Application_instituteUpdate42_route(params@_) =>
      call(params.fromQuery[String]("institute_name", None), params.fromQuery[String]("institute_code", None), params.fromQuery[String]("institute_email", None), params.fromQuery[String]("institute_contact", None), params.fromQuery[String]("institute_line1", None), params.fromQuery[String]("institute_line2", None), params.fromQuery[String]("institute_city", None), params.fromQuery[String]("institute_district", None), params.fromQuery[String]("institute_state", None), params.fromQuery[String]("institute_country", None), params.fromQuery[Int]("institute_pin", None)) { (institute_name, institute_code, institute_email, institute_contact, institute_line1, institute_line2, institute_city, institute_district, institute_state, institute_country, institute_pin) =>
        controllers_Application_instituteUpdate42_invoker.call(Application_0.instituteUpdate(institute_name, institute_code, institute_email, institute_contact, institute_line1, institute_line2, institute_city, institute_district, institute_state, institute_country, institute_pin))
      }
  
    // @LINE:77
    case controllers_Application_instituteList43_route(params@_) =>
      call(params.fromQuery[Int]("currentPage", Some(0))) { (currentPage) =>
        controllers_Application_instituteList43_invoker.call(Application_0.instituteList(currentPage))
      }
  
    // @LINE:78
    case controllers_Application_instituteList44_route(params@_) =>
      call(params.fromPath[Int]("currentPage", None)) { (currentPage) =>
        controllers_Application_instituteList44_invoker.call(Application_0.instituteList(currentPage))
      }
  
    // @LINE:79
    case controllers_Application_instituteSearch45_route(params@_) =>
      call { 
        controllers_Application_instituteSearch45_invoker.call(Application_0.instituteSearch())
      }
  
    // @LINE:83
    case controllers_Assets_versioned46_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned46_invoker.call(Assets_1.versioned(path, file))
      }
  }
}
