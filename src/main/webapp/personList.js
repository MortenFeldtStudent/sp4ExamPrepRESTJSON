document.getElementById("btn").addEventListener('click', function () {
    let amount = document.getElementById("amount").value;
    let firstid = document.getElementById("firstid").value;
    let url = 'http://localhost:8084/sp4ExamPrepRESTJSON/api/sample/criteria?amount=@1&firstid=@2';
    url = url.replace("@1", amount);
    url= url.replace("@2", firstid);
    
    updatePersonList(url);
});




function updatePersonList(url) {
    fetch(url, {method: "GET"})
            .then(res => res.json())
            .then(data => {
                var persons = "";
                persons += " <thead>";
                persons += "<tr>";
                persons += "<th>First Name</th>";
                persons += "<th>Last Name</th>";
                persons += "<th>Age</th>";
                persons += "<th>Id</th>";
                persons += "</tr>";
                persons += " </thead>";
                for (let o of data) {
                    persons += '<tr>';
                    persons += '<td>' + o.fName + '</td>';
                    persons += '<td>' + o.lName + '</td>';
                    persons += '<td>' + o.age + '</td>';
                    persons += '<td>' + o.id + '</td>';
                    persons += '</tr>';
                }

                persons += "</table>";
                document.getElementById("content").innerHTML = persons;


            });
}