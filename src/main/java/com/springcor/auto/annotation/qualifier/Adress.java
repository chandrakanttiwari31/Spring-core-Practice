package com.springcor.auto.annotation.qualifier;

public class Adress {
private String city;

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
