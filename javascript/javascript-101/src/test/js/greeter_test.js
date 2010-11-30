// In Visual Studio: http://slmoloch.blogspot.com/2009/08/how-to-run-jstestdriver-with-visual_02.html
TestCase("greeter behaviours", {

    setUp : function() {},
    tearDown : function(){},

    test_says_hello_to_jim : function() {
    	var greeter = js101.Greeter();
    	    
        console.log("greeter is " + greeter);
        
        var message = greeter.sayHelloTo("Jim");
        
        assertEquals("Hello 'Jim'", message);
    },
    
    test_says_hello_to_sophia : function() {
    	var greeter = js101.Greeter();
    	
        console.log("greeter is " + greeter);
        
        var message = greeter.sayHelloTo("Sophia");
        
        assertEquals("Hello 'Sophia'", message);
    }
        
    
});