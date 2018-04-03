package com.javarnd.controller;

import java.beans.PropertyEditorSupport;

public class StudentNameEditor extends PropertyEditorSupport {
	
	@Override
	public void setAsText(String name) {
		
		if(name.contains("Mr.") || name.contains("Ms.")) {
			setValue(name);
			
		}else {
			name="Ms "+name;
			setValue(name);
		}
		
	}

}
