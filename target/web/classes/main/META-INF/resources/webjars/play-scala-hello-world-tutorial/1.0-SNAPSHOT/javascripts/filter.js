let student_option = document.querySelector("#student_option");
let year = document.querySelector("#year");
let branch = document.querySelector("#branch");
let acad_year = document.querySelector("#acad_year");

let branch_value, year_value, acad_year_value
[branch,year,acad_year].forEach(el => {
    el.addEventListener('change', evt => {
        evt.preventDefault();

        if (evt.target.id === "branch") {
            branch_value = evt.target.value
        } else if (evt.target.id === "year"){
            year_value = evt.target.value
        } else {
            acad_year_value = evt.target.value
        }

        let url = `/fetchExamStudent?branch=${branch_value}&year=${year_value}&acad_year=${acad_year_value}`
        branch_value && year_value && acad_year_value!= undefined ? renderAndFetch(url): console.log("logg")

    })
})

// function getStudents(branch,year,acad_year) {
//     fetch(`/fetchExamStudent?branch=${branch}&year=${year}&acad_year=${acad_year}`)
//         .then((resp) => resp.json())
//         .then((data) => (showStudents(data)))
//         .catch((e) => {
//             console.log("error")
//         })
// }


