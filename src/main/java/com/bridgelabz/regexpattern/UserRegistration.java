package com.bridgelabz.regexpattern;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {
	
	public static void validate(String email) {
		
		String emailPattern = "^[a-z0-9_\\.]+[@][a-z]+[\\.][a-z]{2,3}$";
		boolean id = false;
		id = Pattern.matches(emailPattern, email);
		if(id == true)
			System.out.println("Email ID : "+email+"\nEmail ID is Valid");
		else
			System.out.println("Email ID is Invalid Format !!!");
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Email ID : ");
		String email = scan.next();
		validate(email);
	}
}
