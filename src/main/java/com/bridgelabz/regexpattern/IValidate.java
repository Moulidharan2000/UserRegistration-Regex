package com.bridgelabz.regexpattern;

@FunctionalInterface
public interface IValidate {

	boolean user(String patterns, String details);
}

@FunctionalInterface
interface IPhoneVerify{
	
	boolean user (String patterns, CharSequence phoneNumber);
}