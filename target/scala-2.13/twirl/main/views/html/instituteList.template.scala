
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

        <th>Student Name</th>
        <th>Student Id</th>
        <th>Previous Institute Code</th>
        <th>Current Institue Code</th>

        </thead>
        <tbody>
        """),_display_(/*209.10*/for(d <- paginatedList.items) yield /*209.39*/{_display_(Seq[Any](format.raw/*209.40*/("""
        """),format.raw/*210.9*/("""<tr class="std-row" data-id=""""),_display_(/*210.39*/d/*210.40*/.studentId),format.raw/*210.50*/("""">
            """),format.raw/*211.66*/("""
            """),format.raw/*212.13*/("""<td>
                """),_display_(/*213.18*/d/*213.19*/.studentName.get("first_name")),format.raw/*213.49*/("""
                """),_display_(/*214.18*/d/*214.19*/.studentName.get("middle_name")),format.raw/*214.50*/("""
                """),_display_(/*215.18*/d/*215.19*/.studentName.get("last_name")),format.raw/*215.48*/("""
            """),format.raw/*216.13*/("""</td>
            <td>"""),_display_(/*217.18*/d/*217.19*/.studentId),format.raw/*217.29*/("""</td>
            <td>"""),_display_(/*218.18*/d/*218.19*/.prevInstituteCode.get("Unique Code")),format.raw/*218.56*/("""</td>
            <td>"""),_display_(/*219.18*/d/*219.19*/.currInstituteCode.get("Unique Code")),format.raw/*219.56*/("""</td>
        </tr>
        """)))}),format.raw/*221.10*/("""
        """),format.raw/*222.9*/("""</tbody>
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
                """),format.raw/*234.79*/("""
                """),format.raw/*235.118*/("""
                """),format.raw/*236.76*/("""
                    """),format.raw/*237.84*/("""
                    """),format.raw/*238.159*/("""
                    """),format.raw/*239.54*/("""
                    """),format.raw/*240.58*/("""
                """),format.raw/*241.317*/("""
                    """),format.raw/*242.63*/("""
                    """),format.raw/*243.383*/("""
                    """),format.raw/*244.62*/("""

                """),format.raw/*246.52*/("""
            """),format.raw/*247.13*/("""</div>
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

        """),_display_(/*279.10*/paginatedList/*279.23*/.prevPage.map/*279.36*/ { page =>_display_(Seq[Any](format.raw/*279.46*/("""
        """),format.raw/*280.9*/("""<a href=""""),_display_(/*280.19*/link(page)),format.raw/*280.29*/("""" class="flex items-center px-4 py-2 text-gray-500 bg-gray-300 rounded-md">
            <svg aria-hidden="true" class="mr-2 w-5 h-5" fill="currentColor" viewBox="0 0 20 20" xmlns="http://www.w3.org/2000/svg"><path fill-rule="evenodd" d="M7.707 14.707a1 1 0 01-1.414 0l-4-4a1 1 0 010-1.414l4-4a1 1 0 011.414 1.414L5.414 9H17a1 1 0 110 2H5.414l2.293 2.293a1 1 0 010 1.414z" clip-rule="evenodd"></path></svg>
<!--            Previous-->
        </a>
        """)))}/*284.10*/.getOrElse/*284.20*/{_display_(Seq[Any](format.raw/*284.21*/("""
        """),format.raw/*285.9*/("""<a disabled class="flex items-center px-4 py-2 text-gray-500 bg-gray-300 rounded-md">
            <svg aria-hidden="true" class="mr-2 w-5 h-5" fill="currentColor" viewBox="0 0 20 20" xmlns="http://www.w3.org/2000/svg"><path fill-rule="evenodd" d="M7.707 14.707a1 1 0 01-1.414 0l-4-4a1 1 0 010-1.414l4-4a1 1 0 011.414 1.414L5.414 9H17a1 1 0 110 2H5.414l2.293 2.293a1 1 0 010 1.414z" clip-rule="evenodd"></path></svg>
<!--            Previous-->
        </a>
        """)))}),format.raw/*289.10*/("""

        """),_display_(/*291.10*/for(pageNumber <- paginatedList.lowbound until paginatedList.high ) yield /*291.77*/ {_display_(Seq[Any](format.raw/*291.79*/("""
        """),_display_(/*292.10*/if(pageNumber != 0)/*292.29*/ {_display_(Seq[Any](format.raw/*292.31*/("""
        """),format.raw/*293.9*/("""<a href=""""),_display_(/*293.19*/link(pageNumber)),format.raw/*293.35*/("""" class="px-4 py-2 text-gray-700 bg-gray-200 rounded-md hover:bg-blue-400 hover:text-white">"""),_display_(/*293.128*/pageNumber),format.raw/*293.138*/("""</a>
        """)))}),format.raw/*294.10*/("""
        """)))}),format.raw/*295.10*/("""

        """),_display_(/*297.10*/paginatedList/*297.23*/.nextPage.map/*297.36*/ { page =>_display_(Seq[Any](format.raw/*297.46*/("""
        """),format.raw/*298.9*/("""<a href=""""),_display_(/*298.19*/link(page)),format.raw/*298.29*/("""" class="flex items-center px-4 py-2 text-gray-500 bg-gray-300 rounded-md">
<!--            Next-->
            <svg aria-hidden="true" class="ml-2 w-5 h-5" fill="currentColor" viewBox="0 0 20 20" xmlns="http://www.w3.org/2000/svg"><path fill-rule="evenodd" d="M12.293 5.293a1 1 0 011.414 0l4 4a1 1 0 010 1.414l-4 4a1 1 0 01-1.414-1.414L14.586 11H3a1 1 0 110-2h11.586l-2.293-2.293a1 1 0 010-1.414z" clip-rule="evenodd"></path></svg>
        </a>
        """)))}/*302.10*/.getOrElse/*302.20*/ {_display_(Seq[Any](format.raw/*302.22*/("""
        """),format.raw/*303.9*/("""<a href="#" disabled class="flex items-center px-4 py-2 text-gray-500 bg-gray-300 rounded-md">
<!--            Next-->
            <svg aria-hidden="true" class="ml-2 w-5 h-5" fill="currentColor" viewBox="0 0 20 20" xmlns="http://www.w3.org/2000/svg"><path fill-rule="evenodd" d="M12.293 5.293a1 1 0 011.414 0l4 4a1 1 0 010 1.414l-4 4a1 1 0 01-1.414-1.414L14.586 11H3a1 1 0 110-2h11.586l-2.293-2.293a1 1 0 010-1.414z" clip-rule="evenodd"></path></svg>
        </a>
        """)))}),format.raw/*307.10*/("""
    """),format.raw/*308.5*/("""</div>

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




                function selectRow(row) """),format.raw/*337.41*/("""{"""),format.raw/*337.42*/("""
                    """),format.raw/*338.21*/("""row.addEventListener("click", function (e) """),format.raw/*338.64*/("""{"""),format.raw/*338.65*/("""
                        """),format.raw/*339.25*/("""let select_row = e.target.parentElement;

                        // select only one row
                        Array.from(std_row).forEach(el => """),format.raw/*342.59*/("""{"""),format.raw/*342.60*/("""
                            """),format.raw/*343.29*/("""if (el != this)
                                el.classList.remove("selected")
                            else
                                el.classList.toggle("selected") ?
                                        studentId = select_row.getAttribute("data-id") :
                                        studentId = undefined
                        """),format.raw/*349.25*/("""}"""),format.raw/*349.26*/(""");
                    """),format.raw/*350.21*/("""}"""),format.raw/*350.22*/(""");
                """),format.raw/*351.17*/("""}"""),format.raw/*351.18*/("""

                """),format.raw/*353.17*/("""// Add eventlistener to all rows
                Array.from(std_row).forEach(row => selectRow(row));



                close_btn.onclick = () => """),format.raw/*358.43*/("""{"""),format.raw/*358.44*/("""
                    """),format.raw/*359.21*/("""popup.classList.toggle("popped");
                """),format.raw/*360.17*/("""}"""),format.raw/*360.18*/("""

                """),format.raw/*362.17*/("""close_btn_delete.onclick = (e) => """),format.raw/*362.51*/("""{"""),format.raw/*362.52*/("""
                    """),format.raw/*363.21*/("""deletePopup.classList.toggle("popped")
                """),format.raw/*364.17*/("""}"""),format.raw/*364.18*/("""

                """),format.raw/*366.17*/("""insertBtn.onclick = () => """),format.raw/*366.43*/("""{"""),format.raw/*366.44*/("""
                    """),format.raw/*367.21*/("""window.location.href = """"),_display_(/*367.46*/routes/*367.52*/.Application.instituteIndex()),format.raw/*367.81*/(""""
                """),format.raw/*368.17*/("""}"""),format.raw/*368.18*/("""

                """),format.raw/*370.17*/("""updateBtn.onclick = () => """),format.raw/*370.43*/("""{"""),format.raw/*370.44*/("""
                    """),format.raw/*371.21*/("""if(! studentId)
                        popup.classList.toggle("popped");
                    else """),format.raw/*373.26*/("""{"""),format.raw/*373.27*/("""
                        """),format.raw/*374.25*/("""location.href = `/instituteView?stu_registration_Id=$"""),format.raw/*374.78*/("""{"""),format.raw/*374.79*/("""studentId"""),format.raw/*374.88*/("""}"""),format.raw/*374.89*/("""`;
                    """),format.raw/*375.21*/("""}"""),format.raw/*375.22*/("""
                """),format.raw/*376.17*/("""}"""),format.raw/*376.18*/("""

                """),format.raw/*378.17*/("""function confirmDelete(intent)"""),format.raw/*378.47*/("""{"""),format.raw/*378.48*/("""
                    """),format.raw/*379.21*/("""if(intent)"""),format.raw/*379.31*/("""{"""),format.raw/*379.32*/("""
                        """),format.raw/*380.25*/("""location.href = `/instituteView?stu_registration_Id=$"""),format.raw/*380.78*/("""{"""),format.raw/*380.79*/("""studentId"""),format.raw/*380.88*/("""}"""),format.raw/*380.89*/("""`;
                    """),format.raw/*381.21*/("""}"""),format.raw/*381.22*/(""" """),format.raw/*381.23*/("""else"""),format.raw/*381.27*/("""{"""),format.raw/*381.28*/("""
                        """),format.raw/*382.25*/("""deletePopup.classList.toggle("popped")
                    """),format.raw/*383.21*/("""}"""),format.raw/*383.22*/("""
                """),format.raw/*384.17*/("""}"""),format.raw/*384.18*/("""

                """),format.raw/*386.17*/("""deleteBtn.onclick = () => """),format.raw/*386.43*/("""{"""),format.raw/*386.44*/("""
                    """),format.raw/*387.21*/("""if(!studentId)
                        popup.classList.toggle("popped");
                    else """),format.raw/*389.26*/("""{"""),format.raw/*389.27*/("""
                        """),format.raw/*390.25*/("""deletePopup.classList.toggle("popped")
                    """),format.raw/*391.21*/("""}"""),format.raw/*391.22*/("""
                """),format.raw/*392.17*/("""}"""),format.raw/*392.18*/("""

                """),format.raw/*394.17*/("""search_btn.addEventListener("click", e => """),format.raw/*394.59*/("""{"""),format.raw/*394.60*/("""
                    """),format.raw/*395.21*/("""let q = default_search.value
                    renderAndFetch(q);
                """),format.raw/*397.17*/("""}"""),format.raw/*397.18*/(""");

                async function renderAndFetch(q)"""),format.raw/*399.49*/("""{"""),format.raw/*399.50*/("""
                    """),format.raw/*400.21*/("""let response = await fetch(`/instituteSearch?q=$"""),format.raw/*400.69*/("""{"""),format.raw/*400.70*/("""q"""),format.raw/*400.71*/("""}"""),format.raw/*400.72*/("""`, """),format.raw/*400.75*/("""{"""),format.raw/*400.76*/("""
                        """),format.raw/*401.25*/("""method: "GET"
                    """),format.raw/*402.21*/("""}"""),format.raw/*402.22*/(""");
                    let students = await response.json();


                    var tbody = document.createElement("tbody")

                    if(students.length === 0)"""),format.raw/*408.46*/("""{"""),format.raw/*408.47*/("""
                        """),format.raw/*409.25*/("""popup.getElementsByClassName("inner-container")[0].innerHTML = "No data";
                        popup.classList.toggle("popped");
                    """),format.raw/*411.21*/("""}"""),format.raw/*411.22*/("""

                    """),format.raw/*413.21*/("""// create row, remove existing rows and append new ones
                    for(var i=0; i<students.length; i++)"""),format.raw/*414.57*/("""{"""),format.raw/*414.58*/("""
                        """),format.raw/*415.25*/("""let id = students[i].id["$oid"]
                        let """),format.raw/*416.29*/("""{"""),format.raw/*416.30*/("""first_name,middle_name, last_name"""),format.raw/*416.63*/("""}"""),format.raw/*416.64*/(""" """),format.raw/*416.65*/("""= students[i].studentName
                        let studentId = students[i].studentId
                        let prevInstituteCode = students[i].prevInstituteCode["Unique Code"]
                        let currInstituteCode = students[i].currInstituteCode["Unique Code"].slice(5,9);

                        let row = tbody.insertRow(i)
                        row.classList.add("std-row");
                        row.setAttribute("data-id", studentId)

                        row.insertCell(0).innerHTML = `$"""),format.raw/*425.57*/("""{"""),format.raw/*425.58*/("""first_name"""),format.raw/*425.68*/("""}"""),format.raw/*425.69*/(""" """),format.raw/*425.70*/("""$"""),format.raw/*425.71*/("""{"""),format.raw/*425.72*/("""middle_name"""),format.raw/*425.83*/("""}"""),format.raw/*425.84*/(""" """),format.raw/*425.85*/("""$"""),format.raw/*425.86*/("""{"""),format.raw/*425.87*/("""last_name"""),format.raw/*425.96*/("""}"""),format.raw/*425.97*/("""`
                        row.insertCell(1).innerHTML = studentId
                        row.insertCell(2).innerHTML = prevInstituteCode
                        row.insertCell(3).innerHTML = currInstituteCode
                        selectRow(row);

                        tbody.appendChild(row)
                        table.tBodies[0].parentNode.replaceChild(tbody,table.tBodies[0])
                    """),format.raw/*433.21*/("""}"""),format.raw/*433.22*/("""
                """),format.raw/*434.17*/("""}"""),format.raw/*434.18*/("""

                """),format.raw/*436.17*/("""Array.from(rows).forEach(e => e.addEventListener("click", sortTable));

                // https://www.w3schools.com/howto/howto_js_sort_table.asp
                function sortTable(event) """),format.raw/*439.43*/("""{"""),format.raw/*439.44*/("""
                    """),format.raw/*440.21*/("""var n = event.target.cellIndex;

                    event.target.parentNode.querySelectorAll("th").forEach(rowHead => """),format.raw/*442.87*/("""{"""),format.raw/*442.88*/("""
                        """),format.raw/*443.25*/("""if(rowHead != event.target)"""),format.raw/*443.52*/("""{"""),format.raw/*443.53*/("""
                            """),format.raw/*444.29*/("""rowHead.classList.remove("highlight")
                        """),format.raw/*445.25*/("""}"""),format.raw/*445.26*/(""" """),format.raw/*445.27*/("""else """),format.raw/*445.32*/("""{"""),format.raw/*445.33*/("""
                            """),format.raw/*446.29*/("""event.target.classList.toggle("highlight")
                        """),format.raw/*447.25*/("""}"""),format.raw/*447.26*/("""
                    """),format.raw/*448.21*/("""}"""),format.raw/*448.22*/(""")

                    event.target.parentNode.classList.toggle("rotate");
                    var switching, i, x, y, shouldSwitch, dir, switchcount = 0;

                    switching = true;
                    // Set the sorting direction to ascending:
                    dir = "asc";
                    /* Make a loop that will continue until
                    no switching has been done: */
                    while (switching) """),format.raw/*458.39*/("""{"""),format.raw/*458.40*/("""
                        """),format.raw/*459.25*/("""// Start by saying: no switching is done:
                        switching = false;
                        rows = table.rows;
                        /* Loop through all table rows (except the
                        first, which contains table headers): */
                        for (i = 1; i < (rows.length - 1); i++) """),format.raw/*464.65*/("""{"""),format.raw/*464.66*/("""
                            """),format.raw/*465.29*/("""// Start by saying there should be no switching:
                            shouldSwitch = false;
                            /* Get the two elements you want to compare,
                            one from current row and one from the next: */
                            x = rows[i].getElementsByTagName("TD")[n];
                            y = rows[i + 1].getElementsByTagName("TD")[n];
                            /* Check if the two rows should switch place,
                            based on the direction, asc or desc: */
                            if (dir == "asc") """),format.raw/*473.47*/("""{"""),format.raw/*473.48*/("""
                                """),format.raw/*474.33*/("""if (x.innerHTML.toLowerCase() > y.innerHTML.toLowerCase()) """),format.raw/*474.92*/("""{"""),format.raw/*474.93*/("""
                                    """),format.raw/*475.37*/("""// If so, mark as a switch and break the loop:
                                    shouldSwitch = true;
                                    break;
                                """),format.raw/*478.33*/("""}"""),format.raw/*478.34*/("""
                            """),format.raw/*479.29*/("""}"""),format.raw/*479.30*/(""" """),format.raw/*479.31*/("""else if (dir == "desc") """),format.raw/*479.55*/("""{"""),format.raw/*479.56*/("""
                                """),format.raw/*480.33*/("""if (x.innerHTML.toLowerCase() < y.innerHTML.toLowerCase()) """),format.raw/*480.92*/("""{"""),format.raw/*480.93*/("""
                                    """),format.raw/*481.37*/("""// If so, mark as a switch and break the loop:
                                    shouldSwitch = true;
                                    break;
                                """),format.raw/*484.33*/("""}"""),format.raw/*484.34*/("""
                            """),format.raw/*485.29*/("""}"""),format.raw/*485.30*/("""
                        """),format.raw/*486.25*/("""}"""),format.raw/*486.26*/("""
                        """),format.raw/*487.25*/("""if (shouldSwitch) """),format.raw/*487.43*/("""{"""),format.raw/*487.44*/("""
                            """),format.raw/*488.29*/("""/* If a switch has been marked, make the switch
                            and mark that a switch has been done: */
                            rows[i].parentNode.insertBefore(rows[i + 1], rows[i]);
                            switching = true;
                            // Each time a switch is done, increase this count by 1:
                            switchcount ++;
                        """),format.raw/*494.25*/("""}"""),format.raw/*494.26*/(""" """),format.raw/*494.27*/("""else """),format.raw/*494.32*/("""{"""),format.raw/*494.33*/("""
                            """),format.raw/*495.29*/("""/* If no switching has been done AND the direction is "asc",
                            set the direction to "desc" and run the while loop again. */
                            if (switchcount == 0 && dir == "asc") """),format.raw/*497.67*/("""{"""),format.raw/*497.68*/("""
                                """),format.raw/*498.33*/("""dir = "desc";
                                switching = true;
                            """),format.raw/*500.29*/("""}"""),format.raw/*500.30*/("""
                        """),format.raw/*501.25*/("""}"""),format.raw/*501.26*/("""
                    """),format.raw/*502.21*/("""}"""),format.raw/*502.22*/("""
                """),format.raw/*503.17*/("""}"""),format.raw/*503.18*/("""



            """),format.raw/*507.13*/("""</script>
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
                  HASH: d571c277bcc8beb0889f463b20299d585280c873
                  MATRIX: 432->1|809->47|931->137|942->141|1037->91|1068->134|1096->206|1124->209|1141->218|1179->219|1207->221|1387->373|1416->374|1466->396|1531->433|1560->434|1606->452|1638->456|1667->457|1717->479|1773->507|1802->508|1852->530|1885->535|1914->536|1968->562|2082->648|2111->649|2161->671|2196->678|2225->679|2279->705|2443->841|2472->842|2522->864|2556->870|2585->871|2639->897|2981->1211|3010->1212|3060->1234|3097->1243|3126->1244|3180->1270|3298->1360|3327->1361|3379->1385|3428->1406|3457->1407|3511->1433|4023->1917|4052->1918|4102->1940|4137->1947|4166->1948|4220->1974|4284->2010|4313->2011|4361->2031|4406->2048|4435->2049|4485->2071|4910->2468|4939->2469|4985->2487|5033->2507|5062->2508|5112->2530|5177->2567|5206->2568|5254->2588|5307->2613|5336->2614|5386->2636|5449->2671|5478->2672|5524->2690|5587->2725|5616->2726|5666->2748|5774->2828|5803->2829|5851->2849|5903->2873|5932->2874|5982->2896|6047->2933|6076->2934|6130->2960|6170->2972|6199->2973|6480->3226|6509->3227|6581->3271|6610->3272|6664->3298|6775->3381|6804->3382|6855->3404|6900->3420|6930->3421|6985->3447|7050->3483|7080->3484|7129->3504|7180->3526|7210->3527|7261->3549|7444->3703|7474->3704|7523->3724|7575->3747|7605->3748|7656->3770|7806->3891|7836->3892|7889->3916|7927->3925|7957->3926|8012->3952|8076->3987|8106->3988|8159->4012|8200->4024|8230->4025|8285->4051|8526->4263|8556->4264|8609->4288|8650->4300|8680->4301|8735->4327|8938->4501|8968->4502|9015->4520|9054->4530|9084->4531|9135->4553|9250->4639|9280->4640|9327->4658|9369->4671|9399->4672|9450->4694|9712->4927|9742->4928|9791->4948|9848->4976|9878->4977|9929->4999|10019->5060|10049->5061|10098->5081|10152->5106|10182->5107|10233->5129|10323->5190|10353->5191|10400->5209|10446->5226|10476->5227|10527->5249|10600->5293|10630->5294|10677->5312|10716->5322|10746->5323|10797->5345|10872->5391|10902->5392|10945->5406|15174->9607|15220->9636|15260->9637|15298->9647|15356->9677|15367->9678|15399->9688|15444->9757|15487->9771|15538->9794|15549->9795|15601->9825|15648->9844|15659->9845|15712->9876|15759->9895|15770->9896|15821->9925|15864->9939|15916->9963|15927->9964|15959->9974|16011->9998|16022->9999|16081->10036|16133->10060|16144->10061|16203->10098|16266->10129|16304->10139|17193->11061|17241->11180|17288->11257|17339->11342|17391->11502|17442->11557|17493->11616|17541->11934|17592->11998|17644->12382|17695->12445|17744->12500|17787->12514|19579->14278|19602->14291|19625->14304|19674->14314|19712->14324|19750->14334|19782->14344|20262->14804|20282->14814|20322->14815|20360->14825|20862->15295|20903->15308|20987->15375|21028->15377|21067->15388|21096->15407|21137->15409|21175->15419|21213->15429|21251->15445|21373->15538|21406->15548|21453->15563|21496->15574|21537->15587|21560->15600|21583->15613|21632->15623|21670->15633|21708->15643|21740->15653|22219->16112|22239->16122|22280->16124|22318->16134|22828->16612|22862->16618|24111->17838|24141->17839|24192->17861|24264->17904|24294->17905|24349->17931|24528->18081|24558->18082|24617->18112|25006->18472|25036->18473|25089->18497|25119->18498|25168->18518|25198->18519|25247->18539|25427->18690|25457->18691|25508->18713|25588->18764|25618->18765|25667->18785|25730->18819|25760->18820|25811->18842|25896->18898|25926->18899|25975->18919|26030->18945|26060->18946|26111->18968|26164->18993|26180->18999|26231->19028|26279->19047|26309->19048|26358->19068|26413->19094|26443->19095|26494->19117|26624->19218|26654->19219|26709->19245|26791->19298|26821->19299|26859->19308|26889->19309|26942->19333|26972->19334|27019->19352|27049->19353|27098->19373|27157->19403|27187->19404|27238->19426|27277->19436|27307->19437|27362->19463|27444->19516|27474->19517|27512->19526|27542->19527|27595->19551|27625->19552|27655->19553|27688->19557|27718->19558|27773->19584|27862->19644|27892->19645|27939->19663|27969->19664|28018->19684|28073->19710|28103->19711|28154->19733|28283->19833|28313->19834|28368->19860|28457->19920|28487->19921|28534->19939|28564->19940|28613->19960|28684->20002|28714->20003|28765->20025|28880->20111|28910->20112|28993->20166|29023->20167|29074->20189|29151->20237|29181->20238|29211->20239|29241->20240|29273->20243|29303->20244|29358->20270|29422->20305|29452->20306|29660->20485|29690->20486|29745->20512|29928->20666|29958->20667|30011->20691|30153->20804|30183->20805|30238->20831|30328->20892|30358->20893|30420->20926|30450->20927|30480->20928|31032->21451|31062->21452|31101->21462|31131->21463|31161->21464|31191->21465|31221->21466|31261->21477|31291->21478|31321->21479|31351->21480|31381->21481|31419->21490|31449->21491|31893->21906|31923->21907|31970->21925|32000->21926|32049->21946|32270->22138|32300->22139|32351->22161|32501->22282|32531->22283|32586->22309|32642->22336|32672->22337|32731->22367|32823->22430|32853->22431|32883->22432|32917->22437|32947->22438|33006->22468|33103->22536|33133->22537|33184->22559|33214->22560|33692->23009|33722->23010|33777->23036|34135->23365|34165->23366|34224->23396|34842->23985|34872->23986|34935->24020|35023->24079|35053->24080|35120->24118|35331->24300|35361->24301|35420->24331|35450->24332|35480->24333|35533->24357|35563->24358|35626->24392|35714->24451|35744->24452|35811->24490|36022->24672|36052->24673|36111->24703|36141->24704|36196->24730|36226->24731|36281->24757|36328->24775|36358->24776|36417->24806|36851->25211|36881->25212|36911->25213|36945->25218|36975->25219|37034->25249|37281->25467|37311->25468|37374->25502|37497->25596|37527->25597|37582->25623|37612->25624|37663->25646|37693->25647|37740->25665|37770->25666|37819->25686
                  LINES: 17->1|22->2|26->5|26->5|29->2|31->4|32->7|33->8|33->8|33->8|34->9|40->15|40->15|41->16|42->17|42->17|43->18|43->18|43->18|44->19|45->20|45->20|46->21|46->21|46->21|47->22|49->24|49->24|50->25|50->25|50->25|51->26|54->29|54->29|55->30|55->30|55->30|56->31|63->38|63->38|64->39|64->39|64->39|65->40|67->42|67->42|69->44|69->44|69->44|70->45|81->56|81->56|82->57|82->57|82->57|83->58|84->59|84->59|86->61|86->61|86->61|87->62|96->71|96->71|97->72|97->72|97->72|98->73|99->74|99->74|101->76|101->76|101->76|102->77|103->78|103->78|104->79|104->79|104->79|105->80|107->82|107->82|109->84|109->84|109->84|110->85|111->86|111->86|114->89|114->89|114->89|120->95|120->95|121->96|121->96|122->97|124->99|124->99|125->100|125->100|125->100|126->101|127->102|127->102|129->104|129->104|129->104|130->105|134->109|134->109|136->111|136->111|136->111|137->112|140->115|140->115|142->117|142->117|142->117|143->118|144->119|144->119|146->121|146->121|146->121|147->122|152->127|152->127|154->129|154->129|154->129|155->130|159->134|159->134|160->135|160->135|160->135|161->136|163->138|163->138|164->139|164->139|164->139|165->140|171->146|171->146|173->148|173->148|173->148|174->149|176->151|176->151|178->153|178->153|178->153|179->154|181->156|181->156|182->157|182->157|182->157|183->158|184->159|184->159|185->160|185->160|185->160|186->161|187->162|187->162|188->163|234->209|234->209|234->209|235->210|235->210|235->210|235->210|236->211|237->212|238->213|238->213|238->213|239->214|239->214|239->214|240->215|240->215|240->215|241->216|242->217|242->217|242->217|243->218|243->218|243->218|244->219|244->219|244->219|246->221|247->222|259->234|260->235|261->236|262->237|263->238|264->239|265->240|266->241|267->242|268->243|269->244|271->246|272->247|304->279|304->279|304->279|304->279|305->280|305->280|305->280|309->284|309->284|309->284|310->285|314->289|316->291|316->291|316->291|317->292|317->292|317->292|318->293|318->293|318->293|318->293|318->293|319->294|320->295|322->297|322->297|322->297|322->297|323->298|323->298|323->298|327->302|327->302|327->302|328->303|332->307|333->308|362->337|362->337|363->338|363->338|363->338|364->339|367->342|367->342|368->343|374->349|374->349|375->350|375->350|376->351|376->351|378->353|383->358|383->358|384->359|385->360|385->360|387->362|387->362|387->362|388->363|389->364|389->364|391->366|391->366|391->366|392->367|392->367|392->367|392->367|393->368|393->368|395->370|395->370|395->370|396->371|398->373|398->373|399->374|399->374|399->374|399->374|399->374|400->375|400->375|401->376|401->376|403->378|403->378|403->378|404->379|404->379|404->379|405->380|405->380|405->380|405->380|405->380|406->381|406->381|406->381|406->381|406->381|407->382|408->383|408->383|409->384|409->384|411->386|411->386|411->386|412->387|414->389|414->389|415->390|416->391|416->391|417->392|417->392|419->394|419->394|419->394|420->395|422->397|422->397|424->399|424->399|425->400|425->400|425->400|425->400|425->400|425->400|425->400|426->401|427->402|427->402|433->408|433->408|434->409|436->411|436->411|438->413|439->414|439->414|440->415|441->416|441->416|441->416|441->416|441->416|450->425|450->425|450->425|450->425|450->425|450->425|450->425|450->425|450->425|450->425|450->425|450->425|450->425|450->425|458->433|458->433|459->434|459->434|461->436|464->439|464->439|465->440|467->442|467->442|468->443|468->443|468->443|469->444|470->445|470->445|470->445|470->445|470->445|471->446|472->447|472->447|473->448|473->448|483->458|483->458|484->459|489->464|489->464|490->465|498->473|498->473|499->474|499->474|499->474|500->475|503->478|503->478|504->479|504->479|504->479|504->479|504->479|505->480|505->480|505->480|506->481|509->484|509->484|510->485|510->485|511->486|511->486|512->487|512->487|512->487|513->488|519->494|519->494|519->494|519->494|519->494|520->495|522->497|522->497|523->498|525->500|525->500|526->501|526->501|527->502|527->502|528->503|528->503|532->507
                  -- GENERATED --
              */
          