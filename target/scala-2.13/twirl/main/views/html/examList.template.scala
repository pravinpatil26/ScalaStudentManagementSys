
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

object examList extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Paginator[ExamStudent],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(paginatedList: Paginator[ExamStudent]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*5.2*/link/*5.6*/(newPage: Int) = {{
routes.Application.examStudentList(newPage)
}};
Seq[Any](format.raw/*2.41*/("""

"""),format.raw/*4.40*/("""
"""),format.raw/*7.2*/("""

"""),_display_(/*9.2*/dashboard/*9.11*/{_display_(Seq[Any](format.raw/*9.12*/("""
"""),format.raw/*10.1*/("""<!DOCTYPE html>
<html>
<head>
    <title>Students</title>
    <script src="https://cdn.tailwindcss.com"></script>
    <style>
                html"""),format.raw/*16.21*/("""{"""),format.raw/*16.22*/("""
                    """),format.raw/*17.21*/("""position: relative;
                """),format.raw/*18.17*/("""}"""),format.raw/*18.18*/("""
                """),format.raw/*19.17*/("""body"""),format.raw/*19.21*/("""{"""),format.raw/*19.22*/("""
                    """),format.raw/*20.21*/("""margin: 0;
                """),format.raw/*21.17*/("""}"""),format.raw/*21.18*/("""
                    """),format.raw/*22.21*/("""table"""),format.raw/*22.26*/("""{"""),format.raw/*22.27*/("""
                        """),format.raw/*23.25*/("""width: 100%;
                        border-collapse: collapse;
                    """),format.raw/*25.21*/("""}"""),format.raw/*25.22*/("""
                    """),format.raw/*26.21*/("""td, th """),format.raw/*26.28*/("""{"""),format.raw/*26.29*/("""
                        """),format.raw/*27.25*/("""border: 1px solid #dddddd;
                        text-align: center;
                        padding:6px 20px;
                    """),format.raw/*30.21*/("""}"""),format.raw/*30.22*/("""
                    """),format.raw/*31.21*/("""tr th """),format.raw/*31.27*/("""{"""),format.raw/*31.28*/("""
                        """),format.raw/*32.25*/("""border: 1px solid #dddddd;
                        text-align: center;
                        padding:6px 20px;
                        background-color: #fffacf;
                        color: black;
                        font-size: 18px;
                    """),format.raw/*38.21*/("""}"""),format.raw/*38.22*/("""
                    """),format.raw/*39.21*/("""tr:hover """),format.raw/*39.30*/("""{"""),format.raw/*39.31*/("""
                        """),format.raw/*40.25*/("""background-color: #dddddd;
                        cursor: pointer;
                    """),format.raw/*42.21*/("""}"""),format.raw/*42.22*/("""

                    """),format.raw/*44.21*/(""".popup """),format.raw/*44.28*/("""{"""),format.raw/*44.29*/("""
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

                    """),format.raw/*61.21*/(""".popup-container """),format.raw/*61.38*/("""{"""),format.raw/*61.39*/("""
                        """),format.raw/*62.25*/("""background: white;
                        width: 470px;
                        height: 230px;
                        display: grid;
                        border-radius: 3px;
                        box-shadow: 1px 1px 7px 4px #d6d6d6b5, -2px 2px 8px 4px #f1eeee4f;
                        grid-template-rows: 65px auto;
                    """),format.raw/*69.21*/("""}"""),format.raw/*69.22*/("""

                    """),format.raw/*71.21*/(""".close-btn"""),format.raw/*71.31*/("""{"""),format.raw/*71.32*/("""
                        """),format.raw/*72.25*/("""justify-self: end;
                        align-self: center;
                        top: 7px;
                        right: 19px;
                        position: relative;
                    """),format.raw/*77.21*/("""}"""),format.raw/*77.22*/("""
                    """),format.raw/*78.21*/(""".inner-container h2 """),format.raw/*78.41*/("""{"""),format.raw/*78.42*/("""
                        """),format.raw/*79.25*/("""text-align: center;
                        font-size: 15px;
                    """),format.raw/*81.21*/("""}"""),format.raw/*81.22*/("""
                    """),format.raw/*82.21*/(""".inner-container"""),format.raw/*82.37*/("""{"""),format.raw/*82.38*/("""
                        """),format.raw/*83.25*/("""padding: 15px;
                    """),format.raw/*84.21*/("""}"""),format.raw/*84.22*/("""

                """),format.raw/*86.17*/(""".inner-container form """),format.raw/*86.39*/("""{"""),format.raw/*86.40*/("""
                    """),format.raw/*87.21*/("""margin-top: 10px;
                    display: grid;
                    grid-gap: 20px;
                    justify-content: center;
                """),format.raw/*91.17*/("""}"""),format.raw/*91.18*/("""

                """),format.raw/*93.17*/(""".inner-container select"""),format.raw/*93.40*/("""{"""),format.raw/*93.41*/("""
                    """),format.raw/*94.21*/("""outline: 2px solid #006aff;
                    padding: 5px;
                    border-radius: 3px;
                """),format.raw/*97.17*/("""}"""),format.raw/*97.18*/("""

                    """),format.raw/*99.21*/(""".wrapper """),format.raw/*99.30*/("""{"""),format.raw/*99.31*/("""
                        """),format.raw/*100.25*/("""margin: 20px;
                    """),format.raw/*101.21*/("""}"""),format.raw/*101.22*/("""

                    """),format.raw/*103.21*/(""".btn-select """),format.raw/*103.33*/("""{"""),format.raw/*103.34*/("""
                        """),format.raw/*104.25*/("""margin: 10px;
                        display: grid;
                        justify-content: end;
                        grid-auto-flow: column;
                        grid-gap: 20px;
                    """),format.raw/*109.21*/("""}"""),format.raw/*109.22*/("""

                    """),format.raw/*111.21*/(""".pagination """),format.raw/*111.33*/("""{"""),format.raw/*111.34*/("""
                        """),format.raw/*112.25*/("""margin: 15px;
                        display: grid;
                        grid-auto-flow: column;
                        justify-content: center;
                    """),format.raw/*116.21*/("""}"""),format.raw/*116.22*/("""
                """),format.raw/*117.17*/(""".selected """),format.raw/*117.27*/("""{"""),format.raw/*117.28*/("""
                    """),format.raw/*118.21*/("""border: 2px solid #006aff;
                    background: #d2ddff;
                """),format.raw/*120.17*/("""}"""),format.raw/*120.18*/("""
            """),format.raw/*121.13*/("""</style>
</head>

<body>
<div class="wrapper">
    <h1 class="mb-1 text-2xl  tracking-tight leading-none text-gray-900 md:text-4xl lg:text-4xl dark:text-black">Student Exam List</h1>
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
        <th>Registration No</th>
        <th>Branch</th>
<!--        <th>Admission Year</th>-->

        </thead>
        <tbody>
        """),_display_(/*166.10*/for(d <- paginatedList.items) yield /*166.39*/{_display_(Seq[Any](format.raw/*166.40*/("""
        """),format.raw/*167.9*/("""<tr class="std-row" data-id=""""),_display_(/*167.39*/d/*167.40*/.prn),format.raw/*167.44*/("""">
            """),format.raw/*168.66*/("""
            """),format.raw/*169.13*/("""<td>
                """),_display_(/*170.18*/d/*170.19*/.name.get("firstname")),format.raw/*170.41*/("""
                """),_display_(/*171.18*/d/*171.19*/.name.get("middlename")),format.raw/*171.42*/("""
                """),_display_(/*172.18*/d/*172.19*/.name.get("lastname")),format.raw/*172.40*/("""
            """),format.raw/*173.13*/("""</td>
            <td>"""),_display_(/*174.18*/d/*174.19*/.prn),format.raw/*174.23*/("""</td>
            <td>"""),_display_(/*175.18*/d/*175.19*/.branch),format.raw/*175.26*/("""</td>
        </tr>
        """)))}),format.raw/*177.10*/("""
        """),format.raw/*178.9*/("""</tbody>
    </table>

    <div class="popup">
        <div class="popup-container">
            <button type="button" class="close-btn text-white bg-blue-700 hover:bg-blue-800 focus:ring-4 focus:outline-none focus:ring-blue-300 font-medium rounded-full text-sm p-2.5 text-center inline-flex items-center mr-2 dark:bg-blue-600 dark:hover:bg-blue-700 dark:focus:ring-blue-800">
                <svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 20 20" fill="currentColor" class="w-5 h-5">
                    <path d="M6.28 5.22a.75.75 0 00-1.06 1.06L8.94 10l-3.72 3.72a.75.75 0 101.06 1.06L10 11.06l3.72 3.72a.75.75 0 101.06-1.06L11.06 10l3.72-3.72a.75.75 0 00-1.06-1.06L10 8.94 6.28 5.22z" />
                </svg>
            </button>
            <div class="inner-container">
                <h1>First Select a student to update</h1>
                """),format.raw/*190.81*/("""
                """),format.raw/*191.118*/("""
                """),format.raw/*192.72*/("""
                    """),format.raw/*193.84*/("""
                    """),format.raw/*194.137*/("""
                    """),format.raw/*195.54*/("""
                    """),format.raw/*196.58*/("""
                """),format.raw/*197.317*/("""
                    """),format.raw/*198.63*/("""
                    """),format.raw/*199.383*/("""
                    """),format.raw/*200.62*/("""

                """),format.raw/*202.52*/("""
            """),format.raw/*203.13*/("""</div>
        </div>
    </div>

    <div class="pagination flex items-center space-x-1">

        """),_display_(/*209.10*/paginatedList/*209.23*/.prevPage.map/*209.36*/ { page =>_display_(Seq[Any](format.raw/*209.46*/("""
        """),format.raw/*210.9*/("""<a href=""""),_display_(/*210.19*/link(page)),format.raw/*210.29*/("""" class="flex items-center px-4 py-2 text-gray-500 bg-gray-300 rounded-md">
            <svg aria-hidden="true" class="mr-2 w-5 h-5" fill="currentColor" viewBox="0 0 20 20" xmlns="http://www.w3.org/2000/svg"><path fill-rule="evenodd" d="M7.707 14.707a1 1 0 01-1.414 0l-4-4a1 1 0 010-1.414l4-4a1 1 0 011.414 1.414L5.414 9H17a1 1 0 110 2H5.414l2.293 2.293a1 1 0 010 1.414z" clip-rule="evenodd"></path></svg>
<!--            Previous-->
        </a>
        """)))}/*214.10*/.getOrElse/*214.20*/{_display_(Seq[Any](format.raw/*214.21*/("""
        """),format.raw/*215.9*/("""<a disabled class="flex items-center px-4 py-2 text-gray-500 bg-gray-300 rounded-md">
            <svg aria-hidden="true" class="mr-2 w-5 h-5" fill="currentColor" viewBox="0 0 20 20" xmlns="http://www.w3.org/2000/svg"><path fill-rule="evenodd" d="M7.707 14.707a1 1 0 01-1.414 0l-4-4a1 1 0 010-1.414l4-4a1 1 0 011.414 1.414L5.414 9H17a1 1 0 110 2H5.414l2.293 2.293a1 1 0 010 1.414z" clip-rule="evenodd"></path></svg>
<!--            Previous-->
        </a>
        """)))}),format.raw/*219.10*/("""

        """),_display_(/*221.10*/for(pageNumber <- paginatedList.lowbound+1 to paginatedList.high ) yield /*221.76*/ {_display_(Seq[Any](format.raw/*221.78*/("""
        """),format.raw/*222.9*/("""<a href=""""),_display_(/*222.19*/link(pageNumber)),format.raw/*222.35*/("""" class="px-4 py-2 text-gray-700 bg-gray-200 rounded-md hover:bg-blue-400 hover:text-white">"""),_display_(/*222.128*/pageNumber),format.raw/*222.138*/("""</a>
        """)))}),format.raw/*223.10*/("""

        """),_display_(/*225.10*/paginatedList/*225.23*/.nextPage.map/*225.36*/ { page =>_display_(Seq[Any](format.raw/*225.46*/("""
        """),format.raw/*226.9*/("""<a href=""""),_display_(/*226.19*/link(page)),format.raw/*226.29*/("""" class="flex items-center px-4 py-2 text-gray-500 bg-gray-300 rounded-md">
<!--            Next-->
            <svg aria-hidden="true" class="ml-2 w-5 h-5" fill="currentColor" viewBox="0 0 20 20" xmlns="http://www.w3.org/2000/svg"><path fill-rule="evenodd" d="M12.293 5.293a1 1 0 011.414 0l4 4a1 1 0 010 1.414l-4 4a1 1 0 01-1.414-1.414L14.586 11H3a1 1 0 110-2h11.586l-2.293-2.293a1 1 0 010-1.414z" clip-rule="evenodd"></path></svg>
        </a>
        """)))}/*230.10*/.getOrElse/*230.20*/ {_display_(Seq[Any](format.raw/*230.22*/("""
        """),format.raw/*231.9*/("""<a href="#" disabled class="flex items-center px-4 py-2 text-gray-500 bg-gray-300 rounded-md">
<!--            Next-->
            <svg aria-hidden="true" class="ml-2 w-5 h-5" fill="currentColor" viewBox="0 0 20 20" xmlns="http://www.w3.org/2000/svg"><path fill-rule="evenodd" d="M12.293 5.293a1 1 0 011.414 0l4 4a1 1 0 010 1.414l-4 4a1 1 0 01-1.414-1.414L14.586 11H3a1 1 0 110-2h11.586l-2.293-2.293a1 1 0 010-1.414z" clip-rule="evenodd"></path></svg>
        </a>
        """)))}),format.raw/*235.10*/("""
    """),format.raw/*236.5*/("""</div>

</div>
<script>
                let popup = document.getElementsByClassName("popup")[0];
                let updateBtn = document.getElementById("updateBtn");
                let insertBtn = document.getElementById("insertBtn");
                let close_btn = document.getElementsByClassName("close-btn")[0];
                let std_row = document.getElementsByClassName("std-row");
                let search_btn = document.getElementById("search-btn");
                let default_search = document.getElementById("default-search");

                let table = document.getElementById("student-table");
                let stu_aadhar;


                function selectRow(row) """),format.raw/*252.41*/("""{"""),format.raw/*252.42*/("""
                    """),format.raw/*253.21*/("""row.addEventListener("click", function (e) """),format.raw/*253.64*/("""{"""),format.raw/*253.65*/("""
                        """),format.raw/*254.25*/("""let select_row = e.target.parentElement;

                        // select only one row
                        Array.from(std_row).forEach(el => """),format.raw/*257.59*/("""{"""),format.raw/*257.60*/("""
                            """),format.raw/*258.29*/("""if (el != this)
                                el.classList.remove("selected")
                            else
                                el.classList.toggle("selected") ?
                                        prn = select_row.getAttribute("data-id") :
                                        prn = undefined
                        """),format.raw/*264.25*/("""}"""),format.raw/*264.26*/(""");
                    """),format.raw/*265.21*/("""}"""),format.raw/*265.22*/(""");
                """),format.raw/*266.17*/("""}"""),format.raw/*266.18*/("""

                """),format.raw/*268.17*/("""// Add eventlistener to all rows
                Array.from(std_row).forEach(row => selectRow(row));


                close_btn.onclick = () => """),format.raw/*272.43*/("""{"""),format.raw/*272.44*/("""
                    """),format.raw/*273.21*/("""popup.classList.toggle("popped");
                """),format.raw/*274.17*/("""}"""),format.raw/*274.18*/("""

                """),format.raw/*276.17*/("""insertBtn.onclick = () => """),format.raw/*276.43*/("""{"""),format.raw/*276.44*/("""
                    """),format.raw/*277.21*/("""window.location.href = """"),_display_(/*277.46*/routes/*277.52*/.Application.index()),format.raw/*277.72*/(""""
                """),format.raw/*278.17*/("""}"""),format.raw/*278.18*/("""

                """),format.raw/*280.17*/("""updateBtn.onclick = () => """),format.raw/*280.43*/("""{"""),format.raw/*280.44*/("""
                    """),format.raw/*281.21*/("""if(! prn)
                        popup.classList.toggle("popped");
                    else """),format.raw/*283.26*/("""{"""),format.raw/*283.27*/("""
                        """),format.raw/*284.25*/("""location.href = `/udate2?student_prn=$"""),format.raw/*284.63*/("""{"""),format.raw/*284.64*/("""prn"""),format.raw/*284.67*/("""}"""),format.raw/*284.68*/("""`;
                    """),format.raw/*285.21*/("""}"""),format.raw/*285.22*/("""
                """),format.raw/*286.17*/("""}"""),format.raw/*286.18*/("""

                """),format.raw/*288.17*/("""search_btn.addEventListener("click", e => """),format.raw/*288.59*/("""{"""),format.raw/*288.60*/("""
                    """),format.raw/*289.21*/("""let q = default_search.value
                    renderAndFetch(q);
                """),format.raw/*291.17*/("""}"""),format.raw/*291.18*/(""");

                async function renderAndFetch(q)"""),format.raw/*293.49*/("""{"""),format.raw/*293.50*/("""
                    """),format.raw/*294.21*/("""let response = await fetch(`/examSearch?q=$"""),format.raw/*294.64*/("""{"""),format.raw/*294.65*/("""q"""),format.raw/*294.66*/("""}"""),format.raw/*294.67*/("""`, """),format.raw/*294.70*/("""{"""),format.raw/*294.71*/("""
                        """),format.raw/*295.25*/("""method: "GET"
                    """),format.raw/*296.21*/("""}"""),format.raw/*296.22*/(""");
                    let students = await response.json();


                    var tbody = document.createElement("tbody")

                    if(students.length === 0)"""),format.raw/*302.46*/("""{"""),format.raw/*302.47*/("""
                        """),format.raw/*303.25*/("""popup.getElementsByClassName("inner-container")[0].innerHTML = "No data";
                        popup.classList.toggle("popped");
                    """),format.raw/*305.21*/("""}"""),format.raw/*305.22*/("""

                    """),format.raw/*307.21*/("""// create row, remove existing rows and append new ones
                    for(var i=0; i<students.length; i++)"""),format.raw/*308.57*/("""{"""),format.raw/*308.58*/("""
                        """),format.raw/*309.25*/("""let id = students[i].id["$oid"]
                        let """),format.raw/*310.29*/("""{"""),format.raw/*310.30*/("""firstname,middlename, lastname"""),format.raw/*310.60*/("""}"""),format.raw/*310.61*/(""" """),format.raw/*310.62*/("""= students[i].name
                        let branch = students[i].branch
                        let prn = students[i].prn
<!--                        let year = students[i].year.slice(5,9);-->

                        let row = tbody.insertRow(i)
                        row.classList.add("std-row");
                        row.setAttribute("data-id", prn)

                        row.insertCell(0).innerHTML = `$"""),format.raw/*319.57*/("""{"""),format.raw/*319.58*/("""firstname"""),format.raw/*319.67*/("""}"""),format.raw/*319.68*/(""" """),format.raw/*319.69*/("""$"""),format.raw/*319.70*/("""{"""),format.raw/*319.71*/("""middlename"""),format.raw/*319.81*/("""}"""),format.raw/*319.82*/(""" """),format.raw/*319.83*/("""$"""),format.raw/*319.84*/("""{"""),format.raw/*319.85*/("""lastname"""),format.raw/*319.93*/("""}"""),format.raw/*319.94*/("""`
                        row.insertCell(1).innerHTML = prn
                        row.insertCell(2).innerHTML = branch
<!--                        row.insertCell(3).innerHTML = year-->
                        selectRow(row);

                        tbody.appendChild(row)
                        table.tBodies[0].parentNode.replaceChild(tbody,table.tBodies[0])
                    """),format.raw/*327.21*/("""}"""),format.raw/*327.22*/("""
                """),format.raw/*328.17*/("""}"""),format.raw/*328.18*/("""

            """),format.raw/*330.13*/("""</script>
</body>
</html>
""")))}))
      }
    }
  }

  def render(paginatedList:Paginator[ExamStudent]): play.twirl.api.HtmlFormat.Appendable = apply(paginatedList)

  def f:((Paginator[ExamStudent]) => play.twirl.api.HtmlFormat.Appendable) = (paginatedList) => apply(paginatedList)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/examList.scala.html
                  HASH: 75aa79208d1fd59154a8799c5f984bc56629813b
                  MATRIX: 432->1|799->47|916->132|927->136|1024->86|1055->129|1083->203|1113->208|1130->217|1168->218|1197->220|1377->372|1406->373|1456->395|1521->432|1550->433|1596->451|1628->455|1657->456|1707->478|1763->506|1792->507|1842->529|1875->534|1904->535|1958->561|2072->647|2101->648|2151->670|2186->677|2215->678|2269->704|2433->840|2462->841|2512->863|2546->869|2575->870|2629->896|2926->1165|2955->1166|3005->1188|3042->1197|3071->1198|3125->1224|3243->1314|3272->1315|3324->1339|3359->1346|3388->1347|3442->1373|3954->1857|3983->1858|4033->1880|4068->1887|4097->1888|4151->1914|4215->1950|4244->1951|4296->1975|4341->1992|4370->1993|4424->2019|4804->2371|4833->2372|4885->2396|4923->2406|4952->2407|5006->2433|5237->2636|5266->2637|5316->2659|5364->2679|5393->2680|5447->2706|5558->2789|5587->2790|5637->2812|5681->2828|5710->2829|5764->2855|5828->2891|5857->2892|5905->2912|5955->2934|5984->2935|6034->2957|6216->3111|6245->3112|6293->3132|6344->3155|6373->3156|6423->3178|6572->3299|6601->3300|6653->3324|6690->3333|6719->3334|6774->3360|6838->3395|6868->3396|6921->3420|6962->3432|6992->3433|7047->3459|7288->3671|7318->3672|7371->3696|7412->3708|7442->3709|7497->3735|7700->3909|7730->3910|7777->3928|7816->3938|7846->3939|7897->3961|8012->4047|8042->4048|8085->4062|12259->8208|12305->8237|12345->8238|12383->8248|12441->8278|12452->8279|12478->8283|12523->8352|12566->8366|12617->8389|12628->8390|12672->8412|12719->8431|12730->8432|12775->8455|12822->8474|12833->8475|12876->8496|12919->8510|12971->8534|12982->8535|13008->8539|13060->8563|13071->8564|13100->8571|13163->8602|13201->8612|14099->9545|14147->9664|14194->9737|14245->9822|14297->9960|14348->10015|14399->10074|14447->10392|14498->10456|14550->10840|14601->10903|14650->10958|14693->10972|14828->11079|14851->11092|14874->11105|14923->11115|14961->11125|14999->11135|15031->11145|15511->11605|15531->11615|15571->11616|15609->11626|16111->12096|16152->12109|16235->12175|16276->12177|16314->12187|16352->12197|16390->12213|16512->12306|16545->12316|16592->12331|16633->12344|16656->12357|16679->12370|16728->12380|16766->12390|16804->12400|16836->12410|17315->12869|17335->12879|17376->12881|17414->12891|17924->13369|17958->13375|18692->14080|18722->14081|18773->14103|18845->14146|18875->14147|18930->14173|19109->14323|19139->14324|19198->14354|19575->14702|19605->14703|19658->14727|19688->14728|19737->14748|19767->14749|19816->14769|19994->14918|20024->14919|20075->14941|20155->14992|20185->14993|20234->15013|20289->15039|20319->15040|20370->15062|20423->15087|20439->15093|20481->15113|20529->15132|20559->15133|20608->15153|20663->15179|20693->15180|20744->15202|20868->15297|20898->15298|20953->15324|21020->15362|21050->15363|21082->15366|21112->15367|21165->15391|21195->15392|21242->15410|21272->15411|21321->15431|21392->15473|21422->15474|21473->15496|21588->15582|21618->15583|21701->15637|21731->15638|21782->15660|21854->15703|21884->15704|21914->15705|21944->15706|21976->15709|22006->15710|22061->15736|22125->15771|22155->15772|22363->15951|22393->15952|22448->15978|22631->16132|22661->16133|22714->16157|22856->16270|22886->16271|22941->16297|23031->16358|23061->16359|23120->16389|23150->16390|23180->16391|23636->16818|23666->16819|23704->16828|23734->16829|23764->16830|23794->16831|23824->16832|23863->16842|23893->16843|23923->16844|23953->16845|23983->16846|24020->16854|24050->16855|24471->17247|24501->17248|24548->17266|24578->17267|24623->17283
                  LINES: 17->1|22->2|26->5|26->5|29->2|31->4|32->7|34->9|34->9|34->9|35->10|41->16|41->16|42->17|43->18|43->18|44->19|44->19|44->19|45->20|46->21|46->21|47->22|47->22|47->22|48->23|50->25|50->25|51->26|51->26|51->26|52->27|55->30|55->30|56->31|56->31|56->31|57->32|63->38|63->38|64->39|64->39|64->39|65->40|67->42|67->42|69->44|69->44|69->44|70->45|81->56|81->56|82->57|82->57|82->57|83->58|84->59|84->59|86->61|86->61|86->61|87->62|94->69|94->69|96->71|96->71|96->71|97->72|102->77|102->77|103->78|103->78|103->78|104->79|106->81|106->81|107->82|107->82|107->82|108->83|109->84|109->84|111->86|111->86|111->86|112->87|116->91|116->91|118->93|118->93|118->93|119->94|122->97|122->97|124->99|124->99|124->99|125->100|126->101|126->101|128->103|128->103|128->103|129->104|134->109|134->109|136->111|136->111|136->111|137->112|141->116|141->116|142->117|142->117|142->117|143->118|145->120|145->120|146->121|191->166|191->166|191->166|192->167|192->167|192->167|192->167|193->168|194->169|195->170|195->170|195->170|196->171|196->171|196->171|197->172|197->172|197->172|198->173|199->174|199->174|199->174|200->175|200->175|200->175|202->177|203->178|215->190|216->191|217->192|218->193|219->194|220->195|221->196|222->197|223->198|224->199|225->200|227->202|228->203|234->209|234->209|234->209|234->209|235->210|235->210|235->210|239->214|239->214|239->214|240->215|244->219|246->221|246->221|246->221|247->222|247->222|247->222|247->222|247->222|248->223|250->225|250->225|250->225|250->225|251->226|251->226|251->226|255->230|255->230|255->230|256->231|260->235|261->236|277->252|277->252|278->253|278->253|278->253|279->254|282->257|282->257|283->258|289->264|289->264|290->265|290->265|291->266|291->266|293->268|297->272|297->272|298->273|299->274|299->274|301->276|301->276|301->276|302->277|302->277|302->277|302->277|303->278|303->278|305->280|305->280|305->280|306->281|308->283|308->283|309->284|309->284|309->284|309->284|309->284|310->285|310->285|311->286|311->286|313->288|313->288|313->288|314->289|316->291|316->291|318->293|318->293|319->294|319->294|319->294|319->294|319->294|319->294|319->294|320->295|321->296|321->296|327->302|327->302|328->303|330->305|330->305|332->307|333->308|333->308|334->309|335->310|335->310|335->310|335->310|335->310|344->319|344->319|344->319|344->319|344->319|344->319|344->319|344->319|344->319|344->319|344->319|344->319|344->319|344->319|352->327|352->327|353->328|353->328|355->330
                  -- GENERATED --
              */
          