package com.cs.FirstJerseyProject;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class PersonDetail {
	private String name;
	private int empId;
	private String address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
