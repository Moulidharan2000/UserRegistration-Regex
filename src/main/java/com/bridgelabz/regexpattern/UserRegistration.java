package com.bridgelabz.regexpattern;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {
	
	public static void validate(String password) {
		
		String numberPattern = "^[a-z]{8,}$";
		boolean pass = false;
		pass = Pattern.matches(numberPattern, password);
		if(password.length() >= 8) {
			if(pass == true)
				System.out.println("Password : "+password+"\nPassword is Valid");
		}
		else
			System.out.println("Password is Invalid !!!");
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Password : ");
		String password = scan.next();
		validate(password);
	}
}
