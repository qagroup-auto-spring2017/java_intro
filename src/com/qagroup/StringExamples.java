package com.qagroup;

public class StringExamples {

	public static void main(String[] args) {
		String text = "Java";
		System.out.println(text);
		String upperCase = text.toUpperCase();
		System.out.println(upperCase);
		
		String lowerCase = text.toLowerCase();
		System.out.println(lowerCase);
		
		int length = text.length();
		System.out.println(length);
		
		String part = text.substring(1, 3);
		System.out.println(part);
		
		boolean isEqual = text.equals("java");
		System.out.println(isEqual);
		
		String text2 = " is the best";
		
		String concatenated = text.concat(text2);
		System.out.println(concatenated);
		
		concatenated = text + text2;
		System.out.println(concatenated);
		
		String text3 = new String();
		System.out.println("***");
		System.out.println(text3);
		System.out.println(text3.isEmpty());
		System.out.println("***");
		System.out.println(text.isEmpty());
	}

}
