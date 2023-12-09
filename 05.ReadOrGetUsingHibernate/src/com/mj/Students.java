package com.mj;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;

@Entity
@Table()
public class Students {
	@Id
	@Column(name = "sid")
	private int stdId;
	@Column(name = "sname")
	private String stdName;

	@Column(name = "sfee")
	private double stdFee;
	@Column(name = "age")
	private int Age;

	public Students() {
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

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	@Override
	public String toString() {
		return "Students [stdId=" + stdId + ", stdName=" + stdName + ", stdFee=" + stdFee + ", Age=" + Age + "]";
	}
}