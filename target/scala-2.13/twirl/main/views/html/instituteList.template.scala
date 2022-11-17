
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
/*1.2*/import scala.collection.mutable.ArrayBuffer

object instituteList extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Paginator[StudentInstitute],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(paginatedList: Paginator[StudentInstitute]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*5.2*/link/*5.6*/(newPage: Int) = {{
routes.Application.instituteList(newPage)
}};
Seq[Any](format.raw/*2.46*/("""

"""),format.raw/*4.40*/("""
"""),format.raw/*7.2*/("""
"""),_display_(/*8.2*/dashboard/*8.11*/{_display_(Seq[Any](format.raw/*8.12*/("""
"""),format.raw/*9.1*/("""<!doctype html>
<html>
<head>
    <title>Students</title>
    <script src="https://cdn.tailwindcss.com"></script>
    <style>
                html"""),format.raw/*15.21*/("""{"""),format.raw/*15.22*/("""
                    """),format.raw/*16.21*/("""position: relative;
                """),format.raw/*17.17*/("""}"""),format.raw/*17.18*/("""
                """),format.raw/*18.17*/("""body"""),format.raw/*18.21*/("""{"""),format.raw/*18.22*/("""
                    """),format.raw/*19.21*/("""margin: 0;
                """),format.raw/*20.17*/("""}"""),format.raw/*20.18*/("""
                    """),format.raw/*21.21*/("""table"""),format.raw/*21.26*/("""{"""),format.raw/*21.27*/("""
                        """),format.raw/*22.25*/("""width: 100%;
                        border-collapse: collapse;
                    """),format.raw/*24.21*/("""}"""),format.raw/*24.22*/("""
                    """),format.raw/*25.21*/("""td, th """),format.raw/*25.28*/("""{"""),format.raw/*25.29*/("""
                        """),format.raw/*26.25*/("""border: 1px solid #dddddd;
                        text-align: center;
                        padding:6px 20px;
                    """),format.raw/*29.21*/("""}"""),format.raw/*29.22*/("""
                    """),format.raw/*30.21*/("""tr th """),format.raw/*30.27*/("""{"""),format.raw/*30.28*/("""
                        """),format.raw/*31.25*/("""border: 1px solid #dddddd;
                        text-align: center;
                        padding:6px 20px;
                        background-color: #fffacf;
                        color: black;
                        font-size: 18px;
                        position: relative;
                    """),format.raw/*38.21*/("""}"""),format.raw/*38.22*/("""
                    """),format.raw/*39.21*/("""tr:hover """),format.raw/*39.30*/("""{"""),format.raw/*39.31*/("""
                        """),format.raw/*40.25*/("""background-color: #dddddd;
                        cursor: pointer;
                    """),format.raw/*42.21*/("""}"""),format.raw/*42.22*/("""

                    """),format.raw/*44.21*/(""".popup, .deletePopup """),format.raw/*44.42*/("""{"""),format.raw/*44.43*/("""
                        """),format.raw/*45.25*/("""background: rgba(66, 62, 62, 0.12);
                        display: none;
                        width: 100vw;
                        height: 100vh;
                        z-index: 10;
                        position: absolute;
                        left: 0px;
                        top: 0px;
                        justify-content: center;
                        align-items: center;
                        transition: display 1ms ease-in;
                    """),format.raw/*56.21*/("""}"""),format.raw/*56.22*/("""
                    """),format.raw/*57.21*/(""".popped"""),format.raw/*57.28*/("""{"""),format.raw/*57.29*/("""
                        """),format.raw/*58.25*/("""display: grid;
                    """),format.raw/*59.21*/("""}"""),format.raw/*59.22*/("""

                """),format.raw/*61.17*/(""".popup-container """),format.raw/*61.34*/("""{"""),format.raw/*61.35*/("""
                    """),format.raw/*62.21*/("""background: white;
                    width: 470px;
                    height: 150px;
                    border-radius: 3px;
                    box-shadow: 1px 1px 7px 4px #d6d6d6b5, -2px 2px 8px 4px #f1eeee4f;
                    margin-left: 25%;
                    display: flex;
                    flex-flow: column;
                    justify-content: center;
                """),format.raw/*71.17*/("""}"""),format.raw/*71.18*/("""
                """),format.raw/*72.17*/(""".popup-container h1 """),format.raw/*72.37*/("""{"""),format.raw/*72.38*/("""
                    """),format.raw/*73.21*/("""text-align: center;
                """),format.raw/*74.17*/("""}"""),format.raw/*74.18*/("""

                """),format.raw/*76.17*/(""".popup-container .buttons"""),format.raw/*76.42*/("""{"""),format.raw/*76.43*/("""
                    """),format.raw/*77.21*/("""margin-top: 14px;
                """),format.raw/*78.17*/("""}"""),format.raw/*78.18*/("""
                """),format.raw/*79.17*/("""button.close-btn-delete, .close-btn"""),format.raw/*79.52*/("""{"""),format.raw/*79.53*/("""
                    """),format.raw/*80.21*/("""align-self: flex-end;
                    margin-right: 33px;
                """),format.raw/*82.17*/("""}"""),format.raw/*82.18*/("""

                """),format.raw/*84.17*/(""".delete-inner-container """),format.raw/*84.41*/("""{"""),format.raw/*84.42*/("""
                    """),format.raw/*85.21*/("""align-self: center;
                """),format.raw/*86.17*/("""}"""),format.raw/*86.18*/("""


                    """),format.raw/*89.21*/("""/*.close-btn"""),format.raw/*89.33*/("""{"""),format.raw/*89.34*/("""*/
                    /*    justify-self: end;*/
                    /*    align-self: center;*/
                    /*    top: 7px;*/
                    /*    right: 19px;*/
                    /*    position: relative;*/
                    /*"""),format.raw/*95.23*/("""}"""),format.raw/*95.24*/("""*/
                    .inner-container h2 """),format.raw/*96.41*/("""{"""),format.raw/*96.42*/("""
                        """),format.raw/*97.25*/("""text-align: center;
                        font-size: 15px;
                    """),format.raw/*99.21*/("""}"""),format.raw/*99.22*/("""
                    """),format.raw/*100.21*/(""".inner-container"""),format.raw/*100.37*/("""{"""),format.raw/*100.38*/("""
                        """),format.raw/*101.25*/("""padding: 15px;
                    """),format.raw/*102.21*/("""}"""),format.raw/*102.22*/("""

                """),format.raw/*104.17*/(""".inner-container form """),format.raw/*104.39*/("""{"""),format.raw/*104.40*/("""
                    """),format.raw/*105.21*/("""margin-top: 10px;
                    display: grid;
                    grid-gap: 20px;
                    justify-content: center;
                """),format.raw/*109.17*/("""}"""),format.raw/*109.18*/("""

                """),format.raw/*111.17*/(""".inner-container select"""),format.raw/*111.40*/("""{"""),format.raw/*111.41*/("""
                    """),format.raw/*112.21*/("""outline: 2px solid #006aff;
                    padding: 5px;
                    border-radius: 3px;
                """),format.raw/*115.17*/("""}"""),format.raw/*115.18*/("""

                    """),format.raw/*117.21*/(""".wrapper """),format.raw/*117.30*/("""{"""),format.raw/*117.31*/("""
                        """),format.raw/*118.25*/("""margin: 20px;
                    """),format.raw/*119.21*/("""}"""),format.raw/*119.22*/("""

                    """),format.raw/*121.21*/(""".btn-select """),format.raw/*121.33*/("""{"""),format.raw/*121.34*/("""
                        """),format.raw/*122.25*/("""margin: 10px;
                        display: grid;
                        justify-content: end;
                        grid-auto-flow: column;
                        grid-gap: 20px;
                    """),format.raw/*127.21*/("""}"""),format.raw/*127.22*/("""

                    """),format.raw/*129.21*/(""".pagination """),format.raw/*129.33*/("""{"""),format.raw/*129.34*/("""
                        """),format.raw/*130.25*/("""margin: 15px;
                        display: grid;
                        grid-auto-flow: column;
                        justify-content: center;
                    """),format.raw/*134.21*/("""}"""),format.raw/*134.22*/("""
                """),format.raw/*135.17*/(""".selected """),format.raw/*135.27*/("""{"""),format.raw/*135.28*/("""
                    """),format.raw/*136.21*/("""border: 2px solid #006aff;
                    background: #d2ddff;
                """),format.raw/*138.17*/("""}"""),format.raw/*138.18*/("""
                """),format.raw/*139.17*/("""tr th::after """),format.raw/*139.30*/("""{"""),format.raw/*139.31*/("""
                    """),format.raw/*140.21*/("""content: url(assets/images/chevron.svg);
                    width: 20px;
                    height: 20px;
                    position: absolute;
                    right: 72px;
                    top: 7px;
                """),format.raw/*146.17*/("""}"""),format.raw/*146.18*/("""

                """),format.raw/*148.17*/("""tr th:nth-child(even)::after"""),format.raw/*148.45*/("""{"""),format.raw/*148.46*/("""
                    """),format.raw/*149.21*/("""right: 50px;
                    top: 7px;
                """),format.raw/*151.17*/("""}"""),format.raw/*151.18*/("""

                """),format.raw/*153.17*/("""tr th:nth-child(3)::after"""),format.raw/*153.42*/("""{"""),format.raw/*153.43*/("""
                    """),format.raw/*154.21*/("""right: 30px;
                    top: 7px;
                """),format.raw/*156.17*/("""}"""),format.raw/*156.18*/("""
                """),format.raw/*157.17*/("""tr.rotate ::after"""),format.raw/*157.34*/("""{"""),format.raw/*157.35*/("""
                    """),format.raw/*158.21*/("""transform: rotate(180deg);
                """),format.raw/*159.17*/("""}"""),format.raw/*159.18*/("""
                """),format.raw/*160.17*/(""".highlight"""),format.raw/*160.27*/("""{"""),format.raw/*160.28*/("""
                    """),format.raw/*161.21*/("""background-color: #e7ff0059;
                """),format.raw/*162.17*/("""}"""),format.raw/*162.18*/("""
            """),format.raw/*163.13*/("""</style>
</head>

<body>
<div class="wrapper">
    <h1 class="mb-1 text-2xl  tracking-tight leading-none text-gray-900 md:text-4xl lg:text-4xl dark:text-black">Institute List</h1>
    <div class="btn-select">
        <div class="relative">
            <div class="flex absolute inset-y-0 left-0 items-center pl-3 pointer-events-none">
                <svg aria-hidden="true" class="w-5 h-5 text-gray-500 dark:text-gray-400" fill="none" stroke="currentColor" viewBox="0 0 24 24" xmlns="http://www.w3.org/2000/svg"><path stroke-linecap="round" stroke-linejoin="round" stroke-width="2" d="M21 21l-6-6m2-5a7 7 0 11-14 0 7 7 0 0114 0z"></path></svg>
            </div>
            <input type="search" id="default-search" class="block p-4 pl-10 w-full text-sm text-gray-900 bg-gray-50 rounded-lg border border-gray-300 focus:ring-blue-500 focus:border-blue-500 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-blue-500 dark:focus:border-blue-500" placeholder="Search" required>
            <button id="search-btn" type="submit" class="text-white absolute right-2.5 bottom-2.5 bg-blue-700 hover:bg-blue-800 focus:ring-4 focus:outline-none focus:ring-blue-300 font-medium rounded-lg text-sm px-4 py-2 dark:bg-blue-600 dark:hover:bg-blue-700 dark:focus:ring-blue-800">Search</button>
        </div>
        <button id="insertBtn" type="button" class="text-white bg-blue-700 hover:bg-blue-800 focus:ring-4 focus:outline-none focus:ring-blue-300 font-medium rounded-lg text-sm px-5 py-2.5 text-center inline-flex items-center dark:bg-blue-600 dark:hover:bg-blue-700 dark:focus:ring-blue-800">
            <!--            Insert-->
            <svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 20 20" fill="currentColor" class="w-5 h-5">
                <path d="M10.75 4.75a.75.75 0 00-1.5 0v4.5h-4.5a.75.75 0 000 1.5h4.5v4.5a.75.75 0 001.5 0v-4.5h4.5a.75.75 0 000-1.5h-4.5v-4.5z" />
            </svg>
        </button>
        <button id="updateBtn" type="button" class="text-white bg-blue-700 hover:bg-blue-800 focus:ring-4 focus:outline-none focus:ring-blue-300 font-medium rounded-lg text-sm px-5 py-2.5 text-center inline-flex items-center dark:bg-blue-600 dark:hover:bg-blue-700 dark:focus:ring-blue-800">
            <!--            Update-->
            <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-pencil-square" viewBox="0 0 16 16">
                <path d="M15.502 1.94a.5.5 0 0 1 0 .706L14.459 3.69l-2-2L13.502.646a.5.5 0 0 1 .707 0l1.293 1.293zm-1.75 2.456-2-2L4.939 9.21a.5.5 0 0 0-.121.196l-.805 2.414a.25.25 0 0 0 .316.316l2.414-.805a.5.5 0 0 0 .196-.12l6.813-6.814z"/>
                <path fill-rule="evenodd" d="M1 13.5A1.5 1.5 0 0 0 2.5 15h11a1.5 1.5 0 0 0 1.5-1.5v-6a.5.5 0 0 0-1 0v6a.5.5 0 0 1-.5.5h-11a.5.5 0 0 1-.5-.5v-11a.5.5 0 0 1 .5-.5H9a.5.5 0 0 0 0-1H2.5A1.5 1.5 0 0 0 1 2.5v11z"/>
            </svg>
        </button>
        <button id="deleteBtn" type="button" class="text-white bg-blue-700 hover:bg-blue-800 focus:ring-4 focus:outline-none focus:ring-blue-300 font-medium rounded-lg text-sm px-5 py-2.5 text-center inline-flex items-center dark:bg-blue-600 dark:hover:bg-blue-700 dark:focus:ring-blue-800">
            <!--            Delete-->
            <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-trash" viewBox="0 0 16 16">
                <path d="M5.5 5.5A.5.5 0 0 1 6 6v6a.5.5 0 0 1-1 0V6a.5.5 0 0 1 .5-.5zm2.5 0a.5.5 0 0 1 .5.5v6a.5.5 0 0 1-1 0V6a.5.5 0 0 1 .5-.5zm3 .5a.5.5 0 0 0-1 0v6a.5.5 0 0 0 1 0V6z"/>
                <path fill-rule="evenodd" d="M14.5 3a1 1 0 0 1-1 1H13v9a2 2 0 0 1-2 2H5a2 2 0 0 1-2-2V4h-.5a1 1 0 0 1-1-1V2a1 1 0 0 1 1-1H6a1 1 0 0 1 1-1h2a1 1 0 0 1 1 1h3.5a1 1 0 0 1 1 1v1zM4.118 4 4 4.059V13a1 1 0 0 0 1 1h6a1 1 0 0 0 1-1V4.059L11.882 4H4.118zM2.5 3V2h11v1h-11z"/>
            </svg>
        </button>

    </div>
    <table id="student-table">
        <thead>

        <th>Institute Name</th>
        <th>Registration No</th>
        <th>Institute Contact</th>
        <th>Institute Address</th>

        </thead>
        <tbody>
        """),_display_(/*209.10*/for(d <- paginatedList.items) yield /*209.39*/{_display_(Seq[Any](format.raw/*209.40*/("""
        """),format.raw/*210.9*/("""<tr class="std-row" data-id=""""),_display_(/*210.39*/d/*210.40*/.instituteId),format.raw/*210.52*/("""">
            """),format.raw/*211.66*/("""
            """),format.raw/*212.13*/("""<td>
                """),_display_(/*213.18*/d/*213.19*/.instituteName),format.raw/*213.33*/("""
            """),format.raw/*214.13*/("""</td>
            <td>"""),_display_(/*215.18*/d/*215.19*/.instituteId),format.raw/*215.31*/("""</td>
            <td>"""),_display_(/*216.18*/d/*216.19*/.instituteContact),format.raw/*216.36*/("""</td>
            <td>
                """),_display_(/*218.18*/d/*218.19*/.instituteAddress.get("City")),format.raw/*218.48*/("""
                """),format.raw/*219.17*/(""",
                """),_display_(/*220.18*/d/*220.19*/.instituteAddress.get("District")),format.raw/*220.52*/("""
            """),format.raw/*221.13*/("""</td>
        </tr>
        """)))}),format.raw/*223.10*/("""
        """),format.raw/*224.9*/("""</tbody>
    </table>

    <div class="popup">
        <div class="popup-container">
            <button type="button" class="close-btn text-white bg-blue-700 hover:bg-blue-800 focus:ring-4 focus:outline-none focus:ring-blue-300 font-medium rounded-full text-sm p-2.5 text-center inline-flex items-center mr-2 dark:bg-blue-600 dark:hover:bg-blue-700 dark:focus:ring-blue-800">
                <svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 20 20" fill="currentColor" class="w-5 h-5">
                    <path d="M6.28 5.22a.75.75 0 00-1.06 1.06L8.94 10l-3.72 3.72a.75.75 0 101.06 1.06L10 11.06l3.72 3.72a.75.75 0 101.06-1.06L11.06 10l3.72-3.72a.75.75 0 00-1.06-1.06L10 8.94 6.28 5.22z" />
                </svg>
            </button>
            <div class="inner-container">
                <h1>Please Select a student</h1>
                """),format.raw/*236.79*/("""
                """),format.raw/*237.118*/("""
                """),format.raw/*238.76*/("""
                    """),format.raw/*239.84*/("""
                    """),format.raw/*240.159*/("""
                    """),format.raw/*241.54*/("""
                    """),format.raw/*242.58*/("""
                """),format.raw/*243.317*/("""
                    """),format.raw/*244.63*/("""
                    """),format.raw/*245.383*/("""
                    """),format.raw/*246.62*/("""

                """),format.raw/*248.52*/("""
            """),format.raw/*249.13*/("""</div>
        </div>
    </div>



    <div class="deletePopup">
        <div class="popup-container">
            <button type="button" class="close-btn-delete text-white bg-blue-700 hover:bg-blue-800 focus:ring-4 focus:outline-none focus:ring-blue-300 font-medium rounded-full text-sm p-2.5 text-center inline-flex items-center mr-2 dark:bg-blue-600 dark:hover:bg-blue-700 dark:focus:ring-blue-800">
                <svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 20 20" fill="currentColor" class="w-5 h-5">
                    <path d="M6.28 5.22a.75.75 0 00-1.06 1.06L8.94 10l-3.72 3.72a.75.75 0 101.06 1.06L10 11.06l3.72 3.72a.75.75 0 101.06-1.06L11.06 10l3.72-3.72a.75.75 0 00-1.06-1.06L10 8.94 6.28 5.22z" />
                </svg>
            </button>
            <div class="delete-inner-container">
                <h1>Are you sure?</h1>
                <div class="buttons">
                    <button type="submit" onclick="confirmDelete(true)" class="focus:outline-none text-white bg-red-700 hover:bg-red-800 focus:ring-4 focus:ring-red-300 font-medium rounded-lg text-sm px-5 py-2.5 mr-2 mb-2 dark:bg-red-600 dark:hover:bg-red-700 dark:focus:ring-red-900">
                        Yes
                    </button>
                    <button type="submit" onclick="confirmDelete(false)" class="focus:outline-none text-white bg-green-700 hover:bg-green-800 focus:ring-4 focus:ring-green-300 font-medium rounded-lg text-sm px-5 py-2.5 mr-2 mb-2 dark:bg-green-600 dark:hover:bg-green-700 dark:focus:ring-green-800">
                        No
                    </button>
                </div>
            </div>

        </div>
    </div>



    <div class="pagination flex items-center space-x-1">

        """),_display_(/*281.10*/paginatedList/*281.23*/.prevPage.map/*281.36*/ { page =>_display_(Seq[Any](format.raw/*281.46*/("""
        """),format.raw/*282.9*/("""<a href=""""),_display_(/*282.19*/link(page)),format.raw/*282.29*/("""" class="flex items-center px-4 py-2 text-gray-500 bg-gray-300 rounded-md">
            <svg aria-hidden="true" class="mr-2 w-5 h-5" fill="currentColor" viewBox="0 0 20 20" xmlns="http://www.w3.org/2000/svg"><path fill-rule="evenodd" d="M7.707 14.707a1 1 0 01-1.414 0l-4-4a1 1 0 010-1.414l4-4a1 1 0 011.414 1.414L5.414 9H17a1 1 0 110 2H5.414l2.293 2.293a1 1 0 010 1.414z" clip-rule="evenodd"></path></svg>
<!--            Previous-->
        </a>
        """)))}/*286.10*/.getOrElse/*286.20*/{_display_(Seq[Any](format.raw/*286.21*/("""
        """),format.raw/*287.9*/("""<a disabled class="flex items-center px-4 py-2 text-gray-500 bg-gray-300 rounded-md">
            <svg aria-hidden="true" class="mr-2 w-5 h-5" fill="currentColor" viewBox="0 0 20 20" xmlns="http://www.w3.org/2000/svg"><path fill-rule="evenodd" d="M7.707 14.707a1 1 0 01-1.414 0l-4-4a1 1 0 010-1.414l4-4a1 1 0 011.414 1.414L5.414 9H17a1 1 0 110 2H5.414l2.293 2.293a1 1 0 010 1.414z" clip-rule="evenodd"></path></svg>
<!--            Previous-->
        </a>
        """)))}),format.raw/*291.10*/("""

        """),_display_(/*293.10*/for(pageNumber <- paginatedList.lowbound until paginatedList.high ) yield /*293.77*/ {_display_(Seq[Any](format.raw/*293.79*/("""
        """),_display_(/*294.10*/if(pageNumber != 0)/*294.29*/ {_display_(Seq[Any](format.raw/*294.31*/("""
        """),format.raw/*295.9*/("""<a href=""""),_display_(/*295.19*/link(pageNumber)),format.raw/*295.35*/("""" class="px-4 py-2 text-gray-700 bg-gray-200 rounded-md hover:bg-blue-400 hover:text-white">"""),_display_(/*295.128*/pageNumber),format.raw/*295.138*/("""</a>
        """)))}),format.raw/*296.10*/("""
        """)))}),format.raw/*297.10*/("""

        """),_display_(/*299.10*/paginatedList/*299.23*/.nextPage.map/*299.36*/ { page =>_display_(Seq[Any](format.raw/*299.46*/("""
        """),format.raw/*300.9*/("""<a href=""""),_display_(/*300.19*/link(page)),format.raw/*300.29*/("""" class="flex items-center px-4 py-2 text-gray-500 bg-gray-300 rounded-md">
<!--            Next-->
            <svg aria-hidden="true" class="ml-2 w-5 h-5" fill="currentColor" viewBox="0 0 20 20" xmlns="http://www.w3.org/2000/svg"><path fill-rule="evenodd" d="M12.293 5.293a1 1 0 011.414 0l4 4a1 1 0 010 1.414l-4 4a1 1 0 01-1.414-1.414L14.586 11H3a1 1 0 110-2h11.586l-2.293-2.293a1 1 0 010-1.414z" clip-rule="evenodd"></path></svg>
        </a>
        """)))}/*304.10*/.getOrElse/*304.20*/ {_display_(Seq[Any](format.raw/*304.22*/("""
        """),format.raw/*305.9*/("""<a href="#" disabled class="flex items-center px-4 py-2 text-gray-500 bg-gray-300 rounded-md">
<!--            Next-->
            <svg aria-hidden="true" class="ml-2 w-5 h-5" fill="currentColor" viewBox="0 0 20 20" xmlns="http://www.w3.org/2000/svg"><path fill-rule="evenodd" d="M12.293 5.293a1 1 0 011.414 0l4 4a1 1 0 010 1.414l-4 4a1 1 0 01-1.414-1.414L14.586 11H3a1 1 0 110-2h11.586l-2.293-2.293a1 1 0 010-1.414z" clip-rule="evenodd"></path></svg>
        </a>
        """)))}),format.raw/*309.10*/("""
    """),format.raw/*310.5*/("""</div>

</div>
<script>
                let popup = document.getElementsByClassName("popup")[0];
                let updateBtn = document.getElementById("updateBtn");
                let insertBtn = document.getElementById("insertBtn");
                let deleteBtn = document.getElementById("deleteBtn");
                let close_btn = document.getElementsByClassName("close-btn")[0];
                let close_btn_delete = document.querySelector(".close-btn-delete");
                let std_row = document.getElementsByClassName("std-row");
                let search_btn = document.getElementById("search-btn");
                let deletePopup = document.querySelector(".deletePopup");

<!--                let default_search = document.getElementById("default-search");-->
<!--                let yesDelete = document.getElementById("yesDelete");-->
<!--                let noDelete = document.getElementById("noDelete");-->
<!--                -->

                let table = document.getElementById("student-table");

                // select table header
                let rows = table.rows[0].cells;

                let studentId;




                function selectRow(row) """),format.raw/*339.41*/("""{"""),format.raw/*339.42*/("""
                    """),format.raw/*340.21*/("""row.addEventListener("click", function (e) """),format.raw/*340.64*/("""{"""),format.raw/*340.65*/("""
                        """),format.raw/*341.25*/("""let select_row = e.target.parentElement;

                        // select only one row
                        Array.from(std_row).forEach(el => """),format.raw/*344.59*/("""{"""),format.raw/*344.60*/("""
                            """),format.raw/*345.29*/("""if (el != this)
                                el.classList.remove("selected")
                            else
                                el.classList.toggle("selected") ?
                                        studentId = select_row.getAttribute("data-id") :
                                        studentId = undefined
                        """),format.raw/*351.25*/("""}"""),format.raw/*351.26*/(""");
                    """),format.raw/*352.21*/("""}"""),format.raw/*352.22*/(""");
                """),format.raw/*353.17*/("""}"""),format.raw/*353.18*/("""

                """),format.raw/*355.17*/("""// Add eventlistener to all rows
                Array.from(std_row).forEach(row => selectRow(row));



                close_btn.onclick = () => """),format.raw/*360.43*/("""{"""),format.raw/*360.44*/("""
                    """),format.raw/*361.21*/("""popup.classList.toggle("popped");
                """),format.raw/*362.17*/("""}"""),format.raw/*362.18*/("""

                """),format.raw/*364.17*/("""close_btn_delete.onclick = (e) => """),format.raw/*364.51*/("""{"""),format.raw/*364.52*/("""
                    """),format.raw/*365.21*/("""deletePopup.classList.toggle("popped")
                """),format.raw/*366.17*/("""}"""),format.raw/*366.18*/("""

                """),format.raw/*368.17*/("""insertBtn.onclick = () => """),format.raw/*368.43*/("""{"""),format.raw/*368.44*/("""
                    """),format.raw/*369.21*/("""window.location.href = """"),_display_(/*369.46*/routes/*369.52*/.Application.instituteIndex()),format.raw/*369.81*/(""""
                """),format.raw/*370.17*/("""}"""),format.raw/*370.18*/("""

                """),format.raw/*372.17*/("""updateBtn.onclick = () => """),format.raw/*372.43*/("""{"""),format.raw/*372.44*/("""
                    """),format.raw/*373.21*/("""if(! studentId)
                        popup.classList.toggle("popped");
                    else """),format.raw/*375.26*/("""{"""),format.raw/*375.27*/("""
                        """),format.raw/*376.25*/("""location.href = `/instituteView?institute_code=$"""),format.raw/*376.73*/("""{"""),format.raw/*376.74*/("""studentId"""),format.raw/*376.83*/("""}"""),format.raw/*376.84*/("""`;
                    """),format.raw/*377.21*/("""}"""),format.raw/*377.22*/("""
                """),format.raw/*378.17*/("""}"""),format.raw/*378.18*/("""

                """),format.raw/*380.17*/("""function confirmDelete(intent)"""),format.raw/*380.47*/("""{"""),format.raw/*380.48*/("""
                    """),format.raw/*381.21*/("""if(intent)"""),format.raw/*381.31*/("""{"""),format.raw/*381.32*/("""
                        """),format.raw/*382.25*/("""location.href = `/instituteDelete?institute_code=$"""),format.raw/*382.75*/("""{"""),format.raw/*382.76*/("""studentId"""),format.raw/*382.85*/("""}"""),format.raw/*382.86*/("""`;
                    """),format.raw/*383.21*/("""}"""),format.raw/*383.22*/(""" """),format.raw/*383.23*/("""else"""),format.raw/*383.27*/("""{"""),format.raw/*383.28*/("""
                        """),format.raw/*384.25*/("""deletePopup.classList.toggle("popped")
                    """),format.raw/*385.21*/("""}"""),format.raw/*385.22*/("""
                """),format.raw/*386.17*/("""}"""),format.raw/*386.18*/("""

                """),format.raw/*388.17*/("""deleteBtn.onclick = () => """),format.raw/*388.43*/("""{"""),format.raw/*388.44*/("""
                    """),format.raw/*389.21*/("""if(!studentId)
                        popup.classList.toggle("popped");
                    else """),format.raw/*391.26*/("""{"""),format.raw/*391.27*/("""
                        """),format.raw/*392.25*/("""deletePopup.classList.toggle("popped")
                    """),format.raw/*393.21*/("""}"""),format.raw/*393.22*/("""
                """),format.raw/*394.17*/("""}"""),format.raw/*394.18*/("""

                """),format.raw/*396.17*/("""search_btn.addEventListener("click", e => """),format.raw/*396.59*/("""{"""),format.raw/*396.60*/("""
                    """),format.raw/*397.21*/("""let q = default_search.value
                    renderAndFetch(q);
                """),format.raw/*399.17*/("""}"""),format.raw/*399.18*/(""");

                async function renderAndFetch(q)"""),format.raw/*401.49*/("""{"""),format.raw/*401.50*/("""
                    """),format.raw/*402.21*/("""let response = await fetch(`/instituteSearch?q=$"""),format.raw/*402.69*/("""{"""),format.raw/*402.70*/("""q"""),format.raw/*402.71*/("""}"""),format.raw/*402.72*/("""`, """),format.raw/*402.75*/("""{"""),format.raw/*402.76*/("""
                        """),format.raw/*403.25*/("""method: "GET"
                    """),format.raw/*404.21*/("""}"""),format.raw/*404.22*/(""");
                    let students = await response.json();


                    var tbody = document.createElement("tbody")

                    if(students.length === 0)"""),format.raw/*410.46*/("""{"""),format.raw/*410.47*/("""
                        """),format.raw/*411.25*/("""popup.getElementsByClassName("inner-container")[0].innerHTML = "No data";
                        popup.classList.toggle("popped");
                    """),format.raw/*413.21*/("""}"""),format.raw/*413.22*/("""

                    """),format.raw/*415.21*/("""// create row, remove existing rows and append new ones
                    for(var i=0; i<students.length; i++)"""),format.raw/*416.57*/("""{"""),format.raw/*416.58*/("""
                        """),format.raw/*417.25*/("""let id = students[i].id["$oid"]
                        let inst_name = students[i].instituteName
                        let inst_id = students[i].instituteId
                        let inst_contact = students[i].instituteContact
                        let inst_address = students[i].instituteAddress["City"].slice(5,9);

                        let row = tbody.insertRow(i)
                        row.classList.add("std-row");
                        row.setAttribute("data-id", studentId)

                        row.insertCell(0).innerHTML = inst_name
                        row.insertCell(1).innerHTML = inst_id
                        row.insertCell(2).innerHTML = inst_contact
                        row.insertCell(3).innerHTML = inst_address
                        selectRow(row);

                        tbody.appendChild(row)
                        table.tBodies[0].parentNode.replaceChild(tbody,table.tBodies[0])
                    """),format.raw/*435.21*/("""}"""),format.raw/*435.22*/("""
                """),format.raw/*436.17*/("""}"""),format.raw/*436.18*/("""

                """),format.raw/*438.17*/("""Array.from(rows).forEach(e => e.addEventListener("click", sortTable));

                // https://www.w3schools.com/howto/howto_js_sort_table.asp
                function sortTable(event) """),format.raw/*441.43*/("""{"""),format.raw/*441.44*/("""
                    """),format.raw/*442.21*/("""var n = event.target.cellIndex;

                    event.target.parentNode.querySelectorAll("th").forEach(rowHead => """),format.raw/*444.87*/("""{"""),format.raw/*444.88*/("""
                        """),format.raw/*445.25*/("""if(rowHead != event.target)"""),format.raw/*445.52*/("""{"""),format.raw/*445.53*/("""
                            """),format.raw/*446.29*/("""rowHead.classList.remove("highlight")
                        """),format.raw/*447.25*/("""}"""),format.raw/*447.26*/(""" """),format.raw/*447.27*/("""else """),format.raw/*447.32*/("""{"""),format.raw/*447.33*/("""
                            """),format.raw/*448.29*/("""event.target.classList.toggle("highlight")
                        """),format.raw/*449.25*/("""}"""),format.raw/*449.26*/("""
                    """),format.raw/*450.21*/("""}"""),format.raw/*450.22*/(""")

                    event.target.parentNode.classList.toggle("rotate");
                    var switching, i, x, y, shouldSwitch, dir, switchcount = 0;

                    switching = true;
                    // Set the sorting direction to ascending:
                    dir = "asc";
                    /* Make a loop that will continue until
                    no switching has been done: */
                    while (switching) """),format.raw/*460.39*/("""{"""),format.raw/*460.40*/("""
                        """),format.raw/*461.25*/("""// Start by saying: no switching is done:
                        switching = false;
                        rows = table.rows;
                        /* Loop through all table rows (except the
                        first, which contains table headers): */
                        for (i = 1; i < (rows.length - 1); i++) """),format.raw/*466.65*/("""{"""),format.raw/*466.66*/("""
                            """),format.raw/*467.29*/("""// Start by saying there should be no switching:
                            shouldSwitch = false;
                            /* Get the two elements you want to compare,
                            one from current row and one from the next: */
                            x = rows[i].getElementsByTagName("TD")[n];
                            y = rows[i + 1].getElementsByTagName("TD")[n];
                            /* Check if the two rows should switch place,
                            based on the direction, asc or desc: */
                            if (dir == "asc") """),format.raw/*475.47*/("""{"""),format.raw/*475.48*/("""
                                """),format.raw/*476.33*/("""if (x.innerHTML.toLowerCase() > y.innerHTML.toLowerCase()) """),format.raw/*476.92*/("""{"""),format.raw/*476.93*/("""
                                    """),format.raw/*477.37*/("""// If so, mark as a switch and break the loop:
                                    shouldSwitch = true;
                                    break;
                                """),format.raw/*480.33*/("""}"""),format.raw/*480.34*/("""
                            """),format.raw/*481.29*/("""}"""),format.raw/*481.30*/(""" """),format.raw/*481.31*/("""else if (dir == "desc") """),format.raw/*481.55*/("""{"""),format.raw/*481.56*/("""
                                """),format.raw/*482.33*/("""if (x.innerHTML.toLowerCase() < y.innerHTML.toLowerCase()) """),format.raw/*482.92*/("""{"""),format.raw/*482.93*/("""
                                    """),format.raw/*483.37*/("""// If so, mark as a switch and break the loop:
                                    shouldSwitch = true;
                                    break;
                                """),format.raw/*486.33*/("""}"""),format.raw/*486.34*/("""
                            """),format.raw/*487.29*/("""}"""),format.raw/*487.30*/("""
                        """),format.raw/*488.25*/("""}"""),format.raw/*488.26*/("""
                        """),format.raw/*489.25*/("""if (shouldSwitch) """),format.raw/*489.43*/("""{"""),format.raw/*489.44*/("""
                            """),format.raw/*490.29*/("""/* If a switch has been marked, make the switch
                            and mark that a switch has been done: */
                            rows[i].parentNode.insertBefore(rows[i + 1], rows[i]);
                            switching = true;
                            // Each time a switch is done, increase this count by 1:
                            switchcount ++;
                        """),format.raw/*496.25*/("""}"""),format.raw/*496.26*/(""" """),format.raw/*496.27*/("""else """),format.raw/*496.32*/("""{"""),format.raw/*496.33*/("""
                            """),format.raw/*497.29*/("""/* If no switching has been done AND the direction is "asc",
                            set the direction to "desc" and run the while loop again. */
                            if (switchcount == 0 && dir == "asc") """),format.raw/*499.67*/("""{"""),format.raw/*499.68*/("""
                                """),format.raw/*500.33*/("""dir = "desc";
                                switching = true;
                            """),format.raw/*502.29*/("""}"""),format.raw/*502.30*/("""
                        """),format.raw/*503.25*/("""}"""),format.raw/*503.26*/("""
                    """),format.raw/*504.21*/("""}"""),format.raw/*504.22*/("""
                """),format.raw/*505.17*/("""}"""),format.raw/*505.18*/("""



            """),format.raw/*509.13*/("""</script>
</body>
</html>
""")))}))
      }
    }
  }

  def render(paginatedList:Paginator[StudentInstitute]): play.twirl.api.HtmlFormat.Appendable = apply(paginatedList)

  def f:((Paginator[StudentInstitute]) => play.twirl.api.HtmlFormat.Appendable) = (paginatedList) => apply(paginatedList)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/instituteList.scala.html
                  HASH: a6d049917d82b702a5c608e895f5c248cb8e5332
                  MATRIX: 432->1|809->47|931->137|942->141|1037->91|1068->134|1096->206|1124->209|1141->218|1179->219|1207->221|1387->373|1416->374|1466->396|1531->433|1560->434|1606->452|1638->456|1667->457|1717->479|1773->507|1802->508|1852->530|1885->535|1914->536|1968->562|2082->648|2111->649|2161->671|2196->678|2225->679|2279->705|2443->841|2472->842|2522->864|2556->870|2585->871|2639->897|2981->1211|3010->1212|3060->1234|3097->1243|3126->1244|3180->1270|3298->1360|3327->1361|3379->1385|3428->1406|3457->1407|3511->1433|4023->1917|4052->1918|4102->1940|4137->1947|4166->1948|4220->1974|4284->2010|4313->2011|4361->2031|4406->2048|4435->2049|4485->2071|4910->2468|4939->2469|4985->2487|5033->2507|5062->2508|5112->2530|5177->2567|5206->2568|5254->2588|5307->2613|5336->2614|5386->2636|5449->2671|5478->2672|5524->2690|5587->2725|5616->2726|5666->2748|5774->2828|5803->2829|5851->2849|5903->2873|5932->2874|5982->2896|6047->2933|6076->2934|6130->2960|6170->2972|6199->2973|6480->3226|6509->3227|6581->3271|6610->3272|6664->3298|6775->3381|6804->3382|6855->3404|6900->3420|6930->3421|6985->3447|7050->3483|7080->3484|7129->3504|7180->3526|7210->3527|7261->3549|7444->3703|7474->3704|7523->3724|7575->3747|7605->3748|7656->3770|7806->3891|7836->3892|7889->3916|7927->3925|7957->3926|8012->3952|8076->3987|8106->3988|8159->4012|8200->4024|8230->4025|8285->4051|8526->4263|8556->4264|8609->4288|8650->4300|8680->4301|8735->4327|8938->4501|8968->4502|9015->4520|9054->4530|9084->4531|9135->4553|9250->4639|9280->4640|9327->4658|9369->4671|9399->4672|9450->4694|9712->4927|9742->4928|9791->4948|9848->4976|9878->4977|9929->4999|10019->5060|10049->5061|10098->5081|10152->5106|10182->5107|10233->5129|10323->5190|10353->5191|10400->5209|10446->5226|10476->5227|10527->5249|10600->5293|10630->5294|10677->5312|10716->5322|10746->5323|10797->5345|10872->5391|10902->5392|10945->5406|15171->9604|15217->9633|15257->9634|15295->9644|15353->9674|15364->9675|15398->9687|15443->9756|15486->9770|15537->9793|15548->9794|15584->9808|15627->9822|15679->9846|15690->9847|15724->9859|15776->9883|15787->9884|15826->9901|15896->9943|15907->9944|15958->9973|16005->9991|16053->10011|16064->10012|16119->10045|16162->10059|16225->10090|16263->10100|17152->11022|17200->11141|17247->11218|17298->11303|17350->11463|17401->11518|17452->11577|17500->11895|17551->11959|17603->12343|17654->12406|17703->12461|17746->12475|19538->14239|19561->14252|19584->14265|19633->14275|19671->14285|19709->14295|19741->14305|20221->14765|20241->14775|20281->14776|20319->14786|20821->15256|20862->15269|20946->15336|20987->15338|21026->15349|21055->15368|21096->15370|21134->15380|21172->15390|21210->15406|21332->15499|21365->15509|21412->15524|21455->15535|21496->15548|21519->15561|21542->15574|21591->15584|21629->15594|21667->15604|21699->15614|22178->16073|22198->16083|22239->16085|22277->16095|22787->16573|22821->16579|24070->17799|24100->17800|24151->17822|24223->17865|24253->17866|24308->17892|24487->18042|24517->18043|24576->18073|24965->18433|24995->18434|25048->18458|25078->18459|25127->18479|25157->18480|25206->18500|25386->18651|25416->18652|25467->18674|25547->18725|25577->18726|25626->18746|25689->18780|25719->18781|25770->18803|25855->18859|25885->18860|25934->18880|25989->18906|26019->18907|26070->18929|26123->18954|26139->18960|26190->18989|26238->19008|26268->19009|26317->19029|26372->19055|26402->19056|26453->19078|26583->19179|26613->19180|26668->19206|26745->19254|26775->19255|26813->19264|26843->19265|26896->19289|26926->19290|26973->19308|27003->19309|27052->19329|27111->19359|27141->19360|27192->19382|27231->19392|27261->19393|27316->19419|27395->19469|27425->19470|27463->19479|27493->19480|27546->19504|27576->19505|27606->19506|27639->19510|27669->19511|27724->19537|27813->19597|27843->19598|27890->19616|27920->19617|27969->19637|28024->19663|28054->19664|28105->19686|28234->19786|28264->19787|28319->19813|28408->19873|28438->19874|28485->19892|28515->19893|28564->19913|28635->19955|28665->19956|28716->19978|28831->20064|28861->20065|28944->20119|28974->20120|29025->20142|29102->20190|29132->20191|29162->20192|29192->20193|29224->20196|29254->20197|29309->20223|29373->20258|29403->20259|29611->20438|29641->20439|29696->20465|29879->20619|29909->20620|29962->20644|30104->20757|30134->20758|30189->20784|31189->21755|31219->21756|31266->21774|31296->21775|31345->21795|31566->21987|31596->21988|31647->22010|31797->22131|31827->22132|31882->22158|31938->22185|31968->22186|32027->22216|32119->22279|32149->22280|32179->22281|32213->22286|32243->22287|32302->22317|32399->22385|32429->22386|32480->22408|32510->22409|32988->22858|33018->22859|33073->22885|33431->23214|33461->23215|33520->23245|34138->23834|34168->23835|34231->23869|34319->23928|34349->23929|34416->23967|34627->24149|34657->24150|34716->24180|34746->24181|34776->24182|34829->24206|34859->24207|34922->24241|35010->24300|35040->24301|35107->24339|35318->24521|35348->24522|35407->24552|35437->24553|35492->24579|35522->24580|35577->24606|35624->24624|35654->24625|35713->24655|36147->25060|36177->25061|36207->25062|36241->25067|36271->25068|36330->25098|36577->25316|36607->25317|36670->25351|36793->25445|36823->25446|36878->25472|36908->25473|36959->25495|36989->25496|37036->25514|37066->25515|37115->25535
                  LINES: 17->1|22->2|26->5|26->5|29->2|31->4|32->7|33->8|33->8|33->8|34->9|40->15|40->15|41->16|42->17|42->17|43->18|43->18|43->18|44->19|45->20|45->20|46->21|46->21|46->21|47->22|49->24|49->24|50->25|50->25|50->25|51->26|54->29|54->29|55->30|55->30|55->30|56->31|63->38|63->38|64->39|64->39|64->39|65->40|67->42|67->42|69->44|69->44|69->44|70->45|81->56|81->56|82->57|82->57|82->57|83->58|84->59|84->59|86->61|86->61|86->61|87->62|96->71|96->71|97->72|97->72|97->72|98->73|99->74|99->74|101->76|101->76|101->76|102->77|103->78|103->78|104->79|104->79|104->79|105->80|107->82|107->82|109->84|109->84|109->84|110->85|111->86|111->86|114->89|114->89|114->89|120->95|120->95|121->96|121->96|122->97|124->99|124->99|125->100|125->100|125->100|126->101|127->102|127->102|129->104|129->104|129->104|130->105|134->109|134->109|136->111|136->111|136->111|137->112|140->115|140->115|142->117|142->117|142->117|143->118|144->119|144->119|146->121|146->121|146->121|147->122|152->127|152->127|154->129|154->129|154->129|155->130|159->134|159->134|160->135|160->135|160->135|161->136|163->138|163->138|164->139|164->139|164->139|165->140|171->146|171->146|173->148|173->148|173->148|174->149|176->151|176->151|178->153|178->153|178->153|179->154|181->156|181->156|182->157|182->157|182->157|183->158|184->159|184->159|185->160|185->160|185->160|186->161|187->162|187->162|188->163|234->209|234->209|234->209|235->210|235->210|235->210|235->210|236->211|237->212|238->213|238->213|238->213|239->214|240->215|240->215|240->215|241->216|241->216|241->216|243->218|243->218|243->218|244->219|245->220|245->220|245->220|246->221|248->223|249->224|261->236|262->237|263->238|264->239|265->240|266->241|267->242|268->243|269->244|270->245|271->246|273->248|274->249|306->281|306->281|306->281|306->281|307->282|307->282|307->282|311->286|311->286|311->286|312->287|316->291|318->293|318->293|318->293|319->294|319->294|319->294|320->295|320->295|320->295|320->295|320->295|321->296|322->297|324->299|324->299|324->299|324->299|325->300|325->300|325->300|329->304|329->304|329->304|330->305|334->309|335->310|364->339|364->339|365->340|365->340|365->340|366->341|369->344|369->344|370->345|376->351|376->351|377->352|377->352|378->353|378->353|380->355|385->360|385->360|386->361|387->362|387->362|389->364|389->364|389->364|390->365|391->366|391->366|393->368|393->368|393->368|394->369|394->369|394->369|394->369|395->370|395->370|397->372|397->372|397->372|398->373|400->375|400->375|401->376|401->376|401->376|401->376|401->376|402->377|402->377|403->378|403->378|405->380|405->380|405->380|406->381|406->381|406->381|407->382|407->382|407->382|407->382|407->382|408->383|408->383|408->383|408->383|408->383|409->384|410->385|410->385|411->386|411->386|413->388|413->388|413->388|414->389|416->391|416->391|417->392|418->393|418->393|419->394|419->394|421->396|421->396|421->396|422->397|424->399|424->399|426->401|426->401|427->402|427->402|427->402|427->402|427->402|427->402|427->402|428->403|429->404|429->404|435->410|435->410|436->411|438->413|438->413|440->415|441->416|441->416|442->417|460->435|460->435|461->436|461->436|463->438|466->441|466->441|467->442|469->444|469->444|470->445|470->445|470->445|471->446|472->447|472->447|472->447|472->447|472->447|473->448|474->449|474->449|475->450|475->450|485->460|485->460|486->461|491->466|491->466|492->467|500->475|500->475|501->476|501->476|501->476|502->477|505->480|505->480|506->481|506->481|506->481|506->481|506->481|507->482|507->482|507->482|508->483|511->486|511->486|512->487|512->487|513->488|513->488|514->489|514->489|514->489|515->490|521->496|521->496|521->496|521->496|521->496|522->497|524->499|524->499|525->500|527->502|527->502|528->503|528->503|529->504|529->504|530->505|530->505|534->509
                  -- GENERATED --
              */
          