TestCase("simple event behaviours", {

    setUp : function() {},

    tearDown : function() {},

    test_private_methods : function () {
        var simpleObject = mvc.simpleObject();

        var result = simpleObject.publicMethod();

        assertEquals("This is my private secret: I am a secret", result);

        assertTrue("somePrivateData should not be defined", lang.isNotDefined(simpleObject.somePrivateData));
    }
});