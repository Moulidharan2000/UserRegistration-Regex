package com.bridgelabz.regexpattern;

import java.util.regex.Pattern;

public class UserRegistration {

	public boolean FirstName(String firstName, String namePattern) {
		
		return Pattern.matches(namePattern, firstName);
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
