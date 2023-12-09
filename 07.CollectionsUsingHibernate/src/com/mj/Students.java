package com.mj;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OrderColumn;
import jakarta.persistence.Table;

@Entity
@Table(name = "StudTab")
public class Students {
	@Id
	@Column(name = "sid")
	private int stdId;
	@Column(name = "sname")
	private String stdName;
	@ElementCollection
	@CollectionTable(name = "stdproj", joinColumns = @JoinColumn(name = "sid"))
	@OrderColumn(name = "pos")
	@Column(name = "Data")
	private List<String> stdData = new ArrayList<String>();

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

	public List<String> getStdData() {
		return stdData;
	}

	public void setStdData(List<String> stdData) {
		this.stdData = stdData;
	}

	@Override
	public String toString() {
		return "Students [stdId=" + stdId + ", stdName=" + stdName + ", stdData=" + stdData + "]";
	}
}