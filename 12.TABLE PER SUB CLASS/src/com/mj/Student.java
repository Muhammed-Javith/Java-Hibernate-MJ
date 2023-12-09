package com.mj;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name = "stdTab")
@PrimaryKeyJoinColumn(name = "sid")
public class Student extends Person {
	@Column(name = "fee")
	private double stdFee;
	@Column(name = "grd")
	private String grade;

	public Student() {
		super();
	}

	public double getStdFee() {
		return stdFee;
	}

	public void setStdFee(double stdFee) {
		this.stdFee = stdFee;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Student [stdFee=" + stdFee + ", grade=" + grade + "]";
	}
}