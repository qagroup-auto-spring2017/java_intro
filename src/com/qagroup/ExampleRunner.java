package com.qagroup;

import java.util.List;

public class ExampleRunner {
	
	public static void main(String[] args) {
		boolean b = true;
		
		int[] array = new int[3];
		
		array[0] = 22;
		array[1] = 33;
		array[2] = 44;
		
		int counter = 0;
		while(counter < array.length) {
			System.out.println(array[counter]);
			counter++;
		}
		System.out.println("Counter = " + counter);
		
		counter = 0;
		int sum = 0;
		while(counter < array.length) {
			sum = sum + array[counter++];
		}
		System.out.println(sum);
		
		
		if(sum > 100) {
			System.out.println("Sum is greater than 100. Sum = " + sum);
		} else {
			System.out.println("Sum is less than 100. Sum = " + sum);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main2(String[] args) {
		int[] array = new int[3];
		System.out.println(array[0]);
		
		array[0] = 22;
		array[1] = 33;
		array[2] = 44;
		
		System.out.println(array[1]);
		
		System.out.println(array[2]);
		
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i]*10);
		}
		
		int sum = 0;
		
		for(int i = 0; i < array.length; i++) {
			sum = sum + array[i];
			System.out.println("Sum = " + sum);
		}
		
		System.out.println("Sum = " + sum);
		
		int product = 1;
		
		for(int j = 0; j < array.length; j++) {
			product = product*array[j];
		}
		
		System.out.println("Product = " + product);
	}

	public static void main1(String[] args) {
		System.out.println("Hello Automated World!");

		int a = 2;
		int b = 3;
		int c = a + b;

		System.out.println("c=" + c);

		long d = 2341231231l;

		double d_1 = 10.2;
		double d2 = 0.55;

		double d3 = d2 / d_1;
		System.out.println("d3=" + d3);

		boolean isOk = true;
		System.out.println("is OK? - " + isOk);

		isOk = false;
		System.out.println("is OK? - " + isOk);
	}

}
