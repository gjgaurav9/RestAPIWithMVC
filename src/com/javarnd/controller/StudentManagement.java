package com.javarnd.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller()
@RequestMapping("front")
public class StudentManagement {
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		
		//binder.setDisallowedFields(new String[] {"hobbies"});
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy**dd**mm");
		binder.registerCustomEditor(Date.class, "dob", new CustomDateEditor(dateFormat, false));
		binder.registerCustomEditor(String.class, "name", new StudentNameEditor());
		
	}
	
	@RequestMapping(name="userDetails.html", method= RequestMethod.GET)
	public ModelAndView studentDetails() {
		
		ModelAndView modelAndView = new ModelAndView("studentForm");
		return modelAndView;
	}
	
	/*@RequestMapping(name="success.html", method= RequestMethod.POST)
	public ModelAndView studentDetailsSuccess(@RequestParam("name") String studentName,
			@RequestParam("hobbies") String studentHobbies) {
		
		Student student = new Student();
		student.setHobbies(studentHobbies);
		student.setName(studentName);
		
		
		
		ModelAndView modelAndView = new ModelAndView("studentDisp");
		modelAndView.addObject("myheader", "Welcome bandhu ");
		modelAndView.addObject("student", student);
		
		return modelAndView;
	}
*/
	
	//Using ModelAttribute to set automatic values in the Pojo Classes
	
	@RequestMapping(name="success.html", method=RequestMethod.POST)
	public ModelAndView studentDetailsSuccess(@Valid @ModelAttribute("student") Student student, BindingResult result) {
		
		if(result.hasErrors()) {
			ModelAndView model = new ModelAndView("studentForm");			
			return model;
		}
		
		ModelAndView modelAndView = new ModelAndView("studentDisp");
		modelAndView.addObject("myheader", "Welcome bandhu ");
		
		return modelAndView;
	}
	
	@ResponseBody
	@RequestMapping(value="students" , method = RequestMethod.GET)
	public ArrayList<Student> getStudents() {
		
		ArrayList<Student> students = new ArrayList<>();
		Student student1 = new Student();
		student1.setName("Gaurav");
		Student student2 = new Student();
		student2.setName("Gaurav");
		Student student3 = new Student();
		student3.setName("Gaurav");
		
		students.add(student1);
		students.add(student2);
		students.add(student3);
		
		return students;

		
		
	}

}
