package com.prowings.usingannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.prowings.usingxml.Charger;

public class MobileforAnnotation {
	int number;
	String cname;
	@Autowired
	@Qualifier(value="charger1")
	ChargerforAnnotation charger;
//	@Autowired
//	public MobileforAnnotation(ChargerforAnnotation charger) {
//		System.out.println("inside constructor");
//		this.charger=charger;
//	}
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public ChargerforAnnotation getCharger() {
		return charger;
	}
	//@Autowired
	public void setCharger(ChargerforAnnotation charger) {
		System.out.println("inside setter method");
		this.charger = charger;
	}
	@Override
	public String toString() {
		return "MobileforAnnotation [number=" + number + ", cname=" + cname + ", charger=" + charger + "]";
	}

}
