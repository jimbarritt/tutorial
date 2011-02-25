var sourceloader = sourceloader || {};


sourceloader.loadSourceInto = function (href, divId) {
    var http = new XMLHttpRequest();
    http.open("GET", href, false);
    http.send();
    document.getElementById(divId).innerHTML = http.responseText
}