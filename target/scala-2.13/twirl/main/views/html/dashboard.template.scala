
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

object dashboard extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.17*/("""
"""),format.raw/*2.1*/("""<html lang="en" dir="ltr">
<head>
    <style>
        body"""),format.raw/*5.13*/("""{"""),format.raw/*5.14*/("""
  """),format.raw/*6.3*/("""margin: 0;
  padding: 0;
  font-family: "Roboto", sans-serif;
"""),format.raw/*9.1*/("""}"""),format.raw/*9.2*/("""

"""),format.raw/*11.1*/("""header"""),format.raw/*11.7*/("""{"""),format.raw/*11.8*/("""
  """),format.raw/*12.3*/("""z-index: 1;
  position: fixed;
  background: #22242A;
  padding: 20px;
  width: calc(100% - 0%);
  top: 0;
  height: 70px;
"""),format.raw/*19.1*/("""}"""),format.raw/*19.2*/("""

"""),format.raw/*21.1*/(""".left_area h3"""),format.raw/*21.14*/("""{"""),format.raw/*21.15*/("""
  """),format.raw/*22.3*/("""color: #fff;
  margin: 0;

  font-size: 20px;
  font-weight: 800;
"""),format.raw/*27.1*/("""}"""),format.raw/*27.2*/("""

"""),format.raw/*29.1*/(""".left_area span"""),format.raw/*29.16*/("""{"""),format.raw/*29.17*/("""
  """),format.raw/*30.3*/("""color: #fff;



"""),format.raw/*34.1*/("""}"""),format.raw/*34.2*/("""

"""),format.raw/*36.1*/(""".insert_btn"""),format.raw/*36.12*/("""{"""),format.raw/*36.13*/("""
"""),format.raw/*37.1*/("""padding: 5px;
  background: #2323a;
  text-decoration: none;
  float: right;
  margin-top: -20px;
  margin-right: 10px;
  border-radius: 2px;
  font-size: 15px;
  font-weight: 600;
  color: #ffffff;
  transition: 0.5s;
  transition-property: background;
"""),format.raw/*49.1*/("""}"""),format.raw/*49.2*/("""

"""),format.raw/*51.1*/(""".insert_btn:hover"""),format.raw/*51.18*/("""{"""),format.raw/*51.19*/("""
  """),format.raw/*52.3*/("""background: #0B87A6;
"""),format.raw/*53.1*/("""}"""),format.raw/*53.2*/("""

"""),format.raw/*55.1*/(""".update_btn"""),format.raw/*55.12*/("""{"""),format.raw/*55.13*/("""
"""),format.raw/*56.1*/("""padding: 5px;
  background: #2323a;
  text-decoration: none;
  float: right;
  margin-top: -20px;
  margin-right: 5px;
  border-radius: 2px;
  font-size: 15px;
  font-weight: 600;
  color: #ffffff;
  transition: 0.5s;
  transition-property: background;
"""),format.raw/*68.1*/("""}"""),format.raw/*68.2*/("""

"""),format.raw/*70.1*/(""".update_btn:hover"""),format.raw/*70.18*/("""{"""),format.raw/*70.19*/("""
  """),format.raw/*71.3*/("""background: #0B87A6;
"""),format.raw/*72.1*/("""}"""),format.raw/*72.2*/("""

"""),format.raw/*74.1*/(""".logout_btn"""),format.raw/*74.12*/("""{"""),format.raw/*74.13*/("""
  """),format.raw/*75.3*/("""padding: 5px;

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
"""),format.raw/*87.1*/("""}"""),format.raw/*87.2*/("""

"""),format.raw/*89.1*/(""".logout_btn:hover"""),format.raw/*89.18*/("""{"""),format.raw/*89.19*/("""
  """),format.raw/*90.3*/("""background: #0B87A6;
"""),format.raw/*91.1*/("""}"""),format.raw/*91.2*/("""

"""),format.raw/*93.1*/(""".sidebar"""),format.raw/*93.9*/("""{"""),format.raw/*93.10*/("""
  """),format.raw/*94.3*/("""z-index: 1;
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
"""),format.raw/*106.1*/("""}"""),format.raw/*106.2*/("""

"""),format.raw/*108.1*/(""".profile_info"""),format.raw/*108.14*/("""{"""),format.raw/*108.15*/("""
  """),format.raw/*109.3*/("""display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
"""),format.raw/*113.1*/("""}"""),format.raw/*113.2*/("""

"""),format.raw/*115.1*/(""".sidebar .profile_info .profile_image"""),format.raw/*115.38*/("""{"""),format.raw/*115.39*/("""
  """),format.raw/*116.3*/("""width: 100px;
  height: 100px;
  border-radius: 100px;
  margin-bottom: 10px;
"""),format.raw/*120.1*/("""}"""),format.raw/*120.2*/("""

"""),format.raw/*122.1*/(""".sidebar .profile_info h4"""),format.raw/*122.26*/("""{"""),format.raw/*122.27*/("""
  """),format.raw/*123.3*/("""color: #ccc;
  margin-top: 0;
  margin-bottom: 8px;
"""),format.raw/*126.1*/("""}"""),format.raw/*126.2*/("""

"""),format.raw/*128.1*/(""".sidebar a"""),format.raw/*128.11*/("""{"""),format.raw/*128.12*/("""
  """),format.raw/*129.3*/("""color: #fff;
  display: block;
  width: 100%;
  line-height: 60px;
  text-decoration: none;
  padding-left: 40px;
  box-sizing: border-box;
  transition: 0.5s;
  transition-property: background;
"""),format.raw/*138.1*/("""}"""),format.raw/*138.2*/("""

"""),format.raw/*140.1*/(""".sidebar a:hover"""),format.raw/*140.17*/("""{"""),format.raw/*140.18*/("""
  """),format.raw/*141.3*/("""background: #19B3D3;
"""),format.raw/*142.1*/("""}"""),format.raw/*142.2*/("""

"""),format.raw/*144.1*/(""".sidebar i"""),format.raw/*144.11*/("""{"""),format.raw/*144.12*/("""
  """),format.raw/*145.3*/("""padding-right: 10px;
"""),format.raw/*146.1*/("""}"""),format.raw/*146.2*/("""

"""),format.raw/*148.1*/("""label #sidebar_btn"""),format.raw/*148.19*/("""{"""),format.raw/*148.20*/("""
  """),format.raw/*149.3*/("""z-index: 1;
  color: #fff;
  position: fixed;
  cursor: pointer;
  left: 300px;
  font-size: 20px;
  margin: 5px 0;
  transition: 0.5s;
  transition-property: color;
"""),format.raw/*158.1*/("""}"""),format.raw/*158.2*/("""

"""),format.raw/*160.1*/("""label #sidebar_btn:hover"""),format.raw/*160.25*/("""{"""),format.raw/*160.26*/("""
  """),format.raw/*161.3*/("""color: #19B3D3;
"""),format.raw/*162.1*/("""}"""),format.raw/*162.2*/("""

"""),format.raw/*164.1*/("""#check:checked ~ .sidebar"""),format.raw/*164.26*/("""{"""),format.raw/*164.27*/("""
  """),format.raw/*165.3*/("""left: -185px;
"""),format.raw/*166.1*/("""}"""),format.raw/*166.2*/("""

"""),format.raw/*168.1*/("""#check:checked ~ .sidebar a span"""),format.raw/*168.33*/("""{"""),format.raw/*168.34*/("""
  """),format.raw/*169.3*/("""display: none;
"""),format.raw/*170.1*/("""}"""),format.raw/*170.2*/("""

"""),format.raw/*172.1*/("""#check:checked ~ .sidebar a"""),format.raw/*172.28*/("""{"""),format.raw/*172.29*/("""
  """),format.raw/*173.3*/("""font-size: 20px;
  margin-left: 165px;
  width: 100%;
"""),format.raw/*176.1*/("""}"""),format.raw/*176.2*/("""

"""),format.raw/*178.1*/(""".content"""),format.raw/*178.9*/("""{"""),format.raw/*178.10*/("""
  """),format.raw/*179.3*/("""width: (100% - 250px);
  margin-top: 60px;
  padding: 20px;
  margin-left: 250px;
  background: url(background.png) no-repeat;
  background-position: center;
  background-size: cover;
  height: 100vh;
  transition: 0.5s;
"""),format.raw/*188.1*/("""}"""),format.raw/*188.2*/("""

"""),format.raw/*190.1*/("""#check:checked ~ .content"""),format.raw/*190.26*/("""{"""),format.raw/*190.27*/("""
  """),format.raw/*191.3*/("""margin-left: 60px;
"""),format.raw/*192.1*/("""}"""),format.raw/*192.2*/("""

"""),format.raw/*194.1*/("""#check:checked ~ .sidebar .profile_info"""),format.raw/*194.40*/("""{"""),format.raw/*194.41*/("""
  """),format.raw/*195.3*/("""display: none;
"""),format.raw/*196.1*/("""}"""),format.raw/*196.2*/("""

"""),format.raw/*198.1*/("""#check"""),format.raw/*198.7*/("""{"""),format.raw/*198.8*/("""
  """),format.raw/*199.3*/("""display: none;
"""),format.raw/*200.1*/("""}"""),format.raw/*200.2*/("""

"""),format.raw/*202.1*/(""".mobile_nav"""),format.raw/*202.12*/("""{"""),format.raw/*202.13*/("""
  """),format.raw/*203.3*/("""display: none;
"""),format.raw/*204.1*/("""}"""),format.raw/*204.2*/("""

"""),format.raw/*206.1*/(""".content .card p"""),format.raw/*206.17*/("""{"""),format.raw/*206.18*/("""
  """),format.raw/*207.3*/("""background: #fff;
  padding: 15px;
  margin-bottom: 10px;
  font-size: 14px;
  opacity: 0.8;
"""),format.raw/*212.1*/("""}"""),format.raw/*212.2*/("""


"""),format.raw/*215.1*/("""/* Responsive CSS */


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
<!--        <a href="#" class="insert_btn"><i class="fa fa-plus" style="font-size:16px"></i></a>-->
<!--        &lt;!&ndash;        <button style="font-size:13px" class="insert_btn" type="button"> <i class="fa fa-plus"></i></button>&ndash;&gt;-->
<!--    </div>-->
<!--    <div class="update_area">-->
<!--        <a href="#" class="update_btn"><i class="fa fa-edit" style="font-size:16px"></i></a>-->
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
    <div class="profile_info">
        <!--        <img src="1.png" class="profile_image" alt="">-->
    </div>
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
    <!--    <div class="card">-->
    <!--        <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged.</p>-->
    <!--    </div>-->
    <!--    <div class="card">-->
    <!--        <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged.</p>-->
    <!--    </div>-->
    <!--    <div class="card">-->
    <!--        <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged.</p>-->
    <!--    </div>-->
    """),_display_(/*300.6*/content),format.raw/*300.13*/("""
"""),format.raw/*301.1*/("""</div>

<script type="text/javascript">
    $(document).ready(function()"""),format.raw/*304.33*/("""{"""),format.raw/*304.34*/("""
      """),format.raw/*305.7*/("""$('.nav_btn').click(function()"""),format.raw/*305.37*/("""{"""),format.raw/*305.38*/("""
        """),format.raw/*306.9*/("""$('.mobile_nav_items').toggleClass('active');
      """),format.raw/*307.7*/("""}"""),format.raw/*307.8*/(""");
    """),format.raw/*308.5*/("""}"""),format.raw/*308.6*/(""");
</script>

</body>
</html>
"""))
      }
    }
  }

  def render(content:Html): play.twirl.api.HtmlFormat.Appendable = apply(content)

  def f:((Html) => play.twirl.api.HtmlFormat.Appendable) = (content) => apply(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/dashboard.scala.html
                  HASH: 4eb7da894c7eb9b0f65fd190aad4c93b8e462b09
                  MATRIX: 731->1|841->16|869->18|957->79|985->80|1015->84|1106->149|1133->150|1164->154|1197->160|1225->161|1256->165|1413->295|1441->296|1472->300|1513->313|1542->314|1573->318|1671->389|1699->390|1730->394|1773->409|1802->410|1833->414|1880->434|1908->435|1939->439|1978->450|2007->451|2036->453|2329->719|2357->720|2388->724|2433->741|2462->742|2493->746|2542->768|2570->769|2601->773|2640->784|2669->785|2698->787|2990->1052|3018->1053|3049->1057|3094->1074|3123->1075|3154->1079|3203->1101|3231->1102|3262->1106|3301->1117|3330->1118|3361->1122|3630->1364|3658->1365|3689->1369|3734->1386|3763->1387|3794->1391|3843->1413|3871->1414|3902->1418|3937->1426|3966->1427|3997->1431|4265->1671|4294->1672|4326->1676|4368->1689|4398->1690|4430->1694|4553->1789|4582->1790|4614->1794|4680->1831|4710->1832|4742->1836|4852->1918|4881->1919|4913->1923|4967->1948|4997->1949|5029->1953|5112->2008|5141->2009|5173->2013|5212->2023|5242->2024|5274->2028|5506->2232|5535->2233|5567->2237|5612->2253|5642->2254|5674->2258|5724->2280|5753->2281|5785->2285|5824->2295|5854->2296|5886->2300|5936->2322|5965->2323|5997->2327|6044->2345|6074->2346|6106->2350|6309->2525|6338->2526|6370->2530|6423->2554|6453->2555|6485->2559|6530->2576|6559->2577|6591->2581|6645->2606|6675->2607|6707->2611|6750->2626|6779->2627|6811->2631|6872->2663|6902->2664|6934->2668|6978->2684|7007->2685|7039->2689|7095->2716|7125->2717|7157->2721|7242->2778|7271->2779|7303->2783|7339->2791|7369->2792|7401->2796|7659->3026|7688->3027|7720->3031|7774->3056|7804->3057|7836->3061|7884->3081|7913->3082|7945->3086|8013->3125|8043->3126|8075->3130|8119->3146|8148->3147|8180->3151|8214->3157|8243->3158|8275->3162|8319->3178|8348->3179|8380->3183|8420->3194|8450->3195|8482->3199|8526->3215|8555->3216|8587->3220|8632->3236|8662->3237|8694->3241|8820->3339|8849->3340|8883->3346|13668->8104|13697->8111|13727->8113|13831->8188|13861->8189|13897->8197|13956->8227|13986->8228|14024->8238|14105->8291|14134->8292|14170->8300|14199->8301
                  LINES: 21->1|26->1|27->2|30->5|30->5|31->6|34->9|34->9|36->11|36->11|36->11|37->12|44->19|44->19|46->21|46->21|46->21|47->22|52->27|52->27|54->29|54->29|54->29|55->30|59->34|59->34|61->36|61->36|61->36|62->37|74->49|74->49|76->51|76->51|76->51|77->52|78->53|78->53|80->55|80->55|80->55|81->56|93->68|93->68|95->70|95->70|95->70|96->71|97->72|97->72|99->74|99->74|99->74|100->75|112->87|112->87|114->89|114->89|114->89|115->90|116->91|116->91|118->93|118->93|118->93|119->94|131->106|131->106|133->108|133->108|133->108|134->109|138->113|138->113|140->115|140->115|140->115|141->116|145->120|145->120|147->122|147->122|147->122|148->123|151->126|151->126|153->128|153->128|153->128|154->129|163->138|163->138|165->140|165->140|165->140|166->141|167->142|167->142|169->144|169->144|169->144|170->145|171->146|171->146|173->148|173->148|173->148|174->149|183->158|183->158|185->160|185->160|185->160|186->161|187->162|187->162|189->164|189->164|189->164|190->165|191->166|191->166|193->168|193->168|193->168|194->169|195->170|195->170|197->172|197->172|197->172|198->173|201->176|201->176|203->178|203->178|203->178|204->179|213->188|213->188|215->190|215->190|215->190|216->191|217->192|217->192|219->194|219->194|219->194|220->195|221->196|221->196|223->198|223->198|223->198|224->199|225->200|225->200|227->202|227->202|227->202|228->203|229->204|229->204|231->206|231->206|231->206|232->207|237->212|237->212|240->215|325->300|325->300|326->301|329->304|329->304|330->305|330->305|330->305|331->306|332->307|332->307|333->308|333->308
                  -- GENERATED --
              */
          