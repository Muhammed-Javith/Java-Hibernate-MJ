package com.mj;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.SecondaryTable;
import jakarta.persistence.SecondaryTables;
import jakarta.persistence.Table;

@Entity
@Table(name = "emptab")
@SecondaryTables({ @SecondaryTable(name = "emptwo"),
		@SecondaryTable(name = "empextrainfo", pkJoinColumns = @PrimaryKeyJoinColumn(name = "eidfk")) })
public class Employee {
	@Id
	@Column(name = "eid")
	private int empId;
	@Column(name = "ename")
	private String empName;
	@Column(name = "esal", table = "emptwo")
	private double empSal;
	@Column(name = "proj", table = "empextrainfo")
	private String prjs;
	@Column(name = "dept", table = "empextrainfo")
	private String detp;

	public Employee() {
		super();
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getEmpSal() {
		return empSal;
	}

	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}

	public String getPrjs() {
		return prjs;
	}

	public void setPrjs(String prjs) {
		this.prjs = prjs;
	}

	public String getDetp() {
		return detp;
	}

	public void setDetp(String detp) {
		this.detp = detp;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + ", prjs=" + prjs + ", detp="
				+ detp + "]";
	}
}