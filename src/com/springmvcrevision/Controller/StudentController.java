package com.springmvcrevision.Controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class StudentController {

	@RequestMapping("/showStudentForm")
	public String getStudentForm(Model model) {
		Student student = new Student();
		model.addAttribute("student", student);
		return "student-form";
	}

	@RequestMapping("	/processStudentForm")
	public String processStudentForm(@Valid @ModelAttribute("student") Student student, BindingResult theResult) {
		if (theResult.hasErrors()) {
			return "student-form";
		} else {
			System.out.println("Student details :" + student.getFirstName() + ", " + student.getLastName());
			return "student-confirmation";
		}

	}

}
