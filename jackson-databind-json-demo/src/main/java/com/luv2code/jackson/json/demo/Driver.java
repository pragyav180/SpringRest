package com.luv2code.jackson.json.demo;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Driver {

	public static void main(String[] args) {
	   try {
		   
		   ObjectMapper mapper = new ObjectMapper();
		   
		   Student theStudent = 
				   mapper.readValue(new File("data/sample-full.json")  ,Student.class);
		   
		   System.out.println("First Name =" +theStudent.getFirstName());
		   System.out.println("Last Name = "+theStudent.getLastName());
		   
		   for(String tempWork: theStudent.getWorkExp()) {
			   
			   System.out.println("WorkExp:theStudent.getWorkExp() "+tempWork);
			   
		   }
		   for(String tempHobby: theStudent.getHobbies()) {
			   
			   System.out.println("Hobbies: "+tempHobby); 
		   }
		   
		   Address tempAddress = theStudent.getAddress();
		   
		   System.out.println("Address: " +tempAddress.getStreet()+" "+tempAddress.getCity()+" "+tempAddress.getState()+" "+tempAddress.getCountry()+" "+tempAddress.getZip());
		   
		   
		   
		   

	       }
	   catch(Exception exc) {
		   
		   exc.printStackTrace();
		   
	       }

}
}
