package com.app.mj;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "modtab")
public class Module {
	@Id
	@Column(name = "mid")
	private int modId;
	@Column(name = "mname")
	private String modName;
	@Column(name = "mtype")
	private String modType;

	public Module() {
		super();
	}

	public int getModId() {
		return modId;
	}

	public void setModId(int modId) {
		this.modId = modId;
	}

	public String getModName() {
		return modName;
	}

	public void setModName(String modName) {
		this.modName = modName;
	}

	public String getModType() {
		return modType;
	}

	public void setModType(String modType) {
		this.modType = modType;
	}

	@Override
	public String toString() {
		return "Module [modId=" + modId + ", modName=" + modName + ", modType=" + modType + "]";
	}
}
