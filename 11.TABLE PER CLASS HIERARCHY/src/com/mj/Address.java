package com.mj;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("ADD")
public class Address extends Student {
	@Column(name = "vill")
	private String village;
	@Column(name = "hno")
	private int Hoding_no;
	@Column(name = "city")
	private String city;

	public Address() {
		super();
	}

	public String getVillage() {
		return village;
	}

	public void setVillage(String village) {
		this.village = village;
	}

	public int getHoding_no() {
		return Hoding_no;
	}

	public void setHoding_no(int hoding_no) {
		Hoding_no = hoding_no;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [village=" + village + ", Hoding_no=" + Hoding_no + ", city=" + city + "]";
	}
}