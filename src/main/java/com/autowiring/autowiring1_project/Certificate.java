package com.autowiring.autowiring1_project;

public class Certificate 
{
  private String cname;
  private double cduration;

	/*
	 * public Certificate(String cname, double cduration) { super(); this.cname =
	 * cname; this.cduration = cduration; }
	 */
public String getCname() {
	return cname;
}
public void setCname(String cname) {
	this.cname = cname;
}
public double getCduration() {
	return cduration;
}
public void setCduration(double cduration) {
	this.cduration = cduration;
}
@Override
public String toString() {
	return "Certificate [cname=" + cname + ", cduration=" + cduration + "]";
}
  
}
