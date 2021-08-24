package com.userInput;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DataValidator {
	
	UserInput input = new UserInput();

	
	public String validateNameLength(String name) {		
		int length,sum;
		boolean result=false;
		String validName="";
		
		while(result !=true) {		
		length = name.length();
		sum=0;
		for(int counter=0;counter<length;counter++){
            if(name.charAt(counter)==' ')
                {
                    continue;
                }
                sum++;
                }             

		 result =  !(sum<3)||(sum>20);		 
		 if(result==true) {
			 validName = name;
			 break;
		 }	
		 
		 else {
		   	  System.out.println("Length of name should be ranging from 3 to 20 characters");
	    	  name = input.reenterUserName();
		 }
		 
		}
		 return validName;
	}
	
	
	public String validateName(String name) { 	  
		String validatedName="";
		boolean validName=false;
		
		while(validName!= true) {		
			String regexUserName = "^[A-Za-z\\s]+$";			
			Pattern pattern = Pattern.compile(regexUserName);			
			Matcher matcher = pattern.matcher(name);			
			validName= matcher.matches();
			
			if(validName==true) {
				validatedName = name;
				break;
			}			
			else {
				System.out.println("Not valid name");
				name = input.reenterUserName();
			}		
		}	
		return validatedName;
	}
	
	
	public int validateAge(String age) {
		
		int validatedAge=0;
		boolean validAge=false;
		
		while(validAge!= true) {
			
			String regexUserAge = "^[0-9]*$";			
			Pattern pattern = Pattern.compile(regexUserAge);			
			Matcher matcher = pattern.matcher(age);			
			validAge= matcher.matches();
			
			if(validAge==true) {
				validatedAge = Integer.parseInt(age);
					break;					
			}
			
			else {
				System.out.println("Not valid name");
				age = input.reenterUserAge();
			}		
			
		}
		return validatedAge;
	}
	
	public int validateAgeNumber(int age) {		
		int validatedAge=0;	
		boolean validAge=true;
			
		while(validAge != false) {
			
		validAge = (age<0)||(age>150);
		if(validAge==true) {
			System.out.println("Age should be in between 0 to 150");
			age = Integer.parseInt(input.reenterUserAge());
		}
		else {
			validatedAge=age;
			break;
		}
		}
		return validatedAge;
	}
	
	
	
	
	public String validateEmail(String email) {
		
		boolean validEmail=false;
		String validatedEmail="";
		while(validEmail!=true) {
			String regexUserEmail = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
			Pattern pattern = Pattern.compile(regexUserEmail);
			Matcher matcher = pattern.matcher(email);
			validEmail= matcher.matches();
			

			if(validEmail==true) {
				validatedEmail = email;
				break;
			}			
			else {
				System.out.println("Not valid name");
				email = input.reenterUserEmail();
			}	
		}

		return validatedEmail;
	}
	
	
	
	public Date validateDob(String dob) {
		boolean result=false;
		  Date date = new Date();
		while(result != true) {
		if (dob.matches("[0-9]{2}[/]{1}[0-9]{2}[/][0-9]{4}")) {
		      SimpleDateFormat sdf = new SimpleDateFormat("mm-dd-yyyyy");
		      sdf.setLenient(false);
		      try {
		        date = sdf.parse(dob);
		        System.out.println("valid");
		      } catch (ParseException e) {
		        System.out.println("invalid");
		      }
		      result=true;
	}
		
		else {
			System.out.println("invalid date of birth");
			dob = input.reenterUserDateOfBirth();
		}
	}
		return date;
}

	public void validateCurrentDate(Date date) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("mm-dd-yyyy");
		  LocalDate localDate = LocalDate.now();
		  boolean result = false;
		  Date dateLocal = java.sql.Date.valueOf(localDate);
		  
		  if(date.compareTo(dateLocal) > 0) {			  
		         System.out.println("Date 1 occurs after Date 2");
		         
		      } 
		  else if(date.compareTo(dateLocal) < 0) {
			  System.out.println("Date of birth should be less then today date");
			  String dob = input.reenterUserDateOfBirth();
		      } 
		  else if(date.compareTo(dateLocal) == 0) {
		         System.out.println("Date of birth should be less then today date");
		         String dob = input.reenterUserDateOfBirth();
		      }
	}
	
}