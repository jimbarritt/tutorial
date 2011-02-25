nuskool.UnitTest("A Simple Unit Test", function() {

    var self = {
        before : function() {
            console.log("This gets executed before the test");
        },

        after : function() {
            console.log("This gets executed after the test");
        },

        test_that : {
            one_plus_one_is_two : function() {
                console.log("Test that 1+1===2!");
                invoke_some_private_method();
            }
        }
    };

    function invoke_some_private_method() {
        console.log("I am a private method that supports the test.");
    }
});