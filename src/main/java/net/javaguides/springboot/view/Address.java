package net.javaguides.springboot.view;

import com.fasterxml.jackson.annotation.JsonGetter;

public class Address {
	
	private long id;	
	private String state;
	private int zipcode;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	@JsonGetter("state")
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	@JsonGetter("zipcode")
	public int getZipcode() {
		return zipcode;
	}
	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}
	
	}
