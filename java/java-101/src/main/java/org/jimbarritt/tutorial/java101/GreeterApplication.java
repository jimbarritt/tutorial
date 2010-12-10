package org.jimbarritt.tutorial.java101;

public class GreeterApplication {

	private final String[] arguments;
	private final Greeter greeter;

	public static void main(String[] args) {
		GreeterApplication greeterApplication = new GreeterApplication(args);
		greeterApplication.run();
	}

	public GreeterApplication(String... arguments) {
		this.arguments = arguments;		
		this.greeter = new Greeter();
	}

	private void run() {
		System.out.println("Welcome to the Greeter application.");
		
		String message = greeter.sayHelloTo(arguments);
		System.out.println(message);
	}
	
}
