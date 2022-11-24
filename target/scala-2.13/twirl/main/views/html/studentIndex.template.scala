
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

object studentIndex extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template9[Map[String, Any],Map[String, Any],Map[String, Any],Map[String, Any],Map[String, Any],Map[String, Any],Map[String, Any],Map[String, Any],Boolean,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(idMap:Map[String,Any],stud_name: Map[String,Any],stud_DOB:Map[String,Any],stud_contact_details:
Map[String,Any],stud_per_address:
Map[String,Any],father_details:Map[String,Any],mother_details:Map[String,Any],govt_id:Map[String,Any],
updateView:Boolean):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*4.20*/("""

"""),format.raw/*6.1*/("""<html lang="en">

<head>
        <meta charset="UTF-8">
        <title>Student Basic Details</title>
        <style>
    .show """),format.raw/*12.11*/("""{"""),format.raw/*12.12*/("""
      """),format.raw/*13.7*/("""display: block;
    """),format.raw/*14.5*/("""}"""),format.raw/*14.6*/("""

    """),format.raw/*16.5*/(""".hide """),format.raw/*16.11*/("""{"""),format.raw/*16.12*/("""
      """),format.raw/*17.7*/("""display: none;
    """),format.raw/*18.5*/("""}"""),format.raw/*18.6*/("""

    """),format.raw/*20.5*/("""body """),format.raw/*20.10*/("""{"""),format.raw/*20.11*/("""
      """),format.raw/*21.7*/("""font-family: Calibri, Helvetica, sans-serif;
      margin: 0;
    """),format.raw/*23.5*/("""}"""),format.raw/*23.6*/("""

    """),format.raw/*25.5*/(""".show_option """),format.raw/*25.18*/("""{"""),format.raw/*25.19*/("""
      """),format.raw/*26.7*/("""padding: 10px;
      background: #000000;
      display: grid;
      align-content: center;
      justify-content: end;
    """),format.raw/*31.5*/("""}"""),format.raw/*31.6*/("""

    """),format.raw/*33.5*/("""button,
    .btn """),format.raw/*34.10*/("""{"""),format.raw/*34.11*/("""
      """),format.raw/*35.7*/("""border: 0;
      background: rgb(78, 129, 207);
      padding: 10px;
      border-radius: 5px;
      width: 100px;
      font-size: 20px;
      height: 50px;
      color: white;
      box-shadow: 0px 0px;
      transition: box-shadow ease-in 1ms 1ms;
      margin-top:25px;
    """),format.raw/*46.5*/("""}"""),format.raw/*46.6*/("""

    """),format.raw/*48.5*/("""button:hover """),format.raw/*48.18*/("""{"""),format.raw/*48.19*/("""
      """),format.raw/*49.7*/("""box-shadow: 2px 3px 2px 0px #899dbe;
      /* transition: border-shadow 12s ease-in; */
    """),format.raw/*51.5*/("""}"""),format.raw/*51.6*/("""

    """),format.raw/*53.5*/(""".popup_container """),format.raw/*53.22*/("""{"""),format.raw/*53.23*/("""
      """),format.raw/*54.7*/("""background: #ffffff;
      padding: 30px;
      /* width: 800px; */
      /* height: 800px; */
      /* position: absolute; */
      /* left: 57px; */
      /* top: 100px; */
    """),format.raw/*61.5*/("""}"""),format.raw/*61.6*/("""

    """),format.raw/*63.5*/(""".form_group """),format.raw/*63.17*/("""{"""),format.raw/*63.18*/("""
      """),format.raw/*64.7*/("""display: grid;
      grid-auto-flow: row;
      /* justify-items: center; */
      /* align-items: center; */
      margin-bottom: 1px;
      padding: 1px;
    """),format.raw/*70.5*/("""}"""),format.raw/*70.6*/("""

    """),format.raw/*72.5*/("""p """),format.raw/*72.7*/("""{"""),format.raw/*72.8*/("""
      """),format.raw/*73.7*/("""justify-self: self-start;
      font-size: 20px;
      color: black;
      font-weight: bold;
    """),format.raw/*77.5*/("""}"""),format.raw/*77.6*/("""

    """),format.raw/*79.5*/(""".input_group p,
    p """),format.raw/*80.7*/("""{"""),format.raw/*80.8*/("""
      """),format.raw/*81.7*/("""justify-self: self-start;
      font-size: 17px;
      color: #757087;
      font-weight: normal !important;
    """),format.raw/*85.5*/("""}"""),format.raw/*85.6*/("""

    """),format.raw/*87.5*/(""".input_group input """),format.raw/*87.24*/("""{"""),format.raw/*87.25*/("""
      """),format.raw/*88.7*/("""height: 40px;
      border: 1.5px #d7deee solid;
      border-radius: 4px;
      box-shadow: 1px 1px 4px 0px #d3cece;
      padding: 10px;
      font-size: 15px;
      outline: none;
      transition: border ease-in 10ms;
    """),format.raw/*96.5*/("""}"""),format.raw/*96.6*/("""

    """),format.raw/*98.5*/(""".form_group.address """),format.raw/*98.25*/("""{"""),format.raw/*98.26*/("""
      """),format.raw/*99.7*/("""display: grid;
      grid-auto-flow: row;
      /* justify-items: center; */
      /* align-items: center; */
      /* grid-template-columns: 200px auto; */
    """),format.raw/*104.5*/("""}"""),format.raw/*104.6*/("""

    """),format.raw/*106.5*/(""".group """),format.raw/*106.12*/("""{"""),format.raw/*106.13*/("""
      """),format.raw/*107.7*/("""display: grid;
      grid-auto-flow: row;
      grid-template-columns: repeat(3, 300px);
      grid-column-gap: 30px;
      /* margin-top: 76px; */
    """),format.raw/*112.5*/("""}"""),format.raw/*112.6*/("""


    """),format.raw/*115.5*/(""".input_group """),format.raw/*115.18*/("""{"""),format.raw/*115.19*/("""
      """),format.raw/*116.7*/("""display: grid;
    """),format.raw/*117.5*/("""}"""),format.raw/*117.6*/("""

    """),format.raw/*119.5*/(""".group_col """),format.raw/*119.16*/("""{"""),format.raw/*119.17*/("""
      """),format.raw/*120.7*/("""display: grid;
      grid-auto-flow: column;
      grid-template-columns: repeat(3, 300px);
      grid-gap: 30px;
    """),format.raw/*124.5*/("""}"""),format.raw/*124.6*/("""

    """),format.raw/*126.5*/("""/* input """),format.raw/*126.14*/("""{"""),format.raw/*126.15*/("""

            """),format.raw/*128.13*/("""padding: 10px;
            margin: 20px 0 30px 0;
            display: inline-block;
            border: none;
            background: #f1f1f1;
        """),format.raw/*133.9*/("""}"""),format.raw/*133.10*/("""

        """),format.raw/*135.9*/("""button """),format.raw/*135.16*/("""{"""),format.raw/*135.17*/("""
            """),format.raw/*136.13*/("""background-color: #529AE1;
            color: white;
            padding: 16px 32px;
            margin: 4px 2px;
            border: none;
            cursor: pointer;
            width: 9%;
            opacity: 0.9;
        """),format.raw/*144.9*/("""}"""),format.raw/*144.10*/("""

        """),format.raw/*146.9*/(""".deleteBtn """),format.raw/*146.20*/("""{"""),format.raw/*146.21*/("""
            """),format.raw/*147.13*/("""background-color: ##529AE1;
        """),format.raw/*148.9*/("""}"""),format.raw/*148.10*/("""

        """),format.raw/*150.9*/(""".view """),format.raw/*150.15*/("""{"""),format.raw/*150.16*/("""
            """),format.raw/*151.13*/("""background-color: #529AE1;
        """),format.raw/*152.9*/("""}"""),format.raw/*152.10*/("""

        """),format.raw/*154.9*/(""".update """),format.raw/*154.17*/("""{"""),format.raw/*154.18*/("""
            """),format.raw/*155.13*/("""background-color: ##529AE1;
        """),format.raw/*156.9*/("""}"""),format.raw/*156.10*/("""

        """),format.raw/*158.9*/(""".container """),format.raw/*158.20*/("""{"""),format.raw/*158.21*/("""
            """),format.raw/*159.13*/("""padding: 50px;
            background: lightblue;
        """),format.raw/*161.9*/("""}"""),format.raw/*161.10*/("""


        """),format.raw/*164.9*/("""hr """),format.raw/*164.12*/("""{"""),format.raw/*164.13*/("""
            """),format.raw/*165.13*/("""border: 1px solid #f1f1f1;
            margin-bottom: 25px;
        """),format.raw/*167.9*/("""}"""),format.raw/*167.10*/("""

        """),format.raw/*169.9*/("""p """),format.raw/*169.11*/("""{"""),format.raw/*169.12*/("""
            """),format.raw/*170.13*/("""padding: 8px;
        """),format.raw/*171.9*/("""}"""),format.raw/*171.10*/("""

        """),format.raw/*173.9*/("""input[type=submit] """),format.raw/*173.28*/("""{"""),format.raw/*173.29*/("""
            """),format.raw/*174.13*/("""background-color: #529AE1;
            border: none;
            color: white;
            padding: 16px 32px;
            text-decoration: none;
            margin: 4px 2px;
            cursor: pointer;
        """),format.raw/*181.9*/("""}"""),format.raw/*181.10*/("""

        """),format.raw/*183.9*/("""ul """),format.raw/*183.12*/("""{"""),format.raw/*183.13*/("""
            """),format.raw/*184.13*/("""list-style-type: none;
            margin: 0;
            padding: 0;
            overflow: hidden;
            background-color: #333;
        """),format.raw/*189.9*/("""}"""),format.raw/*189.10*/("""

        """),format.raw/*191.9*/("""li """),format.raw/*191.12*/("""{"""),format.raw/*191.13*/("""
            """),format.raw/*192.13*/("""float: left;
        """),format.raw/*193.9*/("""}"""),format.raw/*193.10*/("""

        """),format.raw/*195.9*/("""li a """),format.raw/*195.14*/("""{"""),format.raw/*195.15*/("""
            """),format.raw/*196.13*/("""display: block;
            color: white;
            text-align: center;
            padding: 14px 16px;
            text-decoration: none;
        """),format.raw/*201.9*/("""}"""),format.raw/*201.10*/("""

        """),format.raw/*203.9*/("""li a:hover """),format.raw/*203.20*/("""{"""),format.raw/*203.21*/("""
            """),format.raw/*204.13*/("""background-color: #111;
        """),format.raw/*205.9*/("""}"""),format.raw/*205.10*/(""" """),format.raw/*205.11*/("""*/
  </style>
        <!--    <div>-->
        <!--        <script src="D:\IntellG\Play_Framework\First_Play_project\First_Play_project\public\javascripts\index.js"></script>-->
        <!--    </div>-->
</head>

<body>
<div class="popup_container">
        <div class="insert_form">
                <h2>Student Information</h2>
                <form method="get" action="/studentForm">
                        <div class="form_group">
                                <div class="group_col ">
                                        <div class="input_group">
                                                <p>First name:</p>
                                                <input type="text" name="student_first_name" value="""),_display_(/*221.101*/stud_name/*221.110*/.get("first_name")),format.raw/*221.128*/(""">
                                        </div>
                                        <div class="input_group">
                                                <p>Middle name:</p>
                                                <input type="text" name="student_middle_name" value="""),_display_(/*225.102*/stud_name/*225.111*/.get("middle_name")),format.raw/*225.130*/(""">
                                        </div>
                                        <div class="input_group">
                                                <p>Last name:</p>
                                                <input type="text" name="student_last_name" value="""),_display_(/*229.100*/stud_name/*229.109*/.get("last_name")),format.raw/*229.126*/(""">
                                        </div>
                                </div>
                        </div>

                        <!-------------------------Birth Date Of Student ------------------------------->

                        <div class="form_group">
                                <div class="group_col">
                                        <div class="input_group">
                                                <p>Date of Birth:</p>
                                                <input type="date" name="student_dob" value='"""),_display_(/*240.95*/stud_DOB/*240.103*/.get("student_DOB")),format.raw/*240.122*/("""' />
                                        </div>
                                </div>
                        </div>

                        <!---------------------------Student Govt Id Details --------------------------->
                        <div class="form_group">
                                <div class="group_col">
                                        <div class="input_group">
                                                <p>Aadhar Card Number of Student:</p>
                                                <input type="tel" name="govt_id" pattern="[0-9]"""),format.raw/*250.96*/("""{"""),format.raw/*250.97*/("""12"""),format.raw/*250.99*/("""}"""),format.raw/*250.100*/("""" title="Twelve digits code"
                                                       value='"""),_display_(/*251.64*/govt_id/*251.71*/.get("aadhar_no")),format.raw/*251.88*/("""'><br>
                                        </div>
                                </div>
                        </div>

                        <input type="hidden" name="student_id" value="""),_display_(/*256.71*/idMap/*256.76*/.get("$oid")),format.raw/*256.88*/(""">



                        <!-- -----------------Address Of Student ------------------------------------------->
                        <div class="form_group">
                                <h3>Permanent Address</h3>

                                <!-- <h4>"""),_display_(/*264.43*/stud_per_address/*264.59*/.get("line1")),format.raw/*264.72*/("""</h4> -->
                                <div class="group">


                                        <div class="input_group">
                                                <p> Line 1: </p>
                                                <input type="text" name="line1" value='"""),_display_(/*270.89*/stud_per_address/*270.105*/.get("line1")),format.raw/*270.118*/("""' />
                                        </div>
                                        <div class="input_group">
                                                <p> Line 2: </p>
                                                <input type="text" name="line2" value='"""),_display_(/*274.89*/stud_per_address/*274.105*/.get("line2")),format.raw/*274.118*/("""'>
                                        </div>
                                        <div class="input_group">
                                                <p> City: </p>
                                                <input type="text" name="city" value="""),_display_(/*278.87*/stud_per_address/*278.103*/.get("city")),format.raw/*278.115*/(""">
                                        </div>
                                        <div class="input_group">
                                                <p> District: </p>
                                                <input type="text" name="district" value="""),_display_(/*282.91*/stud_per_address/*282.107*/.get("district")),format.raw/*282.123*/(""">
                                        </div>
                                        <div class="input_group">
                                                <p> State: </p>
                                                <input type="text" name="state" value="""),_display_(/*286.88*/stud_per_address/*286.104*/.get("state")),format.raw/*286.117*/(""">
                                        </div>
                                        <div class="input_group">
                                                <p> Country: </p>
                                                <input type="text" name="country" value="""),_display_(/*290.90*/stud_per_address/*290.106*/.get("country")),format.raw/*290.121*/(""">
                                        </div>
                                        <div class="input_group">
                                                <p> Pin-code: </p>
                                                <input type="number" name="pincode" value="""),_display_(/*294.92*/stud_per_address/*294.108*/.get("pincode")),format.raw/*294.123*/(""">
                                        </div>
                                </div>
                        </div>


                        <!--------------------------Student Contact Details ---------------------------->

                        <div class="form_group">
                                <h3>Contact Details Of Student</h3>
                                <div class="group">
                                        <div class="input_group">
                                                <p>Mobile Number:</p>
                                                <input type="tel" name="student_mob_no" pattern="[0-9]"""),format.raw/*307.103*/("""{"""),format.raw/*307.104*/("""10"""),format.raw/*307.106*/("""}"""),format.raw/*307.107*/("""" title="Ten digits code"
                                                       value="""),_display_(/*308.63*/stud_contact_details/*308.83*/.get("student_mob_no")),format.raw/*308.105*/(""">
                                        </div>
                                        <div class="input_group">
                                                <p>Email ID:</p>
                                                <input type="email" name="student_email" value="""),_display_(/*312.97*/stud_contact_details/*312.117*/.get("student_email_id")),format.raw/*312.141*/(""">
                                        </div>
                                </div>
                        </div>


                        <h3>Parents Details Of Student</h3>

                        <div class="form_group">
                                <h4>Father Details of Student</h4>
                                <div class="group">
                                        <div class="input_group">
                                                <p>First name:</p>
                                                <input type="text" name="father_first_name" value='"""),_display_(/*325.101*/father_details/*325.115*/.get("first_name")),format.raw/*325.133*/("""'>
                                        </div>
                                        <div class="input_group">
                                                <p>Middle name:</p>
                                                <input type="text" name="father_mid_name" value='"""),_display_(/*329.99*/father_details/*329.113*/.get("middle_name")),format.raw/*329.132*/("""'>
                                        </div>
                                        <div class="input_group">
                                                <p>Last name:</p>
                                                <input type="text" name="father_last_name" value='"""),_display_(/*333.100*/father_details/*333.114*/.get("last_name")),format.raw/*333.131*/("""'>
                                        </div>
                                        <div class="input_group">
                                                <p>Mobile Number:</p>
                                                <input type="tel" name="father_mob_no" pattern="[0-9]"""),format.raw/*337.102*/("""{"""),format.raw/*337.103*/("""10"""),format.raw/*337.105*/("""}"""),format.raw/*337.106*/("""" title="Ten digits code"
                                                       value='"""),_display_(/*338.64*/father_details/*338.78*/.get("father_mob_no")),format.raw/*338.99*/("""'>
                                        </div>
                                        <div class="input_group">
                                                <p>Email ID:</p>
                                                <input type="email" name="father_email" value='"""),_display_(/*342.97*/father_details/*342.111*/.get("father_email_id")),format.raw/*342.134*/("""'>
                                        </div>
                                </div>
                        </div>

                        <h4>Mother Details of Student</h4>

                       <div class="form_group">
                               <div class="group">
                                       <div class="input_group">
                                               <p>First name:</p>
                                               <input type="text" name="mother_first_name" value='"""),_display_(/*353.100*/mother_details/*353.114*/.get("first_name")),format.raw/*353.132*/("""'>
                                       </div>
                                       <div class="input_group">
                                               <p>Middle name:</p>
                                               <input type="text" name="mother_mid_name" value='"""),_display_(/*357.98*/mother_details/*357.112*/.get("middle_name")),format.raw/*357.131*/("""'>
                                       </div>
                                       <div class="input_group">
                                               <p>Last name:</p>
                                               <input type="text" name="mother_last_name" value='"""),_display_(/*361.99*/mother_details/*361.113*/.get("last_name")),format.raw/*361.130*/("""'>
                                       </div>
                                       <div class="input_group">
                                               <p>Mobile Number:</p>
                                               <input type="tel" name="mother_mob_no" pattern="[0-9]"""),format.raw/*365.101*/("""{"""),format.raw/*365.102*/("""10"""),format.raw/*365.104*/("""}"""),format.raw/*365.105*/("""" title="Ten digits code"
                                                      value='"""),_display_(/*366.63*/mother_details/*366.77*/.get("mother_mob_no")),format.raw/*366.98*/("""' required />
                                       </div>
                                       <div class="input_group">
                                               <p>Email ID:</p>
                                               <input type="email" name="mother_email" value='"""),_display_(/*370.96*/mother_details/*370.110*/.get("mother_email_id")),format.raw/*370.133*/("""'>
                                       </div>
                               </div>
                       </div>


                        <div>
                        """),_display_(/*377.26*/if(updateView)/*377.40*/{_display_(Seq[Any](format.raw/*377.41*/("""
                        """),format.raw/*378.25*/("""<input type="submit" name="submit" value="Submit" formaction="/studentUpdateFullData" class="btn">
                        """)))}/*379.27*/else/*379.32*/{_display_(Seq[Any](format.raw/*379.33*/("""
                        """),format.raw/*380.25*/("""<input type="submit" name="Submit" value="Submit" class="btn" />
                        """)))}),format.raw/*381.26*/("""

                        """),format.raw/*383.25*/("""<input type="submit" name="submit" value="Cancel" formaction="/index1" class="btn">
                        </div>
                </form>
        </div>
</div>


</body>

</html>"""))
      }
    }
  }

  def render(idMap:Map[String, Any],stud_name:Map[String, Any],stud_DOB:Map[String, Any],stud_contact_details:Map[String, Any],stud_per_address:Map[String, Any],father_details:Map[String, Any],mother_details:Map[String, Any],govt_id:Map[String, Any],updateView:Boolean): play.twirl.api.HtmlFormat.Appendable = apply(idMap,stud_name,stud_DOB,stud_contact_details,stud_per_address,father_details,mother_details,govt_id,updateView)

  def f:((Map[String, Any],Map[String, Any],Map[String, Any],Map[String, Any],Map[String, Any],Map[String, Any],Map[String, Any],Map[String, Any],Boolean) => play.twirl.api.HtmlFormat.Appendable) = (idMap,stud_name,stud_DOB,stud_contact_details,stud_per_address,father_details,mother_details,govt_id,updateView) => apply(idMap,stud_name,stud_DOB,stud_contact_details,stud_per_address,father_details,mother_details,govt_id,updateView)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/studentIndex.scala.html
                  HASH: 7856566d65ec8bb1432792e904a0e9f85e6814ec
                  MATRIX: 873->1|1224->257|1254->261|1415->394|1444->395|1479->403|1527->424|1555->425|1590->433|1624->439|1653->440|1688->448|1735->468|1763->469|1798->477|1831->482|1860->483|1895->491|1990->559|2018->560|2053->568|2094->581|2123->582|2158->590|2314->719|2342->720|2377->728|2423->746|2452->747|2487->755|2803->1044|2831->1045|2866->1053|2907->1066|2936->1067|2971->1075|3092->1169|3120->1170|3155->1178|3200->1195|3229->1196|3264->1204|3477->1390|3505->1391|3540->1399|3580->1411|3609->1412|3644->1420|3837->1586|3865->1587|3900->1595|3929->1597|3957->1598|3992->1606|4121->1708|4149->1709|4184->1717|4234->1740|4262->1741|4297->1749|4441->1866|4469->1867|4504->1875|4551->1894|4580->1895|4615->1903|4876->2137|4904->2138|4939->2146|4987->2166|5016->2167|5051->2175|5245->2341|5274->2342|5310->2350|5346->2357|5376->2358|5412->2366|5597->2523|5626->2524|5664->2534|5706->2547|5736->2548|5772->2556|5820->2576|5849->2577|5885->2585|5925->2596|5955->2597|5991->2605|6141->2727|6170->2728|6206->2736|6244->2745|6274->2746|6319->2762|6504->2919|6534->2920|6574->2932|6610->2939|6640->2940|6683->2954|6945->3188|6975->3189|7015->3201|7055->3212|7085->3213|7128->3227|7193->3264|7223->3265|7263->3277|7298->3283|7328->3284|7371->3298|7435->3334|7465->3335|7505->3347|7542->3355|7572->3356|7615->3370|7680->3407|7710->3408|7750->3420|7790->3431|7820->3432|7863->3446|7951->3506|7981->3507|8023->3521|8055->3524|8085->3525|8128->3539|8226->3609|8256->3610|8296->3622|8327->3624|8357->3625|8400->3639|8451->3662|8481->3663|8521->3675|8569->3694|8599->3695|8642->3709|8889->3928|8919->3929|8959->3941|8991->3944|9021->3945|9064->3959|9241->4108|9271->4109|9311->4121|9343->4124|9373->4125|9416->4139|9466->4161|9496->4162|9536->4174|9570->4179|9600->4180|9643->4194|9825->4348|9855->4349|9895->4361|9935->4372|9965->4373|10008->4387|10069->4420|10099->4421|10129->4422|10900->5164|10920->5173|10961->5191|11278->5479|11298->5488|11340->5507|11653->5791|11673->5800|11713->5817|12314->6390|12333->6398|12375->6417|12995->7008|13025->7009|13056->7011|13087->7012|13208->7105|13225->7112|13264->7129|13492->7329|13507->7334|13541->7346|13843->7620|13869->7636|13904->7649|14221->7938|14248->7954|14284->7967|14587->8242|14614->8258|14650->8271|14947->8540|14974->8556|15009->8568|15313->8844|15340->8860|15379->8876|15677->9146|15704->9162|15740->9175|16042->9449|16069->9465|16107->9480|16412->9757|16439->9773|16477->9788|17155->10436|17186->10437|17218->10439|17249->10440|17366->10529|17396->10549|17441->10571|17749->10851|17780->10871|17827->10895|18452->11491|18477->11505|18518->11523|18832->11809|18857->11823|18899->11842|19213->12127|19238->12141|19278->12158|19599->12449|19630->12450|19662->12452|19693->12453|19811->12543|19835->12557|19878->12578|20187->12859|20212->12873|20258->12896|20808->13417|20833->13431|20874->13449|21184->13731|21209->13745|21251->13764|21560->14045|21585->14059|21625->14076|21942->14363|21973->14364|22005->14366|22036->14367|22153->14456|22177->14470|22220->14491|22536->14779|22561->14793|22607->14816|22816->14997|22840->15011|22880->15012|22935->15038|23080->15164|23094->15169|23134->15170|23189->15196|23312->15287|23369->15315
                  LINES: 21->1|29->4|31->6|37->12|37->12|38->13|39->14|39->14|41->16|41->16|41->16|42->17|43->18|43->18|45->20|45->20|45->20|46->21|48->23|48->23|50->25|50->25|50->25|51->26|56->31|56->31|58->33|59->34|59->34|60->35|71->46|71->46|73->48|73->48|73->48|74->49|76->51|76->51|78->53|78->53|78->53|79->54|86->61|86->61|88->63|88->63|88->63|89->64|95->70|95->70|97->72|97->72|97->72|98->73|102->77|102->77|104->79|105->80|105->80|106->81|110->85|110->85|112->87|112->87|112->87|113->88|121->96|121->96|123->98|123->98|123->98|124->99|129->104|129->104|131->106|131->106|131->106|132->107|137->112|137->112|140->115|140->115|140->115|141->116|142->117|142->117|144->119|144->119|144->119|145->120|149->124|149->124|151->126|151->126|151->126|153->128|158->133|158->133|160->135|160->135|160->135|161->136|169->144|169->144|171->146|171->146|171->146|172->147|173->148|173->148|175->150|175->150|175->150|176->151|177->152|177->152|179->154|179->154|179->154|180->155|181->156|181->156|183->158|183->158|183->158|184->159|186->161|186->161|189->164|189->164|189->164|190->165|192->167|192->167|194->169|194->169|194->169|195->170|196->171|196->171|198->173|198->173|198->173|199->174|206->181|206->181|208->183|208->183|208->183|209->184|214->189|214->189|216->191|216->191|216->191|217->192|218->193|218->193|220->195|220->195|220->195|221->196|226->201|226->201|228->203|228->203|228->203|229->204|230->205|230->205|230->205|246->221|246->221|246->221|250->225|250->225|250->225|254->229|254->229|254->229|265->240|265->240|265->240|275->250|275->250|275->250|275->250|276->251|276->251|276->251|281->256|281->256|281->256|289->264|289->264|289->264|295->270|295->270|295->270|299->274|299->274|299->274|303->278|303->278|303->278|307->282|307->282|307->282|311->286|311->286|311->286|315->290|315->290|315->290|319->294|319->294|319->294|332->307|332->307|332->307|332->307|333->308|333->308|333->308|337->312|337->312|337->312|350->325|350->325|350->325|354->329|354->329|354->329|358->333|358->333|358->333|362->337|362->337|362->337|362->337|363->338|363->338|363->338|367->342|367->342|367->342|378->353|378->353|378->353|382->357|382->357|382->357|386->361|386->361|386->361|390->365|390->365|390->365|390->365|391->366|391->366|391->366|395->370|395->370|395->370|402->377|402->377|402->377|403->378|404->379|404->379|404->379|405->380|406->381|408->383
                  -- GENERATED --
              */
          