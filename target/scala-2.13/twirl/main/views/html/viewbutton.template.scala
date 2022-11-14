
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

object viewbutton extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <style>
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
    </style>
    <title>Insert/Update</title>
</head>
<body>
<form method="get" action="/">
    <div class="container">
        <input type="submit" value="Insert Data" formaction="/index" size="23">
        <input type="submit" value="Update Data" formaction="/update" size="24">

    </div>



</form>

</body>
</html>"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/viewbutton.scala.html
                  HASH: 738ffbfa3791db910f6b4f8006d6d3690ad16f4f
                  MATRIX: 816->0|947->105|974->106|1004->110|1107->186|1135->187|1164->189|1196->194|1224->195|1257->201|1393->310|1421->311|1450->313|1489->324|1518->325|1549->329|1626->379|1654->380|1686->385|1717->389|1745->390|1779->397|1830->420|1859->421|1888->423|1918->426|1946->427|1977->431|2056->483|2084->484|2113->486|2145->491|2173->492|2204->496|2250->515|2278->516|2307->518|2354->537|2383->538|2414->542|2592->693|2620->694|2649->696|2679->699|2707->700|2738->704|2866->805|2894->806|2925->810|2955->813|2983->814|3014->818|3055->832|3083->833|3114->837|3146->842|3174->843|3205->847|3338->953|3366->954|3397->958|3436->969|3465->970|3496->974|3548->999|3576->1000|3609->1006
                  LINES: 26->1|32->7|32->7|33->8|35->10|35->10|36->11|36->11|36->11|38->13|43->18|43->18|44->19|44->19|44->19|45->20|48->23|48->23|50->25|50->25|50->25|52->27|53->28|53->28|54->29|54->29|54->29|55->30|57->32|57->32|58->33|58->33|58->33|59->34|62->37|62->37|63->38|63->38|63->38|64->39|71->46|71->46|72->47|72->47|72->47|73->48|78->53|78->53|80->55|80->55|80->55|81->56|82->57|82->57|84->59|84->59|84->59|85->60|90->65|90->65|92->67|92->67|92->67|93->68|94->69|94->69|97->72
                  -- GENERATED --
              */
          