
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template5[String,String,String,String,Map[String, String],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(id: String, name: String, branch: String, admission_year: String, academic_year: Map[String, String]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.104*/("""


"""),format.raw/*5.1*/("""<head xmlns="http://www.w3.org/1999/html">
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
    *"""),format.raw/*19.6*/("""{"""),format.raw/*19.7*/("""
    """),format.raw/*20.5*/("""margin: 0;
    padding: 0;
    box-sizing: border-box;
    font-family: 'Poppins', sans-serif;
"""),format.raw/*24.1*/("""}"""),format.raw/*24.2*/("""
"""),format.raw/*25.1*/("""body"""),format.raw/*25.5*/("""{"""),format.raw/*25.6*/("""
    """),format.raw/*26.5*/("""min-height: 100vh;
    display: flex;
    align-items: center;
    justify-content: center;
    background: #D3d3d3;
"""),format.raw/*31.1*/("""}"""),format.raw/*31.2*/("""
"""),format.raw/*32.1*/(""".container"""),format.raw/*32.11*/("""{"""),format.raw/*32.12*/("""
    """),format.raw/*33.5*/("""position: relative;
    max-width: 900px;
    width: 100%;
    border-radius: 6px;
    padding: 30px;
    margin: 0 15px;
    background-color: #fff;
    box-shadow: 0 5px 10px rgba(0,0,0,0.1);
"""),format.raw/*41.1*/("""}"""),format.raw/*41.2*/("""
"""),format.raw/*42.1*/(""".container header"""),format.raw/*42.18*/("""{"""),format.raw/*42.19*/("""
    """),format.raw/*43.5*/("""position: relative;
    font-size: 20px;
    font-weight: 600;
    color: #333;
"""),format.raw/*47.1*/("""}"""),format.raw/*47.2*/("""
"""),format.raw/*48.1*/(""".container header::before"""),format.raw/*48.26*/("""{"""),format.raw/*48.27*/("""
    """),format.raw/*49.5*/("""content: "";
    position: absolute;
    left: 0;
    bottom: -2px;
    height: 3px;
    width: 27px;
    border-radius: 8px;
    background-color: #4070f4;
"""),format.raw/*57.1*/("""}"""),format.raw/*57.2*/("""
"""),format.raw/*58.1*/(""".container form"""),format.raw/*58.16*/("""{"""),format.raw/*58.17*/("""
    """),format.raw/*59.5*/("""position: relative;
    margin-top: 16px;
    min-height: 490px;
    background-color: #fff;
    overflow: hidden;
"""),format.raw/*64.1*/("""}"""),format.raw/*64.2*/("""
"""),format.raw/*65.1*/(""".container form .form"""),format.raw/*65.22*/("""{"""),format.raw/*65.23*/("""
    """),format.raw/*66.5*/("""position: absolute;
    background-color: #fff;
    transition: 0.3s ease;
"""),format.raw/*69.1*/("""}"""),format.raw/*69.2*/("""

"""),format.raw/*71.1*/("""form.secActive .form.first"""),format.raw/*71.27*/("""{"""),format.raw/*71.28*/("""
    """),format.raw/*72.5*/("""opacity: 0;
    pointer-events: none;
    transform: translateX(-100%);
"""),format.raw/*75.1*/("""}"""),format.raw/*75.2*/("""
"""),format.raw/*76.1*/(""".container form .title"""),format.raw/*76.23*/("""{"""),format.raw/*76.24*/("""
    """),format.raw/*77.5*/("""display: block;
    margin-bottom: 8px;
    font-size: 16px;
    font-weight: 500;
    margin: 6px 0;
    color: #333;
"""),format.raw/*83.1*/("""}"""),format.raw/*83.2*/("""
"""),format.raw/*84.1*/(""".container form .fields"""),format.raw/*84.24*/("""{"""),format.raw/*84.25*/("""
    """),format.raw/*85.5*/("""display: flex;
    align-items: center;
    /*justify-content: space-between;*/
    flex-wrap: nowrap;
    column-gap: 30px;
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

"""),format.raw/*165.13*/("""
"""),format.raw/*166.53*/("""
"""),format.raw/*167.57*/("""
"""),format.raw/*168.57*/("""
"""),format.raw/*169.65*/("""


"""),format.raw/*172.45*/("""
"""),format.raw/*173.36*/("""
"""),format.raw/*174.35*/("""
"""),format.raw/*175.49*/("""
"""),format.raw/*176.19*/("""
"""),format.raw/*177.52*/("""
"""),format.raw/*178.14*/("""
"""),format.raw/*179.11*/("""
"""),format.raw/*180.7*/("""

"""),format.raw/*182.81*/("""
"""),format.raw/*183.14*/("""
"""),format.raw/*184.1*/("""<div class="container">
<!--    <header>Basic Details</header>-->
    <header>Student Exam Details</header>

    <form action="/insertExamDetail" method="post" enctype="application/x-www-form-urlencoded">
        <div class="form first">
            <div class="details personal">
                <span class="title">Basic Details</span>

                <div class="fields">


                    <input type="hidden" placeholder="Enter PRN" id="prn" />

                    <div class="input-field">
                        <select id="branch" name="branch" required>
                            <option value="none" disabled selected>Select Branch """),_display_(/*200.83*/branch),format.raw/*200.89*/("""</option>
                            <option value="CSE">CSE</option>
                            <option value="ECE">ECE</option>
                            <option value="Mech">Mech</option>
                            <option value="Civil">Civil</option>
                            <option value="IT">IT</option>
                        </select>
                    </div>

                    <div class="input-field">
                        <select id="year" name="year" required>
                            <option value="none" disabled selected>Select Admission Year </option>
                            <option value="2018">2018 </option>
                            <option value="2019">2019</option>
                            <option value="2020">2020</option>
                            <option value="2021">2021</option>
                        </select>
                    </div>

                    <div class="input-field">
                        <select id="acad_year" name="acad_year">
                            <option value="none" disabled selected>Select academic year</option>
                            <option value="1">1</option>
                            <option value="2">2</option>
                            <option value="3">3</option>
                            <option value="4">4</option>
                        </select>
                    </div>

            <div class="input-field">
                    <!-- <label>Branch</label>-->
                <select id="student_option" name="student" required>
                    <option value="none" disabled selected>Select Student</option>
                </select>
            </div>

                </div>
            </div>

            <div class="details ID">
                <span class="title">Exam Details</span>

                <div class="fields">

                    <div class="input-field">
                        <select id="result" name="result">
                            <option value="none" selected disabled hidden>Select result </option>
                            <option value="Result">Result</option>
                            <option value="Pass">Pass</option>
                            <option value="Fail">Fail</option>

                        </select>
                    </div>

                    <div class="input-field">
                        <input type="text"  name="score" id="score" placeholder="Enter score" size="10" value=''>
                    </div>


                </div>

                <div class="buttons">
                    <div class="backBtn">
                        <span type="submit" class="btnText" id="save">Save</span>
                    </div>

                    <button class="submit">
                        <span class="btnText">Cancel</span>
                    </button>
                </div>
            </div>
        </div>


    </form>
</div>
<script>
    let student_option = document.querySelector("#student_option");
    let year = document.querySelector("#year");
    let branch = document.querySelector("#branch");
    let saveBtn = document.querySelector("#save");

    let result = document.querySelector("#result");
    let score = document.querySelector("#score");
    function reset()"""),format.raw/*284.21*/("""{"""),format.raw/*284.22*/("""
        """),format.raw/*285.9*/("""console.log("reset")
        result.value = ""
        score.value = ""
        student_option.value = ""
    """),format.raw/*289.5*/("""}"""),format.raw/*289.6*/("""
    """),format.raw/*290.5*/("""saveBtn.onclick = (e) => """),format.raw/*290.30*/("""{"""),format.raw/*290.31*/("""
        """),format.raw/*291.9*/("""let form = document.getElementsByTagName("form");
        let formData = new FormData(form[0]);
        formData.append("_id", student_option.selectedOptions[0].getAttribute("data-id"))
        fetch("/insertExamDetail","""),format.raw/*294.35*/("""{"""),format.raw/*294.36*/("""
            """),format.raw/*295.13*/("""body: new URLSearchParams(formData),
            method: "POST",
            headers:  """),format.raw/*297.23*/("""{"""),format.raw/*297.24*/("""
                """),format.raw/*298.17*/(""""Content-Type" : "application/x-www-form-urlencoded"
            """),format.raw/*299.13*/("""}"""),format.raw/*299.14*/("""

        """),format.raw/*301.9*/("""}"""),format.raw/*301.10*/(""")
        .then(resp => resp.json())
        .then(data => """),format.raw/*303.23*/("""{"""),format.raw/*303.24*/("""reset()"""),format.raw/*303.31*/("""}"""),format.raw/*303.32*/(""")


    """),format.raw/*306.5*/("""}"""),format.raw/*306.6*/("""

    """),format.raw/*308.5*/("""let branch_value, year_value
    [branch,year].forEach(el => """),format.raw/*309.33*/("""{"""),format.raw/*309.34*/("""
        """),format.raw/*310.9*/("""el.addEventListener('change', evt => """),format.raw/*310.46*/("""{"""),format.raw/*310.47*/("""
            """),format.raw/*311.13*/("""evt.preventDefault();

            if (evt.target.id === "branch") """),format.raw/*313.45*/("""{"""),format.raw/*313.46*/("""
                """),format.raw/*314.17*/("""branch_value = evt.target.value
            """),format.raw/*315.13*/("""}"""),format.raw/*315.14*/(""" """),format.raw/*315.15*/("""else if (evt.target.id === "year")"""),format.raw/*315.49*/("""{"""),format.raw/*315.50*/("""
                """),format.raw/*316.17*/("""year_value = evt.target.value
            """),format.raw/*317.13*/("""}"""),format.raw/*317.14*/("""

            """),format.raw/*319.13*/("""branch_value && year_value != undefined ? getStudents(branch_value,year_value): console.log("logg")

        """),format.raw/*321.9*/("""}"""),format.raw/*321.10*/(""")
    """),format.raw/*322.5*/("""}"""),format.raw/*322.6*/(""")

    function getStudents(branch,year) """),format.raw/*324.39*/("""{"""),format.raw/*324.40*/("""
        """),format.raw/*325.9*/("""fetch(`/fetchStudent?branch=$"""),format.raw/*325.38*/("""{"""),format.raw/*325.39*/("""branch"""),format.raw/*325.45*/("""}"""),format.raw/*325.46*/("""&year=$"""),format.raw/*325.53*/("""{"""),format.raw/*325.54*/("""year"""),format.raw/*325.58*/("""}"""),format.raw/*325.59*/("""`)
                .then((resp) => resp.json())
                .then((data) => (showStudents(data)))
                .catch((e) => """),format.raw/*328.31*/("""{"""),format.raw/*328.32*/("""
                    """),format.raw/*329.21*/("""console.log("error")
                """),format.raw/*330.17*/("""}"""),format.raw/*330.18*/(""")
    """),format.raw/*331.5*/("""}"""),format.raw/*331.6*/("""

    """),format.raw/*333.5*/("""function showStudents(data)"""),format.raw/*333.32*/("""{"""),format.raw/*333.33*/("""
        """),format.raw/*334.9*/("""let none_el = document.createElement('option');
        none_el.setAttribute('value', "");
        none_el.setAttribute('selected', 'true');
        none_el.innerHTML = "None";
        for (let i = 0; i < data.length; i++) """),format.raw/*338.47*/("""{"""),format.raw/*338.48*/("""
            """),format.raw/*339.13*/("""console.log(data)
            option_el = document.createElement('option');
            option_el.innerHTML = data[i].studentName.first_name + " " + data[i].studentName.last_name;
            option_el.setAttribute('value', data[i].studentName.first_name + " " +  data[i].studentName.middle_name  + " " + data[i].studentName.last_name);
            option_el.setAttribute('data-id', data[i].id["$oid"]);
            student_option.append(option_el);
        """),format.raw/*345.9*/("""}"""),format.raw/*345.10*/("""
        """),format.raw/*346.9*/("""student_option.insertBefore(none_el, student_option[0]);
    """),format.raw/*347.5*/("""}"""),format.raw/*347.6*/("""

    """),format.raw/*349.5*/("""</script>
</body>
</html>

"""))
      }
    }
  }

  def render(id:String,name:String,branch:String,admission_year:String,academic_year:Map[String, String]): play.twirl.api.HtmlFormat.Appendable = apply(id,name,branch,admission_year,academic_year)

  def f:((String,String,String,String,Map[String, String]) => play.twirl.api.HtmlFormat.Appendable) = (id,name,branch,admission_year,academic_year) => apply(id,name,branch,admission_year,academic_year)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/index.scala.html
                  HASH: d88f41b3f3cbc0cd2a60d634b3d4b908a94d0478
                  MATRIX: 770->3|968->105|1000->111|1530->614|1558->615|1591->621|1717->720|1745->721|1774->723|1805->727|1833->728|1866->734|2015->856|2043->857|2072->859|2110->869|2139->870|2172->876|2401->1078|2429->1079|2458->1081|2503->1098|2532->1099|2565->1105|2676->1189|2704->1190|2733->1192|2786->1217|2815->1218|2848->1224|3040->1389|3068->1390|3097->1392|3140->1407|3169->1408|3202->1414|3349->1534|3377->1535|3406->1537|3455->1558|3484->1559|3517->1565|3622->1643|3650->1644|3681->1648|3735->1674|3764->1675|3797->1681|3899->1756|3927->1757|3956->1759|4006->1781|4035->1782|4068->1788|4220->1913|4248->1914|4277->1916|4328->1939|4357->1940|4390->1946|4547->2076|4575->2077|4604->2079|4657->2104|4686->2105|4719->2111|4846->2211|4874->2212|4903->2214|4949->2232|4978->2233|5011->2239|5101->2301|5130->2302|5160->2304|5215->2330|5245->2331|5279->2337|5501->2531|5530->2532|5560->2534|5642->2587|5672->2588|5706->2594|5775->2635|5804->2636|5834->2638|5916->2691|5946->2692|5980->2698|6025->2715|6054->2716|6086->2720|6147->2752|6177->2753|6211->2759|6561->3081|6590->3082|6620->3084|6673->3108|6703->3109|6737->3115|6806->3156|6835->3157|6865->3159|6911->3176|6941->3177|6975->3183|7031->3211|7060->3212|7090->3214|7150->3245|7180->3246|7214->3252|7258->3268|7287->3269|7317->3271|7361->3286|7391->3287|7425->3293|7481->3321|7510->3322|7540->3324|7582->3337|7612->3338|7646->3344|7716->3386|7745->3387|7775->3389|7835->3420|7865->3421|7899->3427|7948->3448|7977->3449|8015->3459|8056->3483|8087->3537|8118->3595|8149->3653|8180->3719|8215->3769|8246->3806|8277->3842|8308->3892|8339->3912|8370->3965|8401->3980|8432->3992|8462->4000|8495->4084|8526->4099|8556->4101|9252->4769|9280->4775|12682->8148|12712->8149|12750->8159|12892->8273|12921->8274|12955->8280|13009->8305|13039->8306|13077->8316|13329->8539|13359->8540|13402->8554|13520->8643|13550->8644|13597->8662|13692->8728|13722->8729|13762->8741|13792->8742|13882->8803|13912->8804|13948->8811|13978->8812|14017->8823|14046->8824|14082->8832|14173->8894|14203->8895|14241->8905|14307->8942|14337->8943|14380->8957|14478->9026|14508->9027|14555->9045|14629->9090|14659->9091|14689->9092|14752->9126|14782->9127|14829->9145|14901->9188|14931->9189|14976->9205|15115->9316|15145->9317|15180->9324|15209->9325|15281->9368|15311->9369|15349->9379|15407->9408|15437->9409|15472->9415|15502->9416|15538->9423|15568->9424|15601->9428|15631->9429|15795->9564|15825->9565|15876->9587|15943->9625|15973->9626|16008->9633|16037->9634|16073->9642|16129->9669|16159->9670|16197->9680|16453->9907|16483->9908|16526->9922|17018->10386|17048->10387|17086->10397|17176->10459|17205->10460|17241->10468
                  LINES: 21->2|26->2|29->5|43->19|43->19|44->20|48->24|48->24|49->25|49->25|49->25|50->26|55->31|55->31|56->32|56->32|56->32|57->33|65->41|65->41|66->42|66->42|66->42|67->43|71->47|71->47|72->48|72->48|72->48|73->49|81->57|81->57|82->58|82->58|82->58|83->59|88->64|88->64|89->65|89->65|89->65|90->66|93->69|93->69|95->71|95->71|95->71|96->72|99->75|99->75|100->76|100->76|100->76|101->77|107->83|107->83|108->84|108->84|108->84|109->85|114->90|114->90|115->91|115->91|115->91|116->92|120->96|120->96|121->97|121->97|121->97|122->98|125->101|125->101|126->102|126->102|126->102|127->103|136->112|136->112|137->113|138->114|138->114|139->115|140->116|140->116|141->117|142->118|142->118|143->119|144->120|144->120|146->122|146->122|146->122|147->123|161->137|161->137|162->138|162->138|162->138|163->139|165->141|165->141|166->142|166->142|166->142|167->143|168->144|168->144|169->145|170->146|170->146|171->147|172->148|172->148|173->149|173->149|173->149|174->150|175->151|175->151|176->152|176->152|176->152|177->153|179->155|179->155|180->156|180->156|180->156|181->157|182->158|182->158|187->163|189->165|190->166|191->167|192->168|193->169|196->172|197->173|198->174|199->175|200->176|201->177|202->178|203->179|204->180|206->182|207->183|208->184|224->200|224->200|308->284|308->284|309->285|313->289|313->289|314->290|314->290|314->290|315->291|318->294|318->294|319->295|321->297|321->297|322->298|323->299|323->299|325->301|325->301|327->303|327->303|327->303|327->303|330->306|330->306|332->308|333->309|333->309|334->310|334->310|334->310|335->311|337->313|337->313|338->314|339->315|339->315|339->315|339->315|339->315|340->316|341->317|341->317|343->319|345->321|345->321|346->322|346->322|348->324|348->324|349->325|349->325|349->325|349->325|349->325|349->325|349->325|349->325|349->325|352->328|352->328|353->329|354->330|354->330|355->331|355->331|357->333|357->333|357->333|358->334|362->338|362->338|363->339|369->345|369->345|370->346|371->347|371->347|373->349
                  -- GENERATED --
              */
          