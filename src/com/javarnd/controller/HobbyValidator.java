package com.javarnd.controller;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class HobbyValidator implements ConstraintValidator<IsValidHobby, String> {
	
	private String listofHobbies;
	
	@Override
	public void initialize(IsValidHobby isValidHobby) {
		listofHobbies= isValidHobby.listofHobbies();
		
	}

	@Override
	public boolean isValid(String hobbies, ConstraintValidatorContext arg1) {
		
		if(hobbies == null) {
			return false;
		}

		if(hobbies.matches(listofHobbies)) {
			return true;
		}else {
			return false;
		}
	}

}
