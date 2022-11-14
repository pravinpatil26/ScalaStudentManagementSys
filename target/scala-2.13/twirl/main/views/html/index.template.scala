
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template7[Map[String, Any],Map[String, Any],Int,Map[String, Any],String,Int,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(idMap:Map[String,Any],name:Map[String,Any],prn:Int,prev_exam:Map[String,Any],branch:String,mobileno:Int,emailid:String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.122*/(""";



<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <!----======== CSS ======== -->
    <link rel="stylesheet" href="style.css">

    <!----===== Iconscout CSS ===== -->
    <link rel="stylesheet" href="https://unicons.iconscout.com/release/v4.0.0/css/line.css">

    <title>Responsive Regisration Form </title>
</head>
<style>
    *"""),format.raw/*20.6*/("""{"""),format.raw/*20.7*/("""
    """),format.raw/*21.5*/("""margin: 0;
    padding: 0;
    box-sizing: border-box;
    font-family: 'Poppins', sans-serif;
"""),format.raw/*25.1*/("""}"""),format.raw/*25.2*/("""
"""),format.raw/*26.1*/("""body"""),format.raw/*26.5*/("""{"""),format.raw/*26.6*/("""
    """),format.raw/*27.5*/("""min-height: 100vh;
    display: flex;
    align-items: center;
    justify-content: center;
    background: #D3d3d3;
"""),format.raw/*32.1*/("""}"""),format.raw/*32.2*/("""
"""),format.raw/*33.1*/(""".container"""),format.raw/*33.11*/("""{"""),format.raw/*33.12*/("""
    """),format.raw/*34.5*/("""position: relative;
    max-width: 900px;
    width: 100%;
    border-radius: 6px;
    padding: 30px;
    margin: 0 15px;
    background-color: #fff;
    box-shadow: 0 5px 10px rgba(0,0,0,0.1);
"""),format.raw/*42.1*/("""}"""),format.raw/*42.2*/("""
"""),format.raw/*43.1*/(""".container header"""),format.raw/*43.18*/("""{"""),format.raw/*43.19*/("""
    """),format.raw/*44.5*/("""position: relative;
    font-size: 20px;
    font-weight: 600;
    color: #333;
"""),format.raw/*48.1*/("""}"""),format.raw/*48.2*/("""
"""),format.raw/*49.1*/(""".container header::before"""),format.raw/*49.26*/("""{"""),format.raw/*49.27*/("""
    """),format.raw/*50.5*/("""content: "";
    position: absolute;
    left: 0;
    bottom: -2px;
    height: 3px;
    width: 27px;
    border-radius: 8px;
    background-color: #4070f4;
"""),format.raw/*58.1*/("""}"""),format.raw/*58.2*/("""
"""),format.raw/*59.1*/(""".container form"""),format.raw/*59.16*/("""{"""),format.raw/*59.17*/("""
    """),format.raw/*60.5*/("""position: relative;
    margin-top: 16px;
    min-height: 490px;
    background-color: #fff;
    overflow: hidden;
"""),format.raw/*65.1*/("""}"""),format.raw/*65.2*/("""
"""),format.raw/*66.1*/(""".container form .form"""),format.raw/*66.22*/("""{"""),format.raw/*66.23*/("""
    """),format.raw/*67.5*/("""position: absolute;
    background-color: #fff;
    transition: 0.3s ease;
"""),format.raw/*70.1*/("""}"""),format.raw/*70.2*/("""

"""),format.raw/*72.1*/("""form.secActive .form.first"""),format.raw/*72.27*/("""{"""),format.raw/*72.28*/("""
    """),format.raw/*73.5*/("""opacity: 0;
    pointer-events: none;
    transform: translateX(-100%);
"""),format.raw/*76.1*/("""}"""),format.raw/*76.2*/("""
"""),format.raw/*77.1*/(""".container form .title"""),format.raw/*77.23*/("""{"""),format.raw/*77.24*/("""
    """),format.raw/*78.5*/("""display: block;
    margin-bottom: 8px;
    font-size: 16px;
    font-weight: 500;
    margin: 6px 0;
    color: #333;
"""),format.raw/*84.1*/("""}"""),format.raw/*84.2*/("""
"""),format.raw/*85.1*/(""".container form .fields"""),format.raw/*85.24*/("""{"""),format.raw/*85.25*/("""
    """),format.raw/*86.5*/("""display: flex;
    align-items: center;
    justify-content: space-between;
    flex-wrap: wrap;
"""),format.raw/*90.1*/("""}"""),format.raw/*90.2*/("""
"""),format.raw/*91.1*/("""form .fields .input-field"""),format.raw/*91.26*/("""{"""),format.raw/*91.27*/("""
    """),format.raw/*92.5*/("""display: flex;
    width: calc(100% / 3 - 15px);
    flex-direction: column;
    margin: 4px 0;
"""),format.raw/*96.1*/("""}"""),format.raw/*96.2*/("""
"""),format.raw/*97.1*/(""".input-field label"""),format.raw/*97.19*/("""{"""),format.raw/*97.20*/("""
    """),format.raw/*98.5*/("""font-size: 12px;
    font-weight: 500;
    color: #2e2e2e;
"""),format.raw/*101.1*/("""}"""),format.raw/*101.2*/("""
"""),format.raw/*102.1*/(""".input-field input, select"""),format.raw/*102.27*/("""{"""),format.raw/*102.28*/("""
    """),format.raw/*103.5*/("""outline: none;
    font-size: 14px;
    font-weight: 400;
    color: #333;
    border-radius: 5px;
    border: 1px solid #aaa;
    padding: 0 15px;
    height: 42px;
    margin: 8px 0;
"""),format.raw/*112.1*/("""}"""),format.raw/*112.2*/("""
"""),format.raw/*113.1*/(""".input-field input :focus,
.input-field select:focus"""),format.raw/*114.26*/("""{"""),format.raw/*114.27*/("""
    """),format.raw/*115.5*/("""box-shadow: 0 3px 6px rgba(0,0,0,0.13);
"""),format.raw/*116.1*/("""}"""),format.raw/*116.2*/("""
"""),format.raw/*117.1*/(""".input-field select,
.input-field input[type="date"]"""),format.raw/*118.32*/("""{"""),format.raw/*118.33*/("""
    """),format.raw/*119.5*/("""color: #707070;
"""),format.raw/*120.1*/("""}"""),format.raw/*120.2*/("""

"""),format.raw/*122.1*/(""".container form button, .backBtn"""),format.raw/*122.33*/("""{"""),format.raw/*122.34*/("""
    """),format.raw/*123.5*/("""display: flex;
    align-items: center;
    justify-content: center;
    height: 45px;
    max-width: 75px;
    width: 100%;
    border: none;
    outline: none;
    color: #fff;
    border-radius: 5px;
    margin: 25px 0;
    background-color: #4070f4;
    transition: all 0.3s linear;
    cursor: pointer;
"""),format.raw/*137.1*/("""}"""),format.raw/*137.2*/("""
"""),format.raw/*138.1*/(""".container form .btnText"""),format.raw/*138.25*/("""{"""),format.raw/*138.26*/("""
    """),format.raw/*139.5*/("""font-size: 14px;
    font-weight: 400;
"""),format.raw/*141.1*/("""}"""),format.raw/*141.2*/("""
"""),format.raw/*142.1*/("""form button:hover"""),format.raw/*142.18*/("""{"""),format.raw/*142.19*/("""
    """),format.raw/*143.5*/("""background-color: #265df2;
"""),format.raw/*144.1*/("""}"""),format.raw/*144.2*/("""
"""),format.raw/*145.1*/("""form button i,
form .backBtn i"""),format.raw/*146.16*/("""{"""),format.raw/*146.17*/("""
    """),format.raw/*147.5*/("""margin: 0 6px;
"""),format.raw/*148.1*/("""}"""),format.raw/*148.2*/("""
"""),format.raw/*149.1*/("""form .backBtn i"""),format.raw/*149.16*/("""{"""),format.raw/*149.17*/("""
    """),format.raw/*150.5*/("""transform: rotate(180deg);
"""),format.raw/*151.1*/("""}"""),format.raw/*151.2*/("""
"""),format.raw/*152.1*/("""form .buttons"""),format.raw/*152.14*/("""{"""),format.raw/*152.15*/("""
    """),format.raw/*153.5*/("""display: flex;
    align-items: center;
"""),format.raw/*155.1*/("""}"""),format.raw/*155.2*/("""
"""),format.raw/*156.1*/("""form .buttons button , .backBtn"""),format.raw/*156.32*/("""{"""),format.raw/*156.33*/("""
    """),format.raw/*157.5*/("""margin-right: 23px;
"""),format.raw/*158.1*/("""}"""),format.raw/*158.2*/("""




"""),format.raw/*163.1*/("""</style>
<body>
<script>
    const form = document.querySelector("form"),
        nextBtn = form.querySelector(".nextBtn"),
        backBtn = form.querySelector(".backBtn"),
        allInput = form.querySelectorAll(".first input");


nextBtn.addEventListener("click", ()=> """),format.raw/*172.40*/("""{"""),format.raw/*172.41*/("""
    """),format.raw/*173.5*/("""allInput.forEach(input => """),format.raw/*173.31*/("""{"""),format.raw/*173.32*/("""
        """),format.raw/*174.9*/("""if(input.value != "")"""),format.raw/*174.30*/("""{"""),format.raw/*174.31*/("""
            """),format.raw/*175.13*/("""form.classList.add('secActive');
        """),format.raw/*176.9*/("""}"""),format.raw/*176.10*/("""else"""),format.raw/*176.14*/("""{"""),format.raw/*176.15*/("""
            """),format.raw/*177.13*/("""form.classList.remove('secActive');
        """),format.raw/*178.9*/("""}"""),format.raw/*178.10*/("""
    """),format.raw/*179.5*/("""}"""),format.raw/*179.6*/(""")
"""),format.raw/*180.1*/("""}"""),format.raw/*180.2*/(""")

backBtn.addEventListener("click", () => form.classList.remove('secActive'));
</script>
<div class="container">
<!--    <header>Basic Details</header>-->
    <header>Student Exam Details</header>

    <form action="#">
        <div class="form first">
            <div class="details personal">
                <span class="title">Basic Details</span>

                <div class="fields">
                    <div class="input-field">
                        <label>Full Name</label>
                        <input type="text" placeholder= "First Name" id="firstname" value='"""),_display_(/*196.93*/name/*196.97*/.get("firstname")),format.raw/*196.114*/("""' required />
                    </div>

                    <div class="input-field">

                        <input type="text"  placeholder="Middle Name" id="middlename" value='"""),_display_(/*201.95*/name/*201.99*/.get("middlename")),format.raw/*201.117*/("""' required />
                    </div>

                    <div class="input-field">
                        <input type="text" placeholder="Last Name"  id="lastname" value='"""),_display_(/*205.91*/name/*205.95*/.get("lastname")),format.raw/*205.111*/("""' required>
                    </div>

                    <div class="input-field">
                        <label>PRN</label>
                        <input type="number" placeholder="Enter PRN" id="prn" value="""),_display_(/*210.86*/prn),format.raw/*210.89*/(""" """),format.raw/*210.90*/("""required />                    </div>

                    <div class="input-field">
                        <label>Branch</label>
                        <select id="branch" required>
<!--                            <option disabled selected>Select your Branch</option>-->
                            <option value="none" disabled selected>Select Branch """),_display_(/*216.83*/branch),format.raw/*216.89*/("""</option>
                            <option value="CSE">CSE</option>
                            <option value="ECE">ECE</option>
                            <option value="Mech">Mech</option>
                            <option value="Civil">Civil</option>
                            <option value="IT">IT</option>
                        </select>
                    </div>

                    <div class="input-field">
                        <label>Mobile Number</label>
                        <input type="text"  placeholder="Enter mobile no." id="mobileno" value="""),_display_(/*227.97*/mobileno),format.raw/*227.105*/(""" """),format.raw/*227.106*/("""size="16"/>
                    </div>

                    <div class="input-field">
                        <label>Email ID</label>
                        <input type="email" placeholder="Enter email address" id="emailid"  value="""),_display_(/*232.100*/emailid),format.raw/*232.107*/(""" """),format.raw/*232.108*/(""">
                    </div>

                </div>
            </div>

            <div class="details ID">
                <span class="title">Previous Exam Details</span>

                <div class="fields">
                    <div class="input-field">
                        <label>Academic Year</label>
                        <select id="acad_year" name="acad_year">
                            <!--                            <option disabled selected>Select your Branch</option>-->
                            <option value="none" disabled selected>Select academic year """),_display_(/*246.90*/prev_exam/*246.99*/.get("acad_year")),format.raw/*246.116*/("""</option>
                            <option value="1">1</option>
                            <option value="2">2</option>
                            <option value="3">3</option>
                            <option value="4">4</option>
                        </select>
                    </div>

                    <div class="input-field">
                        <label>Result</label>
                        <select id="result" name="result">
                            <option value="none" selected disabled hidden>Select result """),_display_(/*257.90*/prev_exam/*257.99*/.get("result")),format.raw/*257.113*/("""</option>
                            <option value="Result">Result</option>
                            <option value="Pass">Pass</option>
                            <option value="Fail">Fail</option>

                        </select>
                    </div>

                    <div class="input-field">
                        <label>Score/Marks Obtained</label>
                        <input type="text"  id="score" placeholder="Enter score" size="10" value='"""),_display_(/*267.100*/prev_exam/*267.109*/.get("score")),format.raw/*267.122*/("""'> <br> <br>

                    </div>


                </div>

                <div class="buttons">
                    <div class="backBtn">

                        <span class="btnText">Save</span>
                    </div>

                    <button class="submit">
                        <span class="btnText">Cancel</span>

                    </button>
                </div>
            </div>
        </div>


    </form>
</div>

<!--<script src="check.js"></script>-->
</body>
</html>

"""))
      }
    }
  }

  def render(idMap:Map[String, Any],name:Map[String, Any],prn:Int,prev_exam:Map[String, Any],branch:String,mobileno:Int,emailid:String): play.twirl.api.HtmlFormat.Appendable = apply(idMap,name,prn,prev_exam,branch,mobileno,emailid)

  def f:((Map[String, Any],Map[String, Any],Int,Map[String, Any],String,Int,String) => play.twirl.api.HtmlFormat.Appendable) = (idMap,name,prn,prev_exam,branch,mobileno,emailid) => apply(idMap,name,prn,prev_exam,branch,mobileno,emailid)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/index.scala.html
                  HASH: 25b02af23ff38179f035e10c8ad900141a4bd673
                  MATRIX: 795->3|1011->123|1514->599|1542->600|1575->606|1701->705|1729->706|1758->708|1789->712|1817->713|1850->719|1999->841|2027->842|2056->844|2094->854|2123->855|2156->861|2385->1063|2413->1064|2442->1066|2487->1083|2516->1084|2549->1090|2660->1174|2688->1175|2717->1177|2770->1202|2799->1203|2832->1209|3024->1374|3052->1375|3081->1377|3124->1392|3153->1393|3186->1399|3333->1519|3361->1520|3390->1522|3439->1543|3468->1544|3501->1550|3606->1628|3634->1629|3665->1633|3719->1659|3748->1660|3781->1666|3883->1741|3911->1742|3940->1744|3990->1766|4019->1767|4052->1773|4204->1898|4232->1899|4261->1901|4312->1924|4341->1925|4374->1931|4502->2032|4530->2033|4559->2035|4612->2060|4641->2061|4674->2067|4801->2167|4829->2168|4858->2170|4904->2188|4933->2189|4966->2195|5056->2257|5085->2258|5115->2260|5170->2286|5200->2287|5234->2293|5456->2487|5485->2488|5515->2490|5597->2543|5627->2544|5661->2550|5730->2591|5759->2592|5789->2594|5871->2647|5901->2648|5935->2654|5980->2671|6009->2672|6041->2676|6102->2708|6132->2709|6166->2715|6516->3037|6545->3038|6575->3040|6628->3064|6658->3065|6692->3071|6761->3112|6790->3113|6820->3115|6866->3132|6896->3133|6930->3139|6986->3167|7015->3168|7045->3170|7105->3201|7135->3202|7169->3208|7213->3224|7242->3225|7272->3227|7316->3242|7346->3243|7380->3249|7436->3277|7465->3278|7495->3280|7537->3293|7567->3294|7601->3300|7671->3342|7700->3343|7730->3345|7790->3376|7820->3377|7854->3383|7903->3404|7932->3405|7970->3415|8281->3697|8311->3698|8345->3704|8400->3730|8430->3731|8468->3741|8518->3762|8548->3763|8591->3777|8661->3819|8691->3820|8724->3824|8754->3825|8797->3839|8870->3884|8900->3885|8934->3891|8963->3892|8994->3895|9023->3896|9646->4491|9660->4495|9700->4512|9916->4700|9930->4704|9971->4722|10181->4904|10195->4908|10234->4924|10481->5143|10506->5146|10536->5147|10926->5509|10954->5515|11569->6102|11600->6110|11631->6111|11898->6349|11928->6356|11959->6357|12584->6954|12603->6963|12643->6980|13222->7531|13241->7540|13278->7554|13788->8035|13808->8044|13844->8057
                  LINES: 21->2|26->2|44->20|44->20|45->21|49->25|49->25|50->26|50->26|50->26|51->27|56->32|56->32|57->33|57->33|57->33|58->34|66->42|66->42|67->43|67->43|67->43|68->44|72->48|72->48|73->49|73->49|73->49|74->50|82->58|82->58|83->59|83->59|83->59|84->60|89->65|89->65|90->66|90->66|90->66|91->67|94->70|94->70|96->72|96->72|96->72|97->73|100->76|100->76|101->77|101->77|101->77|102->78|108->84|108->84|109->85|109->85|109->85|110->86|114->90|114->90|115->91|115->91|115->91|116->92|120->96|120->96|121->97|121->97|121->97|122->98|125->101|125->101|126->102|126->102|126->102|127->103|136->112|136->112|137->113|138->114|138->114|139->115|140->116|140->116|141->117|142->118|142->118|143->119|144->120|144->120|146->122|146->122|146->122|147->123|161->137|161->137|162->138|162->138|162->138|163->139|165->141|165->141|166->142|166->142|166->142|167->143|168->144|168->144|169->145|170->146|170->146|171->147|172->148|172->148|173->149|173->149|173->149|174->150|175->151|175->151|176->152|176->152|176->152|177->153|179->155|179->155|180->156|180->156|180->156|181->157|182->158|182->158|187->163|196->172|196->172|197->173|197->173|197->173|198->174|198->174|198->174|199->175|200->176|200->176|200->176|200->176|201->177|202->178|202->178|203->179|203->179|204->180|204->180|220->196|220->196|220->196|225->201|225->201|225->201|229->205|229->205|229->205|234->210|234->210|234->210|240->216|240->216|251->227|251->227|251->227|256->232|256->232|256->232|270->246|270->246|270->246|281->257|281->257|281->257|291->267|291->267|291->267
                  -- GENERATED --
              */
          