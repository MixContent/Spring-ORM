package com.spring_jdbc;

public class Student {
	private int StudentId;
	private String studentName;
	private int marks;

	public int getStudentId() {
		return StudentId;
	}

	public void setStudentId(int studentId) {
		StudentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [StudentId=" + StudentId + ", studentName="
				+ studentName + ", marks=" + marks + "]";
	}

}
