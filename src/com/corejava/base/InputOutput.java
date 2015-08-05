package com.corejava.base;

import java.util.Date;
import java.util.Scanner;

public class InputOutput {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.println("What`s your name?");
		String name = in.nextLine();
		System.out.println("How old are you?");
		int age = in.nextInt();
		System.out.println("Hello "+name+", you are "+ age +" years old now.");
		System.out.printf("next year you will be %d\n", age+1);
		String message = String.format("next next year you will be %d\n", age+2);
		System.out.println(message);
		System.out.printf("%tc", new Date());
	}

} 
