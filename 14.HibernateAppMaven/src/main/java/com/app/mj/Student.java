package com.app.mj;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "stdTab2")
public class Student {
	@Id
	@Column(name = "sid")
	private int stdId;
	@Column(name = "sname")
	private String stdName;
	@Column(name = "sfee")
	private double stdFee;

	public Student() {
		super();
	}

	public int getStdId() {
		return stdId;
	}

	public void setStdId(int stdId) {
		this.stdId = stdId;
	}

	public String getStdName() {
		return stdName;
	}

	public void setStdName(String stdName) {
		this.stdName = stdName;
	}

	public double getStdFee() {
		return stdFee;
	}

	public void setStdFee(double stdFee) {
		this.stdFee = stdFee;
	}

	@Override
	public String toString() {
		return "Student [stdId=" + stdId + ", stdName=" + stdName + ", stdFee=" + stdFee + "]";
	}
}