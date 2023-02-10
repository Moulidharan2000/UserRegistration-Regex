package com.bridgelabz.regexpattern;

import java.util.regex.Pattern;

public class UserRegistration {

	public boolean Patterns(String email, String emailPattern) {
		
		return Pattern.matches(emailPattern, email);
	}
}
