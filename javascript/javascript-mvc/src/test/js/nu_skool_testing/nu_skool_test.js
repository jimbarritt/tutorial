var nuskool = nuskool || {};

nuskool.UnitTest = function(name, testCase) {

    testCase.before();


    for (var method in testCase.test_that) {
        console.log("Executing method [" + method + "]");
    }

    testCase.after();

}