package org.system;

public class FindTypes {

	public static void main(String[] args) {
		String test = "$$ Welcome to 2nd Class of Automation $$ ";
		int  letter = 0, space = 0, num = 0, specialChar = 0;
		char[] array=test.toCharArray();
		for(int i=0;i<=array.length-1;i++){
			if(Character.isLetter(array[i])) {
				letter++;}
			else if(Character.isDigit(array[i])) {
				num++; }
			else if(Character.isSpaceChar(array[i])) {
				space++;}
			else {
				Character.isSpaceChar(array[i]) ;
			specialChar++;}
			
			}		
System.out.println("No.of.Letters  :" +letter );
	System.out.println("No.of.Numbers " +num );
	System.out.println("No.of.Spaces " +space );
	System.out.println("No.of.Special Characters " +specialChar);

	}
}
