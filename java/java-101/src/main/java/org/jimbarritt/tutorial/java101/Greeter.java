package org.jimbarritt.tutorial.java101;

import static java.lang.String.format;

public class Greeter {

	public String sayHelloTo(String... names) {
		StringBuilder sb = new StringBuilder();

		for (String name : names) {
			sb.append(name).append(" ");
		}

		return format("Hello %s", sb.toString().trim());
	}

	public void sendEmailTo(String emailAddress, String subject) {
	}

}
