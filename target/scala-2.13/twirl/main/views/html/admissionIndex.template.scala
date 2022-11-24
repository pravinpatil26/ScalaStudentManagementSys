
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
            margin-top: 25px;
        """),format.raw/*44.9*/("""}"""),format.raw/*44.10*/("""

        """),format.raw/*46.9*/("""button:hover """),format.raw/*46.22*/("""{"""),format.raw/*46.23*/("""
            """),format.raw/*47.13*/("""box-shadow: 2px 3px 2px 0px #899dbe;
            /* transition: border-shadow 12s ease-in; */
        """),format.raw/*49.9*/("""}"""),format.raw/*49.10*/("""

        """),format.raw/*51.9*/(""".popup_container """),format.raw/*51.26*/("""{"""),format.raw/*51.27*/("""
            """),format.raw/*52.13*/("""background: #ffffff;
            padding: 30px;
            /* width: 800px; */
            /* height: 800px; */
            /* position: absolute; */
            /* left: 57px; */
            /* top: 100px; */
        """),format.raw/*59.9*/("""}"""),format.raw/*59.10*/("""

        """),format.raw/*61.9*/(""".form_group """),format.raw/*61.21*/("""{"""),format.raw/*61.22*/("""
            """),format.raw/*62.13*/("""display: grid;
            grid-auto-flow: row;
            /* justify-items: center; */
            /* align-items: center; */
            margin-bottom: 1px;
            padding: 1px;
        """),format.raw/*68.9*/("""}"""),format.raw/*68.10*/("""

        """),format.raw/*70.9*/("""p """),format.raw/*70.11*/("""{"""),format.raw/*70.12*/("""
            """),format.raw/*71.13*/("""justify-self: self-start;
            font-size: 20px;
            color: black;
            font-weight: bold;
        """),format.raw/*75.9*/("""}"""),format.raw/*75.10*/("""

        """),format.raw/*77.9*/(""".input_group p,
        label """),format.raw/*78.15*/("""{"""),format.raw/*78.16*/("""
            """),format.raw/*79.13*/("""justify-self: self-start;
            font-size: 17px;
            color: #757087;
            font-weight: normal !important;
        """),format.raw/*83.9*/("""}"""),format.raw/*83.10*/("""

        """),format.raw/*85.9*/(""".input_group input """),format.raw/*85.28*/("""{"""),format.raw/*85.29*/("""
            """),format.raw/*86.13*/("""height: 40px;
            border: 1.5px #d7deee solid;
            border-radius: 4px;
            box-shadow: 1px 1px 4px 0px #d3cece;
            padding: 10px;
            font-size: 15px;
            outline: none;
            transition: border ease-in 10ms;
        """),format.raw/*94.9*/("""}"""),format.raw/*94.10*/("""

        """),format.raw/*96.9*/(""".form_group.address """),format.raw/*96.29*/("""{"""),format.raw/*96.30*/("""
            """),format.raw/*97.13*/("""display: grid;
            grid-auto-flow: row;
            /* justify-items: center; */
            /* align-items: center; */
            /* grid-template-columns: 200px auto; */
        """),format.raw/*102.9*/("""}"""),format.raw/*102.10*/("""

        """),format.raw/*104.9*/(""".group """),format.raw/*104.16*/("""{"""),format.raw/*104.17*/("""
            """),format.raw/*105.13*/("""display: grid;
            grid-auto-flow: row;
            grid-template-columns: repeat(3, 300px);
            grid-column-gap: 30px;
            /* margin-top: 76px; */
        """),format.raw/*110.9*/("""}"""),format.raw/*110.10*/("""


        """),format.raw/*113.9*/(""".input_group """),format.raw/*113.22*/("""{"""),format.raw/*113.23*/("""
            """),format.raw/*114.13*/("""display: grid;
        """),format.raw/*115.9*/("""}"""),format.raw/*115.10*/("""

        """),format.raw/*117.9*/(""".group_col """),format.raw/*117.20*/("""{"""),format.raw/*117.21*/("""
            """),format.raw/*118.13*/("""display: grid;
            grid-auto-flow: column;
            grid-template-columns: repeat(3, 300px);
            grid-gap: 30px;
        """),format.raw/*122.9*/("""}"""),format.raw/*122.10*/("""

        """),format.raw/*124.9*/("""/* input """),format.raw/*124.18*/("""{"""),format.raw/*124.19*/("""

            """),format.raw/*126.13*/("""padding: 10px;
            margin: 20px 0 30px 0;
            display: inline-block;
            border: none;
            background: #f1f1f1;
        """),format.raw/*131.9*/("""}"""),format.raw/*131.10*/("""

        """),format.raw/*133.9*/("""button """),format.raw/*133.16*/("""{"""),format.raw/*133.17*/("""
            """),format.raw/*134.13*/("""background-color: #529AE1;
            color: white;
            padding: 16px 32px;
            margin: 4px 2px;
            border: none;
            cursor: pointer;
            width: 9%;
            opacity: 0.9;
        """),format.raw/*142.9*/("""}"""),format.raw/*142.10*/("""

        """),format.raw/*144.9*/(""".deleteBtn """),format.raw/*144.20*/("""{"""),format.raw/*144.21*/("""
            """),format.raw/*145.13*/("""background-color: ##529AE1;
        """),format.raw/*146.9*/("""}"""),format.raw/*146.10*/("""

        """),format.raw/*148.9*/(""".view """),format.raw/*148.15*/("""{"""),format.raw/*148.16*/("""
            """),format.raw/*149.13*/("""background-color: #529AE1;
        """),format.raw/*150.9*/("""}"""),format.raw/*150.10*/("""

        """),format.raw/*152.9*/(""".update """),format.raw/*152.17*/("""{"""),format.raw/*152.18*/("""
            """),format.raw/*153.13*/("""background-color: ##529AE1;
        """),format.raw/*154.9*/("""}"""),format.raw/*154.10*/("""

        """),format.raw/*156.9*/(""".container """),format.raw/*156.20*/("""{"""),format.raw/*156.21*/("""
            """),format.raw/*157.13*/("""padding: 50px;
            background: lightblue;



        """),format.raw/*162.9*/("""}"""),format.raw/*162.10*/("""


        """),format.raw/*165.9*/("""hr """),format.raw/*165.12*/("""{"""),format.raw/*165.13*/("""
            """),format.raw/*166.13*/("""border: 1px solid #f1f1f1;
            margin-bottom: 25px;
        """),format.raw/*168.9*/("""}"""),format.raw/*168.10*/("""

        """),format.raw/*170.9*/("""label """),format.raw/*170.15*/("""{"""),format.raw/*170.16*/("""
            """),format.raw/*171.13*/("""padding: 8px;


        """),format.raw/*174.9*/("""}"""),format.raw/*174.10*/("""

        """),format.raw/*176.9*/("""input[type=submit] """),format.raw/*176.28*/("""{"""),format.raw/*176.29*/("""
            """),format.raw/*177.13*/("""background-color: #529AE1;
            border: none;
            color: white;
            padding: 16px 32px;
            text-decoration: none;
            margin: 4px 2px;
            cursor: pointer;
        """),format.raw/*184.9*/("""}"""),format.raw/*184.10*/("""

        """),format.raw/*186.9*/("""ul """),format.raw/*186.12*/("""{"""),format.raw/*186.13*/("""
            """),format.raw/*187.13*/("""list-style-type: none;
            margin: 0;
            padding: 0;
            overflow: hidden;
            background-color: #333;
        """),format.raw/*192.9*/("""}"""),format.raw/*192.10*/("""

        """),format.raw/*194.9*/("""li """),format.raw/*194.12*/("""{"""),format.raw/*194.13*/("""
            """),format.raw/*195.13*/("""float: left;
        """),format.raw/*196.9*/("""}"""),format.raw/*196.10*/("""

        """),format.raw/*198.9*/("""li a """),format.raw/*198.14*/("""{"""),format.raw/*198.15*/("""
            """),format.raw/*199.13*/("""display: block;
            color: white;
            text-align: center;
            padding: 14px 16px;
            text-decoration: none;
        """),format.raw/*204.9*/("""}"""),format.raw/*204.10*/("""

        """),format.raw/*206.9*/("""li a:hover """),format.raw/*206.20*/("""{"""),format.raw/*206.21*/("""
            """),format.raw/*207.13*/("""background-color: #111;
        """),format.raw/*208.9*/("""}"""),format.raw/*208.10*/(""" """),format.raw/*208.11*/("""*/
    </style>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.12.1/css/all.min.css">
    </head>

    <body>
        <script>
        function autoFillAddress() """),format.raw/*215.36*/("""{"""),format.raw/*215.37*/("""
            """),format.raw/*216.13*/("""let checkBox = document.getElementById('checkBox');

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

            if (checkBox.checked == true) """),format.raw/*235.43*/("""{"""),format.raw/*235.44*/("""
                """),format.raw/*236.17*/("""let pl1v = pl1.value;
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
            """),format.raw/*251.13*/("""}"""),format.raw/*251.14*/(""" """),format.raw/*251.15*/("""else """),format.raw/*251.20*/("""{"""),format.raw/*251.21*/("""
                """),format.raw/*252.17*/("""cl1.value = "";
                cl2.value = "";
                ccity.value = "";
                cdistrict.value = "";
                cstate.value = "";
                ccountry.value = "";
                cpin.value = "";
            """),format.raw/*259.13*/("""}"""),format.raw/*259.14*/("""


        """),format.raw/*262.9*/("""}"""),format.raw/*262.10*/("""

    """),format.raw/*264.5*/("""function admissionBtnHide() """),format.raw/*264.33*/("""{"""),format.raw/*264.34*/("""
        """),format.raw/*265.9*/("""var y = document.getElementById("buttons")
        y.style.display = "none";
    """),format.raw/*267.5*/("""}"""),format.raw/*267.6*/("""

    """),format.raw/*269.5*/("""</script>

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
                                value='"""),_display_(/*282.41*/stu_name/*282.49*/.get("first_name")),format.raw/*282.67*/("""' onkeyup="stu_validFName()"
                                placeholder="First Name" />
                            </div>
                            <div class="input_group">
                                <p>Middle Name</p>
                                <input type="text" id="stu_middle_name" name="stu_middlename"
                                value='"""),_display_(/*288.41*/stu_name/*288.49*/.get("middle_name")),format.raw/*288.68*/("""' placeholder="Middle Name" />
                            </div>
                            <div class="input_group">
                                <p>Last Name</p>
                                <input type="text" id="stu_last_name" name="stu_lastname" value='"""),_display_(/*292.99*/stu_name/*292.107*/.get("last_name")),format.raw/*292.124*/("""'
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
                                <input type="text" name="stu_per_l1" value='"""),_display_(/*305.78*/stu_per_address/*305.93*/.get("line1")),format.raw/*305.106*/("""' id="stu_perm_l1" />
                            </div>
                            <div class="input_group">
                                <p> Line 2: </p>
                                <input type="text" name="stu_per_l2" value='"""),_display_(/*309.78*/stu_per_address/*309.93*/.get("line2")),format.raw/*309.106*/("""'
                                id="stu_perm_l2" />
                            </div>
                            <div class="input_group">
                                <p> City: </p>
                                <input type="text" name="stu_per_city" value='"""),_display_(/*314.80*/stu_per_address/*314.95*/.get("city")),format.raw/*314.107*/("""'
                                id="stu_perm_city" />
                            </div>
                            <div class="input_group">
                                <p>District:</p>
                                <input type="text" name="stu_per_district" id="stu_perm_district"
                                value="""),_display_(/*320.40*/stu_per_address/*320.55*/.get("district")),format.raw/*320.71*/(""">
                            </div>
                            <div class="input_group">
                                <p> State: </p>
                                <input type="text" name="stu_per_state" value='"""),_display_(/*324.81*/stu_per_address/*324.96*/.get("state")),format.raw/*324.109*/("""'
                                id="stu_perm_state" />
                            </div>
                            <div class="input_group">
                                <p> Country: </p>
                                <input type="text" name="stu_per_country" value='"""),_display_(/*329.83*/stu_per_address/*329.98*/.get("country")),format.raw/*329.113*/("""'
                                id="stu_perm_country" />
                            </div>
                            <div class="input_group">
                                <p> Pin-code: </p>
                                <input type="number" name="stu_per_pin" value='"""),_display_(/*334.81*/stu_per_address/*334.96*/.get("pin-code")),format.raw/*334.112*/("""'
                                id="stu_perm_pin" />
                            </div>

                        </div>
                    </div>

                    <div class="form_group">
                        <p>Current Address</p>
                        <div>
                            <input type="checkbox" id="checkBox"  onclick="autoFillAddress()"> Is current address same as permanent address
                        </div>

                        <div class="group">
                            <div class="input_group">
                                <p> Line 1: </p>
                                <input type="text" name="stu_curr_l1" value='"""),_display_(/*350.79*/stu_curr_address/*350.95*/.get("line1")),format.raw/*350.108*/("""'
                                id="stu_curre_l1" />
                            </div>

                            <div class="input_group">
                                <p> Line 2: </p>
                                <input type="text" name="stu_curr_l2" value='"""),_display_(/*356.79*/stu_curr_address/*356.95*/.get("line2")),format.raw/*356.108*/("""'
                                id="stu_curre_l2" />
                            </div>
                            <div class="input_group">
                                <p> City: </p>
                                <input type="text" name="stu_curr_city" value='"""),_display_(/*361.81*/stu_curr_address/*361.97*/.get("city")),format.raw/*361.109*/("""'
                                id="stu_curre_city" />
                            </div>

                            <div class="input_group">
                                <p> District: </p>
                                <input type="text" name="stu_curr_district" value='"""),_display_(/*367.85*/stu_curr_address/*367.101*/.get("district")),format.raw/*367.117*/("""'
                                id="stu_curre_district" />
                            </div>

                            <div class="input_group">
                                <p> State: </p>
                                <input type="text" name="stu_curr_state" value='"""),_display_(/*373.82*/stu_curr_address/*373.98*/.get("state")),format.raw/*373.111*/("""'
                                id="stu_curre_state" />
                            </div>

                            <div class="input_group">
                                <p> Country: </p>
                                <input type="text" name="stu_curr_country" value='"""),_display_(/*379.84*/stu_curr_address/*379.100*/.get("country")),format.raw/*379.115*/("""'
                                id="stu_curre_country" />
                            </div>

                            <div class="input_group">
                                <p> Pin-code: </p>
                                <input type="number" name="stu_curr_pin" value='"""),_display_(/*385.82*/stu_curr_address/*385.98*/.get("pin-code")),format.raw/*385.114*/("""'
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
                                value='"""),_display_(/*402.41*/stu_preEdu/*402.51*/.get("college_name")),format.raw/*402.71*/("""' />
                            </div>
                            <div class="input_group">
                                <p>Grade:</p>
                                <input type="text" id="prev_grade" name="pre_grade" value='"""),_display_(/*406.93*/stu_preEdu/*406.103*/.get("grade")),format.raw/*406.116*/("""' />
                            </div>
                            <div class="input_group">
                                <p>Previous Roll No:</p>
                                <input type=number id="prev_rollNo" name="pre_rollNo"
                                value='"""),_display_(/*411.41*/stu_preEdu/*411.51*/.get("prev_rollno")),format.raw/*411.70*/("""'>
                            </div>
                            <div class="input_group">
                                <p>Passing Year</p>
                                <input type="number" id="prev_pass_year" name="pass_year"
                                value='"""),_display_(/*416.41*/stu_preEdu/*416.51*/.get("passing_year")),format.raw/*416.71*/("""'>
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
                                value='"""),_display_(/*431.41*/stu_local_name/*431.55*/.get("first_name")),format.raw/*431.73*/("""' />
                            </div>
                            <div class="input_group">
                                <p>Middle name:</p>
                                <input type="text" id="gua_middleName" name="gua_mid_name"
                                value='"""),_display_(/*436.41*/stu_local_name/*436.55*/.get("middle_name")),format.raw/*436.74*/("""' />
                            </div>
                            <div class="input_group">
                                <p>Last name:</p>
                                <input type="text" id="gua_lastName" name="gua_last_name"
                                value='"""),_display_(/*441.41*/stu_local_name/*441.55*/.get("last_name")),format.raw/*441.72*/("""' />
                            </div>
                            <div class="input_group">
                                <p>Mobile Number:</p>
                                <input type="text" id="gua_mobile_no" name="gua_mob_no" pattern="[0-9]"""),format.raw/*445.103*/("""{"""),format.raw/*445.104*/("""10"""),format.raw/*445.106*/("""}"""),format.raw/*445.107*/(""""
                                value='"""),_display_(/*446.41*/stu_local/*446.50*/.get("contactno")),format.raw/*446.67*/("""' />
                            </div>
                            <div class="input_group">
                                <p>Email ID:</p>
                                <input type="email" id="guaEmail" name="gua_email" value='"""),_display_(/*450.92*/stu_local/*450.101*/.get("emailid")),format.raw/*450.116*/("""' />
                            </div>
                        </div>

                    </div>


                    <div class="form_group">
                        <p>Guardian Address</p>
                        <div class="group">

                            <div class="input_group">
                                <p> Line 1: </p>
                                <input type="text" id="gua_addr_l1" name="gua_add_l1"
                                value='"""),_display_(/*464.41*/stu_local_address/*464.58*/.get("line1")),format.raw/*464.71*/("""' />

                            </div>

                            <div class="input_group">
                                <p> Line 2: </p>
                                <input type="text" id="gua_addr_l2" name="gua_add_l2"
                                value='"""),_display_(/*471.41*/stu_local_address/*471.58*/.get("line2")),format.raw/*471.71*/("""' />
                            </div>

                            <div class="input_group">
                                <p> City: </p>
                                <input type="text" id="gua_addr_city" name="gua_add_city"
                                value='"""),_display_(/*477.41*/stu_local_address/*477.58*/.get("city")),format.raw/*477.70*/("""' />
                            </div>

                            <div class="input_group">
                                <p>District:</p>
                                <input type="text" id="gua_addr_district" name="gua_add_district"
                                value='"""),_display_(/*483.41*/stu_local_address/*483.58*/.get("district")),format.raw/*483.74*/("""' />
                            </div>
                            <div class="input_group">
                                <p> State: </p>
                                <input type="text" id="gua_addr_state" name="gua_add_state"
                                value='"""),_display_(/*488.41*/stu_local_address/*488.58*/.get("state")),format.raw/*488.71*/("""' />
                            </div>

                            <div class="input_group">
                                <p> Country: </p>
                                <input type="text" id="gua_addr_country" name="gua_add_country"
                                value='"""),_display_(/*494.41*/stu_local_address/*494.58*/.get("country")),format.raw/*494.73*/("""' />
                            </div>

                            <div class="input_group">
                                <p> Pin-code: </p>
                                <input type="number" id="gua_addr_pin" name="gua_add_pin"
                                value='"""),_display_(/*500.41*/stu_local_address/*500.58*/.get("pin-code")),format.raw/*500.74*/("""' />
                            </div>
                        </div>
                    </div>



                        <!--------------------------Student Branch Details ---------------------------->

                    <div class="form_group">
                        <p>Enter selected Branch</p>
                        <div class="group_col">
                            <div class="input_group">

                                <p>Branch: </p>
                                <input type="text" id="stu_branch" name="branch" value='"""),_display_(/*515.90*/stu_branch),format.raw/*515.100*/("""'>
                            </div>
                        </div>
                    </div>



                        <!-------------------------Student Govt Id Details ------------------------->
                    <div class="form_group">
                        <p>Student Government Id Details</p>
                        <div class="group_col">
                            <div class="input_group">

                                <p>Aadhar Card Number of Student:</p>
                                <input type="text" id="stu_aadhaar_no" name="stu_aadhar_no" value='"""),_display_(/*529.101*/stu_aadhar),format.raw/*529.111*/("""' />
                            </div>
                        </div>
                    </div>



                        <!---------------------------Student Fee Details --------------------------->
                    <div class="form_group">
                        <p>Student Fee Details</p>

                        <div class="group_col">
                            <div class="input_group">
                                <p>Total Amount:</p>
                                <input type="number" id="stu_fee_total" name="fee_total" value='"""),_display_(/*543.98*/stu_fee/*543.105*/.get("amount")),format.raw/*543.119*/("""' />
                            </div>
                            <div class="input_group">
                                <p>Paid: </p>
                                <input type="number" id="stu_fee_paid" name="fee_paid" value='"""),_display_(/*547.96*/stu_fee/*547.103*/.get("paid")),format.raw/*547.115*/("""'>
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
                                    <option value='"""),_display_(/*561.53*/stu_category),format.raw/*561.65*/("""' selected hidden>"""),_display_(/*561.84*/stu_category),format.raw/*561.96*/("""</option>
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
                                <input type="number" id="stu_admission_year" name="admission_year" value='"""),_display_(/*579.108*/stu_year),format.raw/*579.116*/("""'>
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
                                    <option value='"""),_display_(/*593.53*/stu_hostel),format.raw/*593.63*/("""' selected hidden>"""),_display_(/*593.82*/stu_hostel),format.raw/*593.92*/("""</option>
                                    <option value="yes">Yes</option>
                                    <option value="no">No</option>
                                </select>
                            </div>
                        </div>
                    </div>

                    <input type="hidden" name="student_id" value="""),_display_(/*601.67*/idMap/*601.72*/.get("$oid")),format.raw/*601.84*/(""">

                    """),_display_(/*603.22*/if(updateView)/*603.36*/{_display_(Seq[Any](format.raw/*603.37*/("""
                        """),format.raw/*604.25*/("""<input type="submit" name="submit" value="Submit" formaction="/admissionUpdateData" class="btn">
                    """)))}/*605.23*/else/*605.28*/{_display_(Seq[Any](format.raw/*605.29*/("""
                        """),format.raw/*606.25*/("""<input type="submit" name="Submit" value="Submit" class="btn" />
                    """)))}),format.raw/*607.22*/("""

                    """),format.raw/*609.21*/("""<input type="submit" name="submit" value="cancel" formaction="/index1" class="btn">

                </form>
            </div>
        </div>
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
                  HASH: 37c651314532c4a92ec705b53f73fd67433138e8
                  MATRIX: 925->3|1384->366|1414->370|1587->515|1616->516|1658->530|1710->555|1739->556|1778->568|1812->574|1841->575|1883->589|1934->613|1963->614|2002->626|2035->631|2064->632|2106->646|2211->724|2240->725|2279->737|2320->750|2349->751|2391->765|2575->922|2604->923|2643->935|2693->957|2722->958|2764->972|3145->1326|3174->1327|3213->1339|3254->1352|3283->1353|3325->1367|3456->1471|3485->1472|3524->1484|3569->1501|3598->1502|3640->1516|3893->1742|3922->1743|3961->1755|4001->1767|4030->1768|4072->1782|4299->1982|4328->1983|4367->1995|4397->1997|4426->1998|4468->2012|4619->2136|4648->2137|4687->2149|4746->2180|4775->2181|4817->2195|4983->2334|5012->2335|5051->2347|5098->2366|5127->2367|5169->2381|5476->2661|5505->2662|5544->2674|5592->2694|5621->2695|5663->2709|5885->2903|5915->2904|5955->2916|5991->2923|6021->2924|6064->2938|6277->3123|6307->3124|6349->3138|6391->3151|6421->3152|6464->3166|6516->3190|6546->3191|6586->3203|6626->3214|6656->3215|6699->3229|6871->3373|6901->3374|6941->3386|6979->3395|7009->3396|7054->3412|7239->3569|7269->3570|7309->3582|7345->3589|7375->3590|7418->3604|7680->3838|7710->3839|7750->3851|7790->3862|7820->3863|7863->3877|7928->3914|7958->3915|7998->3927|8033->3933|8063->3934|8106->3948|8170->3984|8200->3985|8240->3997|8277->4005|8307->4006|8350->4020|8415->4057|8445->4058|8485->4070|8525->4081|8555->4082|8598->4096|8692->4162|8722->4163|8764->4177|8796->4180|8826->4181|8869->4195|8967->4265|8997->4266|9037->4278|9072->4284|9102->4285|9145->4299|9200->4326|9230->4327|9270->4339|9318->4358|9348->4359|9391->4373|9638->4592|9668->4593|9708->4605|9740->4608|9770->4609|9813->4623|9990->4772|10020->4773|10060->4785|10092->4788|10122->4789|10165->4803|10215->4825|10245->4826|10285->4838|10319->4843|10349->4844|10392->4858|10574->5012|10604->5013|10644->5025|10684->5036|10714->5037|10757->5051|10818->5084|10848->5085|10878->5086|11120->5299|11150->5300|11193->5314|12282->6374|12312->6375|12359->6393|12974->6979|13004->6980|13034->6981|13068->6986|13098->6987|13145->7005|13418->7249|13448->7250|13490->7264|13520->7265|13556->7273|13613->7301|13643->7302|13681->7312|13792->7395|13821->7396|13857->7404|14473->7992|14491->8000|14531->8018|14928->8387|14946->8395|14987->8414|15286->8685|15305->8693|15345->8710|15901->9238|15926->9253|15962->9266|16231->9507|16256->9522|16292->9535|16594->9809|16619->9824|16654->9836|17019->10173|17044->10188|17082->10204|17333->10427|17358->10442|17394->10455|17705->10738|17730->10753|17768->10768|18080->11052|18105->11067|18144->11083|18857->11768|18883->11784|18919->11797|19225->12075|19251->12091|19287->12104|19591->12380|19617->12396|19652->12408|19968->12696|19995->12712|20034->12728|20348->13014|20374->13030|20410->13043|20725->13330|20752->13346|20790->13361|21106->13649|21132->13665|21171->13681|21857->14339|21877->14349|21919->14369|22183->14605|22204->14615|22240->14628|22550->14910|22570->14920|22611->14939|22918->15218|22938->15228|22980->15248|23621->15861|23645->15875|23685->15893|23995->16175|24019->16189|24060->16208|24367->16487|24391->16501|24430->16518|24714->16772|24745->16773|24777->16775|24808->16776|24879->16819|24898->16828|24937->16845|25203->17083|25223->17092|25261->17107|25771->17589|25798->17606|25833->17619|26139->17897|26166->17914|26201->17927|26507->18205|26534->18222|26568->18234|26884->18522|26911->18539|26949->18555|27256->18834|27283->18851|27318->18864|27633->19151|27660->19168|27697->19183|28007->19465|28034->19482|28072->19498|28660->20058|28693->20068|29316->20662|29349->20672|29943->21238|29961->21245|29998->21259|30265->21498|30283->21505|30318->21517|30946->22117|30980->22129|31027->22148|31061->22160|32030->23100|32061->23108|32696->23715|32728->23725|32775->23744|32807->23754|33191->24110|33206->24115|33240->24127|33294->24153|33318->24167|33358->24168|33413->24194|33552->24314|33566->24319|33606->24320|33661->24346|33780->24433|33833->24457
                  LINES: 21->2|26->2|28->4|34->10|34->10|35->11|36->12|36->12|38->14|38->14|38->14|39->15|40->16|40->16|42->18|42->18|42->18|43->19|45->21|45->21|47->23|47->23|47->23|48->24|53->29|53->29|55->31|56->32|56->32|57->33|68->44|68->44|70->46|70->46|70->46|71->47|73->49|73->49|75->51|75->51|75->51|76->52|83->59|83->59|85->61|85->61|85->61|86->62|92->68|92->68|94->70|94->70|94->70|95->71|99->75|99->75|101->77|102->78|102->78|103->79|107->83|107->83|109->85|109->85|109->85|110->86|118->94|118->94|120->96|120->96|120->96|121->97|126->102|126->102|128->104|128->104|128->104|129->105|134->110|134->110|137->113|137->113|137->113|138->114|139->115|139->115|141->117|141->117|141->117|142->118|146->122|146->122|148->124|148->124|148->124|150->126|155->131|155->131|157->133|157->133|157->133|158->134|166->142|166->142|168->144|168->144|168->144|169->145|170->146|170->146|172->148|172->148|172->148|173->149|174->150|174->150|176->152|176->152|176->152|177->153|178->154|178->154|180->156|180->156|180->156|181->157|186->162|186->162|189->165|189->165|189->165|190->166|192->168|192->168|194->170|194->170|194->170|195->171|198->174|198->174|200->176|200->176|200->176|201->177|208->184|208->184|210->186|210->186|210->186|211->187|216->192|216->192|218->194|218->194|218->194|219->195|220->196|220->196|222->198|222->198|222->198|223->199|228->204|228->204|230->206|230->206|230->206|231->207|232->208|232->208|232->208|239->215|239->215|240->216|259->235|259->235|260->236|275->251|275->251|275->251|275->251|275->251|276->252|283->259|283->259|286->262|286->262|288->264|288->264|288->264|289->265|291->267|291->267|293->269|306->282|306->282|306->282|312->288|312->288|312->288|316->292|316->292|316->292|329->305|329->305|329->305|333->309|333->309|333->309|338->314|338->314|338->314|344->320|344->320|344->320|348->324|348->324|348->324|353->329|353->329|353->329|358->334|358->334|358->334|374->350|374->350|374->350|380->356|380->356|380->356|385->361|385->361|385->361|391->367|391->367|391->367|397->373|397->373|397->373|403->379|403->379|403->379|409->385|409->385|409->385|426->402|426->402|426->402|430->406|430->406|430->406|435->411|435->411|435->411|440->416|440->416|440->416|455->431|455->431|455->431|460->436|460->436|460->436|465->441|465->441|465->441|469->445|469->445|469->445|469->445|470->446|470->446|470->446|474->450|474->450|474->450|488->464|488->464|488->464|495->471|495->471|495->471|501->477|501->477|501->477|507->483|507->483|507->483|512->488|512->488|512->488|518->494|518->494|518->494|524->500|524->500|524->500|539->515|539->515|553->529|553->529|567->543|567->543|567->543|571->547|571->547|571->547|585->561|585->561|585->561|585->561|603->579|603->579|617->593|617->593|617->593|617->593|625->601|625->601|625->601|627->603|627->603|627->603|628->604|629->605|629->605|629->605|630->606|631->607|633->609
                  -- GENERATED --
              */
          