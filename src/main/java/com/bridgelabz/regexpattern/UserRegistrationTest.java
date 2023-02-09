package com.bridgelabz.regexpattern;

import java.util.Scanner;

import org.junit.Assert;

import org.junit.Test;

public class UserRegistrationTest {

	Scanner scan = new Scanner(System.in);
	UserRegistration ur = new UserRegistration();
	
	@Test
	public void FirstNameTest() {
		
		
		System.out.print("Enter the First Name : ");
		Assert.assertEquals(true, ur.FirstName(scan.next(),"^[A-Z][a-z]{1,}$"));
	}
	
	@Test
	public void LastNameTest() {
		
		System.out.print("Enter the Last Name : ");
		Assert.assertEquals(true, ur.LastName(scan.next(),"^[A-Z][a-z]{1,}$"));
	}
	
	@Test
	public void EmailTest() {
		
		System.out.print("Enter the Email ID : ");
		Assert.assertEquals(true, ur.Email(scan.next(),"^[a-z].[0-9]?.*[\\.\\+\\@\\-][a-z]?.*[a-z_\\.\\,]$"));
	}
	
	@Test
	public void PhoneNumberTest() {
		
		System.out.print("Enetr the Phone Number : ");
		Assert.assertEquals(true, ur.PhoneNumber(scan.next(),"^(91)?[8-9]{1}[0-9]{9}$"));
	}
	
	@Test
	public void PasswordTest() {
		
		System.out.print("Enetr the Password : ");
		Assert.assertEquals(true, ur.Password(scan.next(),"^(?=.*[A-Z])(?=.*[a-z0-9])(?=[!@#$&%~]){8,20}$"));
	}
}

