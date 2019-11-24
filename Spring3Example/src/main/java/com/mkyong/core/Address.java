package com.mkyong.core;

public class Address {
	
	private String pin;
	private String city;
	private String country;
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "Address [pin=" + pin + ", city=" + city + ", country=" + country + "]";
	}
	public Address(String pin, String city, String country) {
		super();
		this.pin = pin;
		this.city = city;
		this.country = country;
	}
	public Address() {
		super();
	}
	
	

}
