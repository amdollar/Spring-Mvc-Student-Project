package com.springmvcrevision.Controller;

import java.util.LinkedHashMap;
import java.util.Map;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Student {
	
	String firstName;
	@NotNull(message= "is required!")
	@Size(min = 1, message="is required!")
	String lastName;
	String language;
	String country;
	Map<String, String> countrySelectValues;
	String[] operatingSystems;

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public Student() {
		countrySelectValues = new LinkedHashMap<String, String>();
		countrySelectValues.put("India", "India");
		countrySelectValues.put("Japan", "Japan");
		countrySelectValues.put("Poland", "Poland");
		countrySelectValues.put("Nepal", "Nepal");

	}

	public Map<String, String> getCountrySelectValues() {
		return countrySelectValues;
	}

	public void setCountrySelectValues(Map<String, String> countrySelectValues) {
		this.countrySelectValues = countrySelectValues;
	}

	public Student(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName + "]";
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String[] getOperatingSystems() {
		return operatingSystems;
	}

	public void setOperatingSystems(String[] operatingSystems) {
		this.operatingSystems = operatingSystems;
	}

}
