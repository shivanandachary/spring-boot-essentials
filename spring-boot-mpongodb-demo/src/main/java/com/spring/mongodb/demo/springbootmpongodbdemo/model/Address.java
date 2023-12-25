package com.spring.mongodb.demo.springbootmpongodbdemo.model;

import org.springframework.data.annotation.Id;

public class Address {
	
	public Address(String flatNumber, String roadNumber, String colonyName, String city) {
		super();
		this.flatNumber = flatNumber;
		this.roadNumber = roadNumber;
		this.colonyName = colonyName;
		this.city = city;
	}

	@Id
	private String id;
	
	private String flatNumber;
	
	private String roadNumber;
	
	private String colonyName;
	
	private String city;

	public String getFlatNumber() {
		return flatNumber;
	}

	public void setFlatNumber(String flatNumber) {
		this.flatNumber = flatNumber;
	}

	public String getRoadNumber() {
		return roadNumber;
	}

	public void setRoadNumber(String roadNumber) {
		this.roadNumber = roadNumber;
	}

	public String getColonyName() {
		return colonyName;
	}

	public void setColonyName(String colonyName) {
		this.colonyName = colonyName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	@Override
	public String toString() {
		return String.format("Address[flatNumber='%s',roadNumber='%s', colonyName='%s',city='%s']",flatNumber,roadNumber,colonyName,city);
	}
	
	
	
}
