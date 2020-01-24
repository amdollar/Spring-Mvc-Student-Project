package com.springmvcrevision.Controller;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Customer {

	String firstName;
	@NotNull(message = "is Required!")
	@Size(min = 1, message = "is Required!")
	String lastName;
	@Min(value = 0, message = "Can not be 0.")
	@Max(value = 10, message = "Can not be more than 10.")
	Integer freePasses;
	@Pattern(regexp = "^[a-zA-Z0-9]{5}", message="Only 5 digits/chars")
	String postalCode;
	

	public Customer() {
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

	public Integer getFreePasses() {
		return freePasses;
	}

	public void setFreePasses(Integer freePasses) {
		this.freePasses = freePasses;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
}
