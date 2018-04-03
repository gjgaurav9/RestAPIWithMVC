package com.javarnd.controller;

import java.util.ArrayList;
import java.util.Date;

import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonIgnoreProperties({"address", "dob"})
@JsonPropertyOrder({"games","dob","name"})
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Student {
	
	private String name;
	
	@Size(min=4, max=40 )
	@IsValidHobby
	private String hobbies;
	
	@JsonProperty("number")
	private Long phoneNumber;
	private Date dob;
	private String[] games;
	
	private Address address;
	
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	
	public String[] getGames() {
		return games;
	}
	public void setGames(String[] games) {
		this.games = games;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHobbies() {
		return hobbies;
	}
	public void setHobbies(String hobbies) {
		this.hobbies = hobbies;
	}
	
}
