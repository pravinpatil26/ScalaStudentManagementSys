
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
        <th>Institute Address
<!--            <p>city, district</p>-->
        </th>

        </thead>
        <tbody>
        """),_display_(/*211.10*/for(d <- paginatedList.items) yield /*211.39*/{_display_(Seq[Any](format.raw/*211.40*/("""
        """),format.raw/*212.9*/("""<tr class="std-row" data-id=""""),_display_(/*212.39*/d/*212.40*/.instituteId),format.raw/*212.52*/("""">
            """),format.raw/*213.66*/("""
            """),format.raw/*214.13*/("""<td>
                """),_display_(/*215.18*/d/*215.19*/.instituteName),format.raw/*215.33*/("""
            """),format.raw/*216.13*/("""</td>
            <td>"""),_display_(/*217.18*/d/*217.19*/.instituteId),format.raw/*217.31*/("""</td>
            <td>"""),_display_(/*218.18*/d/*218.19*/.instituteContact),format.raw/*218.36*/("""</td>
            <td>
                """),_display_(/*220.18*/d/*220.19*/.instituteAddress.get("City")),format.raw/*220.48*/("""
                """),format.raw/*221.17*/(""",
                """),_display_(/*222.18*/d/*222.19*/.instituteAddress.get("District")),format.raw/*222.52*/("""
            """),format.raw/*223.13*/("""</td>
        </tr>
        """)))}),format.raw/*225.10*/("""
        """),format.raw/*226.9*/("""</tbody>
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
                """),format.raw/*238.79*/("""
                """),format.raw/*239.118*/("""
                """),format.raw/*240.76*/("""
                    """),format.raw/*241.84*/("""
                    """),format.raw/*242.159*/("""
                    """),format.raw/*243.54*/("""
                    """),format.raw/*244.58*/("""
                """),format.raw/*245.317*/("""
                    """),format.raw/*246.63*/("""
                    """),format.raw/*247.383*/("""
                    """),format.raw/*248.62*/("""

                """),format.raw/*250.52*/("""
            """),format.raw/*251.13*/("""</div>
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

        """),_display_(/*283.10*/paginatedList/*283.23*/.prevPage.map/*283.36*/ { page =>_display_(Seq[Any](format.raw/*283.46*/("""
        """),format.raw/*284.9*/("""<a href=""""),_display_(/*284.19*/link(page)),format.raw/*284.29*/("""" class="flex items-center px-4 py-2 text-gray-500 bg-gray-300 rounded-md">
            <svg aria-hidden="true" class="mr-2 w-5 h-5" fill="currentColor" viewBox="0 0 20 20" xmlns="http://www.w3.org/2000/svg"><path fill-rule="evenodd" d="M7.707 14.707a1 1 0 01-1.414 0l-4-4a1 1 0 010-1.414l4-4a1 1 0 011.414 1.414L5.414 9H17a1 1 0 110 2H5.414l2.293 2.293a1 1 0 010 1.414z" clip-rule="evenodd"></path></svg>
<!--            Previous-->
        </a>
        """)))}/*288.10*/.getOrElse/*288.20*/{_display_(Seq[Any](format.raw/*288.21*/("""
        """),format.raw/*289.9*/("""<a disabled class="flex items-center px-4 py-2 text-gray-500 bg-gray-300 rounded-md">
            <svg aria-hidden="true" class="mr-2 w-5 h-5" fill="currentColor" viewBox="0 0 20 20" xmlns="http://www.w3.org/2000/svg"><path fill-rule="evenodd" d="M7.707 14.707a1 1 0 01-1.414 0l-4-4a1 1 0 010-1.414l4-4a1 1 0 011.414 1.414L5.414 9H17a1 1 0 110 2H5.414l2.293 2.293a1 1 0 010 1.414z" clip-rule="evenodd"></path></svg>
<!--            Previous-->
        </a>
        """)))}),format.raw/*293.10*/("""

        """),_display_(/*295.10*/for(pageNumber <- paginatedList.lowbound until paginatedList.high ) yield /*295.77*/ {_display_(Seq[Any](format.raw/*295.79*/("""
        """),_display_(/*296.10*/if(pageNumber != 0)/*296.29*/ {_display_(Seq[Any](format.raw/*296.31*/("""
        """),format.raw/*297.9*/("""<a href=""""),_display_(/*297.19*/link(pageNumber)),format.raw/*297.35*/("""" class="px-4 py-2 text-gray-700 bg-gray-200 rounded-md hover:bg-blue-400 hover:text-white">"""),_display_(/*297.128*/pageNumber),format.raw/*297.138*/("""</a>
        """)))}),format.raw/*298.10*/("""
        """)))}),format.raw/*299.10*/("""

        """),_display_(/*301.10*/paginatedList/*301.23*/.nextPage.map/*301.36*/ { page =>_display_(Seq[Any](format.raw/*301.46*/("""
        """),format.raw/*302.9*/("""<a href=""""),_display_(/*302.19*/link(page)),format.raw/*302.29*/("""" class="flex items-center px-4 py-2 text-gray-500 bg-gray-300 rounded-md">
<!--            Next-->
            <svg aria-hidden="true" class="ml-2 w-5 h-5" fill="currentColor" viewBox="0 0 20 20" xmlns="http://www.w3.org/2000/svg"><path fill-rule="evenodd" d="M12.293 5.293a1 1 0 011.414 0l4 4a1 1 0 010 1.414l-4 4a1 1 0 01-1.414-1.414L14.586 11H3a1 1 0 110-2h11.586l-2.293-2.293a1 1 0 010-1.414z" clip-rule="evenodd"></path></svg>
        </a>
        """)))}/*306.10*/.getOrElse/*306.20*/ {_display_(Seq[Any](format.raw/*306.22*/("""
        """),format.raw/*307.9*/("""<a href="#" disabled class="flex items-center px-4 py-2 text-gray-500 bg-gray-300 rounded-md">
<!--            Next-->
            <svg aria-hidden="true" class="ml-2 w-5 h-5" fill="currentColor" viewBox="0 0 20 20" xmlns="http://www.w3.org/2000/svg"><path fill-rule="evenodd" d="M12.293 5.293a1 1 0 011.414 0l4 4a1 1 0 010 1.414l-4 4a1 1 0 01-1.414-1.414L14.586 11H3a1 1 0 110-2h11.586l-2.293-2.293a1 1 0 010-1.414z" clip-rule="evenodd"></path></svg>
        </a>
        """)))}),format.raw/*311.10*/("""
    """),format.raw/*312.5*/("""</div>

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




                function selectRow(row) """),format.raw/*341.41*/("""{"""),format.raw/*341.42*/("""
                    """),format.raw/*342.21*/("""row.addEventListener("click", function (e) """),format.raw/*342.64*/("""{"""),format.raw/*342.65*/("""
                        """),format.raw/*343.25*/("""let select_row = e.target.parentElement;

                        // select only one row
                        Array.from(std_row).forEach(el => """),format.raw/*346.59*/("""{"""),format.raw/*346.60*/("""
                            """),format.raw/*347.29*/("""if (el != this)
                                el.classList.remove("selected")
                            else
                                el.classList.toggle("selected") ?
                                        studentId = select_row.getAttribute("data-id") :
                                        studentId = undefined
                        """),format.raw/*353.25*/("""}"""),format.raw/*353.26*/(""");
                    """),format.raw/*354.21*/("""}"""),format.raw/*354.22*/(""");
                """),format.raw/*355.17*/("""}"""),format.raw/*355.18*/("""

                """),format.raw/*357.17*/("""// Add eventlistener to all rows
                Array.from(std_row).forEach(row => selectRow(row));



                close_btn.onclick = () => """),format.raw/*362.43*/("""{"""),format.raw/*362.44*/("""
                    """),format.raw/*363.21*/("""popup.classList.toggle("popped");
                """),format.raw/*364.17*/("""}"""),format.raw/*364.18*/("""

                """),format.raw/*366.17*/("""close_btn_delete.onclick = (e) => """),format.raw/*366.51*/("""{"""),format.raw/*366.52*/("""
                    """),format.raw/*367.21*/("""deletePopup.classList.toggle("popped")
                """),format.raw/*368.17*/("""}"""),format.raw/*368.18*/("""

                """),format.raw/*370.17*/("""insertBtn.onclick = () => """),format.raw/*370.43*/("""{"""),format.raw/*370.44*/("""
                    """),format.raw/*371.21*/("""window.location.href = """"),_display_(/*371.46*/routes/*371.52*/.Application.instituteIndex()),format.raw/*371.81*/(""""
                """),format.raw/*372.17*/("""}"""),format.raw/*372.18*/("""

                """),format.raw/*374.17*/("""updateBtn.onclick = () => """),format.raw/*374.43*/("""{"""),format.raw/*374.44*/("""
                    """),format.raw/*375.21*/("""if(! studentId)
                        popup.classList.toggle("popped");
                    else """),format.raw/*377.26*/("""{"""),format.raw/*377.27*/("""
                        """),format.raw/*378.25*/("""location.href = `/instituteView?institute_code=$"""),format.raw/*378.73*/("""{"""),format.raw/*378.74*/("""studentId"""),format.raw/*378.83*/("""}"""),format.raw/*378.84*/("""`;
                    """),format.raw/*379.21*/("""}"""),format.raw/*379.22*/("""
                """),format.raw/*380.17*/("""}"""),format.raw/*380.18*/("""

                """),format.raw/*382.17*/("""function confirmDelete(intent)"""),format.raw/*382.47*/("""{"""),format.raw/*382.48*/("""
                    """),format.raw/*383.21*/("""if(intent)"""),format.raw/*383.31*/("""{"""),format.raw/*383.32*/("""
                        """),format.raw/*384.25*/("""location.href = `/instituteDelete?institute_code=$"""),format.raw/*384.75*/("""{"""),format.raw/*384.76*/("""studentId"""),format.raw/*384.85*/("""}"""),format.raw/*384.86*/("""`;
                    """),format.raw/*385.21*/("""}"""),format.raw/*385.22*/(""" """),format.raw/*385.23*/("""else"""),format.raw/*385.27*/("""{"""),format.raw/*385.28*/("""
                        """),format.raw/*386.25*/("""deletePopup.classList.toggle("popped")
                    """),format.raw/*387.21*/("""}"""),format.raw/*387.22*/("""
                """),format.raw/*388.17*/("""}"""),format.raw/*388.18*/("""

                """),format.raw/*390.17*/("""deleteBtn.onclick = () => """),format.raw/*390.43*/("""{"""),format.raw/*390.44*/("""
                    """),format.raw/*391.21*/("""if(!studentId)
                        popup.classList.toggle("popped");
                    else """),format.raw/*393.26*/("""{"""),format.raw/*393.27*/("""
                        """),format.raw/*394.25*/("""deletePopup.classList.toggle("popped")
                    """),format.raw/*395.21*/("""}"""),format.raw/*395.22*/("""
                """),format.raw/*396.17*/("""}"""),format.raw/*396.18*/("""

                """),format.raw/*398.17*/("""search_btn.addEventListener("click", e => """),format.raw/*398.59*/("""{"""),format.raw/*398.60*/("""
                    """),format.raw/*399.21*/("""let q = default_search.value
                    renderAndFetch(q);
                """),format.raw/*401.17*/("""}"""),format.raw/*401.18*/(""");

                async function renderAndFetch(q)"""),format.raw/*403.49*/("""{"""),format.raw/*403.50*/("""
                    """),format.raw/*404.21*/("""let response = await fetch(`/instituteSearch?q=$"""),format.raw/*404.69*/("""{"""),format.raw/*404.70*/("""q"""),format.raw/*404.71*/("""}"""),format.raw/*404.72*/("""`, """),format.raw/*404.75*/("""{"""),format.raw/*404.76*/("""
                        """),format.raw/*405.25*/("""method: "GET"
                    """),format.raw/*406.21*/("""}"""),format.raw/*406.22*/(""");
                    let students = await response.json();


                    var tbody = document.createElement("tbody")

                    if(students.length === 0)"""),format.raw/*412.46*/("""{"""),format.raw/*412.47*/("""
                        """),format.raw/*413.25*/("""popup.getElementsByClassName("inner-container")[0].innerHTML = "No data";
                        popup.classList.toggle("popped");
                    """),format.raw/*415.21*/("""}"""),format.raw/*415.22*/("""

                    """),format.raw/*417.21*/("""// create row, remove existing rows and append new ones
                    for(var i=0; i<students.length; i++)"""),format.raw/*418.57*/("""{"""),format.raw/*418.58*/("""
                        """),format.raw/*419.25*/("""let id = students[i].id["$oid"]
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
                    """),format.raw/*437.21*/("""}"""),format.raw/*437.22*/("""
                """),format.raw/*438.17*/("""}"""),format.raw/*438.18*/("""

                """),format.raw/*440.17*/("""Array.from(rows).forEach(e => e.addEventListener("click", sortTable));

                // https://www.w3schools.com/howto/howto_js_sort_table.asp
                function sortTable(event) """),format.raw/*443.43*/("""{"""),format.raw/*443.44*/("""
                    """),format.raw/*444.21*/("""var n = event.target.cellIndex;

                    event.target.parentNode.querySelectorAll("th").forEach(rowHead => """),format.raw/*446.87*/("""{"""),format.raw/*446.88*/("""
                        """),format.raw/*447.25*/("""if(rowHead != event.target)"""),format.raw/*447.52*/("""{"""),format.raw/*447.53*/("""
                            """),format.raw/*448.29*/("""rowHead.classList.remove("highlight")
                        """),format.raw/*449.25*/("""}"""),format.raw/*449.26*/(""" """),format.raw/*449.27*/("""else """),format.raw/*449.32*/("""{"""),format.raw/*449.33*/("""
                            """),format.raw/*450.29*/("""event.target.classList.toggle("highlight")
                        """),format.raw/*451.25*/("""}"""),format.raw/*451.26*/("""
                    """),format.raw/*452.21*/("""}"""),format.raw/*452.22*/(""")

                    event.target.parentNode.classList.toggle("rotate");
                    var switching, i, x, y, shouldSwitch, dir, switchcount = 0;

                    switching = true;
                    // Set the sorting direction to ascending:
                    dir = "asc";
                    /* Make a loop that will continue until
                    no switching has been done: */
                    while (switching) """),format.raw/*462.39*/("""{"""),format.raw/*462.40*/("""
                        """),format.raw/*463.25*/("""// Start by saying: no switching is done:
                        switching = false;
                        rows = table.rows;
                        /* Loop through all table rows (except the
                        first, which contains table headers): */
                        for (i = 1; i < (rows.length - 1); i++) """),format.raw/*468.65*/("""{"""),format.raw/*468.66*/("""
                            """),format.raw/*469.29*/("""// Start by saying there should be no switching:
                            shouldSwitch = false;
                            /* Get the two elements you want to compare,
                            one from current row and one from the next: */
                            x = rows[i].getElementsByTagName("TD")[n];
                            y = rows[i + 1].getElementsByTagName("TD")[n];
                            /* Check if the two rows should switch place,
                            based on the direction, asc or desc: */
                            if (dir == "asc") """),format.raw/*477.47*/("""{"""),format.raw/*477.48*/("""
                                """),format.raw/*478.33*/("""if (x.innerHTML.toLowerCase() > y.innerHTML.toLowerCase()) """),format.raw/*478.92*/("""{"""),format.raw/*478.93*/("""
                                    """),format.raw/*479.37*/("""// If so, mark as a switch and break the loop:
                                    shouldSwitch = true;
                                    break;
                                """),format.raw/*482.33*/("""}"""),format.raw/*482.34*/("""
                            """),format.raw/*483.29*/("""}"""),format.raw/*483.30*/(""" """),format.raw/*483.31*/("""else if (dir == "desc") """),format.raw/*483.55*/("""{"""),format.raw/*483.56*/("""
                                """),format.raw/*484.33*/("""if (x.innerHTML.toLowerCase() < y.innerHTML.toLowerCase()) """),format.raw/*484.92*/("""{"""),format.raw/*484.93*/("""
                                    """),format.raw/*485.37*/("""// If so, mark as a switch and break the loop:
                                    shouldSwitch = true;
                                    break;
                                """),format.raw/*488.33*/("""}"""),format.raw/*488.34*/("""
                            """),format.raw/*489.29*/("""}"""),format.raw/*489.30*/("""
                        """),format.raw/*490.25*/("""}"""),format.raw/*490.26*/("""
                        """),format.raw/*491.25*/("""if (shouldSwitch) """),format.raw/*491.43*/("""{"""),format.raw/*491.44*/("""
                            """),format.raw/*492.29*/("""/* If a switch has been marked, make the switch
                            and mark that a switch has been done: */
                            rows[i].parentNode.insertBefore(rows[i + 1], rows[i]);
                            switching = true;
                            // Each time a switch is done, increase this count by 1:
                            switchcount ++;
                        """),format.raw/*498.25*/("""}"""),format.raw/*498.26*/(""" """),format.raw/*498.27*/("""else """),format.raw/*498.32*/("""{"""),format.raw/*498.33*/("""
                            """),format.raw/*499.29*/("""/* If no switching has been done AND the direction is "asc",
                            set the direction to "desc" and run the while loop again. */
                            if (switchcount == 0 && dir == "asc") """),format.raw/*501.67*/("""{"""),format.raw/*501.68*/("""
                                """),format.raw/*502.33*/("""dir = "desc";
                                switching = true;
                            """),format.raw/*504.29*/("""}"""),format.raw/*504.30*/("""
                        """),format.raw/*505.25*/("""}"""),format.raw/*505.26*/("""
                    """),format.raw/*506.21*/("""}"""),format.raw/*506.22*/("""
                """),format.raw/*507.17*/("""}"""),format.raw/*507.18*/("""



            """),format.raw/*511.13*/("""</script>
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
                  HASH: a73996f47f3a141a2d6fedce5f4861c449f27aeb
                  MATRIX: 432->1|809->47|931->137|942->141|1037->91|1068->134|1096->206|1124->209|1141->218|1179->219|1207->221|1387->373|1416->374|1466->396|1531->433|1560->434|1606->452|1638->456|1667->457|1717->479|1773->507|1802->508|1852->530|1885->535|1914->536|1968->562|2082->648|2111->649|2161->671|2196->678|2225->679|2279->705|2443->841|2472->842|2522->864|2556->870|2585->871|2639->897|2981->1211|3010->1212|3060->1234|3097->1243|3126->1244|3180->1270|3298->1360|3327->1361|3379->1385|3428->1406|3457->1407|3511->1433|4023->1917|4052->1918|4102->1940|4137->1947|4166->1948|4220->1974|4284->2010|4313->2011|4361->2031|4406->2048|4435->2049|4485->2071|4910->2468|4939->2469|4985->2487|5033->2507|5062->2508|5112->2530|5177->2567|5206->2568|5254->2588|5307->2613|5336->2614|5386->2636|5449->2671|5478->2672|5524->2690|5587->2725|5616->2726|5666->2748|5774->2828|5803->2829|5851->2849|5903->2873|5932->2874|5982->2896|6047->2933|6076->2934|6130->2960|6170->2972|6199->2973|6480->3226|6509->3227|6581->3271|6610->3272|6664->3298|6775->3381|6804->3382|6855->3404|6900->3420|6930->3421|6985->3447|7050->3483|7080->3484|7129->3504|7180->3526|7210->3527|7261->3549|7444->3703|7474->3704|7523->3724|7575->3747|7605->3748|7656->3770|7806->3891|7836->3892|7889->3916|7927->3925|7957->3926|8012->3952|8076->3987|8106->3988|8159->4012|8200->4024|8230->4025|8285->4051|8526->4263|8556->4264|8609->4288|8650->4300|8680->4301|8735->4327|8938->4501|8968->4502|9015->4520|9054->4530|9084->4531|9135->4553|9250->4639|9280->4640|9327->4658|9369->4671|9399->4672|9450->4694|9712->4927|9742->4928|9791->4948|9848->4976|9878->4977|9929->4999|10019->5060|10049->5061|10098->5081|10152->5106|10182->5107|10233->5129|10323->5190|10353->5191|10400->5209|10446->5226|10476->5227|10527->5249|10600->5293|10630->5294|10677->5312|10716->5322|10746->5323|10797->5345|10872->5391|10902->5392|10945->5406|15223->9656|15269->9685|15309->9686|15347->9696|15405->9726|15416->9727|15450->9739|15495->9808|15538->9822|15589->9845|15600->9846|15636->9860|15679->9874|15731->9898|15742->9899|15776->9911|15828->9935|15839->9936|15878->9953|15948->9995|15959->9996|16010->10025|16057->10043|16105->10063|16116->10064|16171->10097|16214->10111|16277->10142|16315->10152|17204->11074|17252->11193|17299->11270|17350->11355|17402->11515|17453->11570|17504->11629|17552->11947|17603->12011|17655->12395|17706->12458|17755->12513|17798->12527|19590->14291|19613->14304|19636->14317|19685->14327|19723->14337|19761->14347|19793->14357|20273->14817|20293->14827|20333->14828|20371->14838|20873->15308|20914->15321|20998->15388|21039->15390|21078->15401|21107->15420|21148->15422|21186->15432|21224->15442|21262->15458|21384->15551|21417->15561|21464->15576|21507->15587|21548->15600|21571->15613|21594->15626|21643->15636|21681->15646|21719->15656|21751->15666|22230->16125|22250->16135|22291->16137|22329->16147|22839->16625|22873->16631|24122->17851|24152->17852|24203->17874|24275->17917|24305->17918|24360->17944|24539->18094|24569->18095|24628->18125|25017->18485|25047->18486|25100->18510|25130->18511|25179->18531|25209->18532|25258->18552|25438->18703|25468->18704|25519->18726|25599->18777|25629->18778|25678->18798|25741->18832|25771->18833|25822->18855|25907->18911|25937->18912|25986->18932|26041->18958|26071->18959|26122->18981|26175->19006|26191->19012|26242->19041|26290->19060|26320->19061|26369->19081|26424->19107|26454->19108|26505->19130|26635->19231|26665->19232|26720->19258|26797->19306|26827->19307|26865->19316|26895->19317|26948->19341|26978->19342|27025->19360|27055->19361|27104->19381|27163->19411|27193->19412|27244->19434|27283->19444|27313->19445|27368->19471|27447->19521|27477->19522|27515->19531|27545->19532|27598->19556|27628->19557|27658->19558|27691->19562|27721->19563|27776->19589|27865->19649|27895->19650|27942->19668|27972->19669|28021->19689|28076->19715|28106->19716|28157->19738|28286->19838|28316->19839|28371->19865|28460->19925|28490->19926|28537->19944|28567->19945|28616->19965|28687->20007|28717->20008|28768->20030|28883->20116|28913->20117|28996->20171|29026->20172|29077->20194|29154->20242|29184->20243|29214->20244|29244->20245|29276->20248|29306->20249|29361->20275|29425->20310|29455->20311|29663->20490|29693->20491|29748->20517|29931->20671|29961->20672|30014->20696|30156->20809|30186->20810|30241->20836|31241->21807|31271->21808|31318->21826|31348->21827|31397->21847|31618->22039|31648->22040|31699->22062|31849->22183|31879->22184|31934->22210|31990->22237|32020->22238|32079->22268|32171->22331|32201->22332|32231->22333|32265->22338|32295->22339|32354->22369|32451->22437|32481->22438|32532->22460|32562->22461|33040->22910|33070->22911|33125->22937|33483->23266|33513->23267|33572->23297|34190->23886|34220->23887|34283->23921|34371->23980|34401->23981|34468->24019|34679->24201|34709->24202|34768->24232|34798->24233|34828->24234|34881->24258|34911->24259|34974->24293|35062->24352|35092->24353|35159->24391|35370->24573|35400->24574|35459->24604|35489->24605|35544->24631|35574->24632|35629->24658|35676->24676|35706->24677|35765->24707|36199->25112|36229->25113|36259->25114|36293->25119|36323->25120|36382->25150|36629->25368|36659->25369|36722->25403|36845->25497|36875->25498|36930->25524|36960->25525|37011->25547|37041->25548|37088->25566|37118->25567|37167->25587
                  LINES: 17->1|22->2|26->5|26->5|29->2|31->4|32->7|33->8|33->8|33->8|34->9|40->15|40->15|41->16|42->17|42->17|43->18|43->18|43->18|44->19|45->20|45->20|46->21|46->21|46->21|47->22|49->24|49->24|50->25|50->25|50->25|51->26|54->29|54->29|55->30|55->30|55->30|56->31|63->38|63->38|64->39|64->39|64->39|65->40|67->42|67->42|69->44|69->44|69->44|70->45|81->56|81->56|82->57|82->57|82->57|83->58|84->59|84->59|86->61|86->61|86->61|87->62|96->71|96->71|97->72|97->72|97->72|98->73|99->74|99->74|101->76|101->76|101->76|102->77|103->78|103->78|104->79|104->79|104->79|105->80|107->82|107->82|109->84|109->84|109->84|110->85|111->86|111->86|114->89|114->89|114->89|120->95|120->95|121->96|121->96|122->97|124->99|124->99|125->100|125->100|125->100|126->101|127->102|127->102|129->104|129->104|129->104|130->105|134->109|134->109|136->111|136->111|136->111|137->112|140->115|140->115|142->117|142->117|142->117|143->118|144->119|144->119|146->121|146->121|146->121|147->122|152->127|152->127|154->129|154->129|154->129|155->130|159->134|159->134|160->135|160->135|160->135|161->136|163->138|163->138|164->139|164->139|164->139|165->140|171->146|171->146|173->148|173->148|173->148|174->149|176->151|176->151|178->153|178->153|178->153|179->154|181->156|181->156|182->157|182->157|182->157|183->158|184->159|184->159|185->160|185->160|185->160|186->161|187->162|187->162|188->163|236->211|236->211|236->211|237->212|237->212|237->212|237->212|238->213|239->214|240->215|240->215|240->215|241->216|242->217|242->217|242->217|243->218|243->218|243->218|245->220|245->220|245->220|246->221|247->222|247->222|247->222|248->223|250->225|251->226|263->238|264->239|265->240|266->241|267->242|268->243|269->244|270->245|271->246|272->247|273->248|275->250|276->251|308->283|308->283|308->283|308->283|309->284|309->284|309->284|313->288|313->288|313->288|314->289|318->293|320->295|320->295|320->295|321->296|321->296|321->296|322->297|322->297|322->297|322->297|322->297|323->298|324->299|326->301|326->301|326->301|326->301|327->302|327->302|327->302|331->306|331->306|331->306|332->307|336->311|337->312|366->341|366->341|367->342|367->342|367->342|368->343|371->346|371->346|372->347|378->353|378->353|379->354|379->354|380->355|380->355|382->357|387->362|387->362|388->363|389->364|389->364|391->366|391->366|391->366|392->367|393->368|393->368|395->370|395->370|395->370|396->371|396->371|396->371|396->371|397->372|397->372|399->374|399->374|399->374|400->375|402->377|402->377|403->378|403->378|403->378|403->378|403->378|404->379|404->379|405->380|405->380|407->382|407->382|407->382|408->383|408->383|408->383|409->384|409->384|409->384|409->384|409->384|410->385|410->385|410->385|410->385|410->385|411->386|412->387|412->387|413->388|413->388|415->390|415->390|415->390|416->391|418->393|418->393|419->394|420->395|420->395|421->396|421->396|423->398|423->398|423->398|424->399|426->401|426->401|428->403|428->403|429->404|429->404|429->404|429->404|429->404|429->404|429->404|430->405|431->406|431->406|437->412|437->412|438->413|440->415|440->415|442->417|443->418|443->418|444->419|462->437|462->437|463->438|463->438|465->440|468->443|468->443|469->444|471->446|471->446|472->447|472->447|472->447|473->448|474->449|474->449|474->449|474->449|474->449|475->450|476->451|476->451|477->452|477->452|487->462|487->462|488->463|493->468|493->468|494->469|502->477|502->477|503->478|503->478|503->478|504->479|507->482|507->482|508->483|508->483|508->483|508->483|508->483|509->484|509->484|509->484|510->485|513->488|513->488|514->489|514->489|515->490|515->490|516->491|516->491|516->491|517->492|523->498|523->498|523->498|523->498|523->498|524->499|526->501|526->501|527->502|529->504|529->504|530->505|530->505|531->506|531->506|532->507|532->507|536->511
                  -- GENERATED --
              */
          