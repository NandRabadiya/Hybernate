package com.map.many;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity
public class Emp {

	@Id
	private int eid;
	
	private String name;
	public Emp(int eid, String name) {
		super();
		this.setEid(eid);
		this.setName(name);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@ManyToMany
	@JoinTable(
				name="emp_project",
				joinColumns = {@JoinColumn(name="eid")},
				inverseJoinColumns = { @JoinColumn(name="pid")}
			)
	private List<Project> projects;
	public Emp(int eid, String name, List<Project> projects) {
		super();
		this.eid = eid;
		this.name = name;
		this.projects = projects;
	}
	public List<Project> getProjects() {
		return projects;
	}
	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}
	
	
}
