var objectDefinition = objectDefinition || {};

objectDefinition.simpleObject = function() {

    var somePrivateData = "I am a secret";

    var self = {
        publicMethod : function() {
            private_send_message(somePrivateData);
        },

        anotherMethod : function() {
            console.log("Calling another method");
        }
    };

    function private_send_message(message) {
        console.log("Sending: " + message);
        self.anotherMethod();
        return "This is my private secret: " + message;
    }

    return self;
}