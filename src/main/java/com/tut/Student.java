
package com.tut;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity //(name="student_details")
//@Table(name="mytable")
public class Student {
	
	
	private String city;
	private String name;
	private Certificate certificate;
	
	public Student(int id, String name, String city ) {
		super();
		this.city = city;
		this.name = name;
		this.id = id;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Id //primary key
	private int id;
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Student [city=" + city + ", name=" + name + ", certificate=" + certificate + ", id=" + id + "]";
	}
	public Certificate getCertificate() {
		return certificate;
	}
	public void setCertificate(Certificate certificate) {
		this.certificate = certificate;
	}

}
