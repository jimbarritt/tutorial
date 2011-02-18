TestCase("demonstrate object definition", {

    simpleObject : null,

    setUp : function() {
        simpleObject = objectDefinition.simpleObject();
    },

    tearDown : function() {},

    test_private_methods : function () {
        var result = simpleObject.publicMethod();

        assertEquals("This is my private secret: I am a secret", result);
    },

    test_cannot_access_private_variables : function () {
        assertTrue("somePrivateData should not be defined", lang.isNotDefined(simpleObject.somePrivateData));
    },

    test_cannot_access_private_methods : function() {
        assertTrue("private_send_message should not be defined", lang.isNotDefined(simpleObject.private_send_message));
    },

    test_explicitly_declared_members : function() {
        var someClosure = function() {

            implicitly_declared = "I am implicit!";

            var self = {};

            return self;
        }

        var aClosure = someClosure();

        assertThat("I am implicit!", implicitly_declared);

    }
});