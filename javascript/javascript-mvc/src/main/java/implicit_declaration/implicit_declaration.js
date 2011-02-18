var implicit = implicit || {};


implicit.someObject = function() {

    self = {

        sayHello : function(name) {
            console.log("hello: " + name);
        }

    };

    return self;
}

anObject = implicit.someObject();

anObject.sayHello("Jim");

self.sayHello("Oops, I am now global!");