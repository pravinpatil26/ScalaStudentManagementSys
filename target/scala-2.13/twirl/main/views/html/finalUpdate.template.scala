
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

object finalUpdate extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Map[String, Any],Map[String, Any],Map[String, Any],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(idMap:Map[String,Any],name:Map[String,Any],prev_exam:Map[String,Any]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.72*/("""
"""),format.raw/*3.1*/("""<html lang="en">
<head>
    <meta charset="UTF-8">
    <style>
body"""),format.raw/*7.5*/("""{"""),format.raw/*7.6*/("""
  """),format.raw/*8.3*/("""font-family: Calibri, Helvetica, sans-serif;
  background-color: #f1f1f1;
"""),format.raw/*10.1*/("""}"""),format.raw/*10.2*/("""
"""),format.raw/*11.1*/("""input"""),format.raw/*11.6*/("""{"""),format.raw/*11.7*/("""

  """),format.raw/*13.3*/("""padding: 10px;
  margin: 20px 0 30px 0;
  display: inline-block;
  border: none;
  background: #f1f1f1;
"""),format.raw/*18.1*/("""}"""),format.raw/*18.2*/("""
"""),format.raw/*19.1*/(""".container """),format.raw/*19.12*/("""{"""),format.raw/*19.13*/("""
  """),format.raw/*20.3*/("""padding: 50px;
  background-color: lightblue;

"""),format.raw/*23.1*/("""}"""),format.raw/*23.2*/("""

 """),format.raw/*25.2*/("""div """),format.raw/*25.6*/("""{"""),format.raw/*25.7*/("""

   """),format.raw/*27.4*/("""padding: px;
         """),format.raw/*28.10*/("""}"""),format.raw/*28.11*/("""
"""),format.raw/*29.1*/("""hr """),format.raw/*29.4*/("""{"""),format.raw/*29.5*/("""
  """),format.raw/*30.3*/("""border: 1px solid #f1f1f1;
  margin-bottom: 25px;
"""),format.raw/*32.1*/("""}"""),format.raw/*32.2*/("""
"""),format.raw/*33.1*/("""label"""),format.raw/*33.6*/("""{"""),format.raw/*33.7*/("""
  """),format.raw/*34.3*/("""padding: 8px;


"""),format.raw/*37.1*/("""}"""),format.raw/*37.2*/("""
"""),format.raw/*38.1*/("""input[type=submit] """),format.raw/*38.20*/("""{"""),format.raw/*38.21*/("""
  """),format.raw/*39.3*/("""background-color: #529AE1;
  border: none;
  color: white;
  padding: 16px 32px;
  text-decoration: none;
  margin: 4px 2px;
  cursor: pointer;
"""),format.raw/*46.1*/("""}"""),format.raw/*46.2*/("""
"""),format.raw/*47.1*/("""ul """),format.raw/*47.4*/("""{"""),format.raw/*47.5*/("""
  """),format.raw/*48.3*/("""list-style-type: none;
  margin: 0;
  padding: 0;
  overflow: hidden;
  background-color: #333;
"""),format.raw/*53.1*/("""}"""),format.raw/*53.2*/("""

"""),format.raw/*55.1*/("""li """),format.raw/*55.4*/("""{"""),format.raw/*55.5*/("""
  """),format.raw/*56.3*/("""float: left;
"""),format.raw/*57.1*/("""}"""),format.raw/*57.2*/("""

"""),format.raw/*59.1*/("""li a """),format.raw/*59.6*/("""{"""),format.raw/*59.7*/("""
  """),format.raw/*60.3*/("""display: block;
  color: white;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
"""),format.raw/*65.1*/("""}"""),format.raw/*65.2*/("""

"""),format.raw/*67.1*/("""li a:hover """),format.raw/*67.12*/("""{"""),format.raw/*67.13*/("""
  """),format.raw/*68.3*/("""background-color: #111;
"""),format.raw/*69.1*/("""}"""),format.raw/*69.2*/("""


"""),format.raw/*72.1*/("""</style>
    <title>Update</title>
</head>
<body>

<form method="get" action="/udate2">
    <div class="container">
        <center>  <h1> Update Your Details</h1> </center>
        <h2>"""),_display_(/*80.14*/idMap/*80.19*/.get("$oid")),format.raw/*80.31*/("""</h2>
        <hr>
        <h3> Student Exam Details </h3>
        <label> Name: </label>
        &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp;
        <input type="text" name="firstname"  value='"""),_display_(/*85.54*/name/*85.58*/.get("firstname")),format.raw/*85.75*/("""' />
        &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp;
        <input type="text" name="middlename" value='"""),_display_(/*87.54*/name/*87.58*/.get("middlename")),format.raw/*87.76*/("""' />
        &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp;
        <input type="text" name="lastname" value='"""),_display_(/*89.52*/name/*89.56*/.get("lastname")),format.raw/*89.72*/("""' />
        <br>


        <br>
        <label>
            Branch :
        </label>
        &nbsp&nbsp&nbsp&nbsp&nbsp
        <input type="text" name="branch" id="branch" />
        <br>
        <br>
        <br>

        <label>
            Phone :
        </label>
        &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
        <input type="text" name="country code" value="+91" size="2" disabled/>
        <input type="text" name="mobileno" id="mobileno" size="16"/> <br> <br>

        <label>
            Email:
        </label>
        &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
        <input type="text" name="emailid" id="emailid" size="28"/> <br>
        <br> <br>
        <h3> Previous Exam Details </h3>

        <label>
            Academic Year :
        </label>
        &nbsp&nbsp&nbsp&nbsp

        <input type="text" name="acad_year" value='"""),_display_(/*123.53*/prev_exam/*123.62*/.get("acad_year")),format.raw/*123.79*/("""' />
        <br><br><br>

        <label>
            Result :
        </label>
        &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
        <input type="text" name="result"  value='"""),_display_(/*130.51*/prev_exam/*130.60*/.get("result")),format.raw/*130.74*/("""' />

        <br>
        <br>
        <label> Score: </label>
        &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
        <input type="text" name="score" value='"""),_display_(/*136.49*/prev_exam/*136.58*/.get("score")),format.raw/*136.71*/("""' size="10"/> <br> <br>

        <br> <br>


        <input type="submit" value="Submit"/>

    </div>
</form>

</body>
</html>"""))
      }
    }
  }

  def render(idMap:Map[String, Any],name:Map[String, Any],prev_exam:Map[String, Any]): play.twirl.api.HtmlFormat.Appendable = apply(idMap,name,prev_exam)

  def f:((Map[String, Any],Map[String, Any],Map[String, Any]) => play.twirl.api.HtmlFormat.Appendable) = (idMap,name,prev_exam) => apply(idMap,name,prev_exam)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/finalUpdate.scala.html
                  HASH: 4c991d732ae17e063f79c138a41e6214cd82f6ae
                  MATRIX: 779->3|944->73|972->75|1069->146|1096->147|1126->151|1229->227|1257->228|1286->230|1318->235|1346->236|1379->242|1515->351|1543->352|1572->354|1611->365|1640->366|1671->370|1748->420|1776->421|1808->426|1839->430|1867->431|1901->438|1952->461|1981->462|2010->464|2040->467|2068->468|2099->472|2178->524|2206->525|2235->527|2267->532|2295->533|2326->537|2372->556|2400->557|2429->559|2476->578|2505->579|2536->583|2714->734|2742->735|2771->737|2801->740|2829->741|2860->745|2988->846|3016->847|3047->851|3077->854|3105->855|3136->859|3177->873|3205->874|3236->878|3268->883|3296->884|3327->888|3460->994|3488->995|3519->999|3558->1010|3587->1011|3618->1015|3670->1040|3698->1041|3731->1047|3953->1242|3967->1247|4000->1259|4225->1457|4238->1461|4276->1478|4413->1588|4426->1592|4465->1610|4600->1718|4613->1722|4650->1738|5556->2616|5575->2625|5614->2642|5869->2869|5888->2878|5924->2892|6169->3109|6188->3118|6223->3131
                  LINES: 21->2|26->2|27->3|31->7|31->7|32->8|34->10|34->10|35->11|35->11|35->11|37->13|42->18|42->18|43->19|43->19|43->19|44->20|47->23|47->23|49->25|49->25|49->25|51->27|52->28|52->28|53->29|53->29|53->29|54->30|56->32|56->32|57->33|57->33|57->33|58->34|61->37|61->37|62->38|62->38|62->38|63->39|70->46|70->46|71->47|71->47|71->47|72->48|77->53|77->53|79->55|79->55|79->55|80->56|81->57|81->57|83->59|83->59|83->59|84->60|89->65|89->65|91->67|91->67|91->67|92->68|93->69|93->69|96->72|104->80|104->80|104->80|109->85|109->85|109->85|111->87|111->87|111->87|113->89|113->89|113->89|147->123|147->123|147->123|154->130|154->130|154->130|160->136|160->136|160->136
                  -- GENERATED --
              */
          