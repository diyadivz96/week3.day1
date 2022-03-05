package org.system;

public class Students {
	public void getStudentInfo(int id) {
System.out.println(id);
	}
	public void getStudentInfo(String name) {
System.out.println(name);
	}
	public void getStudentInfo(char email) {
System.out.println(email);
	}
	public void getStudentInfo(double phonenumber) {
System.out.println(phonenumber);
	}
public static void main(String[] args) {
	Students s=new Students();
	s.getStudentInfo("12");
	s.getStudentInfo("SRI");
	s.getStudentInfo("sri@99gmail.com");;
	s.getStudentInfo("9432121230");
	
}
}
