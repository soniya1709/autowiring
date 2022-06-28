package com.prowings.usingannotation;

public class ChargerforAnnotation {
	int price;
	String cname;
	public ChargerforAnnotation() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ChargerforAnnotation(int price, String cname) {
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
		return "ChargerforAnnotation [price=" + price + ", cname=" + cname + "]";
	}

}
