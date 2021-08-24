package com.main;

import com.userInput.DataValidator;
import com.userInput.UserInput;

public class ExecutionClass {

	public static void main(String[] args) {
		
		UserInput userInput = new UserInput();
		DataValidator validator = new  DataValidator();
		
		String name = userInput.userName();
		String length = validator.validateNameLength(name);
		String validatedName = validator.validateName(length);
		
		String age = userInput.userAge();
		int validAge = validator.validateAge(age);
		int validatedAge = validator.validateAgeNumber(validAge);
		
		String dob = userInput.userDateOfBirth();
		validator.validateDob(dob);
		
		String email = userInput.userEmail();
	    String validatedEmail = validator.validateEmail(email);	

		System.out.println("Your Name is "+validatedName);
		System.out.println("Your Age is "+validatedAge);
		System.out.println("Your Dob is "+dob);
		System.out.println("Your email is "+validatedEmail);
		
		System.exit(2);
	}

}
