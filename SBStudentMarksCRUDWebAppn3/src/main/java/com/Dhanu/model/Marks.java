package com.Dhanu.model;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Marks 
{
	@Id
private int sid;
private String firstName;
private String lastName;
private String fullname;
private double sub1;
private double sub2;
private double sub3;
private double total;
private double percentage;
private String grade;
//PPC+PDC+PSM+PGM+toString
public Marks() {
	super();
}
public Marks(int sid, String firstName, String lastName, String fullname, double sub1, double sub2, double sub3,
		double total, double percentage, String grade) {
	super();
	this.sid = sid;
	this.firstName = firstName;
	this.lastName = lastName;
	this.fullname = fullname;
	this.sub1 = sub1;
	this.sub2 = sub2;
	this.sub3 = sub3;
	this.total = total;
	this.percentage = percentage;
	this.grade = grade;
}
public int getSid() {
	return sid;
}
public void setSid(int sid) {
	this.sid = sid;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getFullname() {
	return fullname;
}
public void setFullname(String fullname) {
	this.fullname = fullname;
}
public double getSub1() {
	return sub1;
}
public void setSub1(double sub1) {
	this.sub1 = sub1;
}
public double getSub2() {
	return sub2;
}
public void setSub2(double sub2) {
	this.sub2 = sub2;
}
public double getSub3() {
	return sub3;
}
public void setSub3(double sub3) {
	this.sub3 = sub3;
}
public double getTotal() {
	return total;
}
public void setTotal(double total) {
	this.total = total;
}
public double getPercentage() {
	return percentage;
}
public void setPercentage(double percentage) {
	this.percentage = percentage;
}
public String getGrade() {
	return grade;
}
public void setGrade(String grade) {
	this.grade = grade;
}
@Override
public String toString() {
	return "Marks [sid=" + sid + ", firstName=" + firstName + ", lastName=" + lastName + ", fullname=" + fullname
			+ ", sub1=" + sub1 + ", sub2=" + sub2 + ", sub3=" + sub3 + ", total=" + total + ", percentage=" + percentage
			+ ", grade=" + grade + "]";
}

}
