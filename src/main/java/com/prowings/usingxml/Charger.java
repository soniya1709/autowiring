package com.prowings.usingxml;

public class Charger {
int price;
String cname;
public Charger() {
	super();
	// TODO Auto-generated constructor stub
}
public Charger(int price, String cname) {
	super();
	this.price = price;
	this.cname = cname;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public String getCname() {
	return cname;
}
public void setCname(String cname) {
	this.cname = cname;
}
@Override
public String toString() {
	return "Charger [price=" + price + ", cname=" + cname + "]";
}

}
