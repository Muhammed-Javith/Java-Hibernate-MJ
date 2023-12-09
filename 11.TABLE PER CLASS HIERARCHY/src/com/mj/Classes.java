package com.mj;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("CLS")
public class Classes extends Student {
	@Column(name = "cname")
	private String Class_Name;

	public Classes() {
		super();
	}

	public String getClass_Name() {
		return Class_Name;
	}

	public void setClass_Name(String class_Name) {
		Class_Name = class_Name;
	}

	@Override
	public String toString() {
		return "Classes [Class_Name=" + Class_Name + "]";
	}
}