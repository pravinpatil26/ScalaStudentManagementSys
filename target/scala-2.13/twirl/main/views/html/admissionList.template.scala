
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

object admissionList extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Paginator[AdmissionStudent],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(paginatedList: Paginator[AdmissionStudent]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*5.2*/link/*5.6*/(newPage: Int) = {{
routes.Application.admissionStudentList(newPage)
}};
Seq[Any](format.raw/*2.46*/("""

"""),format.raw/*4.40*/("""
"""),format.raw/*7.2*/("""
"""),_display_(/*8.2*/dashboard/*8.11*/{_display_(Seq[Any](format.raw/*8.12*/("""
"""),format.raw/*9.1*/("""<!doctype html>
<html>
<head>
    <title>Student Admission</title>
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
    <h1 class="mb-1 text-2xl  tracking-tight leading-none text-gray-900 md:text-4xl lg:text-4xl dark:text-black">Admission List</h1>
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
        <th>Branch</th>
        <th>Admission Year</th>

        </thead>
        <tbody>
        """),_display_(/*209.10*/for(d <- paginatedList.items) yield /*209.39*/{_display_(Seq[Any](format.raw/*209.40*/("""
        """),format.raw/*210.9*/("""<tr class="std-row" data-id=""""),_display_(/*210.39*/d/*210.40*/.aadhar),format.raw/*210.47*/("""">
            """),format.raw/*211.66*/("""
            """),format.raw/*212.13*/("""<td>
                """),_display_(/*213.18*/d/*213.19*/.name.get("first_name")),format.raw/*213.42*/("""
                """),_display_(/*214.18*/d/*214.19*/.name.get("middle_name")),format.raw/*214.43*/("""
                """),_display_(/*215.18*/d/*215.19*/.name.get("last_name")),format.raw/*215.41*/("""
            """),format.raw/*216.13*/("""</td>
            <td>"""),_display_(/*217.18*/d/*217.19*/.aadhar),format.raw/*217.26*/("""</td>
            <td>"""),_display_(/*218.18*/d/*218.19*/.branch),format.raw/*218.26*/("""</td>
            <td>"""),_display_(/*219.18*/d/*219.19*/.year),format.raw/*219.24*/("""</td>
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
                    """),format.raw/*238.142*/("""
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
                let close_btn = document.querySelector(".close-btn");
                let close_btn_delete = document.querySelector(".close-btn-delete");
                let deletePopup = document.querySelector(".deletePopup");
                let std_row = document.getElementsByClassName("std-row");
                let search_btn = document.getElementById("search-btn");


<!--                let default_search = document.getElementById("default-search");-->
<!--                let yesDelete = document.getElementById("yesDelete");-->
<!--                let noDelete = document.getElementById("noDelete");-->
<!--                -->

                let table = document.getElementById("student-table");

                // select table header
                let rows = table.rows[0].cells;

                let stu_aadhar;




                function selectRow(row) """),format.raw/*338.41*/("""{"""),format.raw/*338.42*/("""
                    """),format.raw/*339.21*/("""row.addEventListener("click", function (e) """),format.raw/*339.64*/("""{"""),format.raw/*339.65*/("""
                        """),format.raw/*340.25*/("""let select_row = e.target.parentElement;

                        // select only one row
                        Array.from(std_row).forEach(el => """),format.raw/*343.59*/("""{"""),format.raw/*343.60*/("""
                            """),format.raw/*344.29*/("""if (el != this)
                                el.classList.remove("selected")
                            else
                                el.classList.toggle("selected") ?
                                        stu_aadhar = select_row.getAttribute("data-id") :
                                        stu_aadhar = undefined
                        """),format.raw/*350.25*/("""}"""),format.raw/*350.26*/(""");
                    """),format.raw/*351.21*/("""}"""),format.raw/*351.22*/(""");
                """),format.raw/*352.17*/("""}"""),format.raw/*352.18*/("""

                """),format.raw/*354.17*/("""// Add eventlistener to all rows
                Array.from(std_row).forEach(row => selectRow(row));



                close_btn.onclick = (e) => """),format.raw/*359.44*/("""{"""),format.raw/*359.45*/("""
                    """),format.raw/*360.21*/("""popup.classList.toggle("popped")
                """),format.raw/*361.17*/("""}"""),format.raw/*361.18*/("""
                """),format.raw/*362.17*/("""close_btn_delete.onclick = (e) => """),format.raw/*362.51*/("""{"""),format.raw/*362.52*/("""
                    """),format.raw/*363.21*/("""deletePopup.classList.toggle("popped")
                """),format.raw/*364.17*/("""}"""),format.raw/*364.18*/("""

                """),format.raw/*366.17*/("""insertBtn.onclick = () => """),format.raw/*366.43*/("""{"""),format.raw/*366.44*/("""
                    """),format.raw/*367.21*/("""window.location.href = """"),_display_(/*367.46*/routes/*367.52*/.Application.admissionIndex()),format.raw/*367.81*/(""""
                """),format.raw/*368.17*/("""}"""),format.raw/*368.18*/("""

                """),format.raw/*370.17*/("""updateBtn.onclick = () => """),format.raw/*370.43*/("""{"""),format.raw/*370.44*/("""
                    """),format.raw/*371.21*/("""if(! stu_aadhar)
                        popup.classList.toggle("popped");
                    else """),format.raw/*373.26*/("""{"""),format.raw/*373.27*/("""
                        """),format.raw/*374.25*/("""location.href = `/admissionView?student_aadhaar=$"""),format.raw/*374.74*/("""{"""),format.raw/*374.75*/("""stu_aadhar"""),format.raw/*374.85*/("""}"""),format.raw/*374.86*/("""`;
                    """),format.raw/*375.21*/("""}"""),format.raw/*375.22*/("""
                """),format.raw/*376.17*/("""}"""),format.raw/*376.18*/("""

                """),format.raw/*378.17*/("""function confirmDelete(intent)"""),format.raw/*378.47*/("""{"""),format.raw/*378.48*/("""
                    """),format.raw/*379.21*/("""if(intent)"""),format.raw/*379.31*/("""{"""),format.raw/*379.32*/("""
                        """),format.raw/*380.25*/("""location.href = `/admissionDelete?student_aadhaar=$"""),format.raw/*380.76*/("""{"""),format.raw/*380.77*/("""stu_aadhar"""),format.raw/*380.87*/("""}"""),format.raw/*380.88*/("""`;
                    """),format.raw/*381.21*/("""}"""),format.raw/*381.22*/(""" """),format.raw/*381.23*/("""else"""),format.raw/*381.27*/("""{"""),format.raw/*381.28*/("""
                        """),format.raw/*382.25*/("""deletePopup.classList.toggle("popped")
                    """),format.raw/*383.21*/("""}"""),format.raw/*383.22*/("""
                """),format.raw/*384.17*/("""}"""),format.raw/*384.18*/("""
                """),format.raw/*385.17*/("""deleteBtn.onclick = () => """),format.raw/*385.43*/("""{"""),format.raw/*385.44*/("""
                    """),format.raw/*386.21*/("""if(!stu_aadhar)
                        popup.classList.toggle("popped");
                    else """),format.raw/*388.26*/("""{"""),format.raw/*388.27*/("""
                        """),format.raw/*389.25*/("""deletePopup.classList.toggle("popped")
                    """),format.raw/*390.21*/("""}"""),format.raw/*390.22*/("""
                """),format.raw/*391.17*/("""}"""),format.raw/*391.18*/("""

                """),format.raw/*393.17*/("""search_btn.addEventListener("click", e => """),format.raw/*393.59*/("""{"""),format.raw/*393.60*/("""
                    """),format.raw/*394.21*/("""let q = default_search.value
                    renderAndFetch(q);
                """),format.raw/*396.17*/("""}"""),format.raw/*396.18*/(""");

                async function renderAndFetch(q)"""),format.raw/*398.49*/("""{"""),format.raw/*398.50*/("""
                    """),format.raw/*399.21*/("""let response = await fetch(`/admissionSearch?q=$"""),format.raw/*399.69*/("""{"""),format.raw/*399.70*/("""q"""),format.raw/*399.71*/("""}"""),format.raw/*399.72*/("""`, """),format.raw/*399.75*/("""{"""),format.raw/*399.76*/("""
                        """),format.raw/*400.25*/("""method: "GET"
                    """),format.raw/*401.21*/("""}"""),format.raw/*401.22*/(""");
                    let students = await response.json();


                    var tbody = document.createElement("tbody")

                    if(students.length === 0)"""),format.raw/*407.46*/("""{"""),format.raw/*407.47*/("""
                        """),format.raw/*408.25*/("""popup.getElementsByClassName("inner-container")[0].innerHTML = "No data";
                        popup.classList.toggle("popped");
                    """),format.raw/*410.21*/("""}"""),format.raw/*410.22*/("""

                    """),format.raw/*412.21*/("""// create row, remove existing rows and append new ones
                    for(var i=0; i<students.length; i++)"""),format.raw/*413.57*/("""{"""),format.raw/*413.58*/("""
                        """),format.raw/*414.25*/("""let id = students[i].id["$oid"]
                        let """),format.raw/*415.29*/("""{"""),format.raw/*415.30*/("""first_name,middle_name, last_name"""),format.raw/*415.63*/("""}"""),format.raw/*415.64*/(""" """),format.raw/*415.65*/("""= students[i].name
                        let branch = students[i].branch
                        let aadhar = students[i].aadhar
                        let year = students[i].year.slice(5,9);

                        let row = tbody.insertRow(i)
                        row.classList.add("std-row");
                        row.setAttribute("data-id", aadhar)

                        row.insertCell(0).innerHTML = `$"""),format.raw/*424.57*/("""{"""),format.raw/*424.58*/("""first_name"""),format.raw/*424.68*/("""}"""),format.raw/*424.69*/(""" """),format.raw/*424.70*/("""$"""),format.raw/*424.71*/("""{"""),format.raw/*424.72*/("""middle_name"""),format.raw/*424.83*/("""}"""),format.raw/*424.84*/(""" """),format.raw/*424.85*/("""$"""),format.raw/*424.86*/("""{"""),format.raw/*424.87*/("""last_name"""),format.raw/*424.96*/("""}"""),format.raw/*424.97*/("""`
                        row.insertCell(1).innerHTML = aadhar
                        row.insertCell(2).innerHTML = branch
                        row.insertCell(3).innerHTML = year
                        selectRow(row);

                        tbody.appendChild(row)
                        table.tBodies[0].parentNode.replaceChild(tbody,table.tBodies[0])
                    """),format.raw/*432.21*/("""}"""),format.raw/*432.22*/("""
                """),format.raw/*433.17*/("""}"""),format.raw/*433.18*/("""

                """),format.raw/*435.17*/("""Array.from(rows).forEach(e => e.addEventListener("click", sortTable));

                // https://www.w3schools.com/howto/howto_js_sort_table.asp
                function sortTable(event) """),format.raw/*438.43*/("""{"""),format.raw/*438.44*/("""
                    """),format.raw/*439.21*/("""var n = event.target.cellIndex;

                    event.target.parentNode.querySelectorAll("th").forEach(rowHead => """),format.raw/*441.87*/("""{"""),format.raw/*441.88*/("""
                        """),format.raw/*442.25*/("""if(rowHead != event.target)"""),format.raw/*442.52*/("""{"""),format.raw/*442.53*/("""
                            """),format.raw/*443.29*/("""rowHead.classList.remove("highlight")
                        """),format.raw/*444.25*/("""}"""),format.raw/*444.26*/(""" """),format.raw/*444.27*/("""else """),format.raw/*444.32*/("""{"""),format.raw/*444.33*/("""
                            """),format.raw/*445.29*/("""event.target.classList.toggle("highlight")
                        """),format.raw/*446.25*/("""}"""),format.raw/*446.26*/("""
                    """),format.raw/*447.21*/("""}"""),format.raw/*447.22*/(""")

                    event.target.parentNode.classList.toggle("rotate");
                    var switching, i, x, y, shouldSwitch, dir, switchcount = 0;

                    switching = true;
                    // Set the sorting direction to ascending:
                    dir = "asc";
                    /* Make a loop that will continue until
                    no switching has been done: */
                    while (switching) """),format.raw/*457.39*/("""{"""),format.raw/*457.40*/("""
                        """),format.raw/*458.25*/("""// Start by saying: no switching is done:
                        switching = false;
                        rows = table.rows;
                        /* Loop through all table rows (except the
                        first, which contains table headers): */
                        for (i = 1; i < (rows.length - 1); i++) """),format.raw/*463.65*/("""{"""),format.raw/*463.66*/("""
                            """),format.raw/*464.29*/("""// Start by saying there should be no switching:
                            shouldSwitch = false;
                            /* Get the two elements you want to compare,
                            one from current row and one from the next: */
                            x = rows[i].getElementsByTagName("TD")[n];
                            y = rows[i + 1].getElementsByTagName("TD")[n];
                            /* Check if the two rows should switch place,
                            based on the direction, asc or desc: */
                            if (dir == "asc") """),format.raw/*472.47*/("""{"""),format.raw/*472.48*/("""
                                """),format.raw/*473.33*/("""if (x.innerHTML.toLowerCase() > y.innerHTML.toLowerCase()) """),format.raw/*473.92*/("""{"""),format.raw/*473.93*/("""
                                    """),format.raw/*474.37*/("""// If so, mark as a switch and break the loop:
                                    shouldSwitch = true;
                                    break;
                                """),format.raw/*477.33*/("""}"""),format.raw/*477.34*/("""
                            """),format.raw/*478.29*/("""}"""),format.raw/*478.30*/(""" """),format.raw/*478.31*/("""else if (dir == "desc") """),format.raw/*478.55*/("""{"""),format.raw/*478.56*/("""
                                """),format.raw/*479.33*/("""if (x.innerHTML.toLowerCase() < y.innerHTML.toLowerCase()) """),format.raw/*479.92*/("""{"""),format.raw/*479.93*/("""
                                    """),format.raw/*480.37*/("""// If so, mark as a switch and break the loop:
                                    shouldSwitch = true;
                                    break;
                                """),format.raw/*483.33*/("""}"""),format.raw/*483.34*/("""
                            """),format.raw/*484.29*/("""}"""),format.raw/*484.30*/("""
                        """),format.raw/*485.25*/("""}"""),format.raw/*485.26*/("""
                        """),format.raw/*486.25*/("""if (shouldSwitch) """),format.raw/*486.43*/("""{"""),format.raw/*486.44*/("""
                            """),format.raw/*487.29*/("""/* If a switch has been marked, make the switch
                            and mark that a switch has been done: */
                            rows[i].parentNode.insertBefore(rows[i + 1], rows[i]);
                            switching = true;
                            // Each time a switch is done, increase this count by 1:
                            switchcount ++;
                        """),format.raw/*493.25*/("""}"""),format.raw/*493.26*/(""" """),format.raw/*493.27*/("""else """),format.raw/*493.32*/("""{"""),format.raw/*493.33*/("""
                            """),format.raw/*494.29*/("""/* If no switching has been done AND the direction is "asc",
                            set the direction to "desc" and run the while loop again. */
                            if (switchcount == 0 && dir == "asc") """),format.raw/*496.67*/("""{"""),format.raw/*496.68*/("""
                                """),format.raw/*497.33*/("""dir = "desc";
                                switching = true;
                            """),format.raw/*499.29*/("""}"""),format.raw/*499.30*/("""
                        """),format.raw/*500.25*/("""}"""),format.raw/*500.26*/("""
                    """),format.raw/*501.21*/("""}"""),format.raw/*501.22*/("""
                """),format.raw/*502.17*/("""}"""),format.raw/*502.18*/("""



            """),format.raw/*506.13*/("""</script>
</body>
</html>
""")))}))
      }
    }
  }

  def render(paginatedList:Paginator[AdmissionStudent]): play.twirl.api.HtmlFormat.Appendable = apply(paginatedList)

  def f:((Paginator[AdmissionStudent]) => play.twirl.api.HtmlFormat.Appendable) = (paginatedList) => apply(paginatedList)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/admissionList.scala.html
                  HASH: f44348acb29f26a7d19d525b125856bd018accb7
                  MATRIX: 432->1|809->47|931->137|942->141|1044->91|1075->134|1103->213|1131->216|1148->225|1186->226|1214->228|1403->389|1432->390|1482->412|1547->449|1576->450|1622->468|1654->472|1683->473|1733->495|1789->523|1818->524|1868->546|1901->551|1930->552|1984->578|2098->664|2127->665|2177->687|2212->694|2241->695|2295->721|2459->857|2488->858|2538->880|2572->886|2601->887|2655->913|2997->1227|3026->1228|3076->1250|3113->1259|3142->1260|3196->1286|3314->1376|3343->1377|3395->1401|3444->1422|3473->1423|3527->1449|4039->1933|4068->1934|4118->1956|4153->1963|4182->1964|4236->1990|4300->2026|4329->2027|4377->2047|4422->2064|4451->2065|4501->2087|4926->2484|4955->2485|5001->2503|5049->2523|5078->2524|5128->2546|5193->2583|5222->2584|5270->2604|5323->2629|5352->2630|5402->2652|5465->2687|5494->2688|5540->2706|5603->2741|5632->2742|5682->2764|5790->2844|5819->2845|5867->2865|5919->2889|5948->2890|5998->2912|6063->2949|6092->2950|6146->2976|6186->2988|6215->2989|6496->3242|6525->3243|6597->3287|6626->3288|6680->3314|6791->3397|6820->3398|6871->3420|6916->3436|6946->3437|7001->3463|7066->3499|7096->3500|7145->3520|7196->3542|7226->3543|7277->3565|7460->3719|7490->3720|7539->3740|7591->3763|7621->3764|7672->3786|7822->3907|7852->3908|7905->3932|7943->3941|7973->3942|8028->3968|8092->4003|8122->4004|8175->4028|8216->4040|8246->4041|8301->4067|8542->4279|8572->4280|8625->4304|8666->4316|8696->4317|8751->4343|8954->4517|8984->4518|9031->4536|9070->4546|9100->4547|9151->4569|9266->4655|9296->4656|9343->4674|9385->4687|9415->4688|9466->4710|9728->4943|9758->4944|9807->4964|9864->4992|9894->4993|9945->5015|10035->5076|10065->5077|10114->5097|10168->5122|10198->5123|10249->5145|10339->5206|10369->5207|10416->5225|10462->5242|10492->5243|10543->5265|10616->5309|10646->5310|10693->5328|10732->5338|10762->5339|10813->5361|10888->5407|10918->5408|10961->5422|15154->9587|15200->9616|15240->9617|15278->9627|15336->9657|15347->9658|15376->9665|15421->9734|15464->9748|15515->9771|15526->9772|15571->9795|15618->9814|15629->9815|15675->9839|15722->9858|15733->9859|15777->9881|15820->9895|15872->9919|15883->9920|15912->9927|15964->9951|15975->9952|16004->9959|16056->9983|16067->9984|16094->9989|16157->10020|16195->10030|17084->10952|17132->11071|17179->11148|17230->11233|17282->11376|17333->11431|17384->11490|17432->11808|17483->11872|17535->12256|17586->12319|17635->12374|17678->12388|19470->14152|19493->14165|19516->14178|19565->14188|19603->14198|19641->14208|19673->14218|20153->14678|20173->14688|20213->14689|20251->14699|20753->15169|20794->15182|20878->15249|20919->15251|20958->15262|20987->15281|21028->15283|21066->15293|21104->15303|21142->15319|21264->15412|21297->15422|21344->15437|21387->15448|21428->15461|21451->15474|21474->15487|21523->15497|21561->15507|21599->15517|21631->15527|22110->15986|22130->15996|22171->15998|22209->16008|22719->16486|22753->16492|23994->17704|24024->17705|24075->17727|24147->17770|24177->17771|24232->17797|24411->17947|24441->17948|24500->17978|24891->18340|24921->18341|24974->18365|25004->18366|25053->18386|25083->18387|25132->18407|25313->18559|25343->18560|25394->18582|25473->18632|25503->18633|25550->18651|25613->18685|25643->18686|25694->18708|25779->18764|25809->18765|25858->18785|25913->18811|25943->18812|25994->18834|26047->18859|26063->18865|26114->18894|26162->18913|26192->18914|26241->18934|26296->18960|26326->18961|26377->18983|26508->19085|26538->19086|26593->19112|26671->19161|26701->19162|26740->19172|26770->19173|26823->19197|26853->19198|26900->19216|26930->19217|26979->19237|27038->19267|27068->19268|27119->19290|27158->19300|27188->19301|27243->19327|27323->19378|27353->19379|27392->19389|27422->19390|27475->19414|27505->19415|27535->19416|27568->19420|27598->19421|27653->19447|27742->19507|27772->19508|27819->19526|27849->19527|27896->19545|27951->19571|27981->19572|28032->19594|28162->19695|28192->19696|28247->19722|28336->19782|28366->19783|28413->19801|28443->19802|28492->19822|28563->19864|28593->19865|28644->19887|28759->19973|28789->19974|28872->20028|28902->20029|28953->20051|29030->20099|29060->20100|29090->20101|29120->20102|29152->20105|29182->20106|29237->20132|29301->20167|29331->20168|29539->20347|29569->20348|29624->20374|29807->20528|29837->20529|29890->20553|30032->20666|30062->20667|30117->20693|30207->20754|30237->20755|30299->20788|30329->20789|30359->20790|30817->21219|30847->21220|30886->21230|30916->21231|30946->21232|30976->21233|31006->21234|31046->21245|31076->21246|31106->21247|31136->21248|31166->21249|31204->21258|31234->21259|31651->21647|31681->21648|31728->21666|31758->21667|31807->21687|32028->21879|32058->21880|32109->21902|32259->22023|32289->22024|32344->22050|32400->22077|32430->22078|32489->22108|32581->22171|32611->22172|32641->22173|32675->22178|32705->22179|32764->22209|32861->22277|32891->22278|32942->22300|32972->22301|33450->22750|33480->22751|33535->22777|33893->23106|33923->23107|33982->23137|34600->23726|34630->23727|34693->23761|34781->23820|34811->23821|34878->23859|35089->24041|35119->24042|35178->24072|35208->24073|35238->24074|35291->24098|35321->24099|35384->24133|35472->24192|35502->24193|35569->24231|35780->24413|35810->24414|35869->24444|35899->24445|35954->24471|35984->24472|36039->24498|36086->24516|36116->24517|36175->24547|36609->24952|36639->24953|36669->24954|36703->24959|36733->24960|36792->24990|37039->25208|37069->25209|37132->25243|37255->25337|37285->25338|37340->25364|37370->25365|37421->25387|37451->25388|37498->25406|37528->25407|37577->25427
                  LINES: 17->1|22->2|26->5|26->5|29->2|31->4|32->7|33->8|33->8|33->8|34->9|40->15|40->15|41->16|42->17|42->17|43->18|43->18|43->18|44->19|45->20|45->20|46->21|46->21|46->21|47->22|49->24|49->24|50->25|50->25|50->25|51->26|54->29|54->29|55->30|55->30|55->30|56->31|63->38|63->38|64->39|64->39|64->39|65->40|67->42|67->42|69->44|69->44|69->44|70->45|81->56|81->56|82->57|82->57|82->57|83->58|84->59|84->59|86->61|86->61|86->61|87->62|96->71|96->71|97->72|97->72|97->72|98->73|99->74|99->74|101->76|101->76|101->76|102->77|103->78|103->78|104->79|104->79|104->79|105->80|107->82|107->82|109->84|109->84|109->84|110->85|111->86|111->86|114->89|114->89|114->89|120->95|120->95|121->96|121->96|122->97|124->99|124->99|125->100|125->100|125->100|126->101|127->102|127->102|129->104|129->104|129->104|130->105|134->109|134->109|136->111|136->111|136->111|137->112|140->115|140->115|142->117|142->117|142->117|143->118|144->119|144->119|146->121|146->121|146->121|147->122|152->127|152->127|154->129|154->129|154->129|155->130|159->134|159->134|160->135|160->135|160->135|161->136|163->138|163->138|164->139|164->139|164->139|165->140|171->146|171->146|173->148|173->148|173->148|174->149|176->151|176->151|178->153|178->153|178->153|179->154|181->156|181->156|182->157|182->157|182->157|183->158|184->159|184->159|185->160|185->160|185->160|186->161|187->162|187->162|188->163|234->209|234->209|234->209|235->210|235->210|235->210|235->210|236->211|237->212|238->213|238->213|238->213|239->214|239->214|239->214|240->215|240->215|240->215|241->216|242->217|242->217|242->217|243->218|243->218|243->218|244->219|244->219|244->219|246->221|247->222|259->234|260->235|261->236|262->237|263->238|264->239|265->240|266->241|267->242|268->243|269->244|271->246|272->247|304->279|304->279|304->279|304->279|305->280|305->280|305->280|309->284|309->284|309->284|310->285|314->289|316->291|316->291|316->291|317->292|317->292|317->292|318->293|318->293|318->293|318->293|318->293|319->294|320->295|322->297|322->297|322->297|322->297|323->298|323->298|323->298|327->302|327->302|327->302|328->303|332->307|333->308|363->338|363->338|364->339|364->339|364->339|365->340|368->343|368->343|369->344|375->350|375->350|376->351|376->351|377->352|377->352|379->354|384->359|384->359|385->360|386->361|386->361|387->362|387->362|387->362|388->363|389->364|389->364|391->366|391->366|391->366|392->367|392->367|392->367|392->367|393->368|393->368|395->370|395->370|395->370|396->371|398->373|398->373|399->374|399->374|399->374|399->374|399->374|400->375|400->375|401->376|401->376|403->378|403->378|403->378|404->379|404->379|404->379|405->380|405->380|405->380|405->380|405->380|406->381|406->381|406->381|406->381|406->381|407->382|408->383|408->383|409->384|409->384|410->385|410->385|410->385|411->386|413->388|413->388|414->389|415->390|415->390|416->391|416->391|418->393|418->393|418->393|419->394|421->396|421->396|423->398|423->398|424->399|424->399|424->399|424->399|424->399|424->399|424->399|425->400|426->401|426->401|432->407|432->407|433->408|435->410|435->410|437->412|438->413|438->413|439->414|440->415|440->415|440->415|440->415|440->415|449->424|449->424|449->424|449->424|449->424|449->424|449->424|449->424|449->424|449->424|449->424|449->424|449->424|449->424|457->432|457->432|458->433|458->433|460->435|463->438|463->438|464->439|466->441|466->441|467->442|467->442|467->442|468->443|469->444|469->444|469->444|469->444|469->444|470->445|471->446|471->446|472->447|472->447|482->457|482->457|483->458|488->463|488->463|489->464|497->472|497->472|498->473|498->473|498->473|499->474|502->477|502->477|503->478|503->478|503->478|503->478|503->478|504->479|504->479|504->479|505->480|508->483|508->483|509->484|509->484|510->485|510->485|511->486|511->486|511->486|512->487|518->493|518->493|518->493|518->493|518->493|519->494|521->496|521->496|522->497|524->499|524->499|525->500|525->500|526->501|526->501|527->502|527->502|531->506
                  -- GENERATED --
              */
          