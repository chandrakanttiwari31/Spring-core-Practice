package com.springcor.auto.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Emp {
	
 private Adress address;

public Adress getAddress() {
	return address;
}
@Autowired
public void setAddress(Adress address) {
	this.address = address;
}

public Emp() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "Emp [address=" + address + "]";
}

public Emp(Adress address) {
	super();
	System.out.println("inside constructor");

	this.address = address;
}
 
 
 
	
}
