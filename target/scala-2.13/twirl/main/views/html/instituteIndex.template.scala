
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
        .show """),format.raw/*9.15*/("""{"""),format.raw/*9.16*/("""
            """),format.raw/*10.13*/("""display: block;
        """),format.raw/*11.9*/("""}"""),format.raw/*11.10*/("""

        """),format.raw/*13.9*/(""".hide """),format.raw/*13.15*/("""{"""),format.raw/*13.16*/("""
            """),format.raw/*14.13*/("""display: none;
        """),format.raw/*15.9*/("""}"""),format.raw/*15.10*/("""

        """),format.raw/*17.9*/("""body """),format.raw/*17.14*/("""{"""),format.raw/*17.15*/("""
            """),format.raw/*18.13*/("""font-family: Calibri, Helvetica, sans-serif;
            margin: 0;
        """),format.raw/*20.9*/("""}"""),format.raw/*20.10*/("""

        """),format.raw/*22.9*/(""".show_option """),format.raw/*22.22*/("""{"""),format.raw/*22.23*/("""
            """),format.raw/*23.13*/("""padding: 10px;
            background: #000000;
            display: grid;
            align-content: center;
            justify-content: end;
        """),format.raw/*28.9*/("""}"""),format.raw/*28.10*/("""

        """),format.raw/*30.9*/("""button,
        .btn """),format.raw/*31.14*/("""{"""),format.raw/*31.15*/("""
            """),format.raw/*32.13*/("""border: 0;
            background: rgb(78, 129, 207);
            padding: 10px;
            border-radius: 5px;
            width: 100px;
            font-size: 20px;
            height: 50px;
            color: white;
            box-shadow: 0px 0px;
            transition: box-shadow ease-in 1ms 1ms;
            margin-top: 25px
        """),format.raw/*43.9*/("""}"""),format.raw/*43.10*/("""

        """),format.raw/*45.9*/("""button:hover """),format.raw/*45.22*/("""{"""),format.raw/*45.23*/("""
            """),format.raw/*46.13*/("""box-shadow: 2px 3px 2px 0px #899dbe;
            /* transition: border-shadow 12s ease-in; */
        """),format.raw/*48.9*/("""}"""),format.raw/*48.10*/("""

        """),format.raw/*50.9*/(""".popup_container """),format.raw/*50.26*/("""{"""),format.raw/*50.27*/("""
            """),format.raw/*51.13*/("""background: #ffffff;
            padding: 30px;
            /* width: 800px; */
            /* height: 800px; */
            /* position: absolute; */
            /* left: 57px; */
            /* top: 100px; */
        """),format.raw/*58.9*/("""}"""),format.raw/*58.10*/("""

        """),format.raw/*60.9*/(""".form_group """),format.raw/*60.21*/("""{"""),format.raw/*60.22*/("""
            """),format.raw/*61.13*/("""display: grid;
            grid-auto-flow: row;
            /* justify-items: center; */
            /* align-items: center; */
            margin-bottom: 1px;
            padding: 1px;
        """),format.raw/*67.9*/("""}"""),format.raw/*67.10*/("""

        """),format.raw/*69.9*/("""p """),format.raw/*69.11*/("""{"""),format.raw/*69.12*/("""
            """),format.raw/*70.13*/("""justify-self: self-start;
            font-size: 20px;
            color: black;
            font-weight: bold;
        """),format.raw/*74.9*/("""}"""),format.raw/*74.10*/("""

        """),format.raw/*76.9*/(""".input_group p,
        label """),format.raw/*77.15*/("""{"""),format.raw/*77.16*/("""
            """),format.raw/*78.13*/("""justify-self: self-start;
            font-size: 17px;
            color: #757087;
            font-weight: normal !important;
        """),format.raw/*82.9*/("""}"""),format.raw/*82.10*/("""

        """),format.raw/*84.9*/(""".input_group input """),format.raw/*84.28*/("""{"""),format.raw/*84.29*/("""
            """),format.raw/*85.13*/("""height: 40px;
            border: 1.5px #d7deee solid;
            border-radius: 4px;
            box-shadow: 1px 1px 4px 0px #d3cece;
            padding: 10px;
            font-size: 15px;
            outline: none;
            transition: border ease-in 10ms;
        """),format.raw/*93.9*/("""}"""),format.raw/*93.10*/("""

        """),format.raw/*95.9*/(""".form_group.address """),format.raw/*95.29*/("""{"""),format.raw/*95.30*/("""
            """),format.raw/*96.13*/("""display: grid;
            grid-auto-flow: row;
            /* justify-items: center; */
            /* align-items: center; */
            /* grid-template-columns: 200px auto; */
        """),format.raw/*101.9*/("""}"""),format.raw/*101.10*/("""

        """),format.raw/*103.9*/(""".group """),format.raw/*103.16*/("""{"""),format.raw/*103.17*/("""
            """),format.raw/*104.13*/("""display: grid;
            grid-auto-flow: row;
            grid-template-columns: repeat(3, 300px);
            grid-column-gap: 30px;
            /* margin-top: 76px; */
        """),format.raw/*109.9*/("""}"""),format.raw/*109.10*/("""


        """),format.raw/*112.9*/(""".input_group """),format.raw/*112.22*/("""{"""),format.raw/*112.23*/("""
            """),format.raw/*113.13*/("""display: grid;
        """),format.raw/*114.9*/("""}"""),format.raw/*114.10*/("""

        """),format.raw/*116.9*/(""".group_col """),format.raw/*116.20*/("""{"""),format.raw/*116.21*/("""
            """),format.raw/*117.13*/("""display: grid;
            grid-auto-flow: column;
            grid-template-columns: repeat(3, 300px);
            grid-gap: 40px;
        """),format.raw/*121.9*/("""}"""),format.raw/*121.10*/("""

        """),format.raw/*123.9*/("""/* input """),format.raw/*123.18*/("""{"""),format.raw/*123.19*/("""

            """),format.raw/*125.13*/("""padding: 10px;
            margin: 20px 0 30px 0;
            display: inline-block;
            border: none;
            background: #f1f1f1;
        """),format.raw/*130.9*/("""}"""),format.raw/*130.10*/("""

        """),format.raw/*132.9*/("""button """),format.raw/*132.16*/("""{"""),format.raw/*132.17*/("""
            """),format.raw/*133.13*/("""background-color: #529AE1;
            color: white;
            padding: 16px 32px;
            margin: 4px 2px;
            border: none;
            cursor: pointer;
            width: 9%;
            opacity: 0.9;
        """),format.raw/*141.9*/("""}"""),format.raw/*141.10*/("""

        """),format.raw/*143.9*/(""".deleteBtn """),format.raw/*143.20*/("""{"""),format.raw/*143.21*/("""
            """),format.raw/*144.13*/("""background-color: ##529AE1;
        """),format.raw/*145.9*/("""}"""),format.raw/*145.10*/("""

        """),format.raw/*147.9*/(""".view """),format.raw/*147.15*/("""{"""),format.raw/*147.16*/("""
            """),format.raw/*148.13*/("""background-color: #529AE1;
        """),format.raw/*149.9*/("""}"""),format.raw/*149.10*/("""

        """),format.raw/*151.9*/(""".update """),format.raw/*151.17*/("""{"""),format.raw/*151.18*/("""
            """),format.raw/*152.13*/("""background-color: ##529AE1;
        """),format.raw/*153.9*/("""}"""),format.raw/*153.10*/("""

        """),format.raw/*155.9*/(""".container """),format.raw/*155.20*/("""{"""),format.raw/*155.21*/("""
            """),format.raw/*156.13*/("""padding: 50px;
            background: lightblue;



        """),format.raw/*161.9*/("""}"""),format.raw/*161.10*/("""


        """),format.raw/*164.9*/("""hr """),format.raw/*164.12*/("""{"""),format.raw/*164.13*/("""
            """),format.raw/*165.13*/("""border: 1px solid #f1f1f1;
            margin-bottom: 25px;
        """),format.raw/*167.9*/("""}"""),format.raw/*167.10*/("""

        """),format.raw/*169.9*/("""label """),format.raw/*169.15*/("""{"""),format.raw/*169.16*/("""
            """),format.raw/*170.13*/("""padding: 8px;


        """),format.raw/*173.9*/("""}"""),format.raw/*173.10*/("""

        """),format.raw/*175.9*/("""input[type=submit] """),format.raw/*175.28*/("""{"""),format.raw/*175.29*/("""
            """),format.raw/*176.13*/("""background-color: #529AE1;
            border: none;
            color: white;
            padding: 16px 32px;
            text-decoration: none;
            margin: 4px 2px;
            cursor: pointer;
        """),format.raw/*183.9*/("""}"""),format.raw/*183.10*/("""

        """),format.raw/*185.9*/("""ul """),format.raw/*185.12*/("""{"""),format.raw/*185.13*/("""
            """),format.raw/*186.13*/("""list-style-type: none;
            margin: 0;
            padding: 0;
            overflow: hidden;
            background-color: #333;
        """),format.raw/*191.9*/("""}"""),format.raw/*191.10*/("""

        """),format.raw/*193.9*/("""li """),format.raw/*193.12*/("""{"""),format.raw/*193.13*/("""
            """),format.raw/*194.13*/("""float: left;
        """),format.raw/*195.9*/("""}"""),format.raw/*195.10*/("""

        """),format.raw/*197.9*/("""li a """),format.raw/*197.14*/("""{"""),format.raw/*197.15*/("""
            """),format.raw/*198.13*/("""display: block;
            color: white;
            text-align: center;
            padding: 14px 16px;
            text-decoration: none;
        """),format.raw/*203.9*/("""}"""),format.raw/*203.10*/("""

        """),format.raw/*205.9*/("""li a:hover """),format.raw/*205.20*/("""{"""),format.raw/*205.21*/("""
            """),format.raw/*206.13*/("""background-color: #111;
        """),format.raw/*207.9*/("""}"""),format.raw/*207.10*/(""" """),format.raw/*207.11*/("""*/
    </style>
</head>
<body>

    <div class="popup_container">
        <div class="insert_form">
            <form method="get" action="/instituteForm">
                <h3>Institute Details</h3>

                <div class="form_group">
                    <div class="group_col">
                        <div class="input_group">
                            <p> Name </p>
                            <input type="text" name="institute_name" placeholder= "Institute Name"
                                   id="institute_name" value='"""),_display_(/*222.64*/name),format.raw/*222.68*/("""' />
                        </div>

                    </div>
                </div>

                <div class="form_group">
                    <div class="group_col">
                        <div class="input_group">
                            <p> Registration No: </p>
                            <input type="text" name="institute_code" placeholder="code" id="institute_code"
                                   pattern="[A-Za-z0-9]"""),format.raw/*233.56*/("""{"""),format.raw/*233.57*/("""}"""),format.raw/*233.58*/("""" value='"""),_display_(/*233.68*/registration),format.raw/*233.80*/("""' title="Alphabet and Digits only" />
                        </div>

                        <div class="input_group">
                            <p>Email Id:</p>
                            <input type="email" placeholder="e-mail" name="institute_email"
                                   id="institute_email" value='"""),_display_(/*239.65*/email),format.raw/*239.70*/("""' title="Type a valid Email">
                        </div>

                        <div class="input_group">
                            <p> Contact Number: </p>
                            <input type="text" name="institute_contact" placeholder="contact number"
                                   pattern="[0-9]"""),format.raw/*245.50*/("""{"""),format.raw/*245.51*/("""10"""),format.raw/*245.53*/("""}"""),format.raw/*245.54*/("""" value='"""),_display_(/*245.64*/contact),format.raw/*245.71*/("""' title="Ten digits code" id="institute_contact"/>
                        </div>
                    </div>
                </div>

                <div class="form_group">
                    <h4>Address: </h4>
                    <div class="group">
                        <div class="input_group">
                            <p> Line 1: </p>
                            <input type="text" name="institute_line1" id="institute_line1"
                                   placeholder= "Line 1" value='"""),_display_(/*256.66*/address/*256.73*/.get("Line 1")),format.raw/*256.87*/("""' size="25"/>
                        </div>

                        <div class="input_group">
                            <p> Line 2: </p>
                            <input type="text" name="institute_line2" id="institute_line2"
                                   placeholder= "Line 2" size="25" value='"""),_display_(/*262.76*/address/*262.83*/.get("Line 2")),format.raw/*262.97*/("""'/>
                        </div>

                        <div class="input_group">
                            <p> City: </p>
                            <input type="text" name="institute_city" id="institute_city2"
                                   value='"""),_display_(/*268.44*/address/*268.51*/.get("City")),format.raw/*268.63*/("""' placeholder= "City" />
                        </div>

                        <div class="input_group">
                            <p> District: </p>
                            <input type="text" name="institute_district" id="institute_district1"
                                   value='"""),_display_(/*274.44*/address/*274.51*/.get("District")),format.raw/*274.67*/("""' placeholder= "District" size="25" />
                        </div>

                        <div class="input_group">
                            <p> State: </p>
                            <input type="text" name="institute_state" id="institute_state1"
                                   value='"""),_display_(/*280.44*/address/*280.51*/.get("State")),format.raw/*280.64*/("""' placeholder= "State" size="25" />
                        </div>

                        <div class="input_group">
                            <p> Country: </p>
                            <input type="text" name="institute_country" id="institute_country1"
                                   value='"""),_display_(/*286.44*/address/*286.51*/.get("Country")),format.raw/*286.66*/("""' placeholder= "Country" size="25"/>
                        </div>

                        <div class="input_group">
                            <p> Pin-code: </p>
                            <input type="number" name="institute_pin" id="institute_pin1"
                                   value='"""),_display_(/*292.44*/address/*292.51*/.get("Pin-code")),format.raw/*292.67*/("""' placeholder= "PinCode" size="25"/>
                        </div>
                    </div>
                </div>
                <br>

                <input type="hidden"  name="get_id" value="""),_display_(/*298.60*/jsonMap/*298.67*/.get("$oid")),format.raw/*298.79*/(""">

                <br>

                """),_display_(/*302.18*/if(updateView)/*302.32*/{_display_(Seq[Any](format.raw/*302.33*/("""
                """),format.raw/*303.17*/("""<input type="submit" name="submit" value="Submit" formaction="/instituteUpdate" class="btn">
                """)))}/*304.19*/else/*304.24*/{_display_(Seq[Any](format.raw/*304.25*/("""
                """),format.raw/*305.17*/("""<input type="submit" name="Submit" value="Submit" class="btn" />
                """)))}),format.raw/*306.18*/("""

                """),format.raw/*308.17*/("""<input type="submit" name="submit" value="Cancel" formaction="/index1" class="btn">

            </form>
        </div>
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
                  HASH: e3390696277b677e0adc567d118140e66c46f79a
                  MATRIX: 801->5|1026->134|1056->138|1200->255|1228->256|1270->270|1322->295|1351->296|1390->308|1424->314|1453->315|1495->329|1546->353|1575->354|1614->366|1647->371|1676->372|1718->386|1823->464|1852->465|1891->477|1932->490|1961->491|2003->505|2187->662|2216->663|2255->675|2305->697|2334->698|2376->712|2756->1065|2785->1066|2824->1078|2865->1091|2894->1092|2936->1106|3067->1210|3096->1211|3135->1223|3180->1240|3209->1241|3251->1255|3504->1481|3533->1482|3572->1494|3612->1506|3641->1507|3683->1521|3910->1721|3939->1722|3978->1734|4008->1736|4037->1737|4079->1751|4230->1875|4259->1876|4298->1888|4357->1919|4386->1920|4428->1934|4594->2073|4623->2074|4662->2086|4709->2105|4738->2106|4780->2120|5087->2400|5116->2401|5155->2413|5203->2433|5232->2434|5274->2448|5496->2642|5526->2643|5566->2655|5602->2662|5632->2663|5675->2677|5888->2862|5918->2863|5960->2877|6002->2890|6032->2891|6075->2905|6127->2929|6157->2930|6197->2942|6237->2953|6267->2954|6310->2968|6482->3112|6512->3113|6552->3125|6590->3134|6620->3135|6665->3151|6850->3308|6880->3309|6920->3321|6956->3328|6986->3329|7029->3343|7291->3577|7321->3578|7361->3590|7401->3601|7431->3602|7474->3616|7539->3653|7569->3654|7609->3666|7644->3672|7674->3673|7717->3687|7781->3723|7811->3724|7851->3736|7888->3744|7918->3745|7961->3759|8026->3796|8056->3797|8096->3809|8136->3820|8166->3821|8209->3835|8303->3901|8333->3902|8375->3916|8407->3919|8437->3920|8480->3934|8578->4004|8608->4005|8648->4017|8683->4023|8713->4024|8756->4038|8811->4065|8841->4066|8881->4078|8929->4097|8959->4098|9002->4112|9249->4331|9279->4332|9319->4344|9351->4347|9381->4348|9424->4362|9601->4511|9631->4512|9671->4524|9703->4527|9733->4528|9776->4542|9826->4564|9856->4565|9896->4577|9930->4582|9960->4583|10003->4597|10185->4751|10215->4752|10255->4764|10295->4775|10325->4776|10368->4790|10429->4823|10459->4824|10489->4825|11071->5379|11097->5383|11577->5834|11607->5835|11637->5836|11675->5846|11709->5858|12064->6185|12091->6190|12441->6511|12471->6512|12502->6514|12532->6515|12570->6525|12599->6532|13142->7047|13159->7054|13195->7068|13536->7381|13553->7388|13589->7402|13885->7670|13902->7677|13936->7689|14265->7990|14282->7997|14320->8013|14654->8319|14671->8326|14706->8339|15043->8648|15060->8655|15097->8670|15430->8975|15447->8982|15485->8998|15718->9203|15735->9210|15769->9222|15843->9268|15867->9282|15907->9283|15954->9301|16085->9413|16099->9418|16139->9419|16186->9437|16301->9520|16350->9540
                  LINES: 21->3|26->3|28->5|32->9|32->9|33->10|34->11|34->11|36->13|36->13|36->13|37->14|38->15|38->15|40->17|40->17|40->17|41->18|43->20|43->20|45->22|45->22|45->22|46->23|51->28|51->28|53->30|54->31|54->31|55->32|66->43|66->43|68->45|68->45|68->45|69->46|71->48|71->48|73->50|73->50|73->50|74->51|81->58|81->58|83->60|83->60|83->60|84->61|90->67|90->67|92->69|92->69|92->69|93->70|97->74|97->74|99->76|100->77|100->77|101->78|105->82|105->82|107->84|107->84|107->84|108->85|116->93|116->93|118->95|118->95|118->95|119->96|124->101|124->101|126->103|126->103|126->103|127->104|132->109|132->109|135->112|135->112|135->112|136->113|137->114|137->114|139->116|139->116|139->116|140->117|144->121|144->121|146->123|146->123|146->123|148->125|153->130|153->130|155->132|155->132|155->132|156->133|164->141|164->141|166->143|166->143|166->143|167->144|168->145|168->145|170->147|170->147|170->147|171->148|172->149|172->149|174->151|174->151|174->151|175->152|176->153|176->153|178->155|178->155|178->155|179->156|184->161|184->161|187->164|187->164|187->164|188->165|190->167|190->167|192->169|192->169|192->169|193->170|196->173|196->173|198->175|198->175|198->175|199->176|206->183|206->183|208->185|208->185|208->185|209->186|214->191|214->191|216->193|216->193|216->193|217->194|218->195|218->195|220->197|220->197|220->197|221->198|226->203|226->203|228->205|228->205|228->205|229->206|230->207|230->207|230->207|245->222|245->222|256->233|256->233|256->233|256->233|256->233|262->239|262->239|268->245|268->245|268->245|268->245|268->245|268->245|279->256|279->256|279->256|285->262|285->262|285->262|291->268|291->268|291->268|297->274|297->274|297->274|303->280|303->280|303->280|309->286|309->286|309->286|315->292|315->292|315->292|321->298|321->298|321->298|325->302|325->302|325->302|326->303|327->304|327->304|327->304|328->305|329->306|331->308
                  -- GENERATED --
              */
          