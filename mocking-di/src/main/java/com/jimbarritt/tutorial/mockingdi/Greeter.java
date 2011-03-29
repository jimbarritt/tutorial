package com.jimbarritt.tutorial.mockingdi;

import static java.lang.String.format;

public class Greeter {
    private GreetingService greetingService;

    public Greeter(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHelloTo(String name) {
        return greetingService.formatHelloMessageFor(name);
    }

}