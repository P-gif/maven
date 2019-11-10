package com.jspider.app.dto;

public class UserDto {

	private String firstName;
	private String lastName;
	private int age;
	private String mobileNo;
	
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	@Override
	public String toString() {
		return "USerDto [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", mobileNo=" + mobileNo
				+ "]";
	}
	public UserDto() {
		super();
	}
	
	
}
