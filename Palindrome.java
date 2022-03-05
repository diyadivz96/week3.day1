package org.system;

public class Palindrome {

	public static void main(String[] args) {
String s="madam";
String rev="";
System.out.println("Enter the String " + s);
for (int i=s.length()-1;i>=0;i--) {
	rev=rev+s.charAt(i);
	}
if(rev.equalsIgnoreCase(s))
{System.out.println("palindrome");}
else
	System.out.println("not palindrome");
}
}
