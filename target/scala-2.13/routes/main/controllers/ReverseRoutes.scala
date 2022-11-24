// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:7
package controllers {

  // @LINE:7
  class ReverseApplication(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:40
    def admissionView(student_aadhaar:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "admissionView" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("student_aadhaar", student_aadhaar)))))
    }
  
    // @LINE:11
    def getValues(firstname:String, middlename:String, lastname:String, prn:Int, branch:String, acad_year:Int, result:String, score:Int, mobileno:Int, emailid:String): Call = {
    
      (firstname: @unchecked, middlename: @unchecked, lastname: @unchecked, prn: @unchecked, branch: @unchecked, acad_year: @unchecked, result: @unchecked, score: @unchecked, mobileno: @unchecked, emailid: @unchecked) match {
      
        // @LINE:11
        case (firstname, middlename, lastname, prn, branch, acad_year, result, score, mobileno, emailid)  =>
          
          Call("GET", _prefix + { _defaultPrefix } + "form" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("firstname", firstname)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("middlename", middlename)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("lastname", lastname)), Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("prn", prn)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("branch", branch)), Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("acad_year", acad_year)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("result", result)), Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("score", score)), Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("mobileno", mobileno)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("emailid", emailid)))))
      
      }
    
    }
  
    // @LINE:54
    def studentValuesDelete(govt_id:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "studentDeleteValues" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("govt_id", govt_id)))))
    }
  
    // @LINE:13
    def cancel(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "cancel")
    }
  
    // @LINE:29
    def examSearch(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "examSearch")
    }
  
    // @LINE:19
    def validatelogin(username:String, password:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "validate1" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("username", username)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("password", password)))))
    }
  
    // @LINE:67
    def instituteGetValues(institute_name:String, institute_code:String, institute_email:String, institute_contact:String, institute_line1:String, institute_line2:String, institute_city:String, institute_district:String, institute_state:String, institute_country:String, institute_pin:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "instituteForm" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("institute_name", institute_name)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("institute_code", institute_code)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("institute_email", institute_email)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("institute_contact", institute_contact)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("institute_line1", institute_line1)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("institute_line2", institute_line2)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("institute_city", institute_city)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("institute_district", institute_district)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("institute_state", institute_state)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("institute_country", institute_country)), Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("institute_pin", institute_pin)))))
    }
  
    // @LINE:60
    def studentSearch(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "studentSearch")
    }
  
    // @LINE:17
    def finalUpdate(firstname:String, middlename:String, lastname:String, prn:Int, branch:String, acad_year:Int, result:String, score:Int, mobileno:Int, emailid:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "udate2" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("firstname", firstname)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("middlename", middlename)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("lastname", lastname)), Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("prn", prn)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("branch", branch)), Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("acad_year", acad_year)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("result", result)), Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("score", score)), Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("mobileno", mobileno)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("emailid", emailid)))))
    }
  
    // @LINE:15
    def updatevalues(prn:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "update2" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("prn", prn)))))
    }
  
    // @LINE:10
    def viewbutton(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "viewbutton")
    }
  
    // @LINE:58
    def studentList(currentPage:Int): Call = {
    
      (currentPage: @unchecked) match {
      
        // @LINE:58
        case (currentPage)  =>
          
          Call("GET", _prefix + { _defaultPrefix } + "studentList" + play.core.routing.queryString(List(if(currentPage == 0) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("currentPage", currentPage)))))
      
      }
    
    }
  
    // @LINE:43
    def admissionStudentList(currentPage:Int): Call = {
    
      (currentPage: @unchecked) match {
      
        // @LINE:43
        case (currentPage)  =>
          
          Call("GET", _prefix + { _defaultPrefix } + "admissionList" + play.core.routing.queryString(List(if(currentPage == 0) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("currentPage", currentPage)))))
      
      }
    
    }
  
    // @LINE:27
    def examStudentList(currentPage:Int): Call = {
    
      (currentPage: @unchecked) match {
      
        // @LINE:27
        case (currentPage)  =>
          
          Call("GET", _prefix + { _defaultPrefix } + "examList" + play.core.routing.queryString(List(if(currentPage == 0) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("currentPage", currentPage)))))
      
      }
    
    }
  
    // @LINE:51
    def studentIndex(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "studentIndex")
    }
  
    // @LINE:41
    def admissionUpdate(stu_firstname:String, stu_middlename:String, stu_lastname:String, stu_per_l1:String, stu_per_l2:String, stu_per_city:String, stu_per_district:String, stu_per_state:String, stu_per_country:String, stu_per_pin:Int, stu_curr_l1:String, stu_curr_l2:String, stu_curr_city:String, stu_curr_district:String, stu_curr_state:String, stu_curr_country:String, stu_curr_pin:Int, pre_college:String, pre_grade:String, pre_rollNo:Int, pass_year:Int, gua_firstName:String, gua_mid_name:String, gua_last_name:String, gua_mob_no:String, gua_email:String, gua_add_l1:String, gua_add_l2:String, gua_add_city:String, gua_add_district:String, gua_add_state:String, gua_add_country:String, gua_add_pin:Int, branch:String, fee_total:Int, fee_paid:Int, stu_category:String, admission_year:Int, hostel_need:String, student_id:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "admissionUpdateData" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("stu_firstname", stu_firstname)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("stu_middlename", stu_middlename)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("stu_lastname", stu_lastname)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("stu_per_l1", stu_per_l1)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("stu_per_l2", stu_per_l2)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("stu_per_city", stu_per_city)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("stu_per_district", stu_per_district)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("stu_per_state", stu_per_state)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("stu_per_country", stu_per_country)), Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("stu_per_pin", stu_per_pin)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("stu_curr_l1", stu_curr_l1)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("stu_curr_l2", stu_curr_l2)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("stu_curr_city", stu_curr_city)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("stu_curr_district", stu_curr_district)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("stu_curr_state", stu_curr_state)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("stu_curr_country", stu_curr_country)), Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("stu_curr_pin", stu_curr_pin)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("pre_college", pre_college)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("pre_grade", pre_grade)), Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("pre_rollNo", pre_rollNo)), Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("pass_year", pass_year)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("gua_firstName", gua_firstName)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("gua_mid_name", gua_mid_name)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("gua_last_name", gua_last_name)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("gua_mob_no", gua_mob_no)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("gua_email", gua_email)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("gua_add_l1", gua_add_l1)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("gua_add_l2", gua_add_l2)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("gua_add_city", gua_add_city)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("gua_add_district", gua_add_district)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("gua_add_state", gua_add_state)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("gua_add_country", gua_add_country)), Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("gua_add_pin", gua_add_pin)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("branch", branch)), Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("fee_total", fee_total)), Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("fee_paid", fee_paid)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("stu_category", stu_category)), Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("admission_year", admission_year)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("hostel_need", hostel_need)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("student_id", student_id)))))
    }
  
    // @LINE:16
    def deleterecord(prn:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "delete" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("prn", prn)))))
    }
  
    // @LINE:55
    def studentView(govt_id:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "studentViewPage" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("govt_id", govt_id)))))
    }
  
    // @LINE:12
    def updatepage(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "update")
    }
  
    // @LINE:22
    def view(prn:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "view" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("prn", prn)))))
    }
  
    // @LINE:21
    def logout(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "logout1")
    }
  
    // @LINE:52
    def studentGetValues(student_first_name:String, student_middle_name:String, student_last_name:String, line1:String, line2:String, city:String, district:String, state:String, country:String, pincode:String, student_dob:String, student_mob_no:String, student_email:String, father_first_name:String, father_mid_name:String, father_last_name:String, father_mob_no:String, father_email:String, mother_first_name:String, mother_mid_name:String, mother_last_name:String, mother_mob_no:String, mother_email:String, govt_id:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "studentForm" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("student_first_name", student_first_name)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("student_middle_name", student_middle_name)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("student_last_name", student_last_name)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("line1", line1)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("line2", line2)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("city", city)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("district", district)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("state", state)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("country", country)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("pincode", pincode)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("student_dob", student_dob)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("student_mob_no", student_mob_no)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("student_email", student_email)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("father_first_name", father_first_name)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("father_mid_name", father_mid_name)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("father_last_name", father_last_name)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("father_mob_no", father_mob_no)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("father_email", father_email)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("mother_first_name", mother_first_name)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("mother_mid_name", mother_mid_name)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("mother_last_name", mother_last_name)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("mother_mob_no", mother_mob_no)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("mother_email", mother_email)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("govt_id", govt_id)))))
    }
  
    // @LINE:66
    def instituteIndex(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "instituteIndex")
    }
  
    // @LINE:70
    def instituteUpdate(institute_name:String, institute_code:String, institute_email:String, institute_contact:String, institute_line1:String, institute_line2:String, institute_city:String, institute_district:String, institute_state:String, institute_country:String, institute_pin:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "instituteUpdate" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("institute_name", institute_name)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("institute_code", institute_code)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("institute_email", institute_email)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("institute_contact", institute_contact)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("institute_line1", institute_line1)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("institute_line2", institute_line2)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("institute_city", institute_city)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("institute_district", institute_district)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("institute_state", institute_state)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("institute_country", institute_country)), Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("institute_pin", institute_pin)))))
    }
  
    // @LINE:69
    def instituteView(institute_code:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "instituteView" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("institute_code", institute_code)))))
    }
  
    // @LINE:72
    def instituteList(currentPage:Int): Call = {
    
      (currentPage: @unchecked) match {
      
        // @LINE:72
        case (currentPage)  =>
          
          Call("GET", _prefix + { _defaultPrefix } + "instituteList" + play.core.routing.queryString(List(if(currentPage == 0) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("currentPage", currentPage)))))
      
      }
    
    }
  
    // @LINE:74
    def instituteSearch(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "instituteSearch")
    }
  
    // @LINE:45
    def admissionSearch(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "admissionSearch")
    }
  
    // @LINE:68
    def instituteDelete(institute_code:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "instituteDelete" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("institute_code", institute_code)))))
    }
  
    // @LINE:53
    def studentRedirectDelete(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "studentDeletePage")
    }
  
    // @LINE:36
    def admissionIndex(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "admissionIndex")
    }
  
    // @LINE:56
    def studentUpdateData(student_first_name:String, student_middle_name:String, student_last_name:String, line1:String, line2:String, city:String, district:String, state:String, country:String, pincode:String, student_mob_no:String, student_email:String, student_dob:String, father_first_name:String, father_mid_name:String, father_last_name:String, father_mob_no:String, father_email:String, mother_first_name:String, mother_mid_name:String, mother_last:String, mother_mob_no:String, mother_email:String, govt_id:String, student_id:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "studentUpdateFullData" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("student_first_name", student_first_name)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("student_middle_name", student_middle_name)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("student_last_name", student_last_name)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("line1", line1)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("line2", line2)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("city", city)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("district", district)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("state", state)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("country", country)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("pincode", pincode)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("student_mob_no", student_mob_no)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("student_email", student_email)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("student_dob", student_dob)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("father_first_name", father_first_name)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("father_mid_name", father_mid_name)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("father_last_name", father_last_name)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("father_mob_no", father_mob_no)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("father_email", father_email)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("mother_first_name", mother_first_name)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("mother_mid_name", mother_mid_name)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("mother_last", mother_last)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("mother_mob_no", mother_mob_no)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("mother_email", mother_email)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("govt_id", govt_id)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("student_id", student_id)))))
    }
  
    // @LINE:37
    def admissionGetValues(stu_firstname:String, stu_middlename:String, stu_lastname:String, stu_per_l1:String, stu_per_l2:String, stu_per_city:String, stu_per_district:String, stu_per_state:String, stu_per_country:String, stu_per_pin:Int, stu_curr_l1:String, stu_curr_l2:String, stu_curr_city:String, stu_curr_district:String, stu_curr_state:String, stu_curr_country:String, stu_curr_pin:Int, pre_college:String, pre_grade:String, pre_rollNo:Int, pass_year:Int, gua_firstName:String, gua_mid_name:String, gua_last_name:String, gua_mob_no:String, gua_email:String, gua_add_l1:String, gua_add_l2:String, gua_add_city:String, gua_add_district:String, gua_add_state:String, gua_add_country:String, gua_add_pin:Int, branch:String, stu_aadhar_no:String, fee_total:Int, fee_paid:Int, stu_category:String, admission_year:Int, hostel_need:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "admissionForm" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("stu_firstname", stu_firstname)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("stu_middlename", stu_middlename)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("stu_lastname", stu_lastname)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("stu_per_l1", stu_per_l1)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("stu_per_l2", stu_per_l2)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("stu_per_city", stu_per_city)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("stu_per_district", stu_per_district)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("stu_per_state", stu_per_state)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("stu_per_country", stu_per_country)), Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("stu_per_pin", stu_per_pin)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("stu_curr_l1", stu_curr_l1)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("stu_curr_l2", stu_curr_l2)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("stu_curr_city", stu_curr_city)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("stu_curr_district", stu_curr_district)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("stu_curr_state", stu_curr_state)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("stu_curr_country", stu_curr_country)), Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("stu_curr_pin", stu_curr_pin)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("pre_college", pre_college)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("pre_grade", pre_grade)), Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("pre_rollNo", pre_rollNo)), Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("pass_year", pass_year)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("gua_firstName", gua_firstName)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("gua_mid_name", gua_mid_name)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("gua_last_name", gua_last_name)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("gua_mob_no", gua_mob_no)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("gua_email", gua_email)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("gua_add_l1", gua_add_l1)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("gua_add_l2", gua_add_l2)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("gua_add_city", gua_add_city)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("gua_add_district", gua_add_district)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("gua_add_state", gua_add_state)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("gua_add_country", gua_add_country)), Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("gua_add_pin", gua_add_pin)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("branch", branch)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("stu_aadhar_no", stu_aadhar_no)), Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("fee_total", fee_total)), Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("fee_paid", fee_paid)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("stu_category", stu_category)), Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("admission_year", admission_year)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("hostel_need", hostel_need)))))
    }
  
    // @LINE:9
    def index(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "index")
    }
  
    // @LINE:8
    def index1(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "index1")
    }
  
    // @LINE:38
    def admissionFinalDelete(student_aadhaar:String): Call = {
    
      (student_aadhaar: @unchecked) match {
      
        // @LINE:38
        case (student_aadhaar)  =>
          
          Call("GET", _prefix + { _defaultPrefix } + "admissionDelete" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("student_aadhaar", student_aadhaar)))))
      
      }
    
    }
  
    // @LINE:7
    def login: Call = {
    
      () match {
      
        // @LINE:7
        case ()  =>
          
          Call("GET", _prefix)
      
      }
    
    }
  
  }

  // @LINE:78
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:78
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }


}
