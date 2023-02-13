package com.bridgelabz.regexpattern;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {
	
	Scanner scan = new Scanner(System.in);
	public boolean FirstName(String firstName, String firstNamePattern) {
		
		return Pattern.matches(firstNamePattern, firstName);
	}
	
	public boolean LastName(String firstName, String namePattern) {
		
		return Pattern.matches(namePattern, firstName);
	}
	
	public boolean Email(String email, String emailPattern) {
		
		return Pattern.matches(emailPattern, email);
	}
	
	public boolean PhoneNumber(CharSequence phoneNumber, String numberPattern) {
		
		return Pattern.matches(numberPattern, phoneNumber);
	}
	
	public boolean Password(String password, String passwordPattern) {
		
		return Pattern.matches(passwordPattern, password);
	}
}
