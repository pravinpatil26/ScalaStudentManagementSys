
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

object login1 extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[RequestHeader,Flash,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/()(implicit request:RequestHeader, flash : Flash):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.51*/("""

"""),format.raw/*3.1*/("""<!--"""),_display_(/*3.6*/main("Login")/*3.19*/{_display_(Seq[Any](format.raw/*3.20*/("""-->


<!--<form method="get" action="validate1">-->
<!--    <br><br>-->
<!--    <h2>Login </h2>-->
<!--    <br><br>-->
<!--    Username :  <input type="text" name="username" required/><br><br>-->
<!--    Password : <input type="password" name="password" required/><br><br>-->
<!--    <input type="submit" name="Login" />-->
<!--</form>-->
<!--""")))}),format.raw/*14.6*/("""-->



"""),_display_(/*18.2*/main("Login")/*18.15*/{_display_(Seq[Any](format.raw/*18.16*/("""


"""),format.raw/*21.1*/("""<html lang="en" >
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title> Login </title>
    <link rel='stylesheet' href='https://fonts.googleapis.com/css?family=Rubik:400,700'>
    <style>

/* Google Fonts - Poppins */

*"""),format.raw/*31.2*/("""{"""),format.raw/*31.3*/("""
    """),format.raw/*32.5*/("""margin: 0;
    padding: 0;
    box-sizing: border-box;
    font-family: 'Poppins', sans-serif;

"""),format.raw/*37.1*/("""}"""),format.raw/*37.2*/("""
"""),format.raw/*38.1*/(""".container"""),format.raw/*38.11*/("""{"""),format.raw/*38.12*/("""
    """),format.raw/*39.5*/("""height: 100vh;
    width: 100%;
    display: flex;
    align-items: center;
    justify-content: center;
    background-color: #4070f4;
    background-image: url("D:/logo.jpg");
    column-gap: 30px;
"""),format.raw/*47.1*/("""}"""),format.raw/*47.2*/("""
"""),format.raw/*48.1*/(""".form"""),format.raw/*48.6*/("""{"""),format.raw/*48.7*/("""
    """),format.raw/*49.5*/("""position: absolute;
    max-width: 430px;
    width: 100%;
    padding: 30px;
    border-radius: 6px;
    background: #FFF;
"""),format.raw/*55.1*/("""}"""),format.raw/*55.2*/("""
"""),format.raw/*56.1*/(""".form.signup"""),format.raw/*56.13*/("""{"""),format.raw/*56.14*/("""
    """),format.raw/*57.5*/("""opacity: 0;
    pointer-events: none;
"""),format.raw/*59.1*/("""}"""),format.raw/*59.2*/("""
"""),format.raw/*60.1*/(""".forms.show-signup .form.signup"""),format.raw/*60.32*/("""{"""),format.raw/*60.33*/("""
    """),format.raw/*61.5*/("""opacity: 1;
    pointer-events: auto;
"""),format.raw/*63.1*/("""}"""),format.raw/*63.2*/("""
"""),format.raw/*64.1*/(""".forms.show-signup .form.login"""),format.raw/*64.31*/("""{"""),format.raw/*64.32*/("""
    """),format.raw/*65.5*/("""opacity: 0;
    pointer-events: none;
"""),format.raw/*67.1*/("""}"""),format.raw/*67.2*/("""
"""),format.raw/*68.1*/("""header"""),format.raw/*68.7*/("""{"""),format.raw/*68.8*/("""
    """),format.raw/*69.5*/("""font-size: 28px;
    font-weight: 600;
    color: #232836;
    text-align: center;
"""),format.raw/*73.1*/("""}"""),format.raw/*73.2*/("""
"""),format.raw/*74.1*/("""form"""),format.raw/*74.5*/("""{"""),format.raw/*74.6*/("""
    """),format.raw/*75.5*/("""margin-top: 30px;
"""),format.raw/*76.1*/("""}"""),format.raw/*76.2*/("""
"""),format.raw/*77.1*/(""".form .field"""),format.raw/*77.13*/("""{"""),format.raw/*77.14*/("""
    """),format.raw/*78.5*/("""position: relative;
    height: 50px;
    width: 100%;
    margin-top: 20px;
    border-radius: 6px;
"""),format.raw/*83.1*/("""}"""),format.raw/*83.2*/("""
"""),format.raw/*84.1*/(""".field input,
.field button"""),format.raw/*85.14*/("""{"""),format.raw/*85.15*/("""
    """),format.raw/*86.5*/("""height: 100%;
    width: 100%;
    border: none;
    font-size: 16px;
    font-weight: 400;
    border-radius: 6px;
"""),format.raw/*92.1*/("""}"""),format.raw/*92.2*/("""
"""),format.raw/*93.1*/(""".field input"""),format.raw/*93.13*/("""{"""),format.raw/*93.14*/("""
    """),format.raw/*94.5*/("""outline: none;
    padding: 0 15px;
    border: 1px solid#CACACA;
"""),format.raw/*97.1*/("""}"""),format.raw/*97.2*/("""
"""),format.raw/*98.1*/(""".field input:focus"""),format.raw/*98.19*/("""{"""),format.raw/*98.20*/("""
    """),format.raw/*99.5*/("""border-bottom-width: 2px;
"""),format.raw/*100.1*/("""}"""),format.raw/*100.2*/("""
"""),format.raw/*101.1*/(""".eye-icon"""),format.raw/*101.10*/("""{"""),format.raw/*101.11*/("""
    """),format.raw/*102.5*/("""position: absolute;
    top: 50%;
    right: 10px;
    transform: translateY(-50%);
    font-size: 18px;
    color: #8b8b8b;
    cursor: pointer;
    padding: 5px;
"""),format.raw/*110.1*/("""}"""),format.raw/*110.2*/("""
"""),format.raw/*111.1*/(""".field button"""),format.raw/*111.14*/("""{"""),format.raw/*111.15*/("""
    """),format.raw/*112.5*/("""color: #fff;
    background-color: #0171d3;
    transition: all 0.3s ease;
    cursor: pointer;
"""),format.raw/*116.1*/("""}"""),format.raw/*116.2*/("""
"""),format.raw/*117.1*/(""".field button:hover"""),format.raw/*117.20*/("""{"""),format.raw/*117.21*/("""
    """),format.raw/*118.5*/("""background-color: #016dcb;
"""),format.raw/*119.1*/("""}"""),format.raw/*119.2*/("""
"""),format.raw/*120.1*/(""".form-link"""),format.raw/*120.11*/("""{"""),format.raw/*120.12*/("""
    """),format.raw/*121.5*/("""text-align: center;
    margin-top: 10px;
"""),format.raw/*123.1*/("""}"""),format.raw/*123.2*/("""
"""),format.raw/*124.1*/(""".form-link span,
.form-link a"""),format.raw/*125.13*/("""{"""),format.raw/*125.14*/("""
    """),format.raw/*126.5*/("""font-size: 14px;
    font-weight: 400;
    color: #232836;
"""),format.raw/*129.1*/("""}"""),format.raw/*129.2*/("""
"""),format.raw/*130.1*/(""".form a"""),format.raw/*130.8*/("""{"""),format.raw/*130.9*/("""
    """),format.raw/*131.5*/("""color: #0171d3;
    text-decoration: none;
"""),format.raw/*133.1*/("""}"""),format.raw/*133.2*/("""
"""),format.raw/*134.1*/(""".form-content a:hover"""),format.raw/*134.22*/("""{"""),format.raw/*134.23*/("""
    """),format.raw/*135.5*/("""text-decoration: underline;
"""),format.raw/*136.1*/("""}"""),format.raw/*136.2*/("""
"""),format.raw/*137.1*/(""".line"""),format.raw/*137.6*/("""{"""),format.raw/*137.7*/("""
    """),format.raw/*138.5*/("""position: relative;
    height: 1px;
    width: 100%;
    margin: 36px 0;
    background-color: #d4d4d4;
"""),format.raw/*143.1*/("""}"""),format.raw/*143.2*/("""
"""),format.raw/*144.1*/(""".line::before"""),format.raw/*144.14*/("""{"""),format.raw/*144.15*/("""
    """),format.raw/*145.5*/("""content: 'Or';
    position: absolute;
    top: 50%;
    left: 50%;
    transform: translate(-50%, -50%);
    background-color: #FFF;
    color: #8b8b8b;
    padding: 0 15px;
"""),format.raw/*153.1*/("""}"""),format.raw/*153.2*/("""
"""),format.raw/*154.1*/(""".media-options a"""),format.raw/*154.17*/("""{"""),format.raw/*154.18*/("""
    """),format.raw/*155.5*/("""display: flex;
    align-items: center;
    justify-content: center;
"""),format.raw/*158.1*/("""}"""),format.raw/*158.2*/("""
"""),format.raw/*159.1*/("""a.facebook"""),format.raw/*159.11*/("""{"""),format.raw/*159.12*/("""
    """),format.raw/*160.5*/("""color: #fff;
    background-color: #4267b2;
"""),format.raw/*162.1*/("""}"""),format.raw/*162.2*/("""
"""),format.raw/*163.1*/("""a.facebook .facebook-icon"""),format.raw/*163.26*/("""{"""),format.raw/*163.27*/("""
    """),format.raw/*164.5*/("""height: 28px;
    width: 28px;
    color: #0171d3;
    font-size: 20px;
    border-radius: 50%;
    display: flex;
    align-items: center;
    justify-content: center;

"""),format.raw/*173.1*/("""}"""),format.raw/*173.2*/("""
"""),format.raw/*174.1*/(""".facebook-icon,
img.google-img"""),format.raw/*175.15*/("""{"""),format.raw/*175.16*/("""
    """),format.raw/*176.5*/("""position: absolute;
    top: 50%;
    left: 15px;
    transform: translateY(-50%);
"""),format.raw/*180.1*/("""}"""),format.raw/*180.2*/("""
"""),format.raw/*181.1*/("""img.google-img"""),format.raw/*181.15*/("""{"""),format.raw/*181.16*/("""
    """),format.raw/*182.5*/("""height: 20px;
    width: 20px;
    object-fit: cover;
"""),format.raw/*185.1*/("""}"""),format.raw/*185.2*/("""
"""),format.raw/*186.1*/("""a.google"""),format.raw/*186.9*/("""{"""),format.raw/*186.10*/("""
    """),format.raw/*187.5*/("""border: 1px solid #CACACA;
"""),format.raw/*188.1*/("""}"""),format.raw/*188.2*/("""
"""),format.raw/*189.1*/("""a.google span"""),format.raw/*189.14*/("""{"""),format.raw/*189.15*/("""
    """),format.raw/*190.5*/("""font-weight: 500;
    opacity: 0.6;
    color: #232836;
"""),format.raw/*193.1*/("""}"""),format.raw/*193.2*/("""


    """),format.raw/*196.5*/("""</style>
</head>
<body>
<!-- partial:index.partial.html -->
<section class="container forms">
    <div class="form login">
        <h1 style="text-align: center; font-size: 30px">Login</h1>
        <div class="form-content">

            <form method="get" action="/validate1">

                <div class="field input-field">
                    <input type="text" name="username" id="username" placeholder="Username" autocomplete="nope" required/>
                </div>

                <div class="field input-field">
                    <input type="password" name="password" id="password" placeholder="Password" class="password" autocomplete="new-password" required/>

                    <i class='bx bx-hide eye-icon'></i>
                </div>

<!--                <div class="form-link">-->
<!--                    <a href="#" class="forgot-pass">Forgot password?</a>-->
<!--                </div>-->

                <div class="field button-field">
                    <button>Login</button>
                </div>
            </form>

<!--            <div class="form-link">-->
<!--                <span>Don't have an account? <a href="#" class="link signup-link">Signup</a></span>-->
<!--            </div>-->
        </div>




    </div>

    <!-- Signup Form -->

    <div class="form signup">
        <div class="form-content">
            <header>Signup</header>
            <form action="#">
                <div class="field input-field">
                    <input type="email" placeholder="Email" class="input">
                </div>

                <div class="field input-field">
                    <input type="password" placeholder="Create password" class="password">
                </div>

                <div class="field input-field">
                    <input type="password" placeholder="Confirm password" class="password">
                    <i class='bx bx-hide eye-icon'></i>
                </div>

                <div class="field button-field">
                    <button>Signup</button>
                </div>
            </form>

            <div class="form-link">
                <span>Already have an account? <a href="#" class="link login-link">Login</a></span>
            </div>
        </div>

        <div class="line"></div>

        <div class="media-options">
            <a href="#" class="field facebook">
                <i class='bx bxl-facebook facebook-icon'></i>
                <span>Login with Facebook</span>
            </a>
        </div>

        <div class="media-options">
            <a href="#" class="field google">
                <img src="images/google.png" alt="" class="google-img">
                <span>Login with Google</span>
            </a>
        </div>

    </div>
</section>

<!-- JavaScript -->
<script src="js/script.js"></script>
</body>
</html>







""")))}))
      }
    }
  }

  def render(request:RequestHeader,flash:Flash): play.twirl.api.HtmlFormat.Appendable = apply()(request,flash)

  def f:(() => (RequestHeader,Flash) => play.twirl.api.HtmlFormat.Appendable) = () => (request,flash) => apply()(request,flash)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/login1.scala.html
                  HASH: 4e971ec39e8956c38dd9016add17712fa289056d
                  MATRIX: 743->1|887->50|917->54|947->59|968->72|1006->73|1391->428|1429->440|1451->453|1490->454|1523->460|1845->755|1873->756|1906->762|2034->863|2062->864|2091->866|2129->876|2158->877|2191->883|2426->1091|2454->1092|2483->1094|2515->1099|2543->1100|2576->1106|2733->1236|2761->1237|2790->1239|2830->1251|2859->1252|2892->1258|2959->1298|2987->1299|3016->1301|3075->1332|3104->1333|3137->1339|3204->1379|3232->1380|3261->1382|3319->1412|3348->1413|3381->1419|3448->1459|3476->1460|3505->1462|3538->1468|3566->1469|3599->1475|3713->1562|3741->1563|3770->1565|3801->1569|3829->1570|3862->1576|3908->1595|3936->1596|3965->1598|4005->1610|4034->1611|4067->1617|4200->1723|4228->1724|4257->1726|4313->1754|4342->1755|4375->1761|4524->1883|4552->1884|4581->1886|4621->1898|4650->1899|4683->1905|4779->1974|4807->1975|4836->1977|4882->1995|4911->1996|4944->2002|4999->2029|5028->2030|5058->2032|5096->2041|5126->2042|5160->2048|5360->2220|5389->2221|5419->2223|5461->2236|5491->2237|5525->2243|5653->2343|5682->2344|5712->2346|5760->2365|5790->2366|5824->2372|5880->2400|5909->2401|5939->2403|5978->2413|6008->2414|6042->2420|6114->2464|6143->2465|6173->2467|6232->2497|6262->2498|6296->2504|6386->2566|6415->2567|6445->2569|6480->2576|6509->2577|6543->2583|6616->2628|6645->2629|6675->2631|6725->2652|6755->2653|6789->2659|6846->2688|6875->2689|6905->2691|6938->2696|6967->2697|7001->2703|7139->2813|7168->2814|7198->2816|7240->2829|7270->2830|7304->2836|7515->3019|7544->3020|7574->3022|7619->3038|7649->3039|7683->3045|7783->3117|7812->3118|7842->3120|7881->3130|7911->3131|7945->3137|8019->3183|8048->3184|8078->3186|8132->3211|8162->3212|8196->3218|8403->3397|8432->3398|8462->3400|8522->3431|8552->3432|8586->3438|8701->3525|8730->3526|8760->3528|8803->3542|8833->3543|8867->3549|8952->3606|8981->3607|9011->3609|9047->3617|9077->3618|9111->3624|9167->3652|9196->3653|9226->3655|9268->3668|9298->3669|9332->3675|9419->3734|9448->3735|9486->3745
                  LINES: 21->1|26->1|28->3|28->3|28->3|28->3|39->14|43->18|43->18|43->18|46->21|56->31|56->31|57->32|62->37|62->37|63->38|63->38|63->38|64->39|72->47|72->47|73->48|73->48|73->48|74->49|80->55|80->55|81->56|81->56|81->56|82->57|84->59|84->59|85->60|85->60|85->60|86->61|88->63|88->63|89->64|89->64|89->64|90->65|92->67|92->67|93->68|93->68|93->68|94->69|98->73|98->73|99->74|99->74|99->74|100->75|101->76|101->76|102->77|102->77|102->77|103->78|108->83|108->83|109->84|110->85|110->85|111->86|117->92|117->92|118->93|118->93|118->93|119->94|122->97|122->97|123->98|123->98|123->98|124->99|125->100|125->100|126->101|126->101|126->101|127->102|135->110|135->110|136->111|136->111|136->111|137->112|141->116|141->116|142->117|142->117|142->117|143->118|144->119|144->119|145->120|145->120|145->120|146->121|148->123|148->123|149->124|150->125|150->125|151->126|154->129|154->129|155->130|155->130|155->130|156->131|158->133|158->133|159->134|159->134|159->134|160->135|161->136|161->136|162->137|162->137|162->137|163->138|168->143|168->143|169->144|169->144|169->144|170->145|178->153|178->153|179->154|179->154|179->154|180->155|183->158|183->158|184->159|184->159|184->159|185->160|187->162|187->162|188->163|188->163|188->163|189->164|198->173|198->173|199->174|200->175|200->175|201->176|205->180|205->180|206->181|206->181|206->181|207->182|210->185|210->185|211->186|211->186|211->186|212->187|213->188|213->188|214->189|214->189|214->189|215->190|218->193|218->193|221->196
                  -- GENERATED --
              */
          