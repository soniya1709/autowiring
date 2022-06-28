package com.prowings.usingxml;

public class Mobile {
int number;
String cname;
Charger charger;
public Mobile() {
	super();
	// TODO Auto-generated constructor stub
}
public Mobile(int number, String cname, Charger charger) {
	super();
	this.number = number;
	this.cname = cname;
	this.charger = charger;
}
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
public Charger getCharger() {
	return charger;
}
public void setCharger(Charger charger) {
	this.charger = charger;
}
@Override
public String toString() {
	return "Mobile [number=" + number + ", cname=" + cname + ", charger=" + charger + "]";
}

}
