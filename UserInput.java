package com.userInput;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserInput {
	
	Scanner input = new Scanner(System.in);
	
	public String userName() {
			
		System.out.println("Enter Your Name");
		String name = input.nextLine();
		
		return name;
	}
		

	public String reenterUserName() {
		System.out.println("Enter name again");
		String name = input.nextLine();
		return name;
	}
	
	
	public String userAge() {
			
			System.out.println("Enter Your Age");
			String age = input.nextLine();	
		return age;
	}
	
	public String reenterUserAge() {
		System.out.println("Enter Your Age again !!");
		String age = input.nextLine();	
	return age;
	}
	
	
	public String userDateOfBirth() {
		
		System.out.println("Enter your Date of Birth in the format dd\\mm\\yyyy");
		String dob = input.next();	
		return dob;
	}
	
	
	public String reenterUserDateOfBirth() {
		
		System.out.println("Enter your Date of Birth in the format dd\\mm\\yyyy again");
		String dob = input.next();	
		return dob;
	}
	
	public String userEmail() {
		
		System.out.println("Enter your Email Address");
		String email = input.next();
		
		return email;
	}
	
	public String reenterUserEmail() {
		
		System.out.println("Enter your Email Address again");
		String email = input.next();
		
		return email;
	}
	

}
