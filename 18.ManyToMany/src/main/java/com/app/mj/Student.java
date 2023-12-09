package com.app.mj;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "stdtab2")
public class Student {
	@Id
	@Column(name = "sid")
	private int stdId;
	@Column(name = "sname")
	private String stdName;
	@Column(name = "smarks")
	private double stdMarsk;

	@ManyToMany
	@JoinTable(name = "stdcrstab", joinColumns = @JoinColumn(name = "sidFk"), inverseJoinColumns = @JoinColumn(name = "cidFk"))
	private Set<Course> cobs = new HashSet<Course>(0);/// HAS-A

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

	public double getStdMarsk() {
		return stdMarsk;
	}

	public void setStdMarsk(double stdMarsk) {
		this.stdMarsk = stdMarsk;
	}

	public Set<Course> getCobs() {
		return cobs;
	}

	public void setCobs(Set<Course> cobs) {
		this.cobs = cobs;
	}

	@Override
	public String toString() {
		return "Student [stdId=" + stdId + ", stdName=" + stdName + ", stdMarsk=" + stdMarsk + ", cobs=" + cobs + "]";
	}
}
