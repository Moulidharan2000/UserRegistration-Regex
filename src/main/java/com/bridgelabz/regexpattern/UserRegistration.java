package com.bridgelabz.regexpattern;

import java.util.Scanner;

import java.util.regex.Pattern;

import org.junit.Assert;


public class UserRegistration implements IValidate, IPhoneVerify{
	
	@Override
	public boolean user(String patterns, String details) {
		
		return Pattern.matches(patterns, details);
	}
	
	@Override
	public boolean user(String patterns, CharSequence phoneNumber) {
		
		return Pattern.matches(patterns, phoneNumber);
	}
	
	public static void main(String[] args) throws AssertionError{
		
		try {
			Scanner scan = new Scanner(System.in);
			IValidate valid = new UserRegistration();
			UserRegistration use = new UserRegistration();
			
			valid = (details, pattern) -> {
				Assert.assertEquals(true, use.user(pattern, details));
				return true;
			};
			
			IPhoneVerify verify = new UserRegistration();
			
			verify = (patterns, phoneNumber) -> {
				Assert.assertEquals(true, use.user(patterns, phoneNumber));
				return true;			
			};
			
			System.out.print("Enter the First Name : ");
			boolean checked = valid.user(scan.next(),"^[A-Z][a-z]{1,}$");
			
			System.out.print("Enter the Last Name : ");
			checked = valid.user(scan.next(),"^[A-Z][a-z]{1,}$");
			
			System.out.print("Enter the Email ID : ");
			checked = valid.user(scan.next(),"^[a-z].[0-9]?.*[\\.\\+\\@\\-][a-z]?.*[a-z_\\.\\,]$");
			
			System.out.print("Enter the Phone Number  : ");
			checked = verify.user(scan.next(),"^(91)?[6-9]{1}[0-9]{9}$");
			
			System.out.print("Enter the Password : ");
			checked = valid.user(scan.next(),"^(?=.*[A-Z])(?=.*[a-z0-9])(?=[!@#$&%~]){8,30}$");
			
			if(checked == true)
				System.out.println("User Details are Valid");
			else
				System.out.println("Invalid User Details !!!");
			}catch(AssertionError e) {
				System.out.println("Invalid User Details !!!");
		}
	}
}
