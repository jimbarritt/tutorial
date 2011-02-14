var mvc = mvc || {};

mvc.simpleObject = function() {

    var somePrivateData = "I am a secret";

    var self =  {
        publicMethod : function() {
            return private_send_message(somePrivateData);
        }
    };

    function private_send_message(message) {
       console.log("Sending: " + message);
       return "This is my private secret: " + message;
    }

    return self;
}