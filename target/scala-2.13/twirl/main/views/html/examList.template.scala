
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
                        align-items: center;
                        grid-auto-flow: column;
                        grid-gap: 20px;
                    """),format.raw/*110.21*/("""}"""),format.raw/*110.22*/("""

                    """),format.raw/*112.21*/(""".pagination """),format.raw/*112.33*/("""{"""),format.raw/*112.34*/("""
                        """),format.raw/*113.25*/("""margin: 15px;
                        display: grid;
                        grid-auto-flow: column;
                        justify-content: center;
                    """),format.raw/*117.21*/("""}"""),format.raw/*117.22*/("""
                """),format.raw/*118.17*/(""".selected """),format.raw/*118.27*/("""{"""),format.raw/*118.28*/("""
                    """),format.raw/*119.21*/("""border: 2px solid #006aff;
                    background: #d2ddff;
                """),format.raw/*121.17*/("""}"""),format.raw/*121.18*/("""
            """),format.raw/*122.13*/("""</style>
</head>

<body>
<div class="wrapper">
    <h1 class="mb-1 text-2xl  tracking-tight leading-none text-gray-900 md:text-4xl lg:text-4xl dark:text-black">Student Exam List</h1>
    <div class="btn-select">

        <div class="input-fd">
            <select id="branch" name="branch" required>
                <option value="none" disabled selected>Select Branch</option>
                <option value="CSE">CSE</option>
                <option value="ECE">ECE</option>
                <option value="Mech">Mech</option>
                <option value="Civil">Civil</option>
                <option value="IT">IT</option>
            </select>
        </div>

        <div class="input-">
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
                <option value="none" disabled selected>Select Academic year</option>
                <option value="1">1</option>
                <option value="2">2</option>
                <option value="3">3</option>
                <option value="4">4</option>
            </select>
        </div>

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
        <th>Branch</th>
        <th>Admission Year</th>
        <th>Academic Year</th>
        <th>score</th>
        <th>Result</th>
<!--        <th>Admission Year</th>-->

        </thead>
        <tbody>
"""),format.raw/*202.44*/("""
"""),format.raw/*203.50*/("""
"""),format.raw/*204.70*/("""
"""),format.raw/*205.21*/("""
"""),format.raw/*206.45*/("""
"""),format.raw/*207.46*/("""
"""),format.raw/*208.44*/("""
"""),format.raw/*209.22*/("""
"""),format.raw/*210.32*/("""
"""),format.raw/*211.35*/("""
"""),format.raw/*212.18*/("""
"""),format.raw/*213.14*/("""
        """),format.raw/*214.9*/("""</tbody>
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
                """),format.raw/*226.81*/("""
                """),format.raw/*227.118*/("""
                """),format.raw/*228.72*/("""
                    """),format.raw/*229.84*/("""
                    """),format.raw/*230.137*/("""
                    """),format.raw/*231.54*/("""
                    """),format.raw/*232.58*/("""
                """),format.raw/*233.317*/("""
                    """),format.raw/*234.63*/("""
                    """),format.raw/*235.383*/("""
                    """),format.raw/*236.62*/("""

                """),format.raw/*238.52*/("""
            """),format.raw/*239.13*/("""</div>
        </div>
    </div>

    <div class="pagination flex items-center space-x-1">

        """),_display_(/*245.10*/paginatedList/*245.23*/.prevPage.map/*245.36*/ { page =>_display_(Seq[Any](format.raw/*245.46*/("""
        """),format.raw/*246.9*/("""<a href=""""),_display_(/*246.19*/link(page)),format.raw/*246.29*/("""" class="flex items-center px-4 py-2 text-gray-500 bg-gray-300 rounded-md">
            <svg aria-hidden="true" class="mr-2 w-5 h-5" fill="currentColor" viewBox="0 0 20 20" xmlns="http://www.w3.org/2000/svg"><path fill-rule="evenodd" d="M7.707 14.707a1 1 0 01-1.414 0l-4-4a1 1 0 010-1.414l4-4a1 1 0 011.414 1.414L5.414 9H17a1 1 0 110 2H5.414l2.293 2.293a1 1 0 010 1.414z" clip-rule="evenodd"></path></svg>
<!--            Previous-->
        </a>
        """)))}/*250.10*/.getOrElse/*250.20*/{_display_(Seq[Any](format.raw/*250.21*/("""
        """),format.raw/*251.9*/("""<a disabled class="flex items-center px-4 py-2 text-gray-500 bg-gray-300 rounded-md">
            <svg aria-hidden="true" class="mr-2 w-5 h-5" fill="currentColor" viewBox="0 0 20 20" xmlns="http://www.w3.org/2000/svg"><path fill-rule="evenodd" d="M7.707 14.707a1 1 0 01-1.414 0l-4-4a1 1 0 010-1.414l4-4a1 1 0 011.414 1.414L5.414 9H17a1 1 0 110 2H5.414l2.293 2.293a1 1 0 010 1.414z" clip-rule="evenodd"></path></svg>
<!--            Previous-->
        </a>
        """)))}),format.raw/*255.10*/("""

        """),_display_(/*257.10*/for(pageNumber <- paginatedList.lowbound+1 to paginatedList.high ) yield /*257.76*/ {_display_(Seq[Any](format.raw/*257.78*/("""
        """),format.raw/*258.9*/("""<a href=""""),_display_(/*258.19*/link(pageNumber)),format.raw/*258.35*/("""" class="px-4 py-2 text-gray-700 bg-gray-200 rounded-md hover:bg-blue-400 hover:text-white">"""),_display_(/*258.128*/pageNumber),format.raw/*258.138*/("""</a>
        """)))}),format.raw/*259.10*/("""

        """),_display_(/*261.10*/paginatedList/*261.23*/.nextPage.map/*261.36*/ { page =>_display_(Seq[Any](format.raw/*261.46*/("""
        """),format.raw/*262.9*/("""<a href=""""),_display_(/*262.19*/link(page)),format.raw/*262.29*/("""" class="flex items-center px-4 py-2 text-gray-500 bg-gray-300 rounded-md">
<!--            Next-->
            <svg aria-hidden="true" class="ml-2 w-5 h-5" fill="currentColor" viewBox="0 0 20 20" xmlns="http://www.w3.org/2000/svg"><path fill-rule="evenodd" d="M12.293 5.293a1 1 0 011.414 0l4 4a1 1 0 010 1.414l-4 4a1 1 0 01-1.414-1.414L14.586 11H3a1 1 0 110-2h11.586l-2.293-2.293a1 1 0 010-1.414z" clip-rule="evenodd"></path></svg>
        </a>
        """)))}/*266.10*/.getOrElse/*266.20*/ {_display_(Seq[Any](format.raw/*266.22*/("""
        """),format.raw/*267.9*/("""<a href="#" disabled class="flex items-center px-4 py-2 text-gray-500 bg-gray-300 rounded-md">
<!--            Next-->
            <svg aria-hidden="true" class="ml-2 w-5 h-5" fill="currentColor" viewBox="0 0 20 20" xmlns="http://www.w3.org/2000/svg"><path fill-rule="evenodd" d="M12.293 5.293a1 1 0 011.414 0l4 4a1 1 0 010 1.414l-4 4a1 1 0 01-1.414-1.414L14.586 11H3a1 1 0 110-2h11.586l-2.293-2.293a1 1 0 010-1.414z" clip-rule="evenodd"></path></svg>
        </a>
        """)))}),format.raw/*271.10*/("""
    """),format.raw/*272.5*/("""</div>

</div>
<script src="assets/javascripts/filter.js"></script>
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


                function selectRow(row) """),format.raw/*289.41*/("""{"""),format.raw/*289.42*/("""
                    """),format.raw/*290.21*/("""row.addEventListener("click", function (e) """),format.raw/*290.64*/("""{"""),format.raw/*290.65*/("""
                        """),format.raw/*291.25*/("""let select_row = e.target.parentElement;

                        // select only one row
                        Array.from(std_row).forEach(el => """),format.raw/*294.59*/("""{"""),format.raw/*294.60*/("""
                            """),format.raw/*295.29*/("""if (el != this)
                                el.classList.remove("selected")
                            else
                                el.classList.toggle("selected") ?
                                        prn = select_row.getAttribute("data-id") :
                                        prn = undefined
                        """),format.raw/*301.25*/("""}"""),format.raw/*301.26*/(""");
                    """),format.raw/*302.21*/("""}"""),format.raw/*302.22*/(""");
                """),format.raw/*303.17*/("""}"""),format.raw/*303.18*/("""

                """),format.raw/*305.17*/("""// Add eventlistener to all rows
                Array.from(std_row).forEach(row => selectRow(row));


                close_btn.onclick = () => """),format.raw/*309.43*/("""{"""),format.raw/*309.44*/("""
                    """),format.raw/*310.21*/("""popup.classList.toggle("popped");
                """),format.raw/*311.17*/("""}"""),format.raw/*311.18*/("""

                """),format.raw/*313.17*/("""insertBtn.onclick = () => """),format.raw/*313.43*/("""{"""),format.raw/*313.44*/("""
                    """),format.raw/*314.21*/("""window.location.href = """"),_display_(/*314.46*/routes/*314.52*/.Application.index()),format.raw/*314.72*/(""""
                """),format.raw/*315.17*/("""}"""),format.raw/*315.18*/("""

                """),format.raw/*317.17*/("""updateBtn.onclick = () => """),format.raw/*317.43*/("""{"""),format.raw/*317.44*/("""
                    """),format.raw/*318.21*/("""if(! prn)
                        popup.classList.toggle("popped");
                    else """),format.raw/*320.26*/("""{"""),format.raw/*320.27*/("""
                        """),format.raw/*321.25*/("""location.href = `/udate2?student_prn=$"""),format.raw/*321.63*/("""{"""),format.raw/*321.64*/("""prn"""),format.raw/*321.67*/("""}"""),format.raw/*321.68*/("""`;
                    """),format.raw/*322.21*/("""}"""),format.raw/*322.22*/("""
                """),format.raw/*323.17*/("""}"""),format.raw/*323.18*/("""

                """),format.raw/*325.17*/("""search_btn.addEventListener("click", e => """),format.raw/*325.59*/("""{"""),format.raw/*325.60*/("""
                    """),format.raw/*326.21*/("""let q = default_search.value
                    renderAndFetch(`/examSearch?q=$"""),format.raw/*327.52*/("""{"""),format.raw/*327.53*/("""q"""),format.raw/*327.54*/("""}"""),format.raw/*327.55*/("""`);
                """),format.raw/*328.17*/("""}"""),format.raw/*328.18*/(""");

                async function renderAndFetch(url)"""),format.raw/*330.51*/("""{"""),format.raw/*330.52*/("""
                    """),format.raw/*331.21*/("""let response = await fetch(url, """),format.raw/*331.53*/("""{"""),format.raw/*331.54*/("""
                        """),format.raw/*332.25*/("""method: "GET"
                    """),format.raw/*333.21*/("""}"""),format.raw/*333.22*/(""");
                    let students = await response.json();
                    console.log(students)

                    var tbody = document.createElement("tbody")

                    if(students.length === 0)"""),format.raw/*339.46*/("""{"""),format.raw/*339.47*/("""
                        """),format.raw/*340.25*/("""popup.getElementsByClassName("inner-container")[0].innerHTML = "No data";
                        popup.classList.toggle("popped");
                    """),format.raw/*342.21*/("""}"""),format.raw/*342.22*/("""

                    """),format.raw/*344.21*/("""// create row, remove existing rows and append new ones
                    for(var i=0; i<students.length; i++)"""),format.raw/*345.57*/("""{"""),format.raw/*345.58*/("""

                        """),format.raw/*347.25*/("""let id = students[i].id["$oid"]
                        let name = students[i].name
                        let branch = students[i].branch
                        let prn = students[i].id["$oid"]
                        let admission_year = students[i].year
                        let """),format.raw/*352.29*/("""{"""),format.raw/*352.30*/("""year,score,result"""),format.raw/*352.47*/("""}"""),format.raw/*352.48*/(""" """),format.raw/*352.49*/("""= students[i].acad_year.filter(y => y.year === acad_year_value)[0]


                        let row = tbody.insertRow(i)
                        row.classList.add("std-row");
                        row.setAttribute("data-id", prn)

                        row.insertCell(0).innerHTML = name
                        row.insertCell(1).innerHTML = branch
                        row.insertCell(2).innerHTML = admission_year
                        row.insertCell(3).innerHTML = year
                        row.insertCell(4).innerHTML = score
                        row.insertCell(5).innerHTML = result
                        selectRow(row);

                        tbody.appendChild(row)
                        table.tBodies[0].parentNode.replaceChild(tbody,table.tBodies[0])
                    """),format.raw/*369.21*/("""}"""),format.raw/*369.22*/("""
                """),format.raw/*370.17*/("""}"""),format.raw/*370.18*/("""

            """),format.raw/*372.13*/("""</script>
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
                  HASH: 3dc8fbc2f13f3e752d3b2c653ec2e4dc83346560
                  MATRIX: 432->1|799->47|916->132|927->136|1024->86|1055->129|1083->203|1113->208|1130->217|1168->218|1197->220|1377->372|1406->373|1456->395|1521->432|1550->433|1596->451|1628->455|1657->456|1707->478|1763->506|1792->507|1842->529|1875->534|1904->535|1958->561|2072->647|2101->648|2151->670|2186->677|2215->678|2269->704|2433->840|2462->841|2512->863|2546->869|2575->870|2629->896|2926->1165|2955->1166|3005->1188|3042->1197|3071->1198|3125->1224|3243->1314|3272->1315|3324->1339|3359->1346|3388->1347|3442->1373|3954->1857|3983->1858|4033->1880|4068->1887|4097->1888|4151->1914|4215->1950|4244->1951|4296->1975|4341->1992|4370->1993|4424->2019|4804->2371|4833->2372|4885->2396|4923->2406|4952->2407|5006->2433|5237->2636|5266->2637|5316->2659|5364->2679|5393->2680|5447->2706|5558->2789|5587->2790|5637->2812|5681->2828|5710->2829|5764->2855|5828->2891|5857->2892|5905->2912|5955->2934|5984->2935|6034->2957|6216->3111|6245->3112|6293->3132|6344->3155|6373->3156|6423->3178|6572->3299|6601->3300|6653->3324|6690->3333|6719->3334|6774->3360|6838->3395|6868->3396|6921->3420|6962->3432|6992->3433|7047->3459|7334->3717|7364->3718|7417->3742|7458->3754|7488->3755|7543->3781|7746->3955|7776->3956|7823->3974|7862->3984|7892->3985|7943->4007|8058->4093|8088->4094|8131->4108|13663->9654|13694->9705|13725->9776|13756->9798|13787->9844|13818->9891|13849->9936|13880->9959|13911->9992|13942->10028|13973->10047|14004->10062|14042->10072|14940->11005|14988->11124|15035->11197|15086->11282|15138->11420|15189->11475|15240->11534|15288->11852|15339->11916|15391->12300|15442->12363|15491->12418|15534->12432|15669->12539|15692->12552|15715->12565|15764->12575|15802->12585|15840->12595|15872->12605|16352->13065|16372->13075|16412->13076|16450->13086|16952->13556|16993->13569|17076->13635|17117->13637|17155->13647|17193->13657|17231->13673|17353->13766|17386->13776|17433->13791|17474->13804|17497->13817|17520->13830|17569->13840|17607->13850|17645->13860|17677->13870|18156->14329|18176->14339|18217->14341|18255->14351|18765->14829|18799->14835|19587->15594|19617->15595|19668->15617|19740->15660|19770->15661|19825->15687|20004->15837|20034->15838|20093->15868|20470->16216|20500->16217|20553->16241|20583->16242|20632->16262|20662->16263|20711->16283|20889->16432|20919->16433|20970->16455|21050->16506|21080->16507|21129->16527|21184->16553|21214->16554|21265->16576|21318->16601|21334->16607|21376->16627|21424->16646|21454->16647|21503->16667|21558->16693|21588->16694|21639->16716|21763->16811|21793->16812|21848->16838|21915->16876|21945->16877|21977->16880|22007->16881|22060->16905|22090->16906|22137->16924|22167->16925|22216->16945|22287->16987|22317->16988|22368->17010|22478->17091|22508->17092|22538->17093|22568->17094|22618->17115|22648->17116|22733->17172|22763->17173|22814->17195|22875->17227|22905->17228|22960->17254|23024->17289|23054->17290|23303->17510|23333->17511|23388->17537|23571->17691|23601->17692|23654->17716|23796->17829|23826->17830|23883->17858|24204->18150|24234->18151|24280->18168|24310->18169|24340->18170|25186->18987|25216->18988|25263->19006|25293->19007|25338->19023
                  LINES: 17->1|22->2|26->5|26->5|29->2|31->4|32->7|34->9|34->9|34->9|35->10|41->16|41->16|42->17|43->18|43->18|44->19|44->19|44->19|45->20|46->21|46->21|47->22|47->22|47->22|48->23|50->25|50->25|51->26|51->26|51->26|52->27|55->30|55->30|56->31|56->31|56->31|57->32|63->38|63->38|64->39|64->39|64->39|65->40|67->42|67->42|69->44|69->44|69->44|70->45|81->56|81->56|82->57|82->57|82->57|83->58|84->59|84->59|86->61|86->61|86->61|87->62|94->69|94->69|96->71|96->71|96->71|97->72|102->77|102->77|103->78|103->78|103->78|104->79|106->81|106->81|107->82|107->82|107->82|108->83|109->84|109->84|111->86|111->86|111->86|112->87|116->91|116->91|118->93|118->93|118->93|119->94|122->97|122->97|124->99|124->99|124->99|125->100|126->101|126->101|128->103|128->103|128->103|129->104|135->110|135->110|137->112|137->112|137->112|138->113|142->117|142->117|143->118|143->118|143->118|144->119|146->121|146->121|147->122|227->202|228->203|229->204|230->205|231->206|232->207|233->208|234->209|235->210|236->211|237->212|238->213|239->214|251->226|252->227|253->228|254->229|255->230|256->231|257->232|258->233|259->234|260->235|261->236|263->238|264->239|270->245|270->245|270->245|270->245|271->246|271->246|271->246|275->250|275->250|275->250|276->251|280->255|282->257|282->257|282->257|283->258|283->258|283->258|283->258|283->258|284->259|286->261|286->261|286->261|286->261|287->262|287->262|287->262|291->266|291->266|291->266|292->267|296->271|297->272|314->289|314->289|315->290|315->290|315->290|316->291|319->294|319->294|320->295|326->301|326->301|327->302|327->302|328->303|328->303|330->305|334->309|334->309|335->310|336->311|336->311|338->313|338->313|338->313|339->314|339->314|339->314|339->314|340->315|340->315|342->317|342->317|342->317|343->318|345->320|345->320|346->321|346->321|346->321|346->321|346->321|347->322|347->322|348->323|348->323|350->325|350->325|350->325|351->326|352->327|352->327|352->327|352->327|353->328|353->328|355->330|355->330|356->331|356->331|356->331|357->332|358->333|358->333|364->339|364->339|365->340|367->342|367->342|369->344|370->345|370->345|372->347|377->352|377->352|377->352|377->352|377->352|394->369|394->369|395->370|395->370|397->372
                  -- GENERATED --
              */
          