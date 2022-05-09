package com.studentmanagement;

public class Student {
	
	
	private int studentId;
	private String studentName;
	private String studentClass;
	private String studentSec;
	
	public Student(int studentId, String studentName, String studentClass, String studentSec) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentClass = studentClass;
		this.studentSec = studentSec;
	}
	public Student(String studentName, String studentClass, String studentSec) {
		super();
		this.studentName = studentName;
		this.studentClass = studentClass;
		this.studentSec = studentSec;
	}
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentClass() {
		return studentClass;
	}
	public void setStudentClass(String studentClass) {
		this.studentClass = studentClass;
	}
	public String getStudentSec() {
		return studentSec;
	}
	public void setStudentSec(String studentSec) {
		this.studentSec = studentSec;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentClass=" + studentClass
				+ ", studentSec=" + studentSec + "]";
	}
	
	
	

}
