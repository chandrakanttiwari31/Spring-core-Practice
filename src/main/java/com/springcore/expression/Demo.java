package com.springcore.expression;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {
	
	
	@Value("#{22+34}")
	private int x;
	
	
	@Value("#{33+65}")
	private int y;
	
	 @Value("#{T(java.lang.Math).sqrt(144)}")
	private double z;
	
	@Value("#{new java.lang.String('Chandan Tiwari')}")
	 private String name;
	
	public int getX() {
		return x;
	}
	
	
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}


	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + ", z=" + z + ", name=" + name + "]";
	}

   
	public double getZ() {
		return z;
	}


	public void setZ(double z) {
		this.z = z;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	

}
