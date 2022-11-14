
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
  def apply/*2.2*/(idMap:Map[String,Any],stud_name: Map[String,Any],stud_DOB:Map[String,Any],stud_contact_details: Map[String,Any],stud_per_address: Map[String,Any],father_details:Map[String,Any],mother_details:Map[String,Any],govt_id:Map[String,Any], updateView:Boolean):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.255*/("""

"""),format.raw/*4.1*/("""<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Student Basic Details</title>
    <style>
body"""),format.raw/*9.5*/("""{"""),format.raw/*9.6*/("""
  """),format.raw/*10.3*/("""font-family: Calibri, Helvetica, sans-serif;
  background-color:#;
"""),format.raw/*12.1*/("""}"""),format.raw/*12.2*/("""
"""),format.raw/*13.1*/("""input"""),format.raw/*13.6*/("""{"""),format.raw/*13.7*/("""

  """),format.raw/*15.3*/("""padding: 10px;
  margin: 20px 0 30px 0;
  display: inline-block;
  border: none;
  background: #f1f1f1;
"""),format.raw/*20.1*/("""}"""),format.raw/*20.2*/("""
"""),format.raw/*21.1*/(""".container """),format.raw/*21.12*/("""{"""),format.raw/*21.13*/("""
  """),format.raw/*22.3*/("""padding: 50px;
  background-color: lightblue;

"""),format.raw/*25.1*/("""}"""),format.raw/*25.2*/("""

 """),format.raw/*27.2*/("""div """),format.raw/*27.6*/("""{"""),format.raw/*27.7*/("""

   """),format.raw/*29.4*/("""padding: px;
         """),format.raw/*30.10*/("""}"""),format.raw/*30.11*/("""
"""),format.raw/*31.1*/("""hr """),format.raw/*31.4*/("""{"""),format.raw/*31.5*/("""
  """),format.raw/*32.3*/("""border: 1px solid #f1f1f1;
  margin-bottom: 25px;
"""),format.raw/*34.1*/("""}"""),format.raw/*34.2*/("""
"""),format.raw/*35.1*/("""label"""),format.raw/*35.6*/("""{"""),format.raw/*35.7*/("""
  """),format.raw/*36.3*/("""padding: 8px;


"""),format.raw/*39.1*/("""}"""),format.raw/*39.2*/("""
"""),format.raw/*40.1*/("""input[type=submit] """),format.raw/*40.20*/("""{"""),format.raw/*40.21*/("""
  """),format.raw/*41.3*/("""background-color: #529AE1;
  border: none;
  color: white;
  padding: 16px 32px;
  text-decoration: none;
  margin: 4px 2px;
  cursor: pointer;
"""),format.raw/*48.1*/("""}"""),format.raw/*48.2*/("""

    """),format.raw/*50.5*/("""table,
    th,
    td """),format.raw/*52.8*/("""{"""),format.raw/*52.9*/("""
        """),format.raw/*53.9*/("""border: 2px solid black;
        border-collapse: collapse;
    """),format.raw/*55.5*/("""}"""),format.raw/*55.6*/("""

    """),format.raw/*57.5*/("""th,
    td """),format.raw/*58.8*/("""{"""),format.raw/*58.9*/("""
        """),format.raw/*59.9*/("""padding: 10px;
    """),format.raw/*60.5*/("""}"""),format.raw/*60.6*/("""

    """),format.raw/*62.5*/("""input[type=submit] """),format.raw/*62.24*/("""{"""),format.raw/*62.25*/("""
  """),format.raw/*63.3*/("""background-color: #333;
  border: none;
  color: white;
  padding: 16px 32px;
  text-decoration: none;
  margin: 4px 2px;
  cursor: pointer;
"""),format.raw/*70.1*/("""}"""),format.raw/*70.2*/("""
    """),format.raw/*71.5*/("""ul """),format.raw/*71.8*/("""{"""),format.raw/*71.9*/("""
  """),format.raw/*72.3*/("""list-style-type: none;
  margin: 0;
  padding: 0;
  overflow: hidden;
  background-color: #333;
"""),format.raw/*77.1*/("""}"""),format.raw/*77.2*/("""

"""),format.raw/*79.1*/("""li """),format.raw/*79.4*/("""{"""),format.raw/*79.5*/("""
  """),format.raw/*80.3*/("""float: left;
"""),format.raw/*81.1*/("""}"""),format.raw/*81.2*/("""

"""),format.raw/*83.1*/("""li a """),format.raw/*83.6*/("""{"""),format.raw/*83.7*/("""
  """),format.raw/*84.3*/("""display: block;
  color: white;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
"""),format.raw/*89.1*/("""}"""),format.raw/*89.2*/("""

"""),format.raw/*91.1*/("""li a:hover """),format.raw/*91.12*/("""{"""),format.raw/*91.13*/("""
  """),format.raw/*92.3*/("""background-color: #111;
"""),format.raw/*93.1*/("""}"""),format.raw/*93.2*/("""


"""),format.raw/*96.1*/("""</style>
<!--    <div>-->
<!--        <script src="D:\IntellG\Play_Framework\First_Play_project\First_Play_project\public\javascripts\index.js"></script>-->
<!--    </div>-->
</head>
<body>
<div class="container">
    <h3>Update Student Information</h3>
    <form method="get" action="/studentForm">
        <h4>Name of Student</h4>
        <label >First name:</label>
        <input type="text"  name="student_first_name" value="""),_display_(/*107.62*/stud_name/*107.71*/.get("first_name")),format.raw/*107.89*/(""" """),format.raw/*107.90*/(""">
        <label>Middle name:</label>
        <input type="text"  name="student_middle_name" value="""),_display_(/*109.63*/stud_name/*109.72*/.get("middle_name")),format.raw/*109.91*/(""" """),format.raw/*109.92*/(""">
        <label >Last name:</label>
        <input type="text"  name="student_last_name" value="""),_display_(/*111.61*/stud_name/*111.70*/.get("last_name")),format.raw/*111.87*/(""" """),format.raw/*111.88*/("""><br>



        <!-- -----------------Address Of Student ------------------------------------------->
        <h4>Permanent Address</h4>

        <br>
        <h4>"""),_display_(/*119.14*/stud_per_address/*119.30*/.get("line1")),format.raw/*119.43*/("""</h4>
        <label> Line 1: </label>
        <input type="text"  name="line1" value='"""),_display_(/*121.50*/stud_per_address/*121.66*/.get("line1")),format.raw/*121.79*/("""'  />

        <label> Line 2: </label>
        <input type="text"  name="line2" value='"""),_display_(/*124.50*/stud_per_address/*124.66*/.get("line2")),format.raw/*124.79*/("""'>

        <label> City: </label>
        <input type="text"  name="city" value="""),_display_(/*127.48*/stud_per_address/*127.64*/.get("city")),format.raw/*127.76*/(""">
        <br>
        <label> District: </label>
        <input type="text"  name="district" value="""),_display_(/*130.52*/stud_per_address/*130.68*/.get("district")),format.raw/*130.84*/(""">
        <label> State: </label>
        <input type="text"  name="state" value="""),_display_(/*132.49*/stud_per_address/*132.65*/.get("state")),format.raw/*132.78*/(""">
        <label> Country: </label>
        <input type="text"  name="country" value="""),_display_(/*134.51*/stud_per_address/*134.67*/.get("country")),format.raw/*134.82*/(""">
        <br>
        <label> Pin-code: </label>
        <input type="number"  name="pincode" value="""),_display_(/*137.53*/stud_per_address/*137.69*/.get("pincode")),format.raw/*137.84*/(""">
        </label>
        <br>
        <!-------------------------Birth Date Of Student ------------------------------->

        <h4>Birth Details Of Student</h4>
        <label>Date Of Student:</label>
        <input type="date"  name="student_dob" value='"""),_display_(/*144.56*/stud_DOB/*144.64*/.get("student_DOB")),format.raw/*144.83*/("""'/><br>


        <!--------------------------Student Contact Details ---------------------------->
        <h4>Contact Details Of Student</h4>
        <label >Mobile Number:</label>
        <input type="tel"  name="student_mob_no" pattern="[0-9]"""),format.raw/*150.64*/("""{"""),format.raw/*150.65*/("""10"""),format.raw/*150.67*/("""}"""),format.raw/*150.68*/(""""  title="Ten digits code" value="""),_display_(/*150.102*/stud_contact_details/*150.122*/.get("student_mob_no")),format.raw/*150.144*/(""">

        <label >Email ID:</label>
        <input type="email"  name="student_email" value="""),_display_(/*153.58*/stud_contact_details/*153.78*/.get("student_email_id")),format.raw/*153.102*/("""><br>


        <h4>Parents Details Of Student</h4><br>
        <h5>Father Details of Student</h5>

        <label >First name:</label>
        <input type="text"   name="father_first_name" value='"""),_display_(/*160.63*/father_details/*160.77*/.get("first_name")),format.raw/*160.95*/("""'>
        <label >Middle name:</label>
        <input type="text"  name="father_mid_name" value='"""),_display_(/*162.60*/father_details/*162.74*/.get("middle_name")),format.raw/*162.93*/("""'  >
        <label>Last name:</label>
        <input type="text"  name="father_last_name"  value='"""),_display_(/*164.62*/father_details/*164.76*/.get("last_name")),format.raw/*164.93*/("""'>
        <br>
        <label>Mobile Number:</label>
        <input type="tel"  name="father_mob_no" pattern="[0-9]"""),format.raw/*167.63*/("""{"""),format.raw/*167.64*/("""10"""),format.raw/*167.66*/("""}"""),format.raw/*167.67*/(""""  title="Ten digits code" value='"""),_display_(/*167.102*/father_details/*167.116*/.get("father_mob_no")),format.raw/*167.137*/("""' >
        <label>Email ID:</label>
        <input type="email"  name="father_email" value='"""),_display_(/*169.58*/father_details/*169.72*/.get("father_email_id")),format.raw/*169.95*/("""' ><br>

        <h5>Mother Details of Student</h5>



        <label >First name:</label>
        <input type="text"  name="mother_first_name" value='"""),_display_(/*176.62*/mother_details/*176.76*/.get("first_name")),format.raw/*176.94*/("""'>

        <br>
        <label>Mobile Number:</label>
        <input type="tel"  name="mother_mob_no" pattern="[0-9]"""),format.raw/*180.63*/("""{"""),format.raw/*180.64*/("""10"""),format.raw/*180.66*/("""}"""),format.raw/*180.67*/(""""  title="Ten digits code" value='"""),_display_(/*180.102*/mother_details/*180.116*/.get("mother_mob_no")),format.raw/*180.137*/("""'  required/>
        <label>Email ID:</label>
        <input type="email"  name="mother_email" value='"""),_display_(/*182.58*/mother_details/*182.72*/.get("mother_email_id")),format.raw/*182.95*/("""'><br>


        <!---------------------------Student Govt Id Details --------------------------->
        <h4>Student Goverment Id Details</h4><br>
        <label>Aadhar Card Number of Student:</label>
        <input type="tel"  name="govt_id" pattern="[0-9]"""),format.raw/*188.57*/("""{"""),format.raw/*188.58*/("""12"""),format.raw/*188.60*/("""}"""),format.raw/*188.61*/(""""  title="Twelve digits code" value='"""),_display_(/*188.99*/govt_id/*188.106*/.get("aadhar_no")),format.raw/*188.123*/("""'><br>

        <input type="hidden"  name="student_id" value="""),_display_(/*190.56*/idMap/*190.61*/.get("$oid")),format.raw/*190.73*/(""">

        """),_display_(/*192.10*/if(updateView)/*192.24*/{_display_(Seq[Any](format.raw/*192.25*/("""
        """),format.raw/*193.9*/("""<input type="submit" name="submit" value="Update" formaction="/studentUpdateFullData" class="btn">
        """)))}/*194.11*/else/*194.16*/{_display_(Seq[Any](format.raw/*194.17*/("""
        """),format.raw/*195.9*/("""<input type="submit" name="Submit" value="Insert" class="btn" />
        """)))}),format.raw/*196.10*/("""

        """),format.raw/*198.9*/("""<input type="submit" name="submit" value="cancel" formaction="/index1" class="btn">

    </form>
    <hr>
</div>


</body>
</html>
"""))
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
                  HASH: 94c98784f8225fe5c81fdfd8c089cbcc1cb02e65
                  MATRIX: 873->3|1222->256|1252->260|1391->373|1418->374|1449->378|1545->447|1573->448|1602->450|1634->455|1662->456|1695->462|1831->571|1859->572|1888->574|1927->585|1956->586|1987->590|2064->640|2092->641|2124->646|2155->650|2183->651|2217->658|2268->681|2297->682|2326->684|2356->687|2384->688|2415->692|2494->744|2522->745|2551->747|2583->752|2611->753|2642->757|2688->776|2716->777|2745->779|2792->798|2821->799|2852->803|3030->954|3058->955|3093->963|3144->987|3172->988|3209->998|3302->1064|3330->1065|3365->1073|3404->1085|3432->1086|3469->1096|3516->1116|3544->1117|3579->1125|3626->1144|3655->1145|3686->1149|3861->1297|3889->1298|3922->1304|3952->1307|3980->1308|4011->1312|4139->1413|4167->1414|4198->1418|4228->1421|4256->1422|4287->1426|4328->1440|4356->1441|4387->1445|4419->1450|4447->1451|4478->1455|4611->1561|4639->1562|4670->1566|4709->1577|4738->1578|4769->1582|4821->1607|4849->1608|4882->1614|5351->2055|5370->2064|5410->2082|5440->2083|5570->2185|5589->2194|5630->2213|5660->2214|5787->2313|5806->2322|5845->2339|5875->2340|6076->2513|6102->2529|6137->2542|6255->2632|6281->2648|6316->2661|6436->2753|6462->2769|6497->2782|6610->2867|6636->2883|6670->2895|6802->2999|6828->3015|6866->3031|6978->3115|7004->3131|7039->3144|7155->3232|7181->3248|7218->3263|7351->3368|7377->3384|7414->3399|7709->3666|7727->3674|7768->3693|8049->3945|8079->3946|8110->3948|8140->3949|8203->3983|8234->4003|8279->4025|8404->4122|8434->4142|8481->4166|8714->4371|8738->4385|8778->4403|8907->4504|8931->4518|8972->4537|9102->4639|9126->4653|9165->4670|9313->4789|9343->4790|9374->4792|9404->4793|9468->4828|9493->4842|9537->4863|9661->4959|9685->4973|9730->4996|9917->5155|9941->5169|9981->5187|10131->5308|10161->5309|10192->5311|10222->5312|10286->5347|10311->5361|10355->5382|10489->5488|10513->5502|10558->5525|10852->5790|10882->5791|10913->5793|10943->5794|11009->5832|11027->5839|11067->5856|11160->5921|11175->5926|11209->5938|11251->5952|11275->5966|11315->5967|11353->5977|11482->6087|11496->6092|11536->6093|11574->6103|11681->6178|11721->6190
                  LINES: 21->2|26->2|28->4|33->9|33->9|34->10|36->12|36->12|37->13|37->13|37->13|39->15|44->20|44->20|45->21|45->21|45->21|46->22|49->25|49->25|51->27|51->27|51->27|53->29|54->30|54->30|55->31|55->31|55->31|56->32|58->34|58->34|59->35|59->35|59->35|60->36|63->39|63->39|64->40|64->40|64->40|65->41|72->48|72->48|74->50|76->52|76->52|77->53|79->55|79->55|81->57|82->58|82->58|83->59|84->60|84->60|86->62|86->62|86->62|87->63|94->70|94->70|95->71|95->71|95->71|96->72|101->77|101->77|103->79|103->79|103->79|104->80|105->81|105->81|107->83|107->83|107->83|108->84|113->89|113->89|115->91|115->91|115->91|116->92|117->93|117->93|120->96|131->107|131->107|131->107|131->107|133->109|133->109|133->109|133->109|135->111|135->111|135->111|135->111|143->119|143->119|143->119|145->121|145->121|145->121|148->124|148->124|148->124|151->127|151->127|151->127|154->130|154->130|154->130|156->132|156->132|156->132|158->134|158->134|158->134|161->137|161->137|161->137|168->144|168->144|168->144|174->150|174->150|174->150|174->150|174->150|174->150|174->150|177->153|177->153|177->153|184->160|184->160|184->160|186->162|186->162|186->162|188->164|188->164|188->164|191->167|191->167|191->167|191->167|191->167|191->167|191->167|193->169|193->169|193->169|200->176|200->176|200->176|204->180|204->180|204->180|204->180|204->180|204->180|204->180|206->182|206->182|206->182|212->188|212->188|212->188|212->188|212->188|212->188|212->188|214->190|214->190|214->190|216->192|216->192|216->192|217->193|218->194|218->194|218->194|219->195|220->196|222->198
                  -- GENERATED --
              */
          