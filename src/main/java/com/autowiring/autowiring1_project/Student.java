package com.autowiring.autowiring1_project;

public class Student 
{
  private String sname;
  private int sid;
  private String branch;
  private Certificate certi;

	/*
	 * public Student(String sname, int sid, String branch, Certificate certi) {
	 * this.sname = sname; this.sid = sid; this.branch = branch; this.certi = certi;
	 * System.out.println("inserting the property using constructor"); }
	 */
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
	System.out.println("setting the properties using setter");
}
public int getSid() {
	return sid;
}
public void setSid(int sid) {
	this.sid = sid;
}
public String getBranch() {
	return branch;
}
public void setBranch(String branch) {
	this.branch = branch;
}
public Certificate getCerti() {
	return certi;
}
public void setCerti(Certificate certi) {
	this.certi = certi;
}
@Override
public String toString() {
	return "Student [sname=" + sname + ", sid=" + sid + ", branch=" + branch + ", certi=" + certi + "]";
}
  
}
