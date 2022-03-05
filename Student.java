package org.system;

public class Student extends College {
	public void studentName() {
		System.out.println("Nainika-studentName");}
public void studentDept() {
		System.out.println("CS-studentDept");}
public void studentId() {
		System.out.println("17PCS11-studentId");}
public static void main(String[] args) {
		College college = new College();
		college.collegeName();
		college.collegeCode();
		college.collegeRank();
		Department dept = new Department();
		dept.deptName();
		Student stud = new Student();
		stud.studentName();
		stud.studentDept();
		stud.studentId();
	}

}
