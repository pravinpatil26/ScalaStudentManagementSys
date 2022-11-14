
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

object admissionIndex extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template15[Map[String, Any],Map[String, Any],String,Map[String, Any],Map[String, Any],Map[String, Any],Map[String, Any],Map[String, Any],Map[String, Any],String,String,String,Int,Map[String, Any],Boolean,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(idMap:Map[String,Any],stu_name:Map[String,Any],stu_aadhar:String,stu_per_address:Map[String,Any],stu_curr_address:Map[String,Any],stu_preEdu:Map[String,Any],stu_local_name:Map[String,Any],stu_local_address:Map[String,Any],stu_local:Map[String,Any],stu_branch:String,stu_category:String,stu_hostel:String,stu_year:Int,stu_fee:Map[String,Any], updateView: Boolean):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.365*/("""

"""),format.raw/*4.1*/("""<html lang="en">

    <head>
        <meta charset="UTF-8">
        <title>Student Admission Details</title>
        <style>
        .show """),format.raw/*10.15*/("""{"""),format.raw/*10.16*/("""
            """),format.raw/*11.13*/("""display: block;
        """),format.raw/*12.9*/("""}"""),format.raw/*12.10*/("""

        """),format.raw/*14.9*/(""".hide """),format.raw/*14.15*/("""{"""),format.raw/*14.16*/("""
            """),format.raw/*15.13*/("""display: none;
        """),format.raw/*16.9*/("""}"""),format.raw/*16.10*/("""

        """),format.raw/*18.9*/("""body """),format.raw/*18.14*/("""{"""),format.raw/*18.15*/("""
            """),format.raw/*19.13*/("""font-family: Calibri, Helvetica, sans-serif;
            margin: 0;
        """),format.raw/*21.9*/("""}"""),format.raw/*21.10*/("""

        """),format.raw/*23.9*/(""".show_option """),format.raw/*23.22*/("""{"""),format.raw/*23.23*/("""
            """),format.raw/*24.13*/("""padding: 10px;
            background: #000000;
            display: grid;
            align-content: center;
            justify-content: end;
        """),format.raw/*29.9*/("""}"""),format.raw/*29.10*/("""

        """),format.raw/*31.9*/("""button,
        .btn """),format.raw/*32.14*/("""{"""),format.raw/*32.15*/("""
            """),format.raw/*33.13*/("""border: 0;
            background: rgb(78, 129, 207);
            padding: 10px;
            border-radius: 5px;
            width: 100px;
            font-size: 20px;
            height: 50px;
            color: white;
            box-shadow: 0px 0px;
            transition: box-shadow ease-in 1ms 1ms;
        """),format.raw/*43.9*/("""}"""),format.raw/*43.10*/("""

        """),format.raw/*45.9*/("""button:hover """),format.raw/*45.22*/("""{"""),format.raw/*45.23*/("""
            """),format.raw/*46.13*/("""box-shadow: 2px 3px 2px 0px #899dbe;
            /* transition: border-shadow 12s ease-in; */
        """),format.raw/*48.9*/("""}"""),format.raw/*48.10*/("""

        """),format.raw/*50.9*/(""".popup_container """),format.raw/*50.26*/("""{"""),format.raw/*50.27*/("""
            """),format.raw/*51.13*/("""background: #ffffff;
            padding: 30px;
            /* width: 800px; */
            /* height: 800px; */
            /* position: absolute; */
            /* left: 57px; */
            /* top: 100px; */
        """),format.raw/*58.9*/("""}"""),format.raw/*58.10*/("""

        """),format.raw/*60.9*/(""".form_group """),format.raw/*60.21*/("""{"""),format.raw/*60.22*/("""
            """),format.raw/*61.13*/("""display: grid;
            grid-auto-flow: row;
            /* justify-items: center; */
            /* align-items: center; */
            margin-bottom: 20px;
            padding: 10px;
        """),format.raw/*67.9*/("""}"""),format.raw/*67.10*/("""

        """),format.raw/*69.9*/("""p """),format.raw/*69.11*/("""{"""),format.raw/*69.12*/("""
            """),format.raw/*70.13*/("""justify-self: self-start;
            font-size: 20px;
            color: black;
            font-weight: bold;
        """),format.raw/*74.9*/("""}"""),format.raw/*74.10*/("""

        """),format.raw/*76.9*/(""".input_group p,
        label """),format.raw/*77.15*/("""{"""),format.raw/*77.16*/("""
            """),format.raw/*78.13*/("""justify-self: self-start;
            font-size: 17px;
            color: #757087;
            font-weight: normal !important;
        """),format.raw/*82.9*/("""}"""),format.raw/*82.10*/("""

        """),format.raw/*84.9*/(""".input_group input """),format.raw/*84.28*/("""{"""),format.raw/*84.29*/("""
            """),format.raw/*85.13*/("""height: 40px;
            border: 1.5px #d7deee solid;
            border-radius: 4px;
            box-shadow: 1px 1px 4px 0px #d3cece;
            padding: 10px;
            font-size: 15px;
            outline: none;
            transition: border ease-in 10ms;
        """),format.raw/*93.9*/("""}"""),format.raw/*93.10*/("""

        """),format.raw/*95.9*/(""".form_group.address """),format.raw/*95.29*/("""{"""),format.raw/*95.30*/("""
            """),format.raw/*96.13*/("""display: grid;
            grid-auto-flow: row;
            /* justify-items: center; */
            /* align-items: center; */
            /* grid-template-columns: 200px auto; */
        """),format.raw/*101.9*/("""}"""),format.raw/*101.10*/("""

        """),format.raw/*103.9*/(""".group """),format.raw/*103.16*/("""{"""),format.raw/*103.17*/("""
            """),format.raw/*104.13*/("""display: grid;
            grid-auto-flow: row;
            grid-template-columns: auto auto;
            grid-gap: 20px;
            /* margin-top: 76px; */
        """),format.raw/*109.9*/("""}"""),format.raw/*109.10*/("""


        """),format.raw/*112.9*/(""".input_group """),format.raw/*112.22*/("""{"""),format.raw/*112.23*/("""
            """),format.raw/*113.13*/("""display: grid;
        """),format.raw/*114.9*/("""}"""),format.raw/*114.10*/("""

        """),format.raw/*116.9*/(""".group_col """),format.raw/*116.20*/("""{"""),format.raw/*116.21*/("""
            """),format.raw/*117.13*/("""display: grid;
            grid-auto-flow: column;
            grid-template-columns: repeat(3, 250px);
            grid-gap: 30px;
        """),format.raw/*121.9*/("""}"""),format.raw/*121.10*/("""

        """),format.raw/*123.9*/("""/* input """),format.raw/*123.18*/("""{"""),format.raw/*123.19*/("""

            """),format.raw/*125.13*/("""padding: 10px;
            margin: 20px 0 30px 0;
            display: inline-block;
            border: none;
            background: #f1f1f1;
        """),format.raw/*130.9*/("""}"""),format.raw/*130.10*/("""

        """),format.raw/*132.9*/("""button """),format.raw/*132.16*/("""{"""),format.raw/*132.17*/("""
            """),format.raw/*133.13*/("""background-color: #529AE1;
            color: white;
            padding: 16px 32px;
            margin: 4px 2px;
            border: none;
            cursor: pointer;
            width: 9%;
            opacity: 0.9;
        """),format.raw/*141.9*/("""}"""),format.raw/*141.10*/("""

        """),format.raw/*143.9*/(""".deleteBtn """),format.raw/*143.20*/("""{"""),format.raw/*143.21*/("""
            """),format.raw/*144.13*/("""background-color: ##529AE1;
        """),format.raw/*145.9*/("""}"""),format.raw/*145.10*/("""

        """),format.raw/*147.9*/(""".view """),format.raw/*147.15*/("""{"""),format.raw/*147.16*/("""
            """),format.raw/*148.13*/("""background-color: #529AE1;
        """),format.raw/*149.9*/("""}"""),format.raw/*149.10*/("""

        """),format.raw/*151.9*/(""".update """),format.raw/*151.17*/("""{"""),format.raw/*151.18*/("""
            """),format.raw/*152.13*/("""background-color: ##529AE1;
        """),format.raw/*153.9*/("""}"""),format.raw/*153.10*/("""

        """),format.raw/*155.9*/(""".container """),format.raw/*155.20*/("""{"""),format.raw/*155.21*/("""
            """),format.raw/*156.13*/("""padding: 50px;
            background: lightblue;



        """),format.raw/*161.9*/("""}"""),format.raw/*161.10*/("""


        """),format.raw/*164.9*/("""hr """),format.raw/*164.12*/("""{"""),format.raw/*164.13*/("""
            """),format.raw/*165.13*/("""border: 1px solid #f1f1f1;
            margin-bottom: 25px;
        """),format.raw/*167.9*/("""}"""),format.raw/*167.10*/("""

        """),format.raw/*169.9*/("""label """),format.raw/*169.15*/("""{"""),format.raw/*169.16*/("""
            """),format.raw/*170.13*/("""padding: 8px;


        """),format.raw/*173.9*/("""}"""),format.raw/*173.10*/("""

        """),format.raw/*175.9*/("""input[type=submit] """),format.raw/*175.28*/("""{"""),format.raw/*175.29*/("""
            """),format.raw/*176.13*/("""background-color: #529AE1;
            border: none;
            color: white;
            padding: 16px 32px;
            text-decoration: none;
            margin: 4px 2px;
            cursor: pointer;
        """),format.raw/*183.9*/("""}"""),format.raw/*183.10*/("""

        """),format.raw/*185.9*/("""ul """),format.raw/*185.12*/("""{"""),format.raw/*185.13*/("""
            """),format.raw/*186.13*/("""list-style-type: none;
            margin: 0;
            padding: 0;
            overflow: hidden;
            background-color: #333;
        """),format.raw/*191.9*/("""}"""),format.raw/*191.10*/("""

        """),format.raw/*193.9*/("""li """),format.raw/*193.12*/("""{"""),format.raw/*193.13*/("""
            """),format.raw/*194.13*/("""float: left;
        """),format.raw/*195.9*/("""}"""),format.raw/*195.10*/("""

        """),format.raw/*197.9*/("""li a """),format.raw/*197.14*/("""{"""),format.raw/*197.15*/("""
            """),format.raw/*198.13*/("""display: block;
            color: white;
            text-align: center;
            padding: 14px 16px;
            text-decoration: none;
        """),format.raw/*203.9*/("""}"""),format.raw/*203.10*/("""

        """),format.raw/*205.9*/("""li a:hover """),format.raw/*205.20*/("""{"""),format.raw/*205.21*/("""
            """),format.raw/*206.13*/("""background-color: #111;
        """),format.raw/*207.9*/("""}"""),format.raw/*207.10*/(""" """),format.raw/*207.11*/("""*/
    </style>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.12.1/css/all.min.css">
    </head>

    <body>
            <!--<nav>-->

            <!--    <ul>-->
            <!--        <li class="parent"><a class="link" href="index.scala.html">Home</a></li>-->
            <!--        <li class="parent"><a class="link" href="student.scala.html">Student</a></li>-->
            <!--        <li class="parent"><a class="link" href="#">Admission</a></li>-->
            <!--        <li class="parent"><a class="link" href="#">Exam</a></li>-->
            <!--        <li class="parent"><a class="link" href="institute.scala.html">Institute</a></li>-->
            <!--        <li class="parent"><a class="link" href="contact.scala.html">Contact</a></li>-->
            <!--    </ul>-->
            <!--</nav>-->

        <script>
        function autoFillAddress() """),format.raw/*226.36*/("""{"""),format.raw/*226.37*/("""
            """),format.raw/*227.13*/("""let checkBox = document.getElementById('checkBox');

            let pl1 = document.getElementById('stu_perm_l1');
            let pl2 = document.getElementById('stu_perm_l2');
            let pcity = document.getElementById('stu_perm_city');
            let pdistrict = document.getElementById('stu_perm_district');
            let pstate = document.getElementById('stu_perm_state');
            let pcountry = document.getElementById('stu_perm_country');
            let ppin = document.getElementById('stu_perm_pin');


            let cl1 = document.getElementById('stu_curre_l1');
            let cl2 = document.getElementById('stu_curre_l2');
            let ccity = document.getElementById('stu_curre_city');
            let cdistrict = document.getElementById('stu_curre_district');
            let cstate = document.getElementById('stu_curre_state');
            let ccountry = document.getElementById('stu_curre_country');
            let cpin = document.getElementById('stu_curre_pin');

            if (checkBox.checked == true) """),format.raw/*246.43*/("""{"""),format.raw/*246.44*/("""
                """),format.raw/*247.17*/("""let pl1v = pl1.value;
                let pl2v = pl2.value;
                let pcityv = pcity.value;
                let pdistrictv = pdistrict.value;
                let pstatev = pstate.value;
                let pcountryv = pcountry.value;
                let ppinv = ppin.value;

                cl1.value = pl1v;
                cl2.value = pl2v;
                ccity.value = pcityv;
                cdistrict.value = pdistrictv;
                cstate.value = pdistrictv;
                ccountry.value = pcountryv;
                cpin.value = ppinv
            """),format.raw/*262.13*/("""}"""),format.raw/*262.14*/(""" """),format.raw/*262.15*/("""else """),format.raw/*262.20*/("""{"""),format.raw/*262.21*/("""
                """),format.raw/*263.17*/("""cl1.value = "";
                cl2.value = "";
                ccity.value = "";
                cdistrict.value = "";
                cstate.value = "";
                ccountry.value = "";
                cpin.value = "";
            """),format.raw/*270.13*/("""}"""),format.raw/*270.14*/("""


        """),format.raw/*273.9*/("""}"""),format.raw/*273.10*/("""

    """),format.raw/*275.5*/("""function admissionBtnHide() """),format.raw/*275.33*/("""{"""),format.raw/*275.34*/("""
        """),format.raw/*276.9*/("""var y = document.getElementById("buttons")
        y.style.display = "none";
    """),format.raw/*278.5*/("""}"""),format.raw/*278.6*/("""

    """),format.raw/*280.5*/("""</script>



<!--        <div class="show_option">-->
<!--            <div class="inner" id="buttons">-->
<!--                <button id="insertBtn" onclick="admissionBtnHide()">Insert</button>-->
<!--                <button id="updateBtn" onclick="admissionBtnHide()">Update</button>-->
<!--                <button id="deleteBtn" onclick="admissionBtnHide()">Delete</button>-->
<!--            </div>-->
<!--        </div>-->

        <div class="popup_container">
            <div class="insert_form">
                <h1>Student Admission Details</h1>
                <form action="/admissionForm" method="GET">


                    <div class="form_group">
                        <p>Name of student</p>

                        <div class="group_col">
                            <div class="input_group">
                                <p>First Name</p>
                                <input type="text" id="stu_first_name" name="stu_firstname"
                                value='"""),_display_(/*305.41*/stu_name/*305.49*/.get("first_name")),format.raw/*305.67*/("""' onkeyup="stu_validFName()"
                                placeholder="First Name" />
                            </div>
                            <div class="input_group">
                                <p>Middle Name</p>
                                <input type="text" id="stu_middle_name" name="stu_middlename"
                                value='"""),_display_(/*311.41*/stu_name/*311.49*/.get("middle_name")),format.raw/*311.68*/("""' placeholder="Middle Name" />
                            </div>
                            <div class="input_group">
                                <p>Last Name</p>
                                <input type="text" id="stu_last_name" name="stu_lastname" value='"""),_display_(/*315.99*/stu_name/*315.107*/.get("last_name")),format.raw/*315.124*/("""'
                                placeholder="Last Name" />
                            </div>
                        </div>

                    </div>
                        <!-- Address -->
                    <div class="form_group">
                        <p>Permanent Address</p>

                        <div class="group">

                            <div class="input_group">
                                <p> Line 1: </p>
                                <input type="text" name="stu_per_l1" value='"""),_display_(/*329.78*/stu_per_address/*329.93*/.get("line1")),format.raw/*329.106*/("""' id="stu_perm_l1" />
                            </div>
                            <div class="input_group">
                                <p> Line 2: </p>
                                <input type="text" name="stu_per_l2" value='"""),_display_(/*333.78*/stu_per_address/*333.93*/.get("line2")),format.raw/*333.106*/("""'
                                id="stu_perm_l2" />
                            </div>
                            <div class="input_group">
                                <p> City: </p>
                                <input type="text" name="stu_per_city" value='"""),_display_(/*338.80*/stu_per_address/*338.95*/.get("city")),format.raw/*338.107*/("""'
                                id="stu_perm_city" />
                            </div>
                            <div class="input_group">
                                <p>District:</p>
                                <input type="text" name="stu_per_district" id="stu_perm_district"
                                value="""),_display_(/*344.40*/stu_per_address/*344.55*/.get("district")),format.raw/*344.71*/(""">
                            </div>
                            <div class="input_group">
                                <p> State: </p>
                                <input type="text" name="stu_per_state" value='"""),_display_(/*348.81*/stu_per_address/*348.96*/.get("state")),format.raw/*348.109*/("""'
                                id="stu_perm_state" />
                            </div>
                            <div class="input_group">
                                <p> Country: </p>
                                <input type="text" name="stu_per_country" value='"""),_display_(/*353.83*/stu_per_address/*353.98*/.get("country")),format.raw/*353.113*/("""'
                                id="stu_perm_country" />
                            </div>
                            <div class="input_group">
                                <p> Pin-code: </p>
                                <input type="number" name="stu_per_pin" value='"""),_display_(/*358.81*/stu_per_address/*358.96*/.get("pin-code")),format.raw/*358.112*/("""'
                                id="stu_perm_pin" />
                            </div>
                        </div>
                    </div>

                    <input type="checkbox" id="checkBox"  onclick="autoFillAddress()"> Is current address same as permanent address

                    <div class="form_group">
                        <p>Current Address</p>


                        <div class="group">
                            <div class="input_group">
                                <p> Line 1: </p>
                                <input type="text" name="stu_curr_l1" value='"""),_display_(/*373.79*/stu_curr_address/*373.95*/.get("line1")),format.raw/*373.108*/("""'
                                id="stu_curre_l1" />
                            </div>

                            <div class="input_group">
                                <p> Line 2: </p>
                                <input type="text" name="stu_curr_l2" value='"""),_display_(/*379.79*/stu_curr_address/*379.95*/.get("line2")),format.raw/*379.108*/("""'
                                id="stu_curre_l2" />
                            </div>
                            <div class="input_group">
                                <p> City: </p>
                                <input type="text" name="stu_curr_city" value='"""),_display_(/*384.81*/stu_curr_address/*384.97*/.get("city")),format.raw/*384.109*/("""'
                                id="stu_curre_city" />
                            </div>

                            <div class="input_group">
                                <p> District: </p>
                                <input type="text" name="stu_curr_district" value='"""),_display_(/*390.85*/stu_curr_address/*390.101*/.get("district")),format.raw/*390.117*/("""'
                                id="stu_curre_district" />
                            </div>

                            <div class="input_group">
                                <p> State: </p>
                                <input type="text" name="stu_curr_state" value='"""),_display_(/*396.82*/stu_curr_address/*396.98*/.get("state")),format.raw/*396.111*/("""'
                                id="stu_curre_state" />
                            </div>

                            <div class="input_group">
                                <p> Country: </p>
                                <input type="text" name="stu_curr_country" value='"""),_display_(/*402.84*/stu_curr_address/*402.100*/.get("country")),format.raw/*402.115*/("""'
                                id="stu_curre_country" />
                            </div>

                            <div class="input_group">
                                <p> Pin-code: </p>
                                <input type="number" name="stu_curr_pin" value='"""),_display_(/*408.82*/stu_curr_address/*408.98*/.get("pin-code")),format.raw/*408.114*/("""'
                                id="stu_curre_pin" />
                            </div>
                        </div>
                    </div>

                        <!-------------------------previous education------------------------------->

                    <div class="form_group">
                        <p>Previous Education Of Student</p>

                        <div class="group">
                            <div class="input_group">
                                <p>College Name:</p>
                                <input type="text" id="prev_college" name="pre_college"
                                value='"""),_display_(/*423.41*/stu_preEdu/*423.51*/.get("college_name")),format.raw/*423.71*/("""' />
                            </div>
                            <div class="input_group">
                                <p>Grade:</p>
                                <input type="text" id="prev_grade" name="pre_grade" value='"""),_display_(/*427.93*/stu_preEdu/*427.103*/.get("grade")),format.raw/*427.116*/("""' />
                            </div>
                            <div class="input_group">
                                <p>Previous Roll No:</p>
                                <input type=number id="prev_rollNo" name="pre_rollNo"
                                value='"""),_display_(/*432.41*/stu_preEdu/*432.51*/.get("prev_rollno")),format.raw/*432.70*/("""'>
                            </div>
                            <div class="input_group">
                                <p>Passing Year</p>
                                <input type="number" id="prev_pass_year" name="pass_year"
                                value='"""),_display_(/*437.41*/stu_preEdu/*437.51*/.get("passing_year")),format.raw/*437.71*/("""'>
                            </div>
                        </div>
                    </div>



                        <!---------------------------Student local Guardian Details --------------------------->
                    <div class="form_group">
                        <p>Guardian Details Of Student</p>

                        <div class="group">
                            <div class="input_group">
                                <p>First name:</p>
                                <input type="text" id="gua_first_Name" name="gua_firstName"
                                value='"""),_display_(/*452.41*/stu_local_name/*452.55*/.get("first_name")),format.raw/*452.73*/("""' />
                            </div>
                            <div class="input_group">
                                <p>Middle name:</p>
                                <input type="text" id="gua_middleName" name="gua_mid_name"
                                value='"""),_display_(/*457.41*/stu_local_name/*457.55*/.get("middle_name")),format.raw/*457.74*/("""' />
                            </div>
                            <div class="input_group">
                                <p>Last name:</p>
                                <input type="text" id="gua_lastName" name="gua_last_name"
                                value='"""),_display_(/*462.41*/stu_local_name/*462.55*/.get("last_name")),format.raw/*462.72*/("""' />
                            </div>
                            <div class="input_group">
                                <p>Mobile Number:</p>
                                <input type="text" id="gua_mobile_no" name="gua_mob_no" pattern="[0-9]"""),format.raw/*466.103*/("""{"""),format.raw/*466.104*/("""10"""),format.raw/*466.106*/("""}"""),format.raw/*466.107*/(""""
                                value='"""),_display_(/*467.41*/stu_local/*467.50*/.get("contactno")),format.raw/*467.67*/("""' />
                            </div>
                            <div class="input_group">
                                <p>Email ID:</p>
                                <input type="email" id="guaEmail" name="gua_email" value='"""),_display_(/*471.92*/stu_local/*471.101*/.get("emailid")),format.raw/*471.116*/("""' />
                            </div>
                        </div>

                    </div>


                    <div class="form_group">
                        <p>Guardian Address</p>
                        <div class="group">

                            <div class="input_group">
                                <p> Line 1: </p>
                                <input type="text" id="gua_addr_l1" name="gua_add_l1"
                                value='"""),_display_(/*485.41*/stu_local_address/*485.58*/.get("line1")),format.raw/*485.71*/("""' />

                            </div>

                            <div class="input_group">
                                <p> Line 2: </p>
                                <input type="text" id="gua_addr_l2" name="gua_add_l2"
                                value='"""),_display_(/*492.41*/stu_local_address/*492.58*/.get("line2")),format.raw/*492.71*/("""' />
                            </div>

                            <div class="input_group">
                                <p> City: </p>
                                <input type="text" id="gua_addr_city" name="gua_add_city"
                                value='"""),_display_(/*498.41*/stu_local_address/*498.58*/.get("city")),format.raw/*498.70*/("""' />
                            </div>

                            <div class="input_group">
                                <p>District:</p>
                                <input type="text" id="gua_addr_district" name="gua_add_district"
                                value='"""),_display_(/*504.41*/stu_local_address/*504.58*/.get("district")),format.raw/*504.74*/("""' />
                            </div>
                            <div class="input_group">
                                <p> State: </p>
                                <input type="text" id="gua_addr_state" name="gua_add_state"
                                value='"""),_display_(/*509.41*/stu_local_address/*509.58*/.get("state")),format.raw/*509.71*/("""' />
                            </div>

                            <div class="input_group">
                                <p> Country: </p>
                                <input type="text" id="gua_addr_country" name="gua_add_country"
                                value='"""),_display_(/*515.41*/stu_local_address/*515.58*/.get("country")),format.raw/*515.73*/("""' />
                            </div>

                            <div class="input_group">
                                <p> Pin-code: </p>
                                <input type="number" id="gua_addr_pin" name="gua_add_pin"
                                value='"""),_display_(/*521.41*/stu_local_address/*521.58*/.get("pin-code")),format.raw/*521.74*/("""' />
                            </div>
                        </div>
                    </div>




                        <!--------------------------Student Branch Details ---------------------------->


                    <div class="form_group">
                        <p>Enter selected Branch</p>
                        <div class="group_col">
                            <div class="input_group">

                                <p>Branch: </p>
                                <input type="text" id="stu_branch" name="branch" value='"""),_display_(/*538.90*/stu_branch),format.raw/*538.100*/("""'>
                            </div>
                        </div>
                    </div>




                        <!-------------------------Student Govt Id Details ------------------------->
                    <div class="form_group">
                        <p>Student Government Id Details</p>
                        <div class="group_col">
                            <div class="input_group">

                                <p>Aadhar Card Number of Student:</p>
                                <input type="text" id="stu_aadhaar_no" name="stu_aadhar_no" value='"""),_display_(/*553.101*/stu_aadhar),format.raw/*553.111*/("""' />
                            </div>
                        </div>
                    </div>

                        <!---------------------------Student Fee Details --------------------------->
                    <div class="form_group">
                        <p>Student Fee Details</p>

                        <div class="group_col">
                            <div class="input_group">
                                <p>Total Amount:</p>
                                <input type="number" id="stu_fee_total" name="fee_total" value='"""),_display_(/*565.98*/stu_fee/*565.105*/.get("amount")),format.raw/*565.119*/("""' />
                            </div>
                            <div class="input_group">
                                <p>Paid: </p>
                                <input type="number" id="stu_fee_paid" name="fee_paid" value='"""),_display_(/*569.96*/stu_fee/*569.103*/.get("paid")),format.raw/*569.115*/("""'>
                            </div>
                        </div>
                    </div>

                        <!---------------------------Student Category Details --------------------------->
                    <div class="form_group">
                        <p>Student Category Details</p>
                        <div class="group_col">
                            <div class="input_group">
                                <p>Category: </p>
                                <select name="stu_category" id="category">
                                    <option value='"""),_display_(/*581.53*/stu_category),format.raw/*581.65*/("""' selected hidden>"""),_display_(/*581.84*/stu_category),format.raw/*581.96*/("""</option>
                                    <option value="open/general">Open/General</option>
                                    <option value="sc">SC</option>
                                    <option value="obc">OBC</option>
                                    <option value="nt">NT</option>
                                </select>
                            </div>
                        </div>
                    </div>

                        <!---------------------------Student Admission Year Details --------------------------->
                    <div class="form_group">
                        <p>Student Admission Year Details</p>
                        <div class="group_col">
                            <div class="input_group">
                                <p>Admission Year:</p>
                                <input type="number" id="stu_admission_year" name="admission_year" value='"""),_display_(/*597.108*/stu_year),format.raw/*597.116*/("""'>
                            </div>
                        </div>
                    </div>


                        <!---------------------------Student Hostel Details --------------------------->
                    <div class="form_group">
                        <p>Student Hostel Details</p>
                        <div class="group_col">
                            <div class="input_group">
                                <p>Need of Hostel:</p>
                                <select name="hostel_need" id="stu_hostel_need">
                                    <option value='"""),_display_(/*610.53*/stu_hostel),format.raw/*610.63*/("""' selected hidden>"""),_display_(/*610.82*/stu_hostel),format.raw/*610.92*/("""</option>
                                    <option value="yes">Yes</option>
                                    <option value="no">No</option>
                                </select>
                            </div>
                        </div>
                    </div>

                    <input type="hidden" name="student_id" value="""),_display_(/*618.67*/idMap/*618.72*/.get("$oid")),format.raw/*618.84*/(""">



                    """),_display_(/*622.22*/if(updateView)/*622.36*/{_display_(Seq[Any](format.raw/*622.37*/("""
                        """),format.raw/*623.25*/("""<input type="submit" name="submit" value="Update" formaction="/admissionUpdateData" class="btn">
                    """)))}/*624.23*/else/*624.28*/{_display_(Seq[Any](format.raw/*624.29*/("""
                        """),format.raw/*625.25*/("""<input type="submit" name="Submit" value="Insert" class="btn" />
                    """)))}),format.raw/*626.22*/("""

                    """),format.raw/*628.21*/("""<input type="submit" name="submit" value="cancel" formaction="/index1" class="btn">

                </form>
            </div>
<!--            <form>-->
<!--                <div class="form_group">-->
<!--                    <div class="update_form hide">-->
<!--                        <div class="group_col">-->
<!--                        <div class="input_group">-->
<!--                        <p>Aadhar Card No: </p>-->
<!--                        <input type="text" name="student_aadhaar" placeholder="student aadhaar" required>-->
<!--                        <input type="submit" name="submit" value="View" formaction="/admissionView" class="btn">-->
<!--                        </div>-->
<!--                        </div>-->
<!--                    </div>-->
<!--                </div>-->
<!--            </form>-->
        </div>
<!--        <script>-->
<!--        let insertBtn = document.getElementById("insertBtn");-->
<!--        let updateBtn = document.getElementById("updateBtn");-->
<!--        let insert_form = document.getElementsByClassName("insert_form")[0];-->
<!--        let update_form = document.getElementsByClassName("update_form")[0];-->

<!--        let inView = window.location.pathname;-->
<!--        inView === "/admissionView" ?-->
<!--                insert_form.classList.toggle("hide") : "";-->

<!--         insertBtn.addEventListener("click", e => """),format.raw/*656.55*/("""{"""),format.raw/*656.56*/("""-->
<!--            insert_form.classList.toggle("hide");-->
<!--        """),format.raw/*658.13*/("""}"""),format.raw/*658.14*/(""")-->

<!--        updateBtn.addEventListener("click", e => """),format.raw/*660.54*/("""{"""),format.raw/*660.55*/("""-->
<!--            update_form.classList.toggle("hide");-->
<!--        """),format.raw/*662.13*/("""}"""),format.raw/*662.14*/(""")-->


<!--    </script>-->
    </body>

</html>
"""))
      }
    }
  }

  def render(idMap:Map[String, Any],stu_name:Map[String, Any],stu_aadhar:String,stu_per_address:Map[String, Any],stu_curr_address:Map[String, Any],stu_preEdu:Map[String, Any],stu_local_name:Map[String, Any],stu_local_address:Map[String, Any],stu_local:Map[String, Any],stu_branch:String,stu_category:String,stu_hostel:String,stu_year:Int,stu_fee:Map[String, Any],updateView:Boolean): play.twirl.api.HtmlFormat.Appendable = apply(idMap,stu_name,stu_aadhar,stu_per_address,stu_curr_address,stu_preEdu,stu_local_name,stu_local_address,stu_local,stu_branch,stu_category,stu_hostel,stu_year,stu_fee,updateView)

  def f:((Map[String, Any],Map[String, Any],String,Map[String, Any],Map[String, Any],Map[String, Any],Map[String, Any],Map[String, Any],Map[String, Any],String,String,String,Int,Map[String, Any],Boolean) => play.twirl.api.HtmlFormat.Appendable) = (idMap,stu_name,stu_aadhar,stu_per_address,stu_curr_address,stu_preEdu,stu_local_name,stu_local_address,stu_local,stu_branch,stu_category,stu_hostel,stu_year,stu_fee,updateView) => apply(idMap,stu_name,stu_aadhar,stu_per_address,stu_curr_address,stu_preEdu,stu_local_name,stu_local_address,stu_local,stu_branch,stu_category,stu_hostel,stu_year,stu_fee,updateView)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/admissionIndex.scala.html
                  HASH: f2a0c6c22ba8df137fecb1eebea89a7a585563c8
                  MATRIX: 925->3|1384->366|1414->370|1587->515|1616->516|1658->530|1710->555|1739->556|1778->568|1812->574|1841->575|1883->589|1934->613|1963->614|2002->626|2035->631|2064->632|2106->646|2211->724|2240->725|2279->737|2320->750|2349->751|2391->765|2575->922|2604->923|2643->935|2693->957|2722->958|2764->972|3114->1295|3143->1296|3182->1308|3223->1321|3252->1322|3294->1336|3425->1440|3454->1441|3493->1453|3538->1470|3567->1471|3609->1485|3862->1711|3891->1712|3930->1724|3970->1736|3999->1737|4041->1751|4270->1953|4299->1954|4338->1966|4368->1968|4397->1969|4439->1983|4590->2107|4619->2108|4658->2120|4717->2151|4746->2152|4788->2166|4954->2305|4983->2306|5022->2318|5069->2337|5098->2338|5140->2352|5447->2632|5476->2633|5515->2645|5563->2665|5592->2666|5634->2680|5856->2874|5886->2875|5926->2887|5962->2894|5992->2895|6035->2909|6234->3080|6264->3081|6306->3095|6348->3108|6378->3109|6421->3123|6473->3147|6503->3148|6543->3160|6583->3171|6613->3172|6656->3186|6828->3330|6858->3331|6898->3343|6936->3352|6966->3353|7011->3369|7196->3526|7226->3527|7266->3539|7302->3546|7332->3547|7375->3561|7637->3795|7667->3796|7707->3808|7747->3819|7777->3820|7820->3834|7885->3871|7915->3872|7955->3884|7990->3890|8020->3891|8063->3905|8127->3941|8157->3942|8197->3954|8234->3962|8264->3963|8307->3977|8372->4014|8402->4015|8442->4027|8482->4038|8512->4039|8555->4053|8649->4119|8679->4120|8721->4134|8753->4137|8783->4138|8826->4152|8924->4222|8954->4223|8994->4235|9029->4241|9059->4242|9102->4256|9157->4283|9187->4284|9227->4296|9275->4315|9305->4316|9348->4330|9595->4549|9625->4550|9665->4562|9697->4565|9727->4566|9770->4580|9947->4729|9977->4730|10017->4742|10049->4745|10079->4746|10122->4760|10172->4782|10202->4783|10242->4795|10276->4800|10306->4801|10349->4815|10531->4969|10561->4970|10601->4982|10641->4993|10671->4994|10714->5008|10775->5041|10805->5042|10835->5043|11793->5972|11823->5973|11866->5987|12955->7047|12985->7048|13032->7066|13647->7652|13677->7653|13707->7654|13741->7659|13771->7660|13818->7678|14091->7922|14121->7923|14163->7937|14193->7938|14229->7946|14286->7974|14316->7975|14354->7985|14465->8068|14494->8069|14530->8077|15577->9096|15595->9104|15635->9122|16032->9491|16050->9499|16091->9518|16390->9789|16409->9797|16449->9814|17007->10344|17032->10359|17068->10372|17337->10613|17362->10628|17398->10641|17700->10915|17725->10930|17760->10942|18125->11279|18150->11294|18188->11310|18439->11533|18464->11548|18500->11561|18811->11844|18836->11859|18874->11874|19186->12158|19211->12173|19250->12189|19894->12805|19920->12821|19956->12834|20262->13112|20288->13128|20324->13141|20628->13417|20654->13433|20689->13445|21005->13733|21032->13749|21071->13765|21385->14051|21411->14067|21447->14080|21762->14367|21789->14383|21827->14398|22143->14686|22169->14702|22208->14718|22890->15372|22910->15382|22952->15402|23216->15638|23237->15648|23273->15661|23583->15943|23603->15953|23644->15972|23951->16251|23971->16261|24013->16281|24654->16894|24678->16908|24718->16926|25028->17208|25052->17222|25093->17241|25400->17520|25424->17534|25463->17551|25747->17805|25778->17806|25810->17808|25841->17809|25912->17852|25931->17861|25970->17878|26236->18116|26256->18125|26294->18140|26804->18622|26831->18639|26866->18652|27172->18930|27199->18947|27234->18960|27540->19238|27567->19255|27601->19267|27917->19555|27944->19572|27982->19588|28289->19867|28316->19884|28351->19897|28666->20184|28693->20201|28730->20216|29040->20498|29067->20515|29105->20531|29697->21095|29730->21105|30355->21701|30388->21711|30978->22273|30996->22280|31033->22294|31300->22533|31318->22540|31353->22552|31977->23148|32011->23160|32058->23179|32092->23191|33057->24127|33088->24135|33721->24740|33753->24750|33800->24769|33832->24779|34216->25135|34231->25140|34265->25152|34323->25182|34347->25196|34387->25197|34442->25223|34581->25343|34595->25348|34635->25349|34690->25375|34809->25462|34862->25486|36312->26907|36342->26908|36446->26983|36476->26984|36566->27045|36596->27046|36700->27121|36730->27122
                  LINES: 21->2|26->2|28->4|34->10|34->10|35->11|36->12|36->12|38->14|38->14|38->14|39->15|40->16|40->16|42->18|42->18|42->18|43->19|45->21|45->21|47->23|47->23|47->23|48->24|53->29|53->29|55->31|56->32|56->32|57->33|67->43|67->43|69->45|69->45|69->45|70->46|72->48|72->48|74->50|74->50|74->50|75->51|82->58|82->58|84->60|84->60|84->60|85->61|91->67|91->67|93->69|93->69|93->69|94->70|98->74|98->74|100->76|101->77|101->77|102->78|106->82|106->82|108->84|108->84|108->84|109->85|117->93|117->93|119->95|119->95|119->95|120->96|125->101|125->101|127->103|127->103|127->103|128->104|133->109|133->109|136->112|136->112|136->112|137->113|138->114|138->114|140->116|140->116|140->116|141->117|145->121|145->121|147->123|147->123|147->123|149->125|154->130|154->130|156->132|156->132|156->132|157->133|165->141|165->141|167->143|167->143|167->143|168->144|169->145|169->145|171->147|171->147|171->147|172->148|173->149|173->149|175->151|175->151|175->151|176->152|177->153|177->153|179->155|179->155|179->155|180->156|185->161|185->161|188->164|188->164|188->164|189->165|191->167|191->167|193->169|193->169|193->169|194->170|197->173|197->173|199->175|199->175|199->175|200->176|207->183|207->183|209->185|209->185|209->185|210->186|215->191|215->191|217->193|217->193|217->193|218->194|219->195|219->195|221->197|221->197|221->197|222->198|227->203|227->203|229->205|229->205|229->205|230->206|231->207|231->207|231->207|250->226|250->226|251->227|270->246|270->246|271->247|286->262|286->262|286->262|286->262|286->262|287->263|294->270|294->270|297->273|297->273|299->275|299->275|299->275|300->276|302->278|302->278|304->280|329->305|329->305|329->305|335->311|335->311|335->311|339->315|339->315|339->315|353->329|353->329|353->329|357->333|357->333|357->333|362->338|362->338|362->338|368->344|368->344|368->344|372->348|372->348|372->348|377->353|377->353|377->353|382->358|382->358|382->358|397->373|397->373|397->373|403->379|403->379|403->379|408->384|408->384|408->384|414->390|414->390|414->390|420->396|420->396|420->396|426->402|426->402|426->402|432->408|432->408|432->408|447->423|447->423|447->423|451->427|451->427|451->427|456->432|456->432|456->432|461->437|461->437|461->437|476->452|476->452|476->452|481->457|481->457|481->457|486->462|486->462|486->462|490->466|490->466|490->466|490->466|491->467|491->467|491->467|495->471|495->471|495->471|509->485|509->485|509->485|516->492|516->492|516->492|522->498|522->498|522->498|528->504|528->504|528->504|533->509|533->509|533->509|539->515|539->515|539->515|545->521|545->521|545->521|562->538|562->538|577->553|577->553|589->565|589->565|589->565|593->569|593->569|593->569|605->581|605->581|605->581|605->581|621->597|621->597|634->610|634->610|634->610|634->610|642->618|642->618|642->618|646->622|646->622|646->622|647->623|648->624|648->624|648->624|649->625|650->626|652->628|680->656|680->656|682->658|682->658|684->660|684->660|686->662|686->662
                  -- GENERATED --
              */
          