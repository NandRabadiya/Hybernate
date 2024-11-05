package com.tut;

import jakarta.persistence.Embeddable;

@Embeddable
public class Certificate {
	
	private String coruse;
	private String duration;
	public Certificate() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Certificate(String coruse, String duration) {
		super();
		this.coruse = coruse;
		this.duration = duration;
	}
	public String getCoruse() {
		return coruse;
	}
	public void setCoruse(String coruse) {
		this.coruse = coruse;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}

}
