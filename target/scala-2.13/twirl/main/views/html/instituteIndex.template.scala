
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

object instituteIndex extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template7[Map[String, Any],String,String,String,String,Map[String, Any],Boolean,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(jsonMap: Map[String,Any],name:String,registration:String,email:String,contact:String,address:Map[String,Any],updateView:Boolean):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.131*/("""

"""),format.raw/*5.1*/("""<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <style>
    header """),format.raw/*9.12*/("""{"""),format.raw/*9.13*/("""
        """),format.raw/*10.9*/("""z-index: 4;
        position: fixed;
        background: #22242A;
        padding: 20px;
        width: calc(100% - 0%);
        top: 0;
        height: 43px;
    """),format.raw/*17.5*/("""}"""),format.raw/*17.6*/("""
"""),format.raw/*18.1*/("""body"""),format.raw/*18.5*/("""{"""),format.raw/*18.6*/("""
  """),format.raw/*19.3*/("""font-family: Calibri, Helvetica, sans-serif;
   background-color: lightblue;
"""),format.raw/*21.1*/("""}"""),format.raw/*21.2*/("""
"""),format.raw/*22.1*/("""input"""),format.raw/*22.6*/("""{"""),format.raw/*22.7*/("""
  """),format.raw/*23.3*/("""padding: 10px;
  margin: 20px 0 30px 0;
  display: inline-block;
  border: none;
  background: #f1f1f1;
"""),format.raw/*28.1*/("""}"""),format.raw/*28.2*/("""
"""),format.raw/*29.1*/(""".container """),format.raw/*29.12*/("""{"""),format.raw/*29.13*/("""
  """),format.raw/*30.3*/("""padding: 50px;



"""),format.raw/*34.1*/("""}"""),format.raw/*34.2*/("""


"""),format.raw/*37.1*/("""hr """),format.raw/*37.4*/("""{"""),format.raw/*37.5*/("""
  """),format.raw/*38.3*/("""border: 1px solid #f1f1f1;
  margin-bottom: 25px;
"""),format.raw/*40.1*/("""}"""),format.raw/*40.2*/("""
"""),format.raw/*41.1*/("""label"""),format.raw/*41.6*/("""{"""),format.raw/*41.7*/("""
  """),format.raw/*42.3*/("""padding: 8px;
"""),format.raw/*43.1*/("""}"""),format.raw/*43.2*/("""
"""),format.raw/*44.1*/("""input[type=submit] """),format.raw/*44.20*/("""{"""),format.raw/*44.21*/("""
  """),format.raw/*45.3*/("""background-color: #333;
  border: none;
  color: white;
  padding: 16px 32px;
  text-decoration: none;
  margin: 4px 2px;
  cursor: pointer;
"""),format.raw/*52.1*/("""}"""),format.raw/*52.2*/("""
"""),format.raw/*53.1*/("""ul """),format.raw/*53.4*/("""{"""),format.raw/*53.5*/("""
  """),format.raw/*54.3*/("""list-style-type: none;
  margin: 0;
  padding: 0;
  overflow: hidden;
  background-color: #333;
"""),format.raw/*59.1*/("""}"""),format.raw/*59.2*/("""

"""),format.raw/*61.1*/("""li """),format.raw/*61.4*/("""{"""),format.raw/*61.5*/("""
  """),format.raw/*62.3*/("""float: left;
"""),format.raw/*63.1*/("""}"""),format.raw/*63.2*/("""

"""),format.raw/*65.1*/("""li a """),format.raw/*65.6*/("""{"""),format.raw/*65.7*/("""
  """),format.raw/*66.3*/("""display: block;
  color: white;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
"""),format.raw/*71.1*/("""}"""),format.raw/*71.2*/("""

"""),format.raw/*73.1*/("""li a:hover """),format.raw/*73.12*/("""{"""),format.raw/*73.13*/("""
  """),format.raw/*74.3*/("""background-color: #111;
"""),format.raw/*75.1*/("""}"""),format.raw/*75.2*/("""
"""),format.raw/*76.1*/("""table,

    td """),format.raw/*78.8*/("""{"""),format.raw/*78.9*/("""
        """),format.raw/*79.9*/("""border: 2px solid black;
        border-collapse: collapse;
    """),format.raw/*81.5*/("""}"""),format.raw/*81.6*/("""


    """),format.raw/*84.5*/("""td """),format.raw/*84.8*/("""{"""),format.raw/*84.9*/("""
        """),format.raw/*85.9*/("""padding: 10px;
    """),format.raw/*86.5*/("""}"""),format.raw/*86.6*/("""



"""),format.raw/*90.1*/("""</style>
</head>
<body>

<div class="container">
    <form method="get" action="/instituteForm">
        <h3>Institute Details</h3>
        <br>
        <hr>

        <label> Name </label>
        <input type="text" name="institute_name" placeholder= "name" id="institute_name" value='"""),_display_(/*101.98*/name),format.raw/*101.102*/("""' size="42" required />

        <label> Registration Code: </label>
        <input type="text" name="institute_code" placeholder="code" id="institute_code" pattern="[A-Za-z0-9]"""),format.raw/*104.109*/("""{"""),format.raw/*104.110*/("""}"""),format.raw/*104.111*/("""" value='"""),_display_(/*104.121*/registration),format.raw/*104.133*/("""' title="Alphabet and Digits only" size="25" required />

        <br>
        <label>Email Id:</label>
        <input type="email" placeholder="Email" name="institute_email" id="institute_email" size="42" value='"""),_display_(/*108.111*/email),format.raw/*108.116*/("""' title="Type a valid Email" required>

        <label> Contact Number: </label>
        <input type="text" name="institute_contact" placeholder="ContactNumber" pattern="[0-9]"""),format.raw/*111.95*/("""{"""),format.raw/*111.96*/("""10"""),format.raw/*111.98*/("""}"""),format.raw/*111.99*/("""" value='"""),_display_(/*111.109*/contact),format.raw/*111.116*/("""' title="Ten digits code" id="institute_contact" required />

        <br>
        <hr>
        <label>
            <h4>Address: </h4>
            <br>

            <label> Line 1: </label>
            <input type="text" name="institute_line1" id="institute_line1" placeholder= "Line 1" value='"""),_display_(/*120.106*/address/*120.113*/.get("Line 1")),format.raw/*120.127*/("""' size="49" required />

            <label> Line 2: </label>
            <input type="text" name="institute_line2" id="institute_line2" placeholder= "Line 2" size="49" value='"""),_display_(/*123.116*/address/*123.123*/.get("Line 2")),format.raw/*123.137*/("""' required />

            <br>
            <label> City: </label>
            <input type="text" name="institute_city" id="institute_city2" value='"""),_display_(/*127.83*/address/*127.90*/.get("City")),format.raw/*127.102*/("""' placeholder= "City" required />

            <label> District: </label>
            <input type="text" name="institute_district" id="institute_district1" value='"""),_display_(/*130.91*/address/*130.98*/.get("District")),format.raw/*130.114*/("""' placeholder= "District" size="25" required />

            <label> State: </label>
            <input type="text" name="institute_state" id="institute_state1" value='"""),_display_(/*133.85*/address/*133.92*/.get("State")),format.raw/*133.105*/("""' placeholder= "State" size="25" required />

            <br>
            <label> Country: </label>
            <input type="text" name="institute_country" id="institute_country1"  value='"""),_display_(/*137.90*/address/*137.97*/.get("Country")),format.raw/*137.112*/("""' placeholder= "Country" size="25" required />

            <label> Pin-code: </label>
            <input type="number" name="institute_pin" id="institute_pin1" value='"""),_display_(/*140.83*/address/*140.90*/.get("Pin-code")),format.raw/*140.106*/("""' placeholder= "PinCode" size="25" required />

        </label>

        <br>

        </label>
        <input type="hidden"  name="get_id" value="""),_display_(/*147.52*/jsonMap/*147.59*/.get("$oid")),format.raw/*147.71*/(""">

        <br>

        """),_display_(/*151.10*/if(updateView)/*151.24*/{_display_(Seq[Any](format.raw/*151.25*/("""
        """),format.raw/*152.9*/("""<input type="submit" name="submit" value="Submit" formaction="/instituteUpdate" class="btn">
        """)))}/*153.11*/else/*153.16*/{_display_(Seq[Any](format.raw/*153.17*/("""
        """),format.raw/*154.9*/("""<input type="submit" name="Submit" value="Submit" class="btn" />
        """)))}),format.raw/*155.10*/("""

        """),format.raw/*157.9*/("""<input type="submit" name="submit" value="cancel" formaction="/index1" class="btn">

    </form>
</div>
</body>
</html>
"""))
      }
    }
  }

  def render(jsonMap:Map[String, Any],name:String,registration:String,email:String,contact:String,address:Map[String, Any],updateView:Boolean): play.twirl.api.HtmlFormat.Appendable = apply(jsonMap,name,registration,email,contact,address,updateView)

  def f:((Map[String, Any],String,String,String,String,Map[String, Any],Boolean) => play.twirl.api.HtmlFormat.Appendable) = (jsonMap,name,registration,email,contact,address,updateView) => apply(jsonMap,name,registration,email,contact,address,updateView)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/instituteIndex.scala.html
                  HASH: 8566926d70ab574a2f01e4150ab6cc3120fc19b5
                  MATRIX: 801->5|1026->134|1056->138|1197->252|1225->253|1262->263|1459->433|1487->434|1516->436|1547->440|1575->441|1606->445|1712->524|1740->525|1769->527|1801->532|1829->533|1860->537|1996->646|2024->647|2053->649|2092->660|2121->661|2152->665|2201->687|2229->688|2262->694|2292->697|2320->698|2351->702|2430->754|2458->755|2487->757|2519->762|2547->763|2578->767|2620->782|2648->783|2677->785|2724->804|2753->805|2784->809|2959->957|2987->958|3016->960|3046->963|3074->964|3105->968|3233->1069|3261->1070|3292->1074|3322->1077|3350->1078|3381->1082|3422->1096|3450->1097|3481->1101|3513->1106|3541->1107|3572->1111|3705->1217|3733->1218|3764->1222|3803->1233|3832->1234|3863->1238|3915->1263|3943->1264|3972->1266|4016->1283|4044->1284|4081->1294|4174->1360|4202->1361|4239->1371|4269->1374|4297->1375|4334->1385|4381->1405|4409->1406|4444->1414|4769->1711|4796->1715|5006->1895|5037->1896|5068->1897|5107->1907|5142->1919|5389->2137|5417->2142|5624->2320|5654->2321|5685->2323|5715->2324|5754->2334|5784->2341|6117->2645|6135->2652|6172->2666|6381->2846|6399->2853|6436->2867|6617->3020|6634->3027|6669->3039|6864->3206|6881->3213|6920->3229|7120->3401|7137->3408|7173->3421|7395->3615|7412->3622|7450->3637|7650->3809|7667->3816|7706->3832|7889->3987|7906->3994|7940->4006|7998->4036|8022->4050|8062->4051|8100->4061|8223->4165|8237->4170|8277->4171|8315->4181|8422->4256|8462->4268
                  LINES: 21->3|26->3|28->5|32->9|32->9|33->10|40->17|40->17|41->18|41->18|41->18|42->19|44->21|44->21|45->22|45->22|45->22|46->23|51->28|51->28|52->29|52->29|52->29|53->30|57->34|57->34|60->37|60->37|60->37|61->38|63->40|63->40|64->41|64->41|64->41|65->42|66->43|66->43|67->44|67->44|67->44|68->45|75->52|75->52|76->53|76->53|76->53|77->54|82->59|82->59|84->61|84->61|84->61|85->62|86->63|86->63|88->65|88->65|88->65|89->66|94->71|94->71|96->73|96->73|96->73|97->74|98->75|98->75|99->76|101->78|101->78|102->79|104->81|104->81|107->84|107->84|107->84|108->85|109->86|109->86|113->90|124->101|124->101|127->104|127->104|127->104|127->104|127->104|131->108|131->108|134->111|134->111|134->111|134->111|134->111|134->111|143->120|143->120|143->120|146->123|146->123|146->123|150->127|150->127|150->127|153->130|153->130|153->130|156->133|156->133|156->133|160->137|160->137|160->137|163->140|163->140|163->140|170->147|170->147|170->147|174->151|174->151|174->151|175->152|176->153|176->153|176->153|177->154|178->155|180->157
                  -- GENERATED --
              */
          