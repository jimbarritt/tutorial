var bob = bob || {};

var console = {
    log : function(message) {
        println(message);
    }
}

var assertEquals = function(message, expected, actual) {
    org.junit.Assert.assertEquals(message, expected, actual);
}


bob.foobar = function() {

    var internal = "I is a secret";

    var public_interface = {

        say_cheese : function() {
            console.log(call_something_internal(internal));
        }

    };

    function call_something_internal(internal) {
        return "Hello [" + internal + "]";
    };


    return public_interface;
}

var aFoobar = bob.foobar();

aFoobar.say_cheese();

assertEquals("2 should == 3", "2", "3");