package com.autowiredAnnotations;

import org.springframework.beans.factory.annotation.Autowired;

public class student {

	private int roll;
	private String name;
	
//	@Autowired
	private Address address;
	
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	
	@Autowired
	public void setAddress(Address address) {
		System.out.println("Setter Method");
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "student [roll=" + roll + ", name=" + name + ", address=" + address + "]";
	}
}
