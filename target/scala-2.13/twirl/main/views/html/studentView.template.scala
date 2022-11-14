
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

object studentView extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Map[String, Any],Map[String, Any],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(jsonMap: Map[String,Any],stud_contact_details: Map[String,Any]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.66*/("""
"""),format.raw/*2.1*/("""<html lang="en">
<head>
    <style>
    table,
    th,
    td """),format.raw/*7.8*/("""{"""),format.raw/*7.9*/("""
        """),format.raw/*8.9*/("""border: 2px solid black;
        border-collapse: collapse;
    """),format.raw/*10.5*/("""}"""),format.raw/*10.6*/("""

    """),format.raw/*12.5*/("""th,
    td """),format.raw/*13.8*/("""{"""),format.raw/*13.9*/("""
        """),format.raw/*14.9*/("""padding: 10px;
    """),format.raw/*15.5*/("""}"""),format.raw/*15.6*/("""
    """),format.raw/*16.5*/("""</style>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>


<table style="width:100%">
    <tr>
        <th>Fields</th>
        <th>Values</th>
    </tr>
    """),_display_(/*28.6*/for((k,v) <- jsonMap) yield /*28.27*/ {_display_(Seq[Any](format.raw/*28.29*/("""
    """),format.raw/*29.5*/("""<tr>
        <td>"""),_display_(/*30.14*/k),format.raw/*30.15*/("""</td>

        <td>"""),_display_(/*32.14*/v),format.raw/*32.15*/("""</td><br>
    </tr>
    """)))}),format.raw/*34.6*/("""
    """),_display_(/*35.6*/for((k,v) <- stud_contact_details) yield /*35.40*/ {_display_(Seq[Any](format.raw/*35.42*/("""
    """),format.raw/*36.5*/("""<tr>
        <td>"""),_display_(/*37.14*/k),format.raw/*37.15*/("""</td>
        <td>"""),_display_(/*38.14*/v),format.raw/*38.15*/("""</td>
    </tr>
    """)))}),format.raw/*40.6*/("""
"""),format.raw/*41.1*/("""</table>





</body>
</html>"""))
      }
    }
  }

  def render(jsonMap:Map[String, Any],stud_contact_details:Map[String, Any]): play.twirl.api.HtmlFormat.Appendable = apply(jsonMap,stud_contact_details)

  def f:((Map[String, Any],Map[String, Any]) => play.twirl.api.HtmlFormat.Appendable) = (jsonMap,stud_contact_details) => apply(jsonMap,stud_contact_details)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/studentView.scala.html
                  HASH: 93d29d058eb637e62b434fa04340a6956ff9e9d9
                  MATRIX: 762->1|921->65|949->67|1042->134|1069->135|1105->145|1198->211|1226->212|1261->220|1300->232|1328->233|1365->243|1412->263|1440->264|1473->270|1688->459|1725->480|1765->482|1798->488|1844->507|1866->508|1915->530|1937->531|1994->558|2027->565|2077->599|2117->601|2150->607|2196->626|2218->627|2265->647|2287->648|2340->671|2369->673
                  LINES: 21->1|26->1|27->2|32->7|32->7|33->8|35->10|35->10|37->12|38->13|38->13|39->14|40->15|40->15|41->16|53->28|53->28|53->28|54->29|55->30|55->30|57->32|57->32|59->34|60->35|60->35|60->35|61->36|62->37|62->37|63->38|63->38|65->40|66->41
                  -- GENERATED --
              */
          