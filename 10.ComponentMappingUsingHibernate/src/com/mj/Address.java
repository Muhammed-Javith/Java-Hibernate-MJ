package com.mj;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

/*multiple classes connected to one table*/
@Embeddable
public class Address {
	@Column(name = "hno")
	private String hno;
	@Column(name = "loc")
	private String loc;

	public Address() {
		super();
	}

	public String getHno() {
		return hno;
	}

	public void setHno(String hno) {
		this.hno = hno;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	@Override
	public String toString() {
		return "Address [hno=" + hno + ", loc=" + loc + "]";
	}
}