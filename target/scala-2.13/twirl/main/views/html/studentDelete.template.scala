
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

object studentDelete extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Delete Value Page</title>
</head>
<body>
<form method="get" action="/studentDeleteValues">

    <label >Student First name:</label>
    <input type="text" id="student_first_name" name="student_first_name" placeholder= "firstName"required/>
    <label>Student Middle name:</label>
    <input type="text" id="student_mid_name" name="student_mid_name" placeholder= "middelName" required/>
    <input type="submit" name="Submit" />

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
                  SOURCE: app/views/studentDelete.scala.html
                  HASH: 9aae7865330a6152135e5532c74a28345759b785
                  MATRIX: 819->2
                  LINES: 26->2
                  -- GENERATED --
              */
          