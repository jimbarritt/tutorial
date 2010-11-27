package com.jimbarritt.tutorial.junitmax;

public class StringPadding {


	public static String padStringLeft(String input, int width) {
		StringBuilder sb = new StringBuilder();
		for (int i=0;i<width-input.length();++i) {
			sb.append(" ");
		}		
		sb.append(input);		
		return sb.toString();
	}

}
