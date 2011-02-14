var bob = bob || {};

var console = {
    log : function(message) {
        println(message);
    }
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
