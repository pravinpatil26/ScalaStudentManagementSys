// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset

// @LINE:7
package controllers.javascript {

  // @LINE:7
  class ReverseApplication(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:40
    def admissionView: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.admissionView",
      """
        function(student_aadhaar0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admissionView" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("student_aadhaar", student_aadhaar0)])})
        }
      """
    )
  
    // @LINE:11
    def getValues: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.getValues",
      """
        function(firstname0,middlename1,lastname2,prn3,branch4,acad_year5,result6,score7,mobileno8,emailid9) {
        
          if (true) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "form" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("firstname", firstname0), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("middlename", middlename1), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("lastname", lastname2), (""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("prn", prn3), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("branch", branch4), (""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("acad_year", acad_year5), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("result", result6), (""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("score", score7), (""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("mobileno", mobileno8), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("emailid", emailid9)])})
          }
        
        }
      """
    )
  
    // @LINE:54
    def studentValuesDelete: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.studentValuesDelete",
      """
        function(govt_id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "studentDeleteValues" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("govt_id", govt_id0)])})
        }
      """
    )
  
    // @LINE:13
    def cancel: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.cancel",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "cancel"})
        }
      """
    )
  
    // @LINE:29
    def examSearch: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.examSearch",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "examSearch"})
        }
      """
    )
  
    // @LINE:19
    def validatelogin: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.validatelogin",
      """
        function(username0,password1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "validate1" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("username", username0), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("password", password1)])})
        }
      """
    )
  
    // @LINE:67
    def instituteGetValues: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.instituteGetValues",
      """
        function(institute_name0,institute_code1,institute_email2,institute_contact3,institute_line14,institute_line25,institute_city6,institute_district7,institute_state8,institute_country9,institute_pin10) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "instituteForm" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("institute_name", institute_name0), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("institute_code", institute_code1), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("institute_email", institute_email2), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("institute_contact", institute_contact3), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("institute_line1", institute_line14), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("institute_line2", institute_line25), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("institute_city", institute_city6), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("institute_district", institute_district7), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("institute_state", institute_state8), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("institute_country", institute_country9), (""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("institute_pin", institute_pin10)])})
        }
      """
    )
  
    // @LINE:60
    def studentSearch: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.studentSearch",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "studentSearch"})
        }
      """
    )
  
    // @LINE:17
    def finalUpdate: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.finalUpdate",
      """
        function(firstname0,middlename1,lastname2,prn3,branch4,acad_year5,result6,score7,mobileno8,emailid9) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "udate2" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("firstname", firstname0), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("middlename", middlename1), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("lastname", lastname2), (""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("prn", prn3), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("branch", branch4), (""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("acad_year", acad_year5), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("result", result6), (""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("score", score7), (""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("mobileno", mobileno8), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("emailid", emailid9)])})
        }
      """
    )
  
    // @LINE:56
    def studentUpdateData: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.studentUpdateData",
      """
        function(student_first_name0,student_middle_name1,student_last_name2,line13,line24,city5,district6,state7,country8,pincode9,student_mob_no10,student_email11,student_dob12,father_first_name13,father_mid_name14,father_last_name15,father_mob_no16,father_email17,mother_first_name18,mother_mob_no19,mother_email20,govt_id21,student_id22) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "studentUpdateFullData" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("student_first_name", student_first_name0), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("student_middle_name", student_middle_name1), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("student_last_name", student_last_name2), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("line1", line13), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("line2", line24), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("city", city5), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("district", district6), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("state", state7), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("country", country8), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("pincode", pincode9), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("student_mob_no", student_mob_no10), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("student_email", student_email11), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("student_dob", student_dob12), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("father_first_name", father_first_name13), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("father_mid_name", father_mid_name14), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("father_last_name", father_last_name15), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("father_mob_no", father_mob_no16), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("father_email", father_email17), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("mother_first_name", mother_first_name18), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("mother_mob_no", mother_mob_no19), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("mother_email", mother_email20), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("govt_id", govt_id21), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("student_id", student_id22)])})
        }
      """
    )
  
    // @LINE:15
    def updatevalues: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.updatevalues",
      """
        function(prn0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "update2" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("prn", prn0)])})
        }
      """
    )
  
    // @LINE:10
    def viewbutton: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.viewbutton",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "viewbutton"})
        }
      """
    )
  
    // @LINE:58
    def studentList: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.studentList",
      """
        function(currentPage0) {
        
          if (true) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "studentList" + _qS([(currentPage0 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("currentPage", currentPage0))])})
          }
        
        }
      """
    )
  
    // @LINE:43
    def admissionStudentList: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.admissionStudentList",
      """
        function(currentPage0) {
        
          if (true) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admissionList" + _qS([(currentPage0 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("currentPage", currentPage0))])})
          }
        
        }
      """
    )
  
    // @LINE:27
    def examStudentList: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.examStudentList",
      """
        function(currentPage0) {
        
          if (true) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "examList" + _qS([(currentPage0 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("currentPage", currentPage0))])})
          }
        
        }
      """
    )
  
    // @LINE:51
    def studentIndex: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.studentIndex",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "studentIndex"})
        }
      """
    )
  
    // @LINE:41
    def admissionUpdate: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.admissionUpdate",
      """
        function(stu_firstname0,stu_middlename1,stu_lastname2,stu_per_l13,stu_per_l24,stu_per_city5,stu_per_district6,stu_per_state7,stu_per_country8,stu_per_pin9,stu_curr_l110,stu_curr_l211,stu_curr_city12,stu_curr_district13,stu_curr_state14,stu_curr_country15,stu_curr_pin16,pre_college17,pre_grade18,pre_rollNo19,pass_year20,gua_firstName21,gua_mid_name22,gua_last_name23,gua_mob_no24,gua_email25,gua_add_l126,gua_add_l227,gua_add_city28,gua_add_district29,gua_add_state30,gua_add_country31,gua_add_pin32,branch33,fee_total34,fee_paid35,stu_category36,admission_year37,hostel_need38,student_id39) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admissionUpdateData" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("stu_firstname", stu_firstname0), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("stu_middlename", stu_middlename1), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("stu_lastname", stu_lastname2), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("stu_per_l1", stu_per_l13), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("stu_per_l2", stu_per_l24), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("stu_per_city", stu_per_city5), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("stu_per_district", stu_per_district6), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("stu_per_state", stu_per_state7), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("stu_per_country", stu_per_country8), (""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("stu_per_pin", stu_per_pin9), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("stu_curr_l1", stu_curr_l110), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("stu_curr_l2", stu_curr_l211), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("stu_curr_city", stu_curr_city12), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("stu_curr_district", stu_curr_district13), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("stu_curr_state", stu_curr_state14), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("stu_curr_country", stu_curr_country15), (""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("stu_curr_pin", stu_curr_pin16), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("pre_college", pre_college17), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("pre_grade", pre_grade18), (""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("pre_rollNo", pre_rollNo19), (""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("pass_year", pass_year20), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("gua_firstName", gua_firstName21), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("gua_mid_name", gua_mid_name22), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("gua_last_name", gua_last_name23), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("gua_mob_no", gua_mob_no24), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("gua_email", gua_email25), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("gua_add_l1", gua_add_l126), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("gua_add_l2", gua_add_l227), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("gua_add_city", gua_add_city28), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("gua_add_district", gua_add_district29), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("gua_add_state", gua_add_state30), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("gua_add_country", gua_add_country31), (""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("gua_add_pin", gua_add_pin32), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("branch", branch33), (""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("fee_total", fee_total34), (""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("fee_paid", fee_paid35), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("stu_category", stu_category36), (""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("admission_year", admission_year37), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("hostel_need", hostel_need38), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("student_id", student_id39)])})
        }
      """
    )
  
    // @LINE:16
    def deleterecord: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.deleterecord",
      """
        function(prn0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "delete" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("prn", prn0)])})
        }
      """
    )
  
    // @LINE:55
    def studentView: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.studentView",
      """
        function(govt_id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "studentViewPage" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("govt_id", govt_id0)])})
        }
      """
    )
  
    // @LINE:12
    def updatepage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.updatepage",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "update"})
        }
      """
    )
  
    // @LINE:22
    def view: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.view",
      """
        function(prn0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "view" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("prn", prn0)])})
        }
      """
    )
  
    // @LINE:21
    def logout: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.logout",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout1"})
        }
      """
    )
  
    // @LINE:66
    def instituteIndex: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.instituteIndex",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "instituteIndex"})
        }
      """
    )
  
    // @LINE:70
    def instituteUpdate: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.instituteUpdate",
      """
        function(institute_name0,institute_code1,institute_email2,institute_contact3,institute_line14,institute_line25,institute_city6,institute_district7,institute_state8,institute_country9,institute_pin10) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "instituteUpdate" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("institute_name", institute_name0), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("institute_code", institute_code1), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("institute_email", institute_email2), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("institute_contact", institute_contact3), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("institute_line1", institute_line14), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("institute_line2", institute_line25), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("institute_city", institute_city6), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("institute_district", institute_district7), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("institute_state", institute_state8), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("institute_country", institute_country9), (""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("institute_pin", institute_pin10)])})
        }
      """
    )
  
    // @LINE:69
    def instituteView: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.instituteView",
      """
        function(institute_code0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "instituteView" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("institute_code", institute_code0)])})
        }
      """
    )
  
    // @LINE:72
    def instituteList: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.instituteList",
      """
        function(currentPage0) {
        
          if (true) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "instituteList" + _qS([(currentPage0 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("currentPage", currentPage0))])})
          }
        
        }
      """
    )
  
    // @LINE:74
    def instituteSearch: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.instituteSearch",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "instituteSearch"})
        }
      """
    )
  
    // @LINE:45
    def admissionSearch: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.admissionSearch",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admissionSearch"})
        }
      """
    )
  
    // @LINE:68
    def instituteDelete: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.instituteDelete",
      """
        function(institute_code0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "instituteDelete" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("institute_code", institute_code0)])})
        }
      """
    )
  
    // @LINE:53
    def studentRedirectDelete: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.studentRedirectDelete",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "studentDeletePage"})
        }
      """
    )
  
    // @LINE:36
    def admissionIndex: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.admissionIndex",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admissionIndex"})
        }
      """
    )
  
    // @LINE:37
    def admissionGetValues: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.admissionGetValues",
      """
        function(stu_firstname0,stu_middlename1,stu_lastname2,stu_per_l13,stu_per_l24,stu_per_city5,stu_per_district6,stu_per_state7,stu_per_country8,stu_per_pin9,stu_curr_l110,stu_curr_l211,stu_curr_city12,stu_curr_district13,stu_curr_state14,stu_curr_country15,stu_curr_pin16,pre_college17,pre_grade18,pre_rollNo19,pass_year20,gua_firstName21,gua_mid_name22,gua_last_name23,gua_mob_no24,gua_email25,gua_add_l126,gua_add_l227,gua_add_city28,gua_add_district29,gua_add_state30,gua_add_country31,gua_add_pin32,branch33,stu_aadhar_no34,fee_total35,fee_paid36,stu_category37,admission_year38,hostel_need39) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admissionForm" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("stu_firstname", stu_firstname0), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("stu_middlename", stu_middlename1), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("stu_lastname", stu_lastname2), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("stu_per_l1", stu_per_l13), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("stu_per_l2", stu_per_l24), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("stu_per_city", stu_per_city5), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("stu_per_district", stu_per_district6), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("stu_per_state", stu_per_state7), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("stu_per_country", stu_per_country8), (""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("stu_per_pin", stu_per_pin9), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("stu_curr_l1", stu_curr_l110), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("stu_curr_l2", stu_curr_l211), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("stu_curr_city", stu_curr_city12), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("stu_curr_district", stu_curr_district13), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("stu_curr_state", stu_curr_state14), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("stu_curr_country", stu_curr_country15), (""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("stu_curr_pin", stu_curr_pin16), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("pre_college", pre_college17), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("pre_grade", pre_grade18), (""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("pre_rollNo", pre_rollNo19), (""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("pass_year", pass_year20), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("gua_firstName", gua_firstName21), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("gua_mid_name", gua_mid_name22), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("gua_last_name", gua_last_name23), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("gua_mob_no", gua_mob_no24), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("gua_email", gua_email25), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("gua_add_l1", gua_add_l126), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("gua_add_l2", gua_add_l227), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("gua_add_city", gua_add_city28), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("gua_add_district", gua_add_district29), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("gua_add_state", gua_add_state30), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("gua_add_country", gua_add_country31), (""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("gua_add_pin", gua_add_pin32), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("branch", branch33), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("stu_aadhar_no", stu_aadhar_no34), (""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("fee_total", fee_total35), (""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("fee_paid", fee_paid36), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("stu_category", stu_category37), (""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("admission_year", admission_year38), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("hostel_need", hostel_need39)])})
        }
      """
    )
  
    // @LINE:9
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "index"})
        }
      """
    )
  
    // @LINE:8
    def index1: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.index1",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "index1"})
        }
      """
    )
  
    // @LINE:52
    def studentGetValues: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.studentGetValues",
      """
        function(student_first_name0,student_middle_name1,student_last_name2,line13,line24,city5,district6,state7,country8,pincode9,student_dob10,student_mob_no11,student_email12,father_first_name13,father_mid_name14,father_last_name15,father_mob_no16,father_email17,mother_first_name18,mother_mob_no19,mother_email20,govt_id21) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "studentForm" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("student_first_name", student_first_name0), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("student_middle_name", student_middle_name1), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("student_last_name", student_last_name2), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("line1", line13), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("line2", line24), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("city", city5), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("district", district6), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("state", state7), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("country", country8), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("pincode", pincode9), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("student_dob", student_dob10), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("student_mob_no", student_mob_no11), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("student_email", student_email12), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("father_first_name", father_first_name13), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("father_mid_name", father_mid_name14), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("father_last_name", father_last_name15), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("father_mob_no", father_mob_no16), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("father_email", father_email17), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("mother_first_name", mother_first_name18), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("mother_mob_no", mother_mob_no19), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("mother_email", mother_email20), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("govt_id", govt_id21)])})
        }
      """
    )
  
    // @LINE:38
    def admissionFinalDelete: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.admissionFinalDelete",
      """
        function(student_aadhaar0) {
        
          if (true) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admissionDelete" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("student_aadhaar", student_aadhaar0)])})
          }
        
        }
      """
    )
  
    // @LINE:7
    def login: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.login",
      """
        function() {
        
          if (true) {
            return _wA({method:"GET", url:"""" + _prefix + """"})
          }
        
        }
      """
    )
  
  }

  // @LINE:78
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:78
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }


}
