package com.demo.userRattingService.models;

public class StudentAddress {

	private int rollNumber;
	
	private String district;
	
	private String state;

	public StudentAddress(int rollNumber, String district, String state) {
		super();
		this.rollNumber = rollNumber;
		this.district = district;
		this.state = state;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
}
