package com.springmvcrevision.Controller;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CustomerController {

	@InitBinder
	public void stringInitBinder(WebDataBinder binder) {
		StringTrimmerEditor editor = new StringTrimmerEditor(true);
		binder.registerCustomEditor(String.class, editor);
	}

	@RequestMapping("/showCustomerForm")
	public String getCustomerForm(Model model) {
		model.addAttribute("customer", new Customer());
		return "Customer-form";
	}

	@RequestMapping("/processCustomerForm")
	public String processForm(@Valid @ModelAttribute("customer") Customer customer, BindingResult theresult) {
		if (theresult.hasErrors()) {
			return "Customer-form";
		} else {
			System.out.println("Customer details : " + customer.getFirstName());
			return "Customer-confirmation";
		}
	}
}
