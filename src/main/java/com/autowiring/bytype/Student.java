package com.autowiring.bytype;

import org.springframework.beans.factory.annotation.Autowired;

public class Student 
{
  private String sname;
  private int sid;
  private String branch;
  @Autowired
  private College college;
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
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
public College getCollege() {
	return college;
}
public void setCollege(College college) {
	this.college = college;
}
@Override
public String toString() {
	return "Student [sname=" + sname + ", sid=" + sid + ", branch=" + branch + ", college=" + college + "]";
}
  
}
