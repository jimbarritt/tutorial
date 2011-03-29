package com.jimbarritt.tutorial.mockingdi;

public class Greeter {
    private GreetingService greetingService;

    public Greeter(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHelloTo(String name) {
        return greetingService.formatHelloMessageFor(name);
    }

}