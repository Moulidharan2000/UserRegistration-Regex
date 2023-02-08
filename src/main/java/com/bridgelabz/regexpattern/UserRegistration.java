package com.bridgelabz.regexpattern;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {
	
	public static void validate(String firstName) {
		
		String namePattern = "^[A-Z][a-z]{1,}$";
		boolean name = false;
		if(firstName.length() > 3) {
			name =Pattern.matches(namePattern, firstName);
			if(name == true)
				System.out.println("First Name : "+firstName+"\nFirst Name is Valid");
			else
				System.out.println("First Name is Invalid !!!");
		}
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the First Name : ");
		String firstName = scan.next();
		validate(firstName);
	}
}
