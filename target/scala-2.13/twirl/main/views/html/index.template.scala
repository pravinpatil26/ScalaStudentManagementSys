
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template5[Map[String, String],String,String,String,Map[String, String],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(id: Map[String, String], name: String, branch: String, admission_year: String, academic_year: Map[String, String]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.117*/("""


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


                    <input type="hidden" id="prn" name="prn" value="""),_display_(/*196.69*/id/*196.71*/.get("$oid")),format.raw/*196.83*/(""">

                    <div class="input-field">
                        <select id="branch" name="branch" required>
                            <option value=""""),_display_(/*200.45*/branch),format.raw/*200.51*/(""""  selected>"""),_display_(/*200.64*/if(branch)/*200.74*/{_display_(_display_(/*200.76*/branch))}/*200.84*/else/*200.88*/{_display_(Seq[Any](format.raw/*200.89*/("""select branch""")))}),format.raw/*200.103*/("""</option>
                            <option value="CSE">CSE</option>
                            <option value="ECE">ECE</option>
                            <option value="Mech">Mech</option>
                            <option value="Civil">Civil</option>
                            <option value="IT">IT</option>
                        </select>
                    </div>

                    <div class="input-field">
                        <select id="year" name="year" required>
                            <option value=""""),_display_(/*211.45*/admission_year),format.raw/*211.59*/(""""  selected>"""),_display_(/*211.72*/if(admission_year)/*211.90*/{_display_(_display_(/*211.92*/admission_year))}/*211.108*/else/*211.112*/{_display_(Seq[Any](format.raw/*211.113*/("""Select Admission Year""")))}),format.raw/*211.135*/(""" """),format.raw/*211.136*/("""</option>
                            <option value="2017">2017</option>
                            <option value="2018">2018 </option>
                            <option value="2019">2019</option>
                            <option value="2020">2020</option>
                            <option value="2021">2021</option>
                            <option value="2022">2022</option>
                        </select>
                    </div>

                    <div class="input-field">
                        <select id="acad_year" name="acad_year">
                            <option value=""""),_display_(/*223.45*/academic_year/*223.58*/.get("year")),format.raw/*223.70*/(""""  selected>"""),_display_(/*223.83*/if(academic_year)/*223.100*/{_display_(_display_(/*223.102*/academic_year/*223.115*/.get("year")))}/*223.129*/else/*223.133*/{_display_(Seq[Any](format.raw/*223.134*/("""Select academic year""")))}),format.raw/*223.155*/("""</option>
                            <option value="1">1</option>
                            <option value="2">2</option>
                            <option value="3">3</option>
                            <option value="4">4</option>
                        </select>
                    </div>

            <div class="input-field">
                    <!-- <label>Branch</label>-->
                <select id="student_option" name="student" required>
                    <option value=""""),_display_(/*234.37*/name),format.raw/*234.41*/("""" selected>"""),_display_(/*234.53*/if(name)/*234.61*/{_display_(_display_(/*234.63*/name))}/*234.69*/else/*234.74*/{_display_(Seq[Any](format.raw/*234.75*/("""Select Student""")))}),format.raw/*234.90*/("""</option>
                </select>
            </div>

                </div>
            </div>

            <div class="details ID">
                <span class="title">Exam Details</span>

                <div class="fields">

                    <div class="input-field">
                        <select id="result" name="result">
                            <option value=""""),_display_(/*248.45*/academic_year/*248.58*/.get("result")),format.raw/*248.72*/("""" selected>"""),_display_(/*248.84*/if(academic_year.size>0)/*248.108*/{_display_(_display_(/*248.110*/academic_year/*248.123*/.get("result")))}/*248.139*/else/*248.143*/{_display_(Seq[Any](format.raw/*248.144*/("""Select result""")))}),format.raw/*248.158*/("""</option>
                            <option value="Result">Result</option>
                            <option value="Pass">Pass</option>
                            <option value="Fail">Fail</option>

                        </select>
                    </div>

                    <div class="input-field">
                        <input type="text"  name="score" id="score" placeholder="Enter score" size="10" value="""),_display_(/*257.112*/academic_year/*257.125*/.get("score")),format.raw/*257.138*/(""">
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
    function reset()"""),format.raw/*286.21*/("""{"""),format.raw/*286.22*/("""
        """),format.raw/*287.9*/("""console.log("reset")
        result.value = ""
        score.value = ""
        student_option.value = ""
    """),format.raw/*291.5*/("""}"""),format.raw/*291.6*/("""
    """),format.raw/*292.5*/("""saveBtn.onclick = (e) => """),format.raw/*292.30*/("""{"""),format.raw/*292.31*/("""
        """),format.raw/*293.9*/("""let form = document.getElementsByTagName("form");
        let formData = new FormData(form[0]);
        let _id = student_option.selectedOptions[0].getAttribute("data-id")
        _id != undefined ? formData.append("prn", _id) : ""
        fetch("/updateExam","""),format.raw/*297.29*/("""{"""),format.raw/*297.30*/("""
            """),format.raw/*298.13*/("""body: new URLSearchParams(formData),
            method: "POST",
            headers:  """),format.raw/*300.23*/("""{"""),format.raw/*300.24*/("""
                """),format.raw/*301.17*/(""""Content-Type" : "application/x-www-form-urlencoded"
            """),format.raw/*302.13*/("""}"""),format.raw/*302.14*/("""

        """),format.raw/*304.9*/("""}"""),format.raw/*304.10*/(""")
        .then(resp => resp.json())
        .then(data => """),format.raw/*306.23*/("""{"""),format.raw/*306.24*/("""reset()"""),format.raw/*306.31*/("""}"""),format.raw/*306.32*/(""")


    """),format.raw/*309.5*/("""}"""),format.raw/*309.6*/("""

    """),format.raw/*311.5*/("""let branch_value, year_value
    [branch,year].forEach(el => """),format.raw/*312.33*/("""{"""),format.raw/*312.34*/("""
        """),format.raw/*313.9*/("""el.addEventListener('change', evt => """),format.raw/*313.46*/("""{"""),format.raw/*313.47*/("""
            """),format.raw/*314.13*/("""evt.preventDefault();

            if (evt.target.id === "branch") """),format.raw/*316.45*/("""{"""),format.raw/*316.46*/("""
                """),format.raw/*317.17*/("""branch_value = evt.target.value
            """),format.raw/*318.13*/("""}"""),format.raw/*318.14*/(""" """),format.raw/*318.15*/("""else if (evt.target.id === "year")"""),format.raw/*318.49*/("""{"""),format.raw/*318.50*/("""
                """),format.raw/*319.17*/("""year_value = evt.target.value
            """),format.raw/*320.13*/("""}"""),format.raw/*320.14*/("""

            """),format.raw/*322.13*/("""branch_value && year_value != undefined ? getStudents(branch_value,year_value): console.log("logg")

        """),format.raw/*324.9*/("""}"""),format.raw/*324.10*/(""")
    """),format.raw/*325.5*/("""}"""),format.raw/*325.6*/(""")

    function getStudents(branch,year) """),format.raw/*327.39*/("""{"""),format.raw/*327.40*/("""
        """),format.raw/*328.9*/("""fetch(`/fetchStudent?branch=$"""),format.raw/*328.38*/("""{"""),format.raw/*328.39*/("""branch"""),format.raw/*328.45*/("""}"""),format.raw/*328.46*/("""&year=$"""),format.raw/*328.53*/("""{"""),format.raw/*328.54*/("""year"""),format.raw/*328.58*/("""}"""),format.raw/*328.59*/("""`)
                .then((resp) => resp.json())
                .then((data) => (showStudents(data)))
                .catch((e) => """),format.raw/*331.31*/("""{"""),format.raw/*331.32*/("""
                    """),format.raw/*332.21*/("""console.log("error")
                """),format.raw/*333.17*/("""}"""),format.raw/*333.18*/(""")
    """),format.raw/*334.5*/("""}"""),format.raw/*334.6*/("""

    """),format.raw/*336.5*/("""function showStudents(data)"""),format.raw/*336.32*/("""{"""),format.raw/*336.33*/("""
        """),format.raw/*337.9*/("""let none_el = document.createElement('option');
        none_el.setAttribute('value', "");
        none_el.setAttribute('selected', 'true');
        none_el.innerHTML = "None";
        for (let i = 0; i < data.length; i++) """),format.raw/*341.47*/("""{"""),format.raw/*341.48*/("""
            """),format.raw/*342.13*/("""console.log(data)
            option_el = document.createElement('option');
            option_el.innerHTML = data[i].studentName.first_name + " " + data[i].studentName.last_name;
            option_el.setAttribute('value', data[i].studentName.first_name + " " +  data[i].studentName.middle_name  + " " + data[i].studentName.last_name);
            option_el.setAttribute('data-id', data[i].id["$oid"]);
            student_option.append(option_el);
        """),format.raw/*348.9*/("""}"""),format.raw/*348.10*/("""
        """),format.raw/*349.9*/("""student_option.insertBefore(none_el, student_option[0]);
    """),format.raw/*350.5*/("""}"""),format.raw/*350.6*/("""

    """),format.raw/*352.5*/("""</script>
</body>
</html>

"""))
      }
    }
  }

  def render(id:Map[String, String],name:String,branch:String,admission_year:String,academic_year:Map[String, String]): play.twirl.api.HtmlFormat.Appendable = apply(id,name,branch,admission_year,academic_year)

  def f:((Map[String, String],String,String,String,Map[String, String]) => play.twirl.api.HtmlFormat.Appendable) = (id,name,branch,admission_year,academic_year) => apply(id,name,branch,admission_year,academic_year)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/updateExamStudent.scala.html
                  HASH: 02356bed37e29fe8b80e4da08518f6377870aede
                  MATRIX: 783->3|994->118|1026->124|1556->627|1584->628|1617->634|1743->733|1771->734|1800->736|1831->740|1859->741|1892->747|2041->869|2069->870|2098->872|2136->882|2165->883|2198->889|2427->1091|2455->1092|2484->1094|2529->1111|2558->1112|2591->1118|2702->1202|2730->1203|2759->1205|2812->1230|2841->1231|2874->1237|3066->1402|3094->1403|3123->1405|3166->1420|3195->1421|3228->1427|3375->1547|3403->1548|3432->1550|3481->1571|3510->1572|3543->1578|3648->1656|3676->1657|3707->1661|3761->1687|3790->1688|3823->1694|3925->1769|3953->1770|3982->1772|4032->1794|4061->1795|4094->1801|4246->1926|4274->1927|4303->1929|4354->1952|4383->1953|4416->1959|4573->2089|4601->2090|4630->2092|4683->2117|4712->2118|4745->2124|4872->2224|4900->2225|4929->2227|4975->2245|5004->2246|5037->2252|5127->2314|5156->2315|5186->2317|5241->2343|5271->2344|5305->2350|5527->2544|5556->2545|5586->2547|5668->2600|5698->2601|5732->2607|5801->2648|5830->2649|5860->2651|5942->2704|5972->2705|6006->2711|6051->2728|6080->2729|6112->2733|6173->2765|6203->2766|6237->2772|6587->3094|6616->3095|6646->3097|6699->3121|6729->3122|6763->3128|6832->3169|6861->3170|6891->3172|6937->3189|6967->3190|7001->3196|7057->3224|7086->3225|7116->3227|7176->3258|7206->3259|7240->3265|7284->3281|7313->3282|7343->3284|7387->3299|7417->3300|7451->3306|7507->3334|7536->3335|7566->3337|7608->3350|7638->3351|7672->3357|7742->3399|7771->3400|7801->3402|7861->3433|7891->3434|7925->3440|7974->3461|8003->3462|8041->3472|8082->3496|8113->3550|8144->3608|8175->3666|8206->3732|8241->3782|8272->3819|8303->3855|8334->3905|8365->3925|8396->3978|8427->3993|8458->4005|8488->4013|8521->4097|8552->4112|8582->4114|9068->4572|9080->4574|9114->4586|9307->4751|9335->4757|9376->4770|9396->4780|9427->4782|9446->4790|9460->4794|9500->4795|9547->4809|10121->5355|10157->5369|10198->5382|10226->5400|10257->5402|10285->5418|10300->5422|10341->5423|10396->5445|10427->5446|11073->6064|11096->6077|11130->6089|11171->6102|11199->6119|11231->6121|11255->6134|11281->6148|11296->6152|11337->6153|11391->6174|11923->6678|11949->6682|11989->6694|12007->6702|12038->6704|12055->6710|12069->6715|12109->6716|12156->6731|12578->7125|12601->7138|12637->7152|12677->7164|12712->7188|12744->7190|12768->7203|12796->7219|12811->7223|12852->7224|12899->7238|13360->7670|13384->7683|13420->7696|14286->8533|14316->8534|14354->8544|14496->8658|14525->8659|14559->8665|14613->8690|14643->8691|14681->8701|14974->8965|15004->8966|15047->8980|15165->9069|15195->9070|15242->9088|15337->9154|15367->9155|15407->9167|15437->9168|15527->9229|15557->9230|15593->9237|15623->9238|15662->9249|15691->9250|15727->9258|15818->9320|15848->9321|15886->9331|15952->9368|15982->9369|16025->9383|16123->9452|16153->9453|16200->9471|16274->9516|16304->9517|16334->9518|16397->9552|16427->9553|16474->9571|16546->9614|16576->9615|16621->9631|16760->9742|16790->9743|16825->9750|16854->9751|16926->9794|16956->9795|16994->9805|17052->9834|17082->9835|17117->9841|17147->9842|17183->9849|17213->9850|17246->9854|17276->9855|17440->9990|17470->9991|17521->10013|17588->10051|17618->10052|17653->10059|17682->10060|17718->10068|17774->10095|17804->10096|17842->10106|18098->10333|18128->10334|18171->10348|18663->10812|18693->10813|18731->10823|18821->10885|18850->10886|18886->10894
                  LINES: 21->2|26->2|29->5|43->19|43->19|44->20|48->24|48->24|49->25|49->25|49->25|50->26|55->31|55->31|56->32|56->32|56->32|57->33|65->41|65->41|66->42|66->42|66->42|67->43|71->47|71->47|72->48|72->48|72->48|73->49|81->57|81->57|82->58|82->58|82->58|83->59|88->64|88->64|89->65|89->65|89->65|90->66|93->69|93->69|95->71|95->71|95->71|96->72|99->75|99->75|100->76|100->76|100->76|101->77|107->83|107->83|108->84|108->84|108->84|109->85|114->90|114->90|115->91|115->91|115->91|116->92|120->96|120->96|121->97|121->97|121->97|122->98|125->101|125->101|126->102|126->102|126->102|127->103|136->112|136->112|137->113|138->114|138->114|139->115|140->116|140->116|141->117|142->118|142->118|143->119|144->120|144->120|146->122|146->122|146->122|147->123|161->137|161->137|162->138|162->138|162->138|163->139|165->141|165->141|166->142|166->142|166->142|167->143|168->144|168->144|169->145|170->146|170->146|171->147|172->148|172->148|173->149|173->149|173->149|174->150|175->151|175->151|176->152|176->152|176->152|177->153|179->155|179->155|180->156|180->156|180->156|181->157|182->158|182->158|187->163|189->165|190->166|191->167|192->168|193->169|196->172|197->173|198->174|199->175|200->176|201->177|202->178|203->179|204->180|206->182|207->183|208->184|220->196|220->196|220->196|224->200|224->200|224->200|224->200|224->200|224->200|224->200|224->200|224->200|235->211|235->211|235->211|235->211|235->211|235->211|235->211|235->211|235->211|235->211|247->223|247->223|247->223|247->223|247->223|247->223|247->223|247->223|247->223|247->223|247->223|258->234|258->234|258->234|258->234|258->234|258->234|258->234|258->234|258->234|272->248|272->248|272->248|272->248|272->248|272->248|272->248|272->248|272->248|272->248|272->248|281->257|281->257|281->257|310->286|310->286|311->287|315->291|315->291|316->292|316->292|316->292|317->293|321->297|321->297|322->298|324->300|324->300|325->301|326->302|326->302|328->304|328->304|330->306|330->306|330->306|330->306|333->309|333->309|335->311|336->312|336->312|337->313|337->313|337->313|338->314|340->316|340->316|341->317|342->318|342->318|342->318|342->318|342->318|343->319|344->320|344->320|346->322|348->324|348->324|349->325|349->325|351->327|351->327|352->328|352->328|352->328|352->328|352->328|352->328|352->328|352->328|352->328|355->331|355->331|356->332|357->333|357->333|358->334|358->334|360->336|360->336|360->336|361->337|365->341|365->341|366->342|372->348|372->348|373->349|374->350|374->350|376->352
                  -- GENERATED --
              */
          