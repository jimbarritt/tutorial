var js101 = js101 || {};

js101.Greeter = function() {
	
	var priv = {};
	
	priv.formatGreeting = function(name) {
		return "Hello '" + name + "'";
	}
	
	return {
		sayHelloTo : function(name) {
			return priv.formatGreeting(name);
		}
	}

};
