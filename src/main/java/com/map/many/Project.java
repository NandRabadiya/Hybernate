package com.map.many;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Project {
	
	@Id 
	private int pid;
	
	public Project(int pid, String projectName) {
		super();
		this.pid = pid;
		this.projectName = projectName;
	}

	@Column(name = "project_name")
	private String projectName;
	
	@ManyToMany(mappedBy="projects")
	private List<Emp> emp1;

	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Project(int pid, String projectName, List<Emp> emp1) {
		super();
		this.pid = pid;
		this.projectName = projectName;
		this.emp1 = emp1;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public List<Emp> getEmp1() {
		return emp1;
	}

	public void setEmp1(List<Emp> emp1) {
		this.emp1 = emp1;
	}

	@Override
	public String toString() {
		return "Project [pid=" + pid + ", projectName=" + projectName + ", emp1=" + emp1 + "]";
	}

}
