package com.mj;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "emptab1")
public class Employee extends Person {
	@Column(name = "sal")
	private double empSal;
	@Column(name = "prj")
	private String empProj;

	public Employee() {
		super();
	}

	public double getEmpSal() {
		return empSal;
	}

	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}

	public String getEmpProj() {
		return empProj;
	}

	public void setEmpProj(String empProj) {
		this.empProj = empProj;
	}

	public String toString() {
		return "Employee [empSal=" + empSal + ", empProj=" + empProj + "]";
	}
}