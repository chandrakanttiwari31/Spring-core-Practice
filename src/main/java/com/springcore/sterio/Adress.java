package com.springcore.sterio;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Adress {
	
	@Value("kalyan")
private String city;
@Value("mohana")
private String street;

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}

public String getStreet() {
	return street;
}

public void setStreet(String street) {
	this.street = street;
}

public Adress() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "Adress [city=" + city + ", street=" + street + "]";
}


	
}
