
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

object update extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""<!--<html lang="en">-->
<!--<head>-->
<!--    <meta charset="UTF-8">-->
<!--    <title>update</title>-->
<!--    <style>-->
<!--body"""),format.raw/*7.9*/("""{"""),format.raw/*7.10*/("""-->
<!--  font-family: Calibri, Helvetica, sans-serif;-->
<!--  background-color: #f1f1f1;-->
<!--"""),format.raw/*10.5*/("""}"""),format.raw/*10.6*/("""-->
<!--input"""),format.raw/*11.10*/("""{"""),format.raw/*11.11*/("""-->

<!--  padding: 20px;-->
<!--  margin: 150px 0 40px 0;-->
<!--  display: inline-block;-->
<!--  border: none;-->
<!--  background: #f1f1f1;-->
<!--"""),format.raw/*18.5*/("""}"""),format.raw/*18.6*/("""-->
<!--.container """),format.raw/*19.16*/("""{"""),format.raw/*19.17*/("""-->
<!--  padding: 50px;-->
<!--  background-color: lightblue;-->

<!--"""),format.raw/*23.5*/("""}"""),format.raw/*23.6*/("""-->

<!-- div """),format.raw/*25.10*/("""{"""),format.raw/*25.11*/("""-->

<!--   padding: px;-->
<!--         """),format.raw/*28.14*/("""}"""),format.raw/*28.15*/("""-->
<!--hr """),format.raw/*29.8*/("""{"""),format.raw/*29.9*/("""-->
<!--  border: 1px solid #f1f1f1;-->
<!--  margin-bottom: 25px;-->
<!--"""),format.raw/*32.5*/("""}"""),format.raw/*32.6*/("""-->
<!--label"""),format.raw/*33.10*/("""{"""),format.raw/*33.11*/("""-->
<!--  padding: 8px;-->


<!--"""),format.raw/*37.5*/("""}"""),format.raw/*37.6*/("""-->
<!--input[type=submit] """),format.raw/*38.24*/("""{"""),format.raw/*38.25*/("""-->
<!--  background-color: #529AE1;-->
<!--  border: none;-->
<!--  color: white;-->
<!--  padding: 16px 32px;-->
<!--  text-decoration: none;-->
<!--  margin: 4px 2px;-->
<!--  cursor: pointer;-->
<!--"""),format.raw/*46.5*/("""}"""),format.raw/*46.6*/("""-->
<!--ul """),format.raw/*47.8*/("""{"""),format.raw/*47.9*/("""-->
<!--  list-style-type: none;-->
<!--  margin: 0;-->
<!--  padding: 0;-->
<!--  overflow: hidden;-->
<!--  background-color: #333;-->
<!--"""),format.raw/*53.5*/("""}"""),format.raw/*53.6*/("""-->

<!--li """),format.raw/*55.8*/("""{"""),format.raw/*55.9*/("""-->
<!--  float: left;-->
<!--"""),format.raw/*57.5*/("""}"""),format.raw/*57.6*/("""-->

<!--li a """),format.raw/*59.10*/("""{"""),format.raw/*59.11*/("""-->
<!--  display: block;-->
<!--  color: white;-->
<!--  text-align: center;-->
<!--  padding: 14px 16px;-->
<!--  text-decoration: none;-->
<!--"""),format.raw/*65.5*/("""}"""),format.raw/*65.6*/("""-->

<!--li a:hover """),format.raw/*67.16*/("""{"""),format.raw/*67.17*/("""-->
<!--  background-color: #111;-->
<!--"""),format.raw/*69.5*/("""}"""),format.raw/*69.6*/("""-->


<!--</style>-->

<!--</head>-->

<!--<body>-->

<!--<form method="get" action="/view">-->
<!--    <div class="container" align="center">-->
<!--    <input type="number" name="prn" id="prn" size="50" placeholder="Enter your PRN" required/> <br> <br>-->

<!--    <input type="submit" value="Submit" id="sub"/>-->
<!--    </div>-->

<!--</form>-->

<!--&lt;!&ndash;<form method="get" action="/udate2">&ndash;&gt;-->
<!--&lt;!&ndash;    <input type="submit" value="Submit"/>&ndash;&gt;-->
<!--&lt;!&ndash;</form>&ndash;&gt;-->
<!--</body>-->
<!--</html>-->


<html>
<head>
    <style>
.center """),format.raw/*97.9*/("""{"""),format.raw/*97.10*/("""
    """),format.raw/*98.5*/("""margin: auto;
    width: 60%;
    padding: 20px;
    box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2), 0 6px 20px 0 rgba(0, 0, 0, 0.19);
"""),format.raw/*102.1*/("""}"""),format.raw/*102.2*/("""

"""),format.raw/*104.1*/(""".hideform """),format.raw/*104.11*/("""{"""),format.raw/*104.12*/("""
    """),format.raw/*105.5*/("""display: none;
"""),format.raw/*106.1*/("""}"""),format.raw/*106.2*/("""
"""),format.raw/*107.1*/("""</style>
</head>
<body>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
<div class="center hideform">
    <button id="close" style="float: right;">X</button>
    <form action="/action_page.php">
        First name:<br>
        <input type="text" name="firstname" value="Mickey">
        <br>
        Last name:<br>
        <input type="text" name="lastname" value="Mouse">
        <br><br>
        <input type="submit" value="Submit">
    </form>
</div>
<button id="show">Show form</button>
<script>
$('#show').on('click', function () """),format.raw/*125.36*/("""{"""),format.raw/*125.37*/("""
    """),format.raw/*126.5*/("""$('.center').show();
    $(this).hide();
"""),format.raw/*128.1*/("""}"""),format.raw/*128.2*/(""")

$('#close').on('click', function () """),format.raw/*130.37*/("""{"""),format.raw/*130.38*/("""
    """),format.raw/*131.5*/("""$('.center').hide();
    $('#show').show();
"""),format.raw/*133.1*/("""}"""),format.raw/*133.2*/(""")
</script>
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
                  SOURCE: app/views/update.scala.html
                  HASH: fbf16661f336b88613baa907185645fde3cd9a4f
                  MATRIX: 812->2|975->139|1003->140|1131->241|1159->242|1201->256|1230->257|1415->415|1443->416|1491->436|1520->437|1622->512|1650->513|1694->529|1723->530|1795->574|1824->575|1863->587|1891->588|1995->665|2023->666|2065->680|2094->681|2158->718|2186->719|2242->747|2271->748|2509->959|2537->960|2576->972|2604->973|2778->1120|2806->1121|2847->1135|2875->1136|2934->1168|2962->1169|3006->1185|3035->1186|3214->1338|3242->1339|3292->1361|3321->1362|3391->1405|3419->1406|4069->2029|4098->2030|4131->2036|4294->2171|4323->2172|4355->2176|4394->2186|4424->2187|4458->2193|4502->2209|4531->2210|4561->2212|5184->2806|5214->2807|5248->2813|5319->2856|5348->2857|5418->2898|5448->2899|5482->2905|5556->2951|5585->2952
                  LINES: 26->2|31->7|31->7|34->10|34->10|35->11|35->11|42->18|42->18|43->19|43->19|47->23|47->23|49->25|49->25|52->28|52->28|53->29|53->29|56->32|56->32|57->33|57->33|61->37|61->37|62->38|62->38|70->46|70->46|71->47|71->47|77->53|77->53|79->55|79->55|81->57|81->57|83->59|83->59|89->65|89->65|91->67|91->67|93->69|93->69|121->97|121->97|122->98|126->102|126->102|128->104|128->104|128->104|129->105|130->106|130->106|131->107|149->125|149->125|150->126|152->128|152->128|154->130|154->130|155->131|157->133|157->133
                  -- GENERATED --
              */
          