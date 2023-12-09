package com.app.mj;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "courstab")
public class Course {
	@Id
	@Column(name = "cid")
	private int crId;
	@Column(name = "cname")
	private String crName;
	@Column(name = "ccost")
	private double crCost;

	public Course() {
		super();
	}

	public int getCrId() {
		return crId;
	}

	public void setCrId(int crId) {

		this.crId = crId;
	}

	public String getCrName() {
		return crName;
	}

	public void setCrName(String crName) {
		this.crName = crName;
	}

	public double getCrCost() {
		return crCost;
	}

	public void setCrCost(double crCost) {
		this.crCost = crCost;
	}

	@Override
	public String toString() {
		return "Course [crId=" + crId + ", crName=" + crName + ", crCost=" + crCost + "]";
	}
}