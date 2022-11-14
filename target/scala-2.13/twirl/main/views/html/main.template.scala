
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

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,Html,Flash,play.twirl.api.HtmlFormat.Appendable] {

  /*
* This template is called from the `index` template. This template
* handles the rendering of the page header and body tags. It takes
* two arguments, a `String` for the title of the page and an `Html`
* object to insert into the body of the page.
*/
  def apply/*7.2*/(title: String)(content: Html)(implicit flash:Flash):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*7.54*/("""


"""),format.raw/*10.1*/("""<!DOCTYPE html>
<html lang="en">
<head>
    """),format.raw/*13.58*/("""
    """),format.raw/*14.5*/("""<title>"""),_display_(/*14.13*/title),format.raw/*14.18*/("""</title>
    <link rel="stylesheet" media="screen" href=""""),_display_(/*15.50*/routes/*15.56*/.Assets.versioned("stylesheets/main.css")),format.raw/*15.97*/("""">
    <link rel="shortcut icon" type="image/png" href=""""),_display_(/*16.55*/routes/*16.61*/.Assets.versioned("images/favicon.png")),format.raw/*16.100*/("""">

</head>
<body>
"""),format.raw/*21.23*/("""
"""),format.raw/*22.1*/("""<br><br>
"""),_display_(/*23.2*/flash/*23.7*/.get("error")),format.raw/*23.20*/("""
"""),_display_(/*24.2*/content),format.raw/*24.9*/("""



"""),format.raw/*28.1*/("""<script src=""""),_display_(/*28.15*/routes/*28.21*/.Assets.versioned("javascripts/main.js")),format.raw/*28.61*/("""" type="text/javascript"></script>
</body>
</html>
"""))
      }
    }
  }

  def render(title:String,content:Html,flash:Flash): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)(flash)

  def f:((String) => (Html) => (Flash) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => (flash) => apply(title)(content)(flash)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/main.scala.html
                  HASH: 9ef982b410333acdcea22970fca17718e1beb8c5
                  MATRIX: 993->261|1140->313|1173->319|1248->419|1281->425|1316->433|1342->438|1428->497|1443->503|1505->544|1590->602|1605->608|1666->647|1717->752|1746->754|1783->765|1796->770|1830->783|1859->786|1886->793|1921->801|1962->815|1977->821|2038->861
                  LINES: 26->7|31->7|34->10|37->13|38->14|38->14|38->14|39->15|39->15|39->15|40->16|40->16|40->16|44->21|45->22|46->23|46->23|46->23|47->24|47->24|51->28|51->28|51->28|51->28
                  -- GENERATED --
              */
          