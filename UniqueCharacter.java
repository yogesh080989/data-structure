package com.practice;

/*
 * i/p - durgadurgadurgadurga
 * o/p - durga
 */
public class UniqueCharacter {
	static String input = "durgadurgadurgadurga";
	static StringBuffer s1 = new StringBuffer();

	public static void main(String[] args) {

		int i=0,j=0,n=3;
		while(i< input.length()) {
			char ch = input.charAt(i);
		boolean b =	putUnique(ch);
		if(b) {
			++j;
		}
		if(j==n) {
			System.out.println(n+" repeated character is "+ch);
		}
			++i;
		}
		System.out.println("Unique string is "+s1);
		
		
	}

	private static boolean putUnique(char charAt) {
		
		int i=0;
		boolean isPresent = false;
		while(i< s1.length()) {
			if(s1.charAt(i) == charAt) {
				isPresent=true;
				break;
			}
			++i;
		}
		if(!isPresent) {
			String s3 = new String(new char[] {charAt});
			s1.append(s3);
			return !isPresent;
		}else {
			return isPresent;
		}
	}

}
