package com.springcor.auto.annotation.qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {
	@Autowired
	@Qualifier("address1")
 private Adress address;

public Adress getAddress() {
	return address;
}

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
