package com.bridgelabz.regexpattern;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {
	
	public static void validate(CharSequence number) {
		
		String numberPattern = "^(91)?[8-9]{1}[0-9]{9}$";
		boolean ph = false;
		ph = Pattern.matches(numberPattern, number);
		if(ph == true)
			System.out.println("Phone Number : "+number+"\nPhone Number is Valid");
		else
			System.out.println("Phone Number is Invalid !!!");
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Phone Number : ");
		CharSequence number = scan.next();
		validate(number);
	}
}
