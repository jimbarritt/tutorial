String.prototype.format = function() {
    var formatted = this;
    for (arg in arguments) {
        formatted = formatted.replace("{" + arg + "}", arguments[arg]);
    }
    return formatted;
};

var createTableRow = function(expression, evaluation) {
    var cells = "<div class='table-cell'>{0}</div><div class='table-cell'>{1}</div>".format(expression, evaluation);
    return "<div class='table-row'>{0}</div>".format(cells);
};

var test_equality = function (expression) {
    var resultsTable = document.getElementById("resultsTable");
    console.log(expression + " evaluates to " + eval(expression));
    resultsTable.innerHTML = resultsTable.innerHTML + createTableRow(expression, eval(expression));
};

var buildDocument = function() {
    console.log("Building the results pane up...");
    test_equality("'' == '0'"); // false
    test_equality("0 == ''"); // true
    test_equality("0 == '0'"); // true
    test_equality("false == 'false'"); //false
    test_equality("false == '0'"); // true
    test_equality("false == undefined"); // false
    test_equality("false == null"); // false
    test_equality("null == undefined"); // true
    test_equality("' \\t\\r\\n ' == 0"); // true
}


window.onload=buildDocument;