package com.collections.examples;

public class Student {
	
	private int rollNo;
	private String studentName;
	private int mathsMarks = 0;
	private int scienceMarks = 0;
	private int socialMarks = 0;
	private int totalMarks = 0;

	
	public int getRollNo() {
		return rollNo;
	}
	
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getMathsMarks() {
		return mathsMarks;
	}

	public void setMathsMarks(int mathsMarks) {
		this.mathsMarks = mathsMarks;
	}

	public int getScienceMarks() {
		return scienceMarks;
	}

	public void setScienceMarks(int scienceMarks) {
		this.scienceMarks = scienceMarks;
	}

	public int getSocialMarks() {
		return socialMarks;
	}

	public void setSocialMarks(int socialMarks) {
		this.socialMarks = socialMarks;
	}

	public int getTotalMarks() {
		return totalMarks;
	}

	public void setTotalMarks(int totalMarks) {
		this.totalMarks = totalMarks;
	}
	
	
	public int totalMarks() {
		int total = getMathsMarks()+ getScienceMarks() + getSocialMarks();
		return total;
	}
	
	public double average()
	{
		double avg = totalMarks() / 3;
		return avg;
	}

}
