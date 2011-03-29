package com.jimbarritt.tutorial.mockingdi;

import static java.lang.String.format;

public class Greeter {
    public String sayHelloTo(String name) {
        return format("Hello '%s'", name);
    }
}