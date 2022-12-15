
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

                """),format.raw/*44.17*/(""".popup, .deletePopup """),format.raw/*44.38*/("""{"""),format.raw/*44.39*/("""
                    """),format.raw/*45.21*/("""background: rgba(66, 62, 62, 0.12);
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
                """),format.raw/*56.17*/("""}"""),format.raw/*56.18*/("""
                """),format.raw/*57.17*/(""".popped"""),format.raw/*57.24*/("""{"""),format.raw/*57.25*/("""
                    """),format.raw/*58.21*/("""display: grid;
                """),format.raw/*59.17*/("""}"""),format.raw/*59.18*/("""

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

                """),format.raw/*88.17*/(""".inner-container h2 """),format.raw/*88.37*/("""{"""),format.raw/*88.38*/("""
                        """),format.raw/*89.25*/("""text-align: center;
                        font-size: 15px;
                    """),format.raw/*91.21*/("""}"""),format.raw/*91.22*/("""
                    """),format.raw/*92.21*/(""".inner-container"""),format.raw/*92.37*/("""{"""),format.raw/*92.38*/("""
                        """),format.raw/*93.25*/("""padding: 15px;
                    """),format.raw/*94.21*/("""}"""),format.raw/*94.22*/("""

                """),format.raw/*96.17*/(""".inner-container form """),format.raw/*96.39*/("""{"""),format.raw/*96.40*/("""
                    """),format.raw/*97.21*/("""margin-top: 10px;
                    display: grid;
                    grid-gap: 20px;
                    justify-content: center;
                """),format.raw/*101.17*/("""}"""),format.raw/*101.18*/("""

                """),format.raw/*103.17*/(""".inner-container select"""),format.raw/*103.40*/("""{"""),format.raw/*103.41*/("""
                    """),format.raw/*104.21*/("""outline: 2px solid #006aff;
                    padding: 5px;
                    border-radius: 3px;
                """),format.raw/*107.17*/("""}"""),format.raw/*107.18*/("""

                    """),format.raw/*109.21*/(""".wrapper """),format.raw/*109.30*/("""{"""),format.raw/*109.31*/("""
                        """),format.raw/*110.25*/("""margin: 20px;
                    """),format.raw/*111.21*/("""}"""),format.raw/*111.22*/("""

                """),format.raw/*113.17*/(""".btn-select """),format.raw/*113.29*/("""{"""),format.raw/*113.30*/("""
                    """),format.raw/*114.21*/("""margin: 10px;
                    display: grid;
                    /* justify-content: end; */
                    align-items: center;
                    grid-auto-flow: column;
                    grid-template-columns: auto 70px 70px 70px;
                """),format.raw/*120.17*/("""}"""),format.raw/*120.18*/("""

                    """),format.raw/*122.21*/(""".pagination """),format.raw/*122.33*/("""{"""),format.raw/*122.34*/("""
                        """),format.raw/*123.25*/("""margin: 15px;
                        display: grid;
                        grid-auto-flow: column;
                        justify-content: center;
                    """),format.raw/*127.21*/("""}"""),format.raw/*127.22*/("""
                """),format.raw/*128.17*/(""".selected """),format.raw/*128.27*/("""{"""),format.raw/*128.28*/("""
                    """),format.raw/*129.21*/("""border: 2px solid #006aff;
                    background: #d2ddff;
                """),format.raw/*131.17*/("""}"""),format.raw/*131.18*/("""
                """),format.raw/*132.17*/(""".btn-select > div """),format.raw/*132.35*/("""{"""),format.raw/*132.36*/("""
                    """),format.raw/*133.21*/("""display: grid;
                    justify-items: start;
                    grid-auto-flow: column;
                """),format.raw/*136.17*/("""}"""),format.raw/*136.18*/("""
                """),format.raw/*137.17*/(""".btn-select button """),format.raw/*137.36*/("""{"""),format.raw/*137.37*/("""
                    """),format.raw/*138.21*/("""justify-self: end;
                """),format.raw/*139.17*/("""}"""),format.raw/*139.18*/("""
            """),format.raw/*140.13*/("""</style>
</head>

<body>
<div class="wrapper">
    <h1 class="mb-1 text-2xl  tracking-tight leading-none text-gray-900 md:text-4xl lg:text-4xl dark:text-black">Student Exam List</h1>
    <div class="btn-select">
        <div>
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
                <option value="2017">2017 </option>
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
        </div>
"""),format.raw/*180.35*/("""
"""),format.raw/*181.99*/("""
"""),format.raw/*182.314*/("""
"""),format.raw/*183.23*/("""
"""),format.raw/*184.360*/("""
"""),format.raw/*185.307*/("""
"""),format.raw/*186.19*/("""
        """),format.raw/*187.9*/("""<button id="insertBtn" type="button" class="text-white bg-blue-700 hover:bg-blue-800 focus:ring-4 focus:outline-none focus:ring-blue-300 font-medium rounded-lg text-sm px-5 py-2.5 text-center inline-flex items-center dark:bg-blue-600 dark:hover:bg-blue-700 dark:focus:ring-blue-800">
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
"""),format.raw/*221.44*/("""
"""),format.raw/*222.50*/("""
"""),format.raw/*223.70*/("""
"""),format.raw/*224.21*/("""
"""),format.raw/*225.45*/("""
"""),format.raw/*226.46*/("""
"""),format.raw/*227.44*/("""
"""),format.raw/*228.22*/("""
"""),format.raw/*229.32*/("""
"""),format.raw/*230.35*/("""
"""),format.raw/*231.18*/("""
"""),format.raw/*232.14*/("""
        """),format.raw/*233.9*/("""</tbody>
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
                """),format.raw/*245.81*/("""
                """),format.raw/*246.118*/("""
                """),format.raw/*247.72*/("""
                    """),format.raw/*248.84*/("""
                    """),format.raw/*249.137*/("""
                    """),format.raw/*250.54*/("""
                    """),format.raw/*251.58*/("""
                """),format.raw/*252.317*/("""
                    """),format.raw/*253.63*/("""
                    """),format.raw/*254.383*/("""
                    """),format.raw/*255.62*/("""

                """),format.raw/*257.52*/("""
            """),format.raw/*258.13*/("""</div>
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

        """),_display_(/*287.10*/paginatedList/*287.23*/.prevPage.map/*287.36*/ { page =>_display_(Seq[Any](format.raw/*287.46*/("""
        """),format.raw/*288.9*/("""<a href=""""),_display_(/*288.19*/link(page)),format.raw/*288.29*/("""" class="flex items-center px-4 py-2 text-gray-500 bg-gray-300 rounded-md">
            <svg aria-hidden="true" class="mr-2 w-5 h-5" fill="currentColor" viewBox="0 0 20 20" xmlns="http://www.w3.org/2000/svg"><path fill-rule="evenodd" d="M7.707 14.707a1 1 0 01-1.414 0l-4-4a1 1 0 010-1.414l4-4a1 1 0 011.414 1.414L5.414 9H17a1 1 0 110 2H5.414l2.293 2.293a1 1 0 010 1.414z" clip-rule="evenodd"></path></svg>
<!--            Previous-->
        </a>
        """)))}/*292.10*/.getOrElse/*292.20*/{_display_(Seq[Any](format.raw/*292.21*/("""
        """),format.raw/*293.9*/("""<a disabled class="flex items-center px-4 py-2 text-gray-500 bg-gray-300 rounded-md">
            <svg aria-hidden="true" class="mr-2 w-5 h-5" fill="currentColor" viewBox="0 0 20 20" xmlns="http://www.w3.org/2000/svg"><path fill-rule="evenodd" d="M7.707 14.707a1 1 0 01-1.414 0l-4-4a1 1 0 010-1.414l4-4a1 1 0 011.414 1.414L5.414 9H17a1 1 0 110 2H5.414l2.293 2.293a1 1 0 010 1.414z" clip-rule="evenodd"></path></svg>
<!--            Previous-->
        </a>
        """)))}),format.raw/*297.10*/("""

        """),_display_(/*299.10*/for(pageNumber <- paginatedList.lowbound+1 to paginatedList.high ) yield /*299.76*/ {_display_(Seq[Any](format.raw/*299.78*/("""
        """),format.raw/*300.9*/("""<a href=""""),_display_(/*300.19*/link(pageNumber)),format.raw/*300.35*/("""" class="px-4 py-2 text-gray-700 bg-gray-200 rounded-md hover:bg-blue-400 hover:text-white">"""),_display_(/*300.128*/pageNumber),format.raw/*300.138*/("""</a>
        """)))}),format.raw/*301.10*/("""

        """),_display_(/*303.10*/paginatedList/*303.23*/.nextPage.map/*303.36*/ { page =>_display_(Seq[Any](format.raw/*303.46*/("""
        """),format.raw/*304.9*/("""<a href=""""),_display_(/*304.19*/link(page)),format.raw/*304.29*/("""" class="flex items-center px-4 py-2 text-gray-500 bg-gray-300 rounded-md">
<!--            Next-->
            <svg aria-hidden="true" class="ml-2 w-5 h-5" fill="currentColor" viewBox="0 0 20 20" xmlns="http://www.w3.org/2000/svg"><path fill-rule="evenodd" d="M12.293 5.293a1 1 0 011.414 0l4 4a1 1 0 010 1.414l-4 4a1 1 0 01-1.414-1.414L14.586 11H3a1 1 0 110-2h11.586l-2.293-2.293a1 1 0 010-1.414z" clip-rule="evenodd"></path></svg>
        </a>
        """)))}/*308.10*/.getOrElse/*308.20*/ {_display_(Seq[Any](format.raw/*308.22*/("""
        """),format.raw/*309.9*/("""<a href="#" disabled class="flex items-center px-4 py-2 text-gray-500 bg-gray-300 rounded-md">
<!--            Next-->
            <svg aria-hidden="true" class="ml-2 w-5 h-5" fill="currentColor" viewBox="0 0 20 20" xmlns="http://www.w3.org/2000/svg"><path fill-rule="evenodd" d="M12.293 5.293a1 1 0 011.414 0l4 4a1 1 0 010 1.414l-4 4a1 1 0 01-1.414-1.414L14.586 11H3a1 1 0 110-2h11.586l-2.293-2.293a1 1 0 010-1.414z" clip-rule="evenodd"></path></svg>
        </a>
        """)))}),format.raw/*313.10*/("""
    """),format.raw/*314.5*/("""</div>

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
                let deleteBtn = document.getElementById("deleteBtn");
                let close_btn_delete = document.querySelector(".close-btn-delete");
                let deletePopup = document.querySelector(".deletePopup");

                let table = document.getElementById("student-table");
                let stu_aadhar,prn;


                function selectRow(row) """),format.raw/*334.41*/("""{"""),format.raw/*334.42*/("""
                    """),format.raw/*335.21*/("""row.addEventListener("click", function (e) """),format.raw/*335.64*/("""{"""),format.raw/*335.65*/("""
                        """),format.raw/*336.25*/("""let select_row = e.target.parentElement;

                        // select only one row
                        Array.from(std_row).forEach(el => """),format.raw/*339.59*/("""{"""),format.raw/*339.60*/("""
                            """),format.raw/*340.29*/("""if (el != this)
                                el.classList.remove("selected")
                            else
                                el.classList.toggle("selected") ?
                                        prn = select_row.getAttribute("data-id") :
                                        prn = undefined
                        """),format.raw/*346.25*/("""}"""),format.raw/*346.26*/(""");
                    """),format.raw/*347.21*/("""}"""),format.raw/*347.22*/(""");
                """),format.raw/*348.17*/("""}"""),format.raw/*348.18*/("""

                """),format.raw/*350.17*/("""// Add eventlistener to all rows
                Array.from(std_row).forEach(row => selectRow(row));


                close_btn.onclick = () => """),format.raw/*354.43*/("""{"""),format.raw/*354.44*/("""
                    """),format.raw/*355.21*/("""popup.classList.toggle("popped");
                """),format.raw/*356.17*/("""}"""),format.raw/*356.18*/("""

                """),format.raw/*358.17*/("""close_btn_delete.onclick = (e) => """),format.raw/*358.51*/("""{"""),format.raw/*358.52*/("""
                    """),format.raw/*359.21*/("""deletePopup.classList.toggle("popped")
                """),format.raw/*360.17*/("""}"""),format.raw/*360.18*/("""

                """),format.raw/*362.17*/("""function confirmDelete(intent)"""),format.raw/*362.47*/("""{"""),format.raw/*362.48*/("""
                    """),format.raw/*363.21*/("""if(intent)"""),format.raw/*363.31*/("""{"""),format.raw/*363.32*/("""
                        """),format.raw/*364.25*/("""location.href = `/deleteExamStudent?prn=$"""),format.raw/*364.66*/("""{"""),format.raw/*364.67*/("""prn"""),format.raw/*364.70*/("""}"""),format.raw/*364.71*/("""&acad_year=$"""),format.raw/*364.83*/("""{"""),format.raw/*364.84*/("""acad_year_value"""),format.raw/*364.99*/("""}"""),format.raw/*364.100*/("""`;
                    """),format.raw/*365.21*/("""}"""),format.raw/*365.22*/(""" """),format.raw/*365.23*/("""else"""),format.raw/*365.27*/("""{"""),format.raw/*365.28*/("""
                        """),format.raw/*366.25*/("""deletePopup.classList.toggle("popped")
                    """),format.raw/*367.21*/("""}"""),format.raw/*367.22*/("""
                """),format.raw/*368.17*/("""}"""),format.raw/*368.18*/("""
                """),format.raw/*369.17*/("""deleteBtn.onclick = () => """),format.raw/*369.43*/("""{"""),format.raw/*369.44*/("""
                    """),format.raw/*370.21*/("""if(!prn)
                        popup.classList.toggle("popped");
                    else """),format.raw/*372.26*/("""{"""),format.raw/*372.27*/("""
                        """),format.raw/*373.25*/("""deletePopup.classList.toggle("popped")
                    """),format.raw/*374.21*/("""}"""),format.raw/*374.22*/("""
                """),format.raw/*375.17*/("""}"""),format.raw/*375.18*/("""

                """),format.raw/*377.17*/("""insertBtn.onclick = () => """),format.raw/*377.43*/("""{"""),format.raw/*377.44*/("""
                    """),format.raw/*378.21*/("""window.location.href = """"),_display_(/*378.46*/routes/*378.52*/.Application.index()),format.raw/*378.72*/(""""
                """),format.raw/*379.17*/("""}"""),format.raw/*379.18*/("""

                """),format.raw/*381.17*/("""updateBtn.onclick = () => """),format.raw/*381.43*/("""{"""),format.raw/*381.44*/("""
                    """),format.raw/*382.21*/("""if(! prn)
                        popup.classList.toggle("popped");
                    else """),format.raw/*384.26*/("""{"""),format.raw/*384.27*/("""
                        """),format.raw/*385.25*/("""location.href = `/updateExam?prn=$"""),format.raw/*385.59*/("""{"""),format.raw/*385.60*/("""prn"""),format.raw/*385.63*/("""}"""),format.raw/*385.64*/("""&acad_year=$"""),format.raw/*385.76*/("""{"""),format.raw/*385.77*/("""acad_year_value"""),format.raw/*385.92*/("""}"""),format.raw/*385.93*/("""`;
                    """),format.raw/*386.21*/("""}"""),format.raw/*386.22*/("""
                """),format.raw/*387.17*/("""}"""),format.raw/*387.18*/("""

                """),format.raw/*389.17*/("""// search_btn.addEventListener("click", e => """),format.raw/*389.62*/("""{"""),format.raw/*389.63*/("""
                """),format.raw/*390.17*/("""//     let q = default_search.value
                //     renderAndFetch(`/examSearch?q=$"""),format.raw/*391.55*/("""{"""),format.raw/*391.56*/("""q"""),format.raw/*391.57*/("""}"""),format.raw/*391.58*/("""`);
                // """),format.raw/*392.20*/("""}"""),format.raw/*392.21*/(""");

                async function renderAndFetch(url)"""),format.raw/*394.51*/("""{"""),format.raw/*394.52*/("""
                    """),format.raw/*395.21*/("""let response = await fetch(url, """),format.raw/*395.53*/("""{"""),format.raw/*395.54*/("""
                        """),format.raw/*396.25*/("""method: "GET"
                    """),format.raw/*397.21*/("""}"""),format.raw/*397.22*/(""");
                    let students = await response.json();
                    console.log(students)

                    var tbody = document.createElement("tbody")

                    if(students.length === 0)"""),format.raw/*403.46*/("""{"""),format.raw/*403.47*/("""
                        """),format.raw/*404.25*/("""popup.getElementsByClassName("inner-container")[0].innerHTML = "No data";
                        popup.classList.toggle("popped");
                    """),format.raw/*406.21*/("""}"""),format.raw/*406.22*/("""

                    """),format.raw/*408.21*/("""// create row, remove existing rows and append new ones
                    for(var i=0; i<students.length; i++)"""),format.raw/*409.57*/("""{"""),format.raw/*409.58*/("""

                        """),format.raw/*411.25*/("""let id = students[i].id["$oid"]
                        let name = students[i].name
                        let branch = students[i].branch
                        let prn = students[i].id["$oid"]
                        let admission_year = students[i].year
                        let """),format.raw/*416.29*/("""{"""),format.raw/*416.30*/("""year,score,result"""),format.raw/*416.47*/("""}"""),format.raw/*416.48*/(""" """),format.raw/*416.49*/("""= students[i].acad_year.filter(y => y.year === acad_year_value)[0]


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
                    """),format.raw/*433.21*/("""}"""),format.raw/*433.22*/("""
                """),format.raw/*434.17*/("""}"""),format.raw/*434.18*/("""

            """),format.raw/*436.13*/("""</script>
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
                  HASH: 19fd976996439bc05d7a683dcb9833c621932d1a
                  MATRIX: 432->1|799->47|916->132|927->136|1024->86|1055->129|1083->203|1113->208|1130->217|1168->218|1197->220|1377->372|1406->373|1456->395|1521->432|1550->433|1596->451|1628->455|1657->456|1707->478|1763->506|1792->507|1842->529|1875->534|1904->535|1958->561|2072->647|2101->648|2151->670|2186->677|2215->678|2269->704|2433->840|2462->841|2512->863|2546->869|2575->870|2629->896|2926->1165|2955->1166|3005->1188|3042->1197|3071->1198|3125->1224|3243->1314|3272->1315|3320->1335|3369->1356|3398->1357|3448->1379|3916->1819|3945->1820|3991->1838|4026->1845|4055->1846|4105->1868|4165->1900|4194->1901|4242->1921|4287->1938|4316->1939|4366->1961|4791->2358|4820->2359|4866->2377|4914->2397|4943->2398|4993->2420|5058->2457|5087->2458|5135->2478|5188->2503|5217->2504|5267->2526|5330->2561|5359->2562|5405->2580|5468->2615|5497->2616|5547->2638|5655->2718|5684->2719|5732->2739|5784->2763|5813->2764|5863->2786|5928->2823|5957->2824|6005->2844|6053->2864|6082->2865|6136->2891|6247->2974|6276->2975|6326->2997|6370->3013|6399->3014|6453->3040|6517->3076|6546->3077|6594->3097|6644->3119|6673->3120|6723->3142|6906->3296|6936->3297|6985->3317|7037->3340|7067->3341|7118->3363|7268->3484|7298->3485|7351->3509|7389->3518|7419->3519|7474->3545|7538->3580|7568->3581|7617->3601|7658->3613|7688->3614|7739->3636|8036->3904|8066->3905|8119->3929|8160->3941|8190->3942|8245->3968|8448->4142|8478->4143|8525->4161|8564->4171|8594->4172|8645->4194|8760->4280|8790->4281|8837->4299|8884->4317|8914->4318|8965->4340|9114->4460|9144->4461|9191->4479|9239->4498|9269->4499|9320->4521|9385->4557|9415->4558|9458->4572|11072->6191|11103->6291|11135->6606|11166->6630|11198->6991|11230->7299|11261->7319|11299->7329|14182->10226|14213->10277|14244->10348|14275->10370|14306->10416|14337->10463|14368->10508|14399->10531|14430->10564|14461->10600|14492->10619|14523->10634|14561->10644|15459->11577|15507->11696|15554->11769|15605->11854|15657->11992|15708->12047|15759->12106|15807->12424|15858->12488|15910->12872|15961->12935|16010->12990|16053->13004|17839->14762|17862->14775|17885->14788|17934->14798|17972->14808|18010->14818|18042->14828|18522->15288|18542->15298|18582->15299|18620->15309|19122->15779|19163->15792|19246->15858|19287->15860|19325->15870|19363->15880|19401->15896|19523->15989|19556->15999|19603->16014|19644->16027|19667->16040|19690->16053|19739->16063|19777->16073|19815->16083|19847->16093|20326->16552|20346->16562|20387->16564|20425->16574|20935->17052|20969->17058|21992->18052|22022->18053|22073->18075|22145->18118|22175->18119|22230->18145|22409->18295|22439->18296|22498->18326|22875->18674|22905->18675|22958->18699|22988->18700|23037->18720|23067->18721|23116->18741|23294->18890|23324->18891|23375->18913|23455->18964|23485->18965|23534->18985|23597->19019|23627->19020|23678->19042|23763->19098|23793->19099|23842->19119|23901->19149|23931->19150|23982->19172|24021->19182|24051->19183|24106->19209|24176->19250|24206->19251|24238->19254|24268->19255|24309->19267|24339->19268|24383->19283|24414->19284|24467->19308|24497->19309|24527->19310|24560->19314|24590->19315|24645->19341|24734->19401|24764->19402|24811->19420|24841->19421|24888->19439|24943->19465|24973->19466|25024->19488|25147->19582|25177->19583|25232->19609|25321->19669|25351->19670|25398->19688|25428->19689|25477->19709|25532->19735|25562->19736|25613->19758|25666->19783|25682->19789|25724->19809|25772->19828|25802->19829|25851->19849|25906->19875|25936->19876|25987->19898|26111->19993|26141->19994|26196->20020|26259->20054|26289->20055|26321->20058|26351->20059|26392->20071|26422->20072|26466->20087|26496->20088|26549->20112|26579->20113|26626->20131|26656->20132|26705->20152|26779->20197|26809->20198|26856->20216|26976->20307|27006->20308|27036->20309|27066->20310|27119->20334|27149->20335|27234->20391|27264->20392|27315->20414|27376->20446|27406->20447|27461->20473|27525->20508|27555->20509|27804->20729|27834->20730|27889->20756|28072->20910|28102->20911|28155->20935|28297->21048|28327->21049|28384->21077|28705->21369|28735->21370|28781->21387|28811->21388|28841->21389|29687->22206|29717->22207|29764->22225|29794->22226|29839->22242
                  LINES: 17->1|22->2|26->5|26->5|29->2|31->4|32->7|34->9|34->9|34->9|35->10|41->16|41->16|42->17|43->18|43->18|44->19|44->19|44->19|45->20|46->21|46->21|47->22|47->22|47->22|48->23|50->25|50->25|51->26|51->26|51->26|52->27|55->30|55->30|56->31|56->31|56->31|57->32|63->38|63->38|64->39|64->39|64->39|65->40|67->42|67->42|69->44|69->44|69->44|70->45|81->56|81->56|82->57|82->57|82->57|83->58|84->59|84->59|86->61|86->61|86->61|87->62|96->71|96->71|97->72|97->72|97->72|98->73|99->74|99->74|101->76|101->76|101->76|102->77|103->78|103->78|104->79|104->79|104->79|105->80|107->82|107->82|109->84|109->84|109->84|110->85|111->86|111->86|113->88|113->88|113->88|114->89|116->91|116->91|117->92|117->92|117->92|118->93|119->94|119->94|121->96|121->96|121->96|122->97|126->101|126->101|128->103|128->103|128->103|129->104|132->107|132->107|134->109|134->109|134->109|135->110|136->111|136->111|138->113|138->113|138->113|139->114|145->120|145->120|147->122|147->122|147->122|148->123|152->127|152->127|153->128|153->128|153->128|154->129|156->131|156->131|157->132|157->132|157->132|158->133|161->136|161->136|162->137|162->137|162->137|163->138|164->139|164->139|165->140|205->180|206->181|207->182|208->183|209->184|210->185|211->186|212->187|246->221|247->222|248->223|249->224|250->225|251->226|252->227|253->228|254->229|255->230|256->231|257->232|258->233|270->245|271->246|272->247|273->248|274->249|275->250|276->251|277->252|278->253|279->254|280->255|282->257|283->258|312->287|312->287|312->287|312->287|313->288|313->288|313->288|317->292|317->292|317->292|318->293|322->297|324->299|324->299|324->299|325->300|325->300|325->300|325->300|325->300|326->301|328->303|328->303|328->303|328->303|329->304|329->304|329->304|333->308|333->308|333->308|334->309|338->313|339->314|359->334|359->334|360->335|360->335|360->335|361->336|364->339|364->339|365->340|371->346|371->346|372->347|372->347|373->348|373->348|375->350|379->354|379->354|380->355|381->356|381->356|383->358|383->358|383->358|384->359|385->360|385->360|387->362|387->362|387->362|388->363|388->363|388->363|389->364|389->364|389->364|389->364|389->364|389->364|389->364|389->364|389->364|390->365|390->365|390->365|390->365|390->365|391->366|392->367|392->367|393->368|393->368|394->369|394->369|394->369|395->370|397->372|397->372|398->373|399->374|399->374|400->375|400->375|402->377|402->377|402->377|403->378|403->378|403->378|403->378|404->379|404->379|406->381|406->381|406->381|407->382|409->384|409->384|410->385|410->385|410->385|410->385|410->385|410->385|410->385|410->385|410->385|411->386|411->386|412->387|412->387|414->389|414->389|414->389|415->390|416->391|416->391|416->391|416->391|417->392|417->392|419->394|419->394|420->395|420->395|420->395|421->396|422->397|422->397|428->403|428->403|429->404|431->406|431->406|433->408|434->409|434->409|436->411|441->416|441->416|441->416|441->416|441->416|458->433|458->433|459->434|459->434|461->436
                  -- GENERATED --
              */
          