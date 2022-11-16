
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

object index1 extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<html lang="en" dir="ltr">
<head>
    <style>
        body"""),format.raw/*4.13*/("""{"""),format.raw/*4.14*/("""
  """),format.raw/*5.3*/("""margin: 0;
  padding: 0;
  font-family: "Roboto", sans-serif;
"""),format.raw/*8.1*/("""}"""),format.raw/*8.2*/("""

"""),format.raw/*10.1*/("""header"""),format.raw/*10.7*/("""{"""),format.raw/*10.8*/("""
  """),format.raw/*11.3*/("""z-index: 1;
  position: fixed;
  background: #22242A;
  padding: 20px;
  width: calc(100% - 0%);
  top: 0;
  height: 30px;
"""),format.raw/*18.1*/("""}"""),format.raw/*18.2*/("""

"""),format.raw/*20.1*/(""".left_area h3"""),format.raw/*20.14*/("""{"""),format.raw/*20.15*/("""
  """),format.raw/*21.3*/("""color: #fff;
  margin: 0;

  font-size: 20px;
  font-weight: 800;
"""),format.raw/*26.1*/("""}"""),format.raw/*26.2*/("""

"""),format.raw/*28.1*/(""".left_area span"""),format.raw/*28.16*/("""{"""),format.raw/*28.17*/("""
  """),format.raw/*29.3*/("""color: #fff;



"""),format.raw/*33.1*/("""}"""),format.raw/*33.2*/("""

"""),format.raw/*35.1*/(""".insert_btn"""),format.raw/*35.12*/("""{"""),format.raw/*35.13*/("""
"""),format.raw/*36.1*/("""padding: 5px;
  background: #2323a;
  text-decoration: none;
  float: right;
  margin-top: -20px;
  margin-right: 70px;
  border-radius: 2px;
  font-size: 15px;
  font-weight: 600;
  color: #ffffff;
  transition: 0.5s;
  transition-property: background;
"""),format.raw/*48.1*/("""}"""),format.raw/*48.2*/("""

"""),format.raw/*50.1*/(""".insert_btn:hover"""),format.raw/*50.18*/("""{"""),format.raw/*50.19*/("""
  """),format.raw/*51.3*/("""background: #0B87A6;
"""),format.raw/*52.1*/("""}"""),format.raw/*52.2*/("""

"""),format.raw/*54.1*/(""".update_btn"""),format.raw/*54.12*/("""{"""),format.raw/*54.13*/("""
"""),format.raw/*55.1*/("""padding: 5px;
  background: #2323a;
  text-decoration: none;
  float: right;
  margin-top: -40px;
  margin-right: 130px;
  border-radius: 2px;
  font-size: 15px;
  font-weight: 600;
  color: #ffffff;
  transition: 0.5s;
  transition-property: background;
"""),format.raw/*67.1*/("""}"""),format.raw/*67.2*/("""

"""),format.raw/*69.1*/(""".update_btn:hover"""),format.raw/*69.18*/("""{"""),format.raw/*69.19*/("""
  """),format.raw/*70.3*/("""background: #0B87A6;
"""),format.raw/*71.1*/("""}"""),format.raw/*71.2*/("""

"""),format.raw/*73.1*/(""".logout_btn"""),format.raw/*73.12*/("""{"""),format.raw/*73.13*/("""
  """),format.raw/*74.3*/("""padding: 5px;

  text-decoration: none;
  float: right;
  margin-top: -20px;
  margin-right: 70px;
  border-radius: 2px;
  font-size: 15px;
  font-weight: 600;
  color: #fff;
  transition: 0.5s;
  transition-property: background;
"""),format.raw/*86.1*/("""}"""),format.raw/*86.2*/("""

"""),format.raw/*88.1*/(""".logout_btn:hover"""),format.raw/*88.18*/("""{"""),format.raw/*88.19*/("""
  """),format.raw/*89.3*/("""background: #0B87A6;
"""),format.raw/*90.1*/("""}"""),format.raw/*90.2*/("""

"""),format.raw/*92.1*/(""".sidebar"""),format.raw/*92.9*/("""{"""),format.raw/*92.10*/("""
  """),format.raw/*93.3*/("""z-index: 1;
  top: 0;
  background: #2f323a;
  margin-top: 70px;
  padding-top: 30px;
  position: fixed;
  left: 0;
  width: 250px;
  height: calc(100% - 9%);
  transition: 0.5s;
  transition-property: left;
  overflow-y: auto;
"""),format.raw/*105.1*/("""}"""),format.raw/*105.2*/("""

"""),format.raw/*107.1*/(""".profile_info"""),format.raw/*107.14*/("""{"""),format.raw/*107.15*/("""
  """),format.raw/*108.3*/("""display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
"""),format.raw/*112.1*/("""}"""),format.raw/*112.2*/("""

"""),format.raw/*114.1*/(""".sidebar .profile_info .profile_image"""),format.raw/*114.38*/("""{"""),format.raw/*114.39*/("""
  """),format.raw/*115.3*/("""width: 100px;
  height: 100px;
  border-radius: 100px;
  margin-bottom: 10px;
"""),format.raw/*119.1*/("""}"""),format.raw/*119.2*/("""

"""),format.raw/*121.1*/(""".sidebar .profile_info h4"""),format.raw/*121.26*/("""{"""),format.raw/*121.27*/("""
  """),format.raw/*122.3*/("""color: #ccc;
  margin-top: 0;
  margin-bottom: 8px;
"""),format.raw/*125.1*/("""}"""),format.raw/*125.2*/("""

"""),format.raw/*127.1*/(""".sidebar a"""),format.raw/*127.11*/("""{"""),format.raw/*127.12*/("""
  """),format.raw/*128.3*/("""color: #fff;
  display: block;
  width: 100%;
  line-height: 60px;
  text-decoration: none;
  padding-left: 40px;
  box-sizing: border-box;
  transition: 0.5s;
  transition-property: background;
"""),format.raw/*137.1*/("""}"""),format.raw/*137.2*/("""

"""),format.raw/*139.1*/(""".sidebar a:hover"""),format.raw/*139.17*/("""{"""),format.raw/*139.18*/("""
  """),format.raw/*140.3*/("""background: #19B3D3;
"""),format.raw/*141.1*/("""}"""),format.raw/*141.2*/("""

"""),format.raw/*143.1*/(""".sidebar i"""),format.raw/*143.11*/("""{"""),format.raw/*143.12*/("""
  """),format.raw/*144.3*/("""padding-right: 10px;
"""),format.raw/*145.1*/("""}"""),format.raw/*145.2*/("""

"""),format.raw/*147.1*/("""label #sidebar_btn"""),format.raw/*147.19*/("""{"""),format.raw/*147.20*/("""
  """),format.raw/*148.3*/("""z-index: 1;
  color: #fff;
  position: fixed;
  cursor: pointer;
  left: 300px;
  font-size: 20px;
  margin: 5px 0;
  transition: 0.5s;
  transition-property: color;
"""),format.raw/*157.1*/("""}"""),format.raw/*157.2*/("""

"""),format.raw/*159.1*/("""label #sidebar_btn:hover"""),format.raw/*159.25*/("""{"""),format.raw/*159.26*/("""
  """),format.raw/*160.3*/("""color: #19B3D3;
"""),format.raw/*161.1*/("""}"""),format.raw/*161.2*/("""

"""),format.raw/*163.1*/("""#check:checked ~ .sidebar"""),format.raw/*163.26*/("""{"""),format.raw/*163.27*/("""
  """),format.raw/*164.3*/("""left: -185px;
"""),format.raw/*165.1*/("""}"""),format.raw/*165.2*/("""

"""),format.raw/*167.1*/("""#check:checked ~ .sidebar a span"""),format.raw/*167.33*/("""{"""),format.raw/*167.34*/("""
  """),format.raw/*168.3*/("""display: none;
"""),format.raw/*169.1*/("""}"""),format.raw/*169.2*/("""

"""),format.raw/*171.1*/("""#check:checked ~ .sidebar a"""),format.raw/*171.28*/("""{"""),format.raw/*171.29*/("""
  """),format.raw/*172.3*/("""font-size: 20px;
  margin-left: 165px;
  width: 100%;
"""),format.raw/*175.1*/("""}"""),format.raw/*175.2*/("""

"""),format.raw/*177.1*/(""".content"""),format.raw/*177.9*/("""{"""),format.raw/*177.10*/("""
  """),format.raw/*178.3*/("""width: (100% - 250px);
  margin-top: 60px;
  padding: 20px;
  margin-left: 250px;
  background: url(background.png) no-repeat;
  background-position: center;
  background-size: cover;
  height: 100vh;
  transition: 0.5s;
"""),format.raw/*187.1*/("""}"""),format.raw/*187.2*/("""

"""),format.raw/*189.1*/("""#check:checked ~ .content"""),format.raw/*189.26*/("""{"""),format.raw/*189.27*/("""
  """),format.raw/*190.3*/("""margin-left: 60px;
"""),format.raw/*191.1*/("""}"""),format.raw/*191.2*/("""

"""),format.raw/*193.1*/("""#check:checked ~ .sidebar .profile_info"""),format.raw/*193.40*/("""{"""),format.raw/*193.41*/("""
  """),format.raw/*194.3*/("""display: none;
"""),format.raw/*195.1*/("""}"""),format.raw/*195.2*/("""

"""),format.raw/*197.1*/("""#check"""),format.raw/*197.7*/("""{"""),format.raw/*197.8*/("""
  """),format.raw/*198.3*/("""display: none;
"""),format.raw/*199.1*/("""}"""),format.raw/*199.2*/("""

"""),format.raw/*201.1*/(""".mobile_nav"""),format.raw/*201.12*/("""{"""),format.raw/*201.13*/("""
  """),format.raw/*202.3*/("""display: none;
"""),format.raw/*203.1*/("""}"""),format.raw/*203.2*/("""

"""),format.raw/*205.1*/(""".content .card p"""),format.raw/*205.17*/("""{"""),format.raw/*205.18*/("""
  """),format.raw/*206.3*/("""background: #fff;
  padding: 15px;
  margin-bottom: 10px;
  font-size: 14px;
  opacity: 0.8;
"""),format.raw/*211.1*/("""}"""),format.raw/*211.2*/("""


"""),format.raw/*214.1*/("""/* Responsive CSS */


    </style>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Responsive Sidebar Dashboard Template</title>
    <link rel="stylesheet" href="style.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.12.1/css/all.min.css">
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.5.1/jquery.min.js" charset="utf-8"></script>
</head>
<body>

<input type="checkbox" id="check">
<!--header area start-->
<header>
    <label for="check">
        <i class="fas fa-bars" id="sidebar_btn"></i>
    </label>
    <div class="left_area">
        <h3>Student <span>Management</span></h3>
    </div>
    <div class="right_area">
<!--        <a href="/login1" class="logout_btn">Logout</a>-->

        <a href="/login1" class="logout_btn"><i class="fa fa-power-off" style="font-size:16px"></i></a>

    </div>
<!--    <form method="get" action="/index">-->
<!--    <div class="insert_area">-->
<!--       <a href="/index" class="insert_btn"><i class="fa fa-plus" style="font-size:16px"></i></a>&ndash;&gt;-->
<!--&lt;!&ndash;        <button style="font-size:13px" class="insert_btn" type="button"> <i class="fa fa-plus"></i></button>&ndash;&gt;-->
<!--    </div>-->
<!--    <div class="update_area">-->
<!--        <a href="/update" class="update_btn"><i class="fa fa-edit" style="font-size:16px"></i></a>&ndash;&gt;-->
<!--        &lt;!&ndash;        <button style="font-size:13px" class="insert_btn" type="button"> <i class="fa fa-plus"></i></button>&ndash;&gt;-->
<!--    </div>-->

</header>
<!--header area end-->
<!--mobile navigation bar start-->
<div class="mobile_nav">
    <div class="nav_bar">
        <img src="1.png" class="mobile_profile_image" alt="">
        <i class="fa fa-bars nav_btn"></i>
    </div>
    <div class="mobile_nav_items">

        <a href="#"><i class="fas fa-home"></i><span>Dashboard</span></a>
        <a href="#"><i class="fas fa-cogs"></i><span>Student</span></a>
        <a href="#"><i class="fas fa-table"></i><span>Admission</span></a>
        <a href="#"><i class="fas fa-th"></i><span>Exam</span></a>
        <a href="#"><i class="fas fa-sliders-h"></i><span>Institute</span></a>
        <a href="#"><i class="fas fa-info-circle"></i><span>About Us</span></a>
        <a href="#"><i class="fa fa-phone" style="font-size:16px"></i><span>Contact</span></a>
    </div>
</div>
<!--mobile navigation bar end-->
<!--sidebar start-->
<div class="sidebar">
<!--    <div class="profile_info">-->
<!--&lt;!&ndash;        <img src="1.png" class="profile_image" alt="">&ndash;&gt;-->
<!--        <h4>Hi, Divyesh</h4>-->
<!--    </div>-->
    <a href="/index1"><i class="fas fa-home"></i><span>Home</span></a>
    <a href="/studentList"><i class="fas fa-cogs"></i><span>Student</span></a>
<!--    <a href="/admissionIndex"><i class="fas fa-table"></i><span>Admission</span></a>-->
    <a href="/admissionList"><i class="fas fa-table"></i><span>Admission</span></a>
    <a href="/examList"><i class="fas fa-th"></i><span>Exam</span></a>
    <a href="/instituteList"><i class="fas fa-sliders-h"></i><span>Institute</span></a>
    <a href="#"><i class="fas fa-info-circle"></i><span>About Us</span></a>
    <a href="#"><i class="fa fa-phone" style="font-size:16px"></i><span>Contact</span></a>

</div>
<!--sidebar end-->

<div class="content">
    <center>  <h1> Student Managment System</h1> </center>
    <hr>
    <p>"Student Management System (SMS) is a solution tool that is designed to track, maintain and manage all the data generated by a School, including the grades of a student, their attendance, their interpersonal activities records, etc.,"

        SMS acts as the bottom line database to store all the day-to-day school operations, maintain the proper records of the past few decades, regulate the various operation modules, managing the critical tasks, efficiently handling the administrative processes such as:
        <br>
        <br>
        1. Admissions
        The Student Management System software is created to help manage the student's admissions activities, starting from initial communication to course enrolment.
<!--        <br>-->
<!--        <br>-->
<!--        2. Billing and Payments-->
<!--        The Payments paid or received can also be managed and recorded through Student Management System; unlike invoice generation, credit notes, refunds, etc., SMS stores all the necessary information about parents and staff suppliers, and contractors.-->
        <br>
        <br>
        2. Reporting
        Reporting feature benefits the schools to analyze the trends in student behavior and examine the outcomes to boost their performance.
        <br>
        <br>
        3. Tracking Student's Fees
        Fee tracking is one of the most beneficial features of this online software.
        <br>
        <br>
<!--        The school administration department can track billing dates, induce late fee penalty, generate invoice, and automatically gets the report of received payments throughout the year.-->

        Student Management System software is helpful for teachers and school supervisors and also support applications and dashboards effective for students and parents as well for communication and combined data collection.

        The other names of Student Management System are Student Information System (SIS), Student Information Management System (SIMS) and Student Record System (SRS).
        <br><br><br>
    </p>
<!--    <div class="card">-->
<!--        <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged.</p>-->
<!--    </div>-->
<!--    <div class="card">-->
<!--        <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged.</p>-->
<!--    </div>-->
<!--    <div class="card">-->
<!--        <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged.</p>-->
<!--    </div>-->

</div>

<script type="text/javascript">
    $(document).ready(function()"""),format.raw/*334.33*/("""{"""),format.raw/*334.34*/("""
      """),format.raw/*335.7*/("""$('.nav_btn').click(function()"""),format.raw/*335.37*/("""{"""),format.raw/*335.38*/("""
        """),format.raw/*336.9*/("""$('.mobile_nav_items').toggleClass('active');
      """),format.raw/*337.7*/("""}"""),format.raw/*337.8*/(""");
    """),format.raw/*338.5*/("""}"""),format.raw/*338.6*/(""");
</script>

</body>
</html>
      """))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/index1.scala.html
                  HASH: 729cc03e5f05dbea580c36bf04a28ec61af30a7e
                  MATRIX: 812->0|900->61|928->62|958->66|1049->131|1076->132|1107->136|1140->142|1168->143|1199->147|1356->277|1384->278|1415->282|1456->295|1485->296|1516->300|1614->371|1642->372|1673->376|1716->391|1745->392|1776->396|1823->416|1851->417|1882->421|1921->432|1950->433|1979->435|2272->701|2300->702|2331->706|2376->723|2405->724|2436->728|2485->750|2513->751|2544->755|2583->766|2612->767|2641->769|2935->1036|2963->1037|2994->1041|3039->1058|3068->1059|3099->1063|3148->1085|3176->1086|3207->1090|3246->1101|3275->1102|3306->1106|3575->1348|3603->1349|3634->1353|3679->1370|3708->1371|3739->1375|3788->1397|3816->1398|3847->1402|3882->1410|3911->1411|3942->1415|4210->1655|4239->1656|4271->1660|4313->1673|4343->1674|4375->1678|4498->1773|4527->1774|4559->1778|4625->1815|4655->1816|4687->1820|4797->1902|4826->1903|4858->1907|4912->1932|4942->1933|4974->1937|5057->1992|5086->1993|5118->1997|5157->2007|5187->2008|5219->2012|5451->2216|5480->2217|5512->2221|5557->2237|5587->2238|5619->2242|5669->2264|5698->2265|5730->2269|5769->2279|5799->2280|5831->2284|5881->2306|5910->2307|5942->2311|5989->2329|6019->2330|6051->2334|6254->2509|6283->2510|6315->2514|6368->2538|6398->2539|6430->2543|6475->2560|6504->2561|6536->2565|6590->2590|6620->2591|6652->2595|6695->2610|6724->2611|6756->2615|6817->2647|6847->2648|6879->2652|6923->2668|6952->2669|6984->2673|7040->2700|7070->2701|7102->2705|7187->2762|7216->2763|7248->2767|7284->2775|7314->2776|7346->2780|7604->3010|7633->3011|7665->3015|7719->3040|7749->3041|7781->3045|7829->3065|7858->3066|7890->3070|7958->3109|7988->3110|8020->3114|8064->3130|8093->3131|8125->3135|8159->3141|8188->3142|8220->3146|8264->3162|8293->3163|8325->3167|8365->3178|8395->3179|8427->3183|8471->3199|8500->3200|8532->3204|8577->3220|8607->3221|8639->3225|8765->3323|8794->3324|8828->3330|15879->10352|15909->10353|15945->10361|16004->10391|16034->10392|16072->10402|16153->10455|16182->10456|16218->10464|16247->10465
                  LINES: 26->1|29->4|29->4|30->5|33->8|33->8|35->10|35->10|35->10|36->11|43->18|43->18|45->20|45->20|45->20|46->21|51->26|51->26|53->28|53->28|53->28|54->29|58->33|58->33|60->35|60->35|60->35|61->36|73->48|73->48|75->50|75->50|75->50|76->51|77->52|77->52|79->54|79->54|79->54|80->55|92->67|92->67|94->69|94->69|94->69|95->70|96->71|96->71|98->73|98->73|98->73|99->74|111->86|111->86|113->88|113->88|113->88|114->89|115->90|115->90|117->92|117->92|117->92|118->93|130->105|130->105|132->107|132->107|132->107|133->108|137->112|137->112|139->114|139->114|139->114|140->115|144->119|144->119|146->121|146->121|146->121|147->122|150->125|150->125|152->127|152->127|152->127|153->128|162->137|162->137|164->139|164->139|164->139|165->140|166->141|166->141|168->143|168->143|168->143|169->144|170->145|170->145|172->147|172->147|172->147|173->148|182->157|182->157|184->159|184->159|184->159|185->160|186->161|186->161|188->163|188->163|188->163|189->164|190->165|190->165|192->167|192->167|192->167|193->168|194->169|194->169|196->171|196->171|196->171|197->172|200->175|200->175|202->177|202->177|202->177|203->178|212->187|212->187|214->189|214->189|214->189|215->190|216->191|216->191|218->193|218->193|218->193|219->194|220->195|220->195|222->197|222->197|222->197|223->198|224->199|224->199|226->201|226->201|226->201|227->202|228->203|228->203|230->205|230->205|230->205|231->206|236->211|236->211|239->214|359->334|359->334|360->335|360->335|360->335|361->336|362->337|362->337|363->338|363->338
                  -- GENERATED --
              */
          