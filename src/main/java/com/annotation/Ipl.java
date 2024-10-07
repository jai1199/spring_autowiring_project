package com.annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Ipl 
{
	@Value("RCB")
 private String teamname;
	@Value("virat kohli")
 private String captainname;
public String getTeamname() {
	return teamname;
}
public void setTeamname(String teamname) {
	this.teamname = teamname;
}
public String getCaptainname() {
	return captainname;
}
public void setCaptainname(String captainname) {
	this.captainname = captainname;
}
@Override
public String toString() {
	return "Ipl [teamname=" + teamname + ", captainname=" + captainname + "]";
}
 
}
