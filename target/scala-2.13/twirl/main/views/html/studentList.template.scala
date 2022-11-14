
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

object studentList extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Paginator[StudentBasic],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(paginatedList: Paginator[StudentBasic]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*5.2*/link/*5.6*/(newPage: Int) = {{
routes.Application.studentList(newPage)
}};
Seq[Any](format.raw/*2.42*/("""

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
    <h1 class="mb-1 text-2xl  tracking-tight leading-none text-gray-900 md:text-4xl lg:text-4xl dark:text-black">Students List</h1>
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

        <th>Name</th>
        <th>Aadhar</th>
        <th>Date of Birth</th>

        </thead>
        <tbody>
        """),_display_(/*208.10*/for(d <- paginatedList.items) yield /*208.39*/{_display_(Seq[Any](format.raw/*208.40*/("""
        """),format.raw/*209.9*/("""<tr class="std-row" data-id='"""),_display_(/*209.39*/d/*209.40*/.aadhar.get("aadhar_no")),format.raw/*209.64*/("""'>
            """),format.raw/*210.66*/("""
            """),format.raw/*211.13*/("""<td>
                """),_display_(/*212.18*/d/*212.19*/.name.get("first_name")),format.raw/*212.42*/("""
                """),_display_(/*213.18*/d/*213.19*/.name.get("middle_name")),format.raw/*213.43*/("""
                """),_display_(/*214.18*/d/*214.19*/.name.get("last_name")),format.raw/*214.41*/("""
            """),format.raw/*215.13*/("""</td>
            <td>"""),_display_(/*216.18*/d/*216.19*/.aadhar.get("aadhar_no")),format.raw/*216.43*/("""</td>
            <td>"""),_display_(/*217.18*/d/*217.19*/.studentDOB.get("student_DOB")),format.raw/*217.49*/("""</td>
        </tr>
        """)))}),format.raw/*219.10*/("""
        """),format.raw/*220.9*/("""</tbody>
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
                """),format.raw/*232.79*/("""
                """),format.raw/*233.118*/("""
                """),format.raw/*234.76*/("""
                    """),format.raw/*235.84*/("""
                    """),format.raw/*236.142*/("""
                    """),format.raw/*237.54*/("""
                    """),format.raw/*238.58*/("""
                """),format.raw/*239.317*/("""
                    """),format.raw/*240.63*/("""
                    """),format.raw/*241.383*/("""
                    """),format.raw/*242.62*/("""

                """),format.raw/*244.52*/("""
            """),format.raw/*245.13*/("""</div>
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

        """),_display_(/*277.10*/paginatedList/*277.23*/.prevPage.map/*277.36*/ { page =>_display_(Seq[Any](format.raw/*277.46*/("""
        """),format.raw/*278.9*/("""<a href=""""),_display_(/*278.19*/link(page)),format.raw/*278.29*/("""" class="flex items-center px-4 py-2 text-gray-500 bg-gray-300 rounded-md">
            <svg aria-hidden="true" class="mr-2 w-5 h-5" fill="currentColor" viewBox="0 0 20 20" xmlns="http://www.w3.org/2000/svg"><path fill-rule="evenodd" d="M7.707 14.707a1 1 0 01-1.414 0l-4-4a1 1 0 010-1.414l4-4a1 1 0 011.414 1.414L5.414 9H17a1 1 0 110 2H5.414l2.293 2.293a1 1 0 010 1.414z" clip-rule="evenodd"></path></svg>
<!--            Previous-->
        </a>
        """)))}/*282.10*/.getOrElse/*282.20*/{_display_(Seq[Any](format.raw/*282.21*/("""
        """),format.raw/*283.9*/("""<a disabled class="flex items-center px-4 py-2 text-gray-500 bg-gray-300 rounded-md">
            <svg aria-hidden="true" class="mr-2 w-5 h-5" fill="currentColor" viewBox="0 0 20 20" xmlns="http://www.w3.org/2000/svg"><path fill-rule="evenodd" d="M7.707 14.707a1 1 0 01-1.414 0l-4-4a1 1 0 010-1.414l4-4a1 1 0 011.414 1.414L5.414 9H17a1 1 0 110 2H5.414l2.293 2.293a1 1 0 010 1.414z" clip-rule="evenodd"></path></svg>
<!--            Previous-->
        </a>
        """)))}),format.raw/*287.10*/("""

        """),_display_(/*289.10*/for(pageNumber <- paginatedList.lowbound until paginatedList.high ) yield /*289.77*/ {_display_(Seq[Any](format.raw/*289.79*/("""
        """),_display_(/*290.10*/if(pageNumber != 0)/*290.29*/ {_display_(Seq[Any](format.raw/*290.31*/("""
        """),format.raw/*291.9*/("""<a href=""""),_display_(/*291.19*/link(pageNumber)),format.raw/*291.35*/("""" class="px-4 py-2 text-gray-700 bg-gray-200 rounded-md hover:bg-blue-400 hover:text-white">"""),_display_(/*291.128*/pageNumber),format.raw/*291.138*/("""</a>
        """)))}),format.raw/*292.10*/("""
        """)))}),format.raw/*293.10*/("""

        """),_display_(/*295.10*/paginatedList/*295.23*/.nextPage.map/*295.36*/ { page =>_display_(Seq[Any](format.raw/*295.46*/("""
        """),format.raw/*296.9*/("""<a href=""""),_display_(/*296.19*/link(page)),format.raw/*296.29*/("""" class="flex items-center px-4 py-2 text-gray-500 bg-gray-300 rounded-md">
<!--            Next-->
            <svg aria-hidden="true" class="ml-2 w-5 h-5" fill="currentColor" viewBox="0 0 20 20" xmlns="http://www.w3.org/2000/svg"><path fill-rule="evenodd" d="M12.293 5.293a1 1 0 011.414 0l4 4a1 1 0 010 1.414l-4 4a1 1 0 01-1.414-1.414L14.586 11H3a1 1 0 110-2h11.586l-2.293-2.293a1 1 0 010-1.414z" clip-rule="evenodd"></path></svg>
        </a>
        """)))}/*300.10*/.getOrElse/*300.20*/ {_display_(Seq[Any](format.raw/*300.22*/("""
        """),format.raw/*301.9*/("""<a href="#" disabled class="flex items-center px-4 py-2 text-gray-500 bg-gray-300 rounded-md">
<!--            Next-->
            <svg aria-hidden="true" class="ml-2 w-5 h-5" fill="currentColor" viewBox="0 0 20 20" xmlns="http://www.w3.org/2000/svg"><path fill-rule="evenodd" d="M12.293 5.293a1 1 0 011.414 0l4 4a1 1 0 010 1.414l-4 4a1 1 0 01-1.414-1.414L14.586 11H3a1 1 0 110-2h11.586l-2.293-2.293a1 1 0 010-1.414z" clip-rule="evenodd"></path></svg>
        </a>
        """)))}),format.raw/*305.10*/("""
    """),format.raw/*306.5*/("""</div>

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


                let table = document.getElementById("student-table");

                // select table header
                let rows = table.rows[0].cells;

                let stu_aadhar;




                function selectRow(row) """),format.raw/*331.41*/("""{"""),format.raw/*331.42*/("""
                    """),format.raw/*332.21*/("""row.addEventListener("click", function (e) """),format.raw/*332.64*/("""{"""),format.raw/*332.65*/("""
                        """),format.raw/*333.25*/("""let select_row = e.target.parentElement;

                        // select only one row
                        Array.from(std_row).forEach(el => """),format.raw/*336.59*/("""{"""),format.raw/*336.60*/("""
                            """),format.raw/*337.29*/("""if (el != this)
                                el.classList.remove("selected")
                            else
                                el.classList.toggle("selected") ?
                                        stu_aadhar = select_row.getAttribute("data-id") :
                                        stu_aadhar = undefined
                        """),format.raw/*343.25*/("""}"""),format.raw/*343.26*/(""");
                    """),format.raw/*344.21*/("""}"""),format.raw/*344.22*/(""");
                """),format.raw/*345.17*/("""}"""),format.raw/*345.18*/("""

                """),format.raw/*347.17*/("""// Add eventlistener to all rows
                Array.from(std_row).forEach(row => selectRow(row));



                close_btn.onclick = () => """),format.raw/*352.43*/("""{"""),format.raw/*352.44*/("""
                    """),format.raw/*353.21*/("""popup.classList.toggle("popped");
                """),format.raw/*354.17*/("""}"""),format.raw/*354.18*/("""

                """),format.raw/*356.17*/("""close_btn_delete.onclick = (e) => """),format.raw/*356.51*/("""{"""),format.raw/*356.52*/("""
                    """),format.raw/*357.21*/("""deletePopup.classList.toggle("popped")
                """),format.raw/*358.17*/("""}"""),format.raw/*358.18*/("""

                """),format.raw/*360.17*/("""insertBtn.onclick = () => """),format.raw/*360.43*/("""{"""),format.raw/*360.44*/("""
                    """),format.raw/*361.21*/("""window.location.href = """"),_display_(/*361.46*/routes/*361.52*/.Application.studentIndex()),format.raw/*361.79*/(""""
                """),format.raw/*362.17*/("""}"""),format.raw/*362.18*/("""

                """),format.raw/*364.17*/("""updateBtn.onclick = () => """),format.raw/*364.43*/("""{"""),format.raw/*364.44*/("""
                    """),format.raw/*365.21*/("""if(! stu_aadhar)
                        popup.classList.toggle("popped");
                    else """),format.raw/*367.26*/("""{"""),format.raw/*367.27*/("""
                        """),format.raw/*368.25*/("""location.href = `/studentViewPage?govt_id=$"""),format.raw/*368.68*/("""{"""),format.raw/*368.69*/("""stu_aadhar"""),format.raw/*368.79*/("""}"""),format.raw/*368.80*/("""`;
                    """),format.raw/*369.21*/("""}"""),format.raw/*369.22*/("""
                """),format.raw/*370.17*/("""}"""),format.raw/*370.18*/("""

                """),format.raw/*372.17*/("""function confirmDelete(intent)"""),format.raw/*372.47*/("""{"""),format.raw/*372.48*/("""
                    """),format.raw/*373.21*/("""if(intent)"""),format.raw/*373.31*/("""{"""),format.raw/*373.32*/("""
                        """),format.raw/*374.25*/("""location.href = `/studentDeleteValues?govt_id=$"""),format.raw/*374.72*/("""{"""),format.raw/*374.73*/("""stu_aadhar"""),format.raw/*374.83*/("""}"""),format.raw/*374.84*/("""`;
                    """),format.raw/*375.21*/("""}"""),format.raw/*375.22*/(""" """),format.raw/*375.23*/("""else"""),format.raw/*375.27*/("""{"""),format.raw/*375.28*/("""
                        """),format.raw/*376.25*/("""deletePopup.classList.toggle("popped")
                    """),format.raw/*377.21*/("""}"""),format.raw/*377.22*/("""
                """),format.raw/*378.17*/("""}"""),format.raw/*378.18*/("""

                """),format.raw/*380.17*/("""deleteBtn.onclick = () => """),format.raw/*380.43*/("""{"""),format.raw/*380.44*/("""
                    """),format.raw/*381.21*/("""if(!stu_aadhar)
                        popup.classList.toggle("popped");
                    else """),format.raw/*383.26*/("""{"""),format.raw/*383.27*/("""
                        """),format.raw/*384.25*/("""deletePopup.classList.toggle("popped")
                    """),format.raw/*385.21*/("""}"""),format.raw/*385.22*/("""
                """),format.raw/*386.17*/("""}"""),format.raw/*386.18*/("""

                """),format.raw/*388.17*/("""search_btn.addEventListener("click", e => """),format.raw/*388.59*/("""{"""),format.raw/*388.60*/("""
                    """),format.raw/*389.21*/("""let q = default_search.value
                    renderAndFetch(q);
                """),format.raw/*391.17*/("""}"""),format.raw/*391.18*/(""");

                async function renderAndFetch(q)"""),format.raw/*393.49*/("""{"""),format.raw/*393.50*/("""
                    """),format.raw/*394.21*/("""let response = await fetch(`/studentSearch?q=$"""),format.raw/*394.67*/("""{"""),format.raw/*394.68*/("""q"""),format.raw/*394.69*/("""}"""),format.raw/*394.70*/("""`, """),format.raw/*394.73*/("""{"""),format.raw/*394.74*/("""
                        """),format.raw/*395.25*/("""method: "GET"
                    """),format.raw/*396.21*/("""}"""),format.raw/*396.22*/(""");
                    let students = await response.json();


                    var tbody = document.createElement("tbody")

                    if(students.length === 0)"""),format.raw/*402.46*/("""{"""),format.raw/*402.47*/("""
                        """),format.raw/*403.25*/("""popup.getElementsByClassName("inner-container")[0].innerHTML = "No data";
                        popup.classList.toggle("popped");
                    """),format.raw/*405.21*/("""}"""),format.raw/*405.22*/("""

                    """),format.raw/*407.21*/("""// create row, remove existing rows and append new ones
                    for(var i=0; i<students.length; i++)"""),format.raw/*408.57*/("""{"""),format.raw/*408.58*/("""
                        """),format.raw/*409.25*/("""let id = students[i].id["$oid"]
                        let """),format.raw/*410.29*/("""{"""),format.raw/*410.30*/("""first_name,middle_name, last_name"""),format.raw/*410.63*/("""}"""),format.raw/*410.64*/(""" """),format.raw/*410.65*/("""= students[i].name
                        let studentDOB = students[i].studentDOB
                        let aadhar = students[i].aadhar
                        //let year = students[i].year.slice(5,9);

                        let row = tbody.insertRow(i)
                        row.classList.add("std-row");
                        row.setAttribute("data-id", aadhar)

                        row.insertCell(0).innerHTML = `$"""),format.raw/*419.57*/("""{"""),format.raw/*419.58*/("""first_name"""),format.raw/*419.68*/("""}"""),format.raw/*419.69*/(""" """),format.raw/*419.70*/("""$"""),format.raw/*419.71*/("""{"""),format.raw/*419.72*/("""middle_name"""),format.raw/*419.83*/("""}"""),format.raw/*419.84*/(""" """),format.raw/*419.85*/("""$"""),format.raw/*419.86*/("""{"""),format.raw/*419.87*/("""last_name"""),format.raw/*419.96*/("""}"""),format.raw/*419.97*/("""`
                        row.insertCell(1).innerHTML = aadhar
                        row.insertCell(2).innerHTML = studentDOB
                        //row.insertCell(3).innerHTML = year
                        selectRow(row);

                        tbody.appendChild(row)
                        table.tBodies[0].parentNode.replaceChild(tbody,table.tBodies[0])
                    """),format.raw/*427.21*/("""}"""),format.raw/*427.22*/("""
                """),format.raw/*428.17*/("""}"""),format.raw/*428.18*/("""

                """),format.raw/*430.17*/("""Array.from(rows).forEach(e => e.addEventListener("click", sortTable));

                // https://www.w3schools.com/howto/howto_js_sort_table.asp
                function sortTable(event) """),format.raw/*433.43*/("""{"""),format.raw/*433.44*/("""
                    """),format.raw/*434.21*/("""var n = event.target.cellIndex;

                    event.target.parentNode.querySelectorAll("th").forEach(rowHead => """),format.raw/*436.87*/("""{"""),format.raw/*436.88*/("""
                        """),format.raw/*437.25*/("""if(rowHead != event.target)"""),format.raw/*437.52*/("""{"""),format.raw/*437.53*/("""
                            """),format.raw/*438.29*/("""rowHead.classList.remove("highlight")
                        """),format.raw/*439.25*/("""}"""),format.raw/*439.26*/(""" """),format.raw/*439.27*/("""else """),format.raw/*439.32*/("""{"""),format.raw/*439.33*/("""
                            """),format.raw/*440.29*/("""event.target.classList.toggle("highlight")
                        """),format.raw/*441.25*/("""}"""),format.raw/*441.26*/("""
                    """),format.raw/*442.21*/("""}"""),format.raw/*442.22*/(""")

                    event.target.parentNode.classList.toggle("rotate");
                    var switching, i, x, y, shouldSwitch, dir, switchcount = 0;

                    switching = true;
                    // Set the sorting direction to ascending:
                    dir = "asc";
                    /* Make a loop that will continue until
                    no switching has been done: */
                    while (switching) """),format.raw/*452.39*/("""{"""),format.raw/*452.40*/("""
                        """),format.raw/*453.25*/("""// Start by saying: no switching is done:
                        switching = false;
                        rows = table.rows;
                        /* Loop through all table rows (except the
                        first, which contains table headers): */
                        for (i = 1; i < (rows.length - 1); i++) """),format.raw/*458.65*/("""{"""),format.raw/*458.66*/("""
                            """),format.raw/*459.29*/("""// Start by saying there should be no switching:
                            shouldSwitch = false;
                            /* Get the two elements you want to compare,
                            one from current row and one from the next: */
                            x = rows[i].getElementsByTagName("TD")[n];
                            y = rows[i + 1].getElementsByTagName("TD")[n];
                            /* Check if the two rows should switch place,
                            based on the direction, asc or desc: */
                            if (dir == "asc") """),format.raw/*467.47*/("""{"""),format.raw/*467.48*/("""
                                """),format.raw/*468.33*/("""if (x.innerHTML.toLowerCase() > y.innerHTML.toLowerCase()) """),format.raw/*468.92*/("""{"""),format.raw/*468.93*/("""
                                    """),format.raw/*469.37*/("""// If so, mark as a switch and break the loop:
                                    shouldSwitch = true;
                                    break;
                                """),format.raw/*472.33*/("""}"""),format.raw/*472.34*/("""
                            """),format.raw/*473.29*/("""}"""),format.raw/*473.30*/(""" """),format.raw/*473.31*/("""else if (dir == "desc") """),format.raw/*473.55*/("""{"""),format.raw/*473.56*/("""
                                """),format.raw/*474.33*/("""if (x.innerHTML.toLowerCase() < y.innerHTML.toLowerCase()) """),format.raw/*474.92*/("""{"""),format.raw/*474.93*/("""
                                    """),format.raw/*475.37*/("""// If so, mark as a switch and break the loop:
                                    shouldSwitch = true;
                                    break;
                                """),format.raw/*478.33*/("""}"""),format.raw/*478.34*/("""
                            """),format.raw/*479.29*/("""}"""),format.raw/*479.30*/("""
                        """),format.raw/*480.25*/("""}"""),format.raw/*480.26*/("""
                        """),format.raw/*481.25*/("""if (shouldSwitch) """),format.raw/*481.43*/("""{"""),format.raw/*481.44*/("""
                            """),format.raw/*482.29*/("""/* If a switch has been marked, make the switch
                            and mark that a switch has been done: */
                            rows[i].parentNode.insertBefore(rows[i + 1], rows[i]);
                            switching = true;
                            // Each time a switch is done, increase this count by 1:
                            switchcount ++;
                        """),format.raw/*488.25*/("""}"""),format.raw/*488.26*/(""" """),format.raw/*488.27*/("""else """),format.raw/*488.32*/("""{"""),format.raw/*488.33*/("""
                            """),format.raw/*489.29*/("""/* If no switching has been done AND the direction is "asc",
                            set the direction to "desc" and run the while loop again. */
                            if (switchcount == 0 && dir == "asc") """),format.raw/*491.67*/("""{"""),format.raw/*491.68*/("""
                                """),format.raw/*492.33*/("""dir = "desc";
                                switching = true;
                            """),format.raw/*494.29*/("""}"""),format.raw/*494.30*/("""
                        """),format.raw/*495.25*/("""}"""),format.raw/*495.26*/("""
                    """),format.raw/*496.21*/("""}"""),format.raw/*496.22*/("""
                """),format.raw/*497.17*/("""}"""),format.raw/*497.18*/("""



            """),format.raw/*501.13*/("""</script>
</body>
</html>
""")))}))
      }
    }
  }

  def render(paginatedList:Paginator[StudentBasic]): play.twirl.api.HtmlFormat.Appendable = apply(paginatedList)

  def f:((Paginator[StudentBasic]) => play.twirl.api.HtmlFormat.Appendable) = (paginatedList) => apply(paginatedList)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/studentList.scala.html
                  HASH: f08e5b8abcbd8ffda3f902c8406478710c26efeb
                  MATRIX: 432->1|803->47|921->133|932->137|1025->87|1056->130|1084->200|1112->203|1129->212|1167->213|1195->215|1375->367|1404->368|1454->390|1519->427|1548->428|1594->446|1626->450|1655->451|1705->473|1761->501|1790->502|1840->524|1873->529|1902->530|1956->556|2070->642|2099->643|2149->665|2184->672|2213->673|2267->699|2431->835|2460->836|2510->858|2544->864|2573->865|2627->891|2969->1205|2998->1206|3048->1228|3085->1237|3114->1238|3168->1264|3286->1354|3315->1355|3367->1379|3416->1400|3445->1401|3499->1427|4011->1911|4040->1912|4090->1934|4125->1941|4154->1942|4208->1968|4272->2004|4301->2005|4349->2025|4394->2042|4423->2043|4473->2065|4898->2462|4927->2463|4973->2481|5021->2501|5050->2502|5100->2524|5165->2561|5194->2562|5242->2582|5295->2607|5324->2608|5374->2630|5437->2665|5466->2666|5512->2684|5575->2719|5604->2720|5654->2742|5762->2822|5791->2823|5839->2843|5891->2867|5920->2868|5970->2890|6035->2927|6064->2928|6118->2954|6158->2966|6187->2967|6468->3220|6497->3221|6569->3265|6598->3266|6652->3292|6763->3375|6792->3376|6843->3398|6888->3414|6918->3415|6973->3441|7038->3477|7068->3478|7117->3498|7168->3520|7198->3521|7249->3543|7432->3697|7462->3698|7511->3718|7563->3741|7593->3742|7644->3764|7794->3885|7824->3886|7877->3910|7915->3919|7945->3920|8000->3946|8064->3981|8094->3982|8147->4006|8188->4018|8218->4019|8273->4045|8514->4257|8544->4258|8597->4282|8638->4294|8668->4295|8723->4321|8926->4495|8956->4496|9003->4514|9042->4524|9072->4525|9123->4547|9238->4633|9268->4634|9315->4652|9357->4665|9387->4666|9438->4688|9700->4921|9730->4922|9779->4942|9836->4970|9866->4971|9917->4993|10007->5054|10037->5055|10086->5075|10140->5100|10170->5101|10221->5123|10311->5184|10341->5185|10388->5203|10434->5220|10464->5221|10515->5243|10588->5287|10618->5288|10665->5306|10704->5316|10734->5317|10785->5339|10860->5385|10890->5386|10933->5400|15099->9538|15145->9567|15185->9568|15223->9578|15281->9608|15292->9609|15338->9633|15383->9702|15426->9716|15477->9739|15488->9740|15533->9763|15580->9782|15591->9783|15637->9807|15684->9826|15695->9827|15739->9849|15782->9863|15834->9887|15845->9888|15891->9912|15943->9936|15954->9937|16006->9967|16069->9998|16107->10008|16996->10930|17044->11049|17091->11126|17142->11211|17194->11354|17245->11409|17296->11468|17344->11786|17395->11850|17447->12234|17498->12297|17547->12352|17590->12366|19382->14130|19405->14143|19428->14156|19477->14166|19515->14176|19553->14186|19585->14196|20065->14656|20085->14666|20125->14667|20163->14677|20665->15147|20706->15160|20790->15227|20831->15229|20870->15240|20899->15259|20940->15261|20978->15271|21016->15281|21054->15297|21176->15390|21209->15400|21256->15415|21299->15426|21340->15439|21363->15452|21386->15465|21435->15475|21473->15485|21511->15495|21543->15505|22022->15964|22042->15974|22083->15976|22121->15986|22631->16464|22665->16470|23648->17424|23678->17425|23729->17447|23801->17490|23831->17491|23886->17517|24065->17667|24095->17668|24154->17698|24545->18060|24575->18061|24628->18085|24658->18086|24707->18106|24737->18107|24786->18127|24966->18278|24996->18279|25047->18301|25127->18352|25157->18353|25206->18373|25269->18407|25299->18408|25350->18430|25435->18486|25465->18487|25514->18507|25569->18533|25599->18534|25650->18556|25703->18581|25719->18587|25768->18614|25816->18633|25846->18634|25895->18654|25950->18680|25980->18681|26031->18703|26162->18805|26192->18806|26247->18832|26319->18875|26349->18876|26388->18886|26418->18887|26471->18911|26501->18912|26548->18930|26578->18931|26627->18951|26686->18981|26716->18982|26767->19004|26806->19014|26836->19015|26891->19041|26967->19088|26997->19089|27036->19099|27066->19100|27119->19124|27149->19125|27179->19126|27212->19130|27242->19131|27297->19157|27386->19217|27416->19218|27463->19236|27493->19237|27542->19257|27597->19283|27627->19284|27678->19306|27808->19407|27838->19408|27893->19434|27982->19494|28012->19495|28059->19513|28089->19514|28138->19534|28209->19576|28239->19577|28290->19599|28405->19685|28435->19686|28518->19740|28548->19741|28599->19763|28674->19809|28704->19810|28734->19811|28764->19812|28796->19815|28826->19816|28881->19842|28945->19877|28975->19878|29183->20057|29213->20058|29268->20084|29451->20238|29481->20239|29534->20263|29676->20376|29706->20377|29761->20403|29851->20464|29881->20465|29943->20498|29973->20499|30003->20500|30471->20939|30501->20940|30540->20950|30570->20951|30600->20952|30630->20953|30660->20954|30700->20965|30730->20966|30760->20967|30790->20968|30820->20969|30858->20978|30888->20979|31311->21373|31341->21374|31388->21392|31418->21393|31467->21413|31688->21605|31718->21606|31769->21628|31919->21749|31949->21750|32004->21776|32060->21803|32090->21804|32149->21834|32241->21897|32271->21898|32301->21899|32335->21904|32365->21905|32424->21935|32521->22003|32551->22004|32602->22026|32632->22027|33110->22476|33140->22477|33195->22503|33553->22832|33583->22833|33642->22863|34260->23452|34290->23453|34353->23487|34441->23546|34471->23547|34538->23585|34749->23767|34779->23768|34838->23798|34868->23799|34898->23800|34951->23824|34981->23825|35044->23859|35132->23918|35162->23919|35229->23957|35440->24139|35470->24140|35529->24170|35559->24171|35614->24197|35644->24198|35699->24224|35746->24242|35776->24243|35835->24273|36269->24678|36299->24679|36329->24680|36363->24685|36393->24686|36452->24716|36699->24934|36729->24935|36792->24969|36915->25063|36945->25064|37000->25090|37030->25091|37081->25113|37111->25114|37158->25132|37188->25133|37237->25153
                  LINES: 17->1|22->2|26->5|26->5|29->2|31->4|32->7|33->8|33->8|33->8|34->9|40->15|40->15|41->16|42->17|42->17|43->18|43->18|43->18|44->19|45->20|45->20|46->21|46->21|46->21|47->22|49->24|49->24|50->25|50->25|50->25|51->26|54->29|54->29|55->30|55->30|55->30|56->31|63->38|63->38|64->39|64->39|64->39|65->40|67->42|67->42|69->44|69->44|69->44|70->45|81->56|81->56|82->57|82->57|82->57|83->58|84->59|84->59|86->61|86->61|86->61|87->62|96->71|96->71|97->72|97->72|97->72|98->73|99->74|99->74|101->76|101->76|101->76|102->77|103->78|103->78|104->79|104->79|104->79|105->80|107->82|107->82|109->84|109->84|109->84|110->85|111->86|111->86|114->89|114->89|114->89|120->95|120->95|121->96|121->96|122->97|124->99|124->99|125->100|125->100|125->100|126->101|127->102|127->102|129->104|129->104|129->104|130->105|134->109|134->109|136->111|136->111|136->111|137->112|140->115|140->115|142->117|142->117|142->117|143->118|144->119|144->119|146->121|146->121|146->121|147->122|152->127|152->127|154->129|154->129|154->129|155->130|159->134|159->134|160->135|160->135|160->135|161->136|163->138|163->138|164->139|164->139|164->139|165->140|171->146|171->146|173->148|173->148|173->148|174->149|176->151|176->151|178->153|178->153|178->153|179->154|181->156|181->156|182->157|182->157|182->157|183->158|184->159|184->159|185->160|185->160|185->160|186->161|187->162|187->162|188->163|233->208|233->208|233->208|234->209|234->209|234->209|234->209|235->210|236->211|237->212|237->212|237->212|238->213|238->213|238->213|239->214|239->214|239->214|240->215|241->216|241->216|241->216|242->217|242->217|242->217|244->219|245->220|257->232|258->233|259->234|260->235|261->236|262->237|263->238|264->239|265->240|266->241|267->242|269->244|270->245|302->277|302->277|302->277|302->277|303->278|303->278|303->278|307->282|307->282|307->282|308->283|312->287|314->289|314->289|314->289|315->290|315->290|315->290|316->291|316->291|316->291|316->291|316->291|317->292|318->293|320->295|320->295|320->295|320->295|321->296|321->296|321->296|325->300|325->300|325->300|326->301|330->305|331->306|356->331|356->331|357->332|357->332|357->332|358->333|361->336|361->336|362->337|368->343|368->343|369->344|369->344|370->345|370->345|372->347|377->352|377->352|378->353|379->354|379->354|381->356|381->356|381->356|382->357|383->358|383->358|385->360|385->360|385->360|386->361|386->361|386->361|386->361|387->362|387->362|389->364|389->364|389->364|390->365|392->367|392->367|393->368|393->368|393->368|393->368|393->368|394->369|394->369|395->370|395->370|397->372|397->372|397->372|398->373|398->373|398->373|399->374|399->374|399->374|399->374|399->374|400->375|400->375|400->375|400->375|400->375|401->376|402->377|402->377|403->378|403->378|405->380|405->380|405->380|406->381|408->383|408->383|409->384|410->385|410->385|411->386|411->386|413->388|413->388|413->388|414->389|416->391|416->391|418->393|418->393|419->394|419->394|419->394|419->394|419->394|419->394|419->394|420->395|421->396|421->396|427->402|427->402|428->403|430->405|430->405|432->407|433->408|433->408|434->409|435->410|435->410|435->410|435->410|435->410|444->419|444->419|444->419|444->419|444->419|444->419|444->419|444->419|444->419|444->419|444->419|444->419|444->419|444->419|452->427|452->427|453->428|453->428|455->430|458->433|458->433|459->434|461->436|461->436|462->437|462->437|462->437|463->438|464->439|464->439|464->439|464->439|464->439|465->440|466->441|466->441|467->442|467->442|477->452|477->452|478->453|483->458|483->458|484->459|492->467|492->467|493->468|493->468|493->468|494->469|497->472|497->472|498->473|498->473|498->473|498->473|498->473|499->474|499->474|499->474|500->475|503->478|503->478|504->479|504->479|505->480|505->480|506->481|506->481|506->481|507->482|513->488|513->488|513->488|513->488|513->488|514->489|516->491|516->491|517->492|519->494|519->494|520->495|520->495|521->496|521->496|522->497|522->497|526->501
                  -- GENERATED --
              */
          