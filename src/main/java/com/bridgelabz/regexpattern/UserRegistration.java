package com.bridgelabz.regexpattern;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {
	
	public static void validate(String lastName) {
		
		String namePattern = "^[A-Z][a-z]{1,}$";
		boolean name = false;
		if(lastName.length() > 3) {
			name =Pattern.matches(namePattern, lastName);
			if(name == true)
				System.out.println("Last Name : "+lastName+"\nLast Name is Valid");
			else
				System.out.println("Last Name is Invalid !!!");
		}
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Last Name : ");
		String lastName = scan.next();
		validate(lastName);
	}
}
