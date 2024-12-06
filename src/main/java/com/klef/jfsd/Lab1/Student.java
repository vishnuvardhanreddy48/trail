package com.klef.jfsd.Lab1;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="lb1Student_table")
public class Student {

	@Id
	@Column(name = "s_id")
	int id;
	
	@Column(name="s_name",length = 50 , nullable = false)
	String name;
	
	@Column(name="s_gender", length = 10 , nullable = false)
	String gender;
	
	@Column(name="s_department", length = 10 , nullable = false)
	String department;
	
	@Column(name="s_program", length = 10 , nullable = false)
	String program;
	
	@Column(name="s_DOB", length = 10 , nullable = false)
	String DOB;
	
	@Column(name="s_Con_num", length = 10 , nullable = false)
	String phone;
	
	@Column(name="s_gra_sta", length = 10 , nullable = false)
	String GS;
	
	@Column(name="s_cgpa", precision = 4 ,scale = 2, nullable = false)
	Double cgpa;
	
	@Column(name="s_backlogs", nullable = false)
	int backlogs;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getProgram() {
		return program;
	}

	public void setProgram(String program) {
		this.program = program;
	}

	public String getDOB() {
		return DOB;
	}

	public void setDOB(String dOB) {
		DOB = dOB;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getGS() {
		return GS;
	}

	public void setGS(String gS) {
		GS = gS;
	}

	public Double getCgpa() {
		return cgpa;
	}

	public void setCgpa(Double cgpa) {
		this.cgpa = cgpa;
	}

	public int getBacklogs() {
		return backlogs;
	}

	public void setBacklogs(int backlogs) {
		this.backlogs = backlogs;
	}
	@Override
	public String toString() {
	    return "Student{" + "id=" + id +
	            ", name='" + name + '\'' +
	            ", gender='" + gender + '\'' +
	            ", department='" + department + '\'' +
	            ", program='" + program + '\'' +
	            ", DOB='" + DOB + '\'' +
	            ", phone='" + phone + '\'' +
	            ", GS='" + GS + '\'' +
	            ", cgpa=" + cgpa +
	            ", backlogs=" + backlogs +
	            '}';
	}

	
}
