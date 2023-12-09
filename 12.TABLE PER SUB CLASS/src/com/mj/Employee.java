package com.mj;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name = "empTab")
@PrimaryKeyJoinColumn(name = "eid")
public class Employee extends Person {
	@Column(name = "sal")
	private double empSal;

	public Employee() {
		super();
	}

	public double getEmpSal() {
		return empSal;
	}

	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}

	@Override
	public String toString() {
		return "Employee [empSal=" + empSal + "]";
	}
}