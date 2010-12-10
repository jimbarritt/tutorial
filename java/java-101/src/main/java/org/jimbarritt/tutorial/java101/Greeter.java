package org.jimbarritt.tutorial.java101;

import static java.lang.String.format;

public class Greeter {

	private boolean useForEachLoop = false;
	
	public String sayHelloTo(String... names) {
		if (useForEachLoop) {
			return buildStringWithForEachLoop(names);
		}
		return buildStringWithIndexedLoop(names);
	}

	private String buildStringWithIndexedLoop(String... names) {
		StringBuilder sb = new StringBuilder();
		
		for (int i=0; i< names.length; i++) {
			sb.append(names[i]);	
			if (i<names.length-1) {
				sb.append(" ");
			}
		}
		
		return format("Hello %s", sb.toString());
	}

	private String buildStringWithForEachLoop(String... names) {
		StringBuilder sb = new StringBuilder();

		for (String name : names) {
			sb.append(name).append(" ");
		}				

		return format("Hello %s", sb.toString().trim());
	}

	public void sendEmailTo(String emailAddress, String subject) {
	}

}
