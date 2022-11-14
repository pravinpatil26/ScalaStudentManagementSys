
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

object instituteIndex extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template8[Map[String, Any],Map[String, Any],Int,Map[String, Any],Map[String, Any],Map[String, Any],Map[String, Any],Boolean,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(jsonMap: Map[String,Any],stu_name: Map[String,Any],stu_Id:Int,jsonMap1: Map[String,Any],jsonMap2: Map[String,Any],jsonMap3: Map[String,Any],jsonMap4: Map[String,Any],updateView:Boolean):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.188*/("""

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

        <h4> Previous Institute Details </h4>

        <!-- ---------------------- Name OF Student -------------------------------------         -->
        <h4>Name of Student</h4>
        <label >First name:</label>
        <input type="text" name="student_first_name" placeholder= "firstName" value='"""),_display_(/*102.87*/stu_name/*102.95*/.get("first_name")),format.raw/*102.113*/("""'/>
        <label>Middle name:</label>
        <input type="text" name="student_mid_name" placeholder= "middleName" value='"""),_display_(/*104.86*/stu_name/*104.94*/.get("middle_name")),format.raw/*104.113*/("""' />
        <label >Last name:</label>
        <input type="text" name="student_last_name" placeholder= "lastName" value='"""),_display_(/*106.85*/stu_name/*106.93*/.get("last_name")),format.raw/*106.110*/("""'/>

        <br>
        <h4>Student Registration Id</h4>
        <label>Registration Id:</label>
        <input type="number" name="stu_registration_Id" placeholder="student registration Id" value='"""),_display_(/*111.103*/stu_Id),format.raw/*111.109*/("""'>
        <br>
        <hr>
        <label> Name </label>
        <input type="text" name="prev_name" placeholder= "name" id="prev_name3" value='"""),_display_(/*115.89*/jsonMap1/*115.97*/.get("Name")),format.raw/*115.109*/("""' size="42" required />
        <label> Unique Code: </label>
        <input type="text" name="prev_code" placeholder="code" id="prev_code4" pattern="[A-Za-z0-9]"""),format.raw/*117.100*/("""{"""),format.raw/*117.101*/("""}"""),format.raw/*117.102*/("""" value='"""),_display_(/*117.112*/jsonMap1/*117.120*/.get("Unique Code")),format.raw/*117.139*/("""' title="Alphabet and Digits only" size="25" required />

        <label>Email Id:</label>
        <input type="email" placeholder="Email" name="prev_email" id="prev_email3" size="42" value='"""),_display_(/*120.102*/jsonMap1/*120.110*/.get("Email ID")),format.raw/*120.126*/("""' title="Type a valid Email" required>

        <label> Contact Number: </label>
        <input type="text" name="prev_contact" placeholder="ContactNumber" pattern="[0-9]"""),format.raw/*123.90*/("""{"""),format.raw/*123.91*/("""10"""),format.raw/*123.93*/("""}"""),format.raw/*123.94*/("""" value='"""),_display_(/*123.104*/jsonMap1/*123.112*/.get("Contact Number")),format.raw/*123.134*/("""' title="Ten digits code" id="prev_contact" required />

        <br>
        <label>
            Address:
            <br>

            <label> Line 1: </label>
            <input type="text" name="prev_line1" id="prev_line3" placeholder= "Line 1" value='"""),_display_(/*131.96*/jsonMap3/*131.104*/.get("Line 1")),format.raw/*131.118*/("""' size="49" required />

            <label> Line 2: </label>
            <input type="text" name="prev_line2" id="prev_line4" placeholder= "Line 2" size="49" value='"""),_display_(/*134.106*/jsonMap3/*134.114*/.get("Line 2")),format.raw/*134.128*/("""' required />

            <label> City: </label>
            <input type="text" name="prev_city" id="prev_city2" value='"""),_display_(/*137.73*/jsonMap3/*137.81*/.get("City")),format.raw/*137.93*/("""' placeholder= "City" required />

            <br>
            <label> District: </label>
            <input type="text" name="prev_district" id="prev_district1" value='"""),_display_(/*141.81*/jsonMap3/*141.89*/.get("District")),format.raw/*141.105*/("""' placeholder= "District" size="25" required />

            <label> State: </label>
            <input type="text" name="prev_state" id="prev_state1" value='"""),_display_(/*144.75*/jsonMap3/*144.83*/.get("State")),format.raw/*144.96*/("""' placeholder= "State" size="25" required />

            <label> Country: </label>
            <input type="text" name="prev_country" id="prev_country1"  value='"""),_display_(/*147.80*/jsonMap3/*147.88*/.get("Country")),format.raw/*147.103*/("""' placeholder= "Country" size="25" required />

            <label> Pin-code: </label>
            <input type="number" name="prev_pin" id="prev_pin1" value='"""),_display_(/*150.73*/jsonMap3/*150.81*/.get("Pin-code")),format.raw/*150.97*/("""' placeholder= "PinCode" size="25" required />

        </label>

        <br>

        <label> Passing Year: </label>
        <input type="date" name="prev_year"  id="prev_year1" value='"""),_display_(/*157.70*/jsonMap1/*157.78*/.get("Passing year")),format.raw/*157.98*/("""'
               min="2010-01-01" max="2022-07-31" required />
        <h4> Current Institute Details </h4>


        <label> Name </label>
        <input type="text" name="current_name" placeholder= "name" id="current_name1" value='"""),_display_(/*163.95*/jsonMap2/*163.103*/.get("Name")),format.raw/*163.115*/("""' size="42" required />

        <label> Unique Code: </label>
        <input type="text" name="current_code" placeholder="code" size="25" id="current_code4" value='"""),_display_(/*166.104*/jsonMap2/*166.112*/.get("Unique Code")),format.raw/*166.131*/("""' pattern="[A-Za-z0-9]"""),format.raw/*166.153*/("""{"""),format.raw/*166.154*/("""}"""),format.raw/*166.155*/("""" title="Alphabet and Digits only" required />

        <label>Email Id:</label>
        <input type="email" placeholder="Email" name="current_email" size="42"   title="Type a valid Email"  value='"""),_display_(/*169.118*/jsonMap2/*169.126*/.get("Email ID")),format.raw/*169.142*/("""' id="current_email1" required>

        <label> Contact Number: </label>
        <input type="text" name="current_contact" id="current_contact1" pattern="[0-9]"""),format.raw/*172.87*/("""{"""),format.raw/*172.88*/("""10"""),format.raw/*172.90*/("""}"""),format.raw/*172.91*/("""" value='"""),_display_(/*172.101*/jsonMap2/*172.109*/.get("Contact Number")),format.raw/*172.131*/("""' title="Ten digits code" placeholder="ContactNumber"  required />

        <br>
        <label>
            Address:

            <br>
            <label> Line 1: </label>
            <input type="text" name="current_line1" id="current_line3" value='"""),_display_(/*180.80*/jsonMap4/*180.88*/.get("Line 1")),format.raw/*180.102*/("""' placeholder= "Line 1" size="49" required />

            <label> Line 2: </label>
            <input type="text" name="current_line2" id="current_line4" value='"""),_display_(/*183.80*/jsonMap4/*183.88*/.get("Line 2")),format.raw/*183.102*/("""' placeholder= "Line 2" size="49" required />

            <label> City: </label>
            <input type="text" name="current_city" id="current_city1" value='"""),_display_(/*186.79*/jsonMap4/*186.87*/.get("City")),format.raw/*186.99*/("""' placeholder= "City" required />

            <br>
            <label> District: </label>
            <input type="text" name="current_district" id="current_district1" value='"""),_display_(/*190.87*/jsonMap4/*190.95*/.get("District")),format.raw/*190.111*/("""' placeholder= "District" title="Alphabet and Digits only" size="25" required />
            <label> State: </label>
            <input type="text" name="current_state" id="current_state1" value='"""),_display_(/*192.81*/jsonMap4/*192.89*/.get("State")),format.raw/*192.102*/("""' placeholder= "State"  size="25" required />

            <label> Country: </label>
            <input type="text" name="current_country" id="current_country1" value='"""),_display_(/*195.85*/jsonMap4/*195.93*/.get("Country")),format.raw/*195.108*/("""' placeholder= "Country" size="25" required />

            <label> Pin-code: </label>
            <input type="number" name="current_pin" id="current_pin1" value='"""),_display_(/*198.79*/jsonMap4/*198.87*/.get("Pin-code")),format.raw/*198.103*/("""' placeholder= "PinCode" size="25" required />

        </label>
        <input type="hidden"  name="get_id" value="""),_display_(/*201.52*/jsonMap/*201.59*/.get("$oid")),format.raw/*201.71*/(""">

        <br>

        """),_display_(/*205.10*/if(updateView)/*205.24*/{_display_(Seq[Any](format.raw/*205.25*/("""
        """),format.raw/*206.9*/("""<input type="submit" name="submit" value="Submit" formaction="/instituteUpdate" class="btn">
        """)))}/*207.11*/else/*207.16*/{_display_(Seq[Any](format.raw/*207.17*/("""
        """),format.raw/*208.9*/("""<input type="submit" name="Submit" value="Submit" class="btn" />
        """)))}),format.raw/*209.10*/("""

        """),format.raw/*211.9*/("""<input type="submit" name="submit" value="cancel" formaction="/index1" class="btn">

    </form>
</div>
</body>
</html>
"""))
      }
    }
  }

  def render(jsonMap:Map[String, Any],stu_name:Map[String, Any],stu_Id:Int,jsonMap1:Map[String, Any],jsonMap2:Map[String, Any],jsonMap3:Map[String, Any],jsonMap4:Map[String, Any],updateView:Boolean): play.twirl.api.HtmlFormat.Appendable = apply(jsonMap,stu_name,stu_Id,jsonMap1,jsonMap2,jsonMap3,jsonMap4,updateView)

  def f:((Map[String, Any],Map[String, Any],Int,Map[String, Any],Map[String, Any],Map[String, Any],Map[String, Any],Boolean) => play.twirl.api.HtmlFormat.Appendable) = (jsonMap,stu_name,stu_Id,jsonMap1,jsonMap2,jsonMap3,jsonMap4,updateView) => apply(jsonMap,stu_name,stu_Id,jsonMap1,jsonMap2,jsonMap3,jsonMap4,updateView)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/instituteIndex.scala.html
                  HASH: 864fcf6f9b24063fedfffd28a8b5ea750cff5bf7
                  MATRIX: 845->5|1127->191|1157->195|1298->309|1326->310|1363->320|1560->490|1588->491|1617->493|1648->497|1676->498|1707->502|1813->581|1841->582|1870->584|1902->589|1930->590|1961->594|2097->703|2125->704|2154->706|2193->717|2222->718|2253->722|2302->744|2330->745|2363->751|2393->754|2421->755|2452->759|2531->811|2559->812|2588->814|2620->819|2648->820|2679->824|2721->839|2749->840|2778->842|2825->861|2854->862|2885->866|3060->1014|3088->1015|3117->1017|3147->1020|3175->1021|3206->1025|3334->1126|3362->1127|3393->1131|3423->1134|3451->1135|3482->1139|3523->1153|3551->1154|3582->1158|3614->1163|3642->1164|3673->1168|3806->1274|3834->1275|3865->1279|3904->1290|3933->1291|3964->1295|4016->1320|4044->1321|4073->1323|4117->1340|4145->1341|4182->1351|4275->1417|4303->1418|4340->1428|4370->1431|4398->1432|4435->1442|4482->1462|4510->1463|4545->1471|4987->1885|5005->1893|5046->1911|5201->2038|5219->2046|5261->2065|5415->2191|5433->2199|5473->2216|5708->2422|5737->2428|5916->2579|5934->2587|5969->2599|6162->2762|6193->2763|6224->2764|6263->2774|6282->2782|6324->2801|6548->2996|6567->3004|6606->3020|6808->3193|6838->3194|6869->3196|6899->3197|6938->3207|6957->3215|7002->3237|7295->3502|7314->3510|7351->3524|7550->3694|7569->3702|7606->3716|7759->3841|7777->3849|7811->3861|8014->4036|8032->4044|8071->4060|8261->4222|8279->4230|8314->4243|8508->4409|8526->4417|8564->4432|8754->4594|8772->4602|8810->4618|9033->4813|9051->4821|9093->4841|9361->5081|9380->5089|9415->5101|9613->5270|9632->5278|9674->5297|9726->5319|9757->5320|9788->5321|10018->5522|10037->5530|10076->5546|10268->5709|10298->5710|10329->5712|10359->5713|10398->5723|10417->5731|10462->5753|10750->6013|10768->6021|10805->6035|10999->6201|11017->6209|11054->6223|11245->6386|11263->6394|11297->6406|11506->6587|11524->6595|11563->6611|11790->6810|11808->6818|11844->6831|12044->7003|12062->7011|12100->7026|12296->7194|12314->7202|12353->7218|12500->7337|12517->7344|12551->7356|12609->7386|12633->7400|12673->7401|12711->7411|12834->7515|12848->7520|12888->7521|12926->7531|13033->7606|13073->7618
                  LINES: 21->3|26->3|28->5|32->9|32->9|33->10|40->17|40->17|41->18|41->18|41->18|42->19|44->21|44->21|45->22|45->22|45->22|46->23|51->28|51->28|52->29|52->29|52->29|53->30|57->34|57->34|60->37|60->37|60->37|61->38|63->40|63->40|64->41|64->41|64->41|65->42|66->43|66->43|67->44|67->44|67->44|68->45|75->52|75->52|76->53|76->53|76->53|77->54|82->59|82->59|84->61|84->61|84->61|85->62|86->63|86->63|88->65|88->65|88->65|89->66|94->71|94->71|96->73|96->73|96->73|97->74|98->75|98->75|99->76|101->78|101->78|102->79|104->81|104->81|107->84|107->84|107->84|108->85|109->86|109->86|113->90|125->102|125->102|125->102|127->104|127->104|127->104|129->106|129->106|129->106|134->111|134->111|138->115|138->115|138->115|140->117|140->117|140->117|140->117|140->117|140->117|143->120|143->120|143->120|146->123|146->123|146->123|146->123|146->123|146->123|146->123|154->131|154->131|154->131|157->134|157->134|157->134|160->137|160->137|160->137|164->141|164->141|164->141|167->144|167->144|167->144|170->147|170->147|170->147|173->150|173->150|173->150|180->157|180->157|180->157|186->163|186->163|186->163|189->166|189->166|189->166|189->166|189->166|189->166|192->169|192->169|192->169|195->172|195->172|195->172|195->172|195->172|195->172|195->172|203->180|203->180|203->180|206->183|206->183|206->183|209->186|209->186|209->186|213->190|213->190|213->190|215->192|215->192|215->192|218->195|218->195|218->195|221->198|221->198|221->198|224->201|224->201|224->201|228->205|228->205|228->205|229->206|230->207|230->207|230->207|231->208|232->209|234->211
                  -- GENERATED --
              */
          