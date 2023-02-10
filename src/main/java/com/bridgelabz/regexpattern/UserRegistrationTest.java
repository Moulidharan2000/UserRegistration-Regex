package com.bridgelabz.regexpattern;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class UserRegistrationTest {
	
	String email;
	String emailPattern;
	boolean result;
	UserRegistration ur = new UserRegistration();
	
	public UserRegistrationTest(String email, String emailPattern, boolean result) {
		
		super();
		this.email = email;
		this.emailPattern = emailPattern;
		this.result = result;
	}
	
	@Test
	public void FirstNameTest() {
		
		Assert.assertEquals(result, ur.Patterns(email,emailPattern));
	}
	
	@Parameterized.Parameters
	public static Collection<Object[]> inputs() {
		
		return Arrays.asList(new Object[][] {
			{"abc@yahoo.com,","^[a-z].[0-9]?.*[\\.\\+\\@\\-][a-z]?.*[a-z_\\.\\,]$", true},
			{"abc-100@yahoo.com,","^[a-z].[0-9]?.*[\\.\\+\\@\\-][a-z]?.*[a-z_\\.\\,]$", true},
			{"abc.100@yahoo.com","^[a-z].[0-9]?.*[\\.\\+\\@\\-][a-z]?.*[a-z_\\.\\,]$", true},
			{"abc111@abc.com,","^[a-z].[0-9]?.*[\\.\\+\\@\\-][a-z]?.*[a-z_\\.\\,]$", true},
			{"abc-100@abc.net,","^[a-z].[0-9]?.*[\\.\\+\\@\\-][a-z]?.*[a-z_\\.\\,]$", true},
		});
	}
}

