// Code by Saleh Ibne Omar


function calC(c) {

    // form theke panel e jao then value bosao function calC ja value pabe ta 
    // sei value + koro jno protita value add hoi
    form.panel.value = form.panel.value + c;


}


function CE() {

    // clear korar jonne function
    // form theke panel e jao giye value bosao faka
    form.panel.value = "";
}
function myFunction() {
    var x = document.getElementById("frm1");
    var fname = "";
    var mail = "";
    mail = x.elements[0].value;
    fname = x.elements[1].value;
  var table = document.getElementById("table");
  var row = table.insertRow(0);
  var cell1 = row.insertCell(0);
  var cell2 = row.insertCell(1);
  cell1.innerHTML = mail;
  cell2.innerHTML =fname;
  
}
