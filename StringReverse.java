package com.practice;

public class StringReverse {
	
	static StringBuffer strBuffer = new StringBuffer("position 1 no. @ Durga is This");

	public static void main(String[] args) {
		
		int i=0;
		int j=0;
		int word=0;
		
		while(i < strBuffer.length()) {
			
			if(strBuffer.charAt(i) == ' '  || (i == strBuffer.length()-1))  {
				
				if(i == strBuffer.length()-1) {
					++i;
				}
				j=i;
				--j;
				swap(word, j);
				word=i+1;
			}
			++i;
		}
		System.out.println(strBuffer.reverse());
		//strBuffer.reverse();
		//System.out.println(strBuffer.reverse());
		// output -> This is Durga @ no. 1 position
	/*	String[] strArray = strBuffer.toString().split(" ");
		StringBuffer strBuffer2 = new StringBuffer();
		for(String str : strArray) {
			strBuffer2.append(str);
			System.out.println(strBuffer2.reverse());
			
		}*/
		
		
		

	}

	private static void swap(int word, int j) {
		while(word<=j) {
			char ch = strBuffer.charAt(word);
			strBuffer.setCharAt(word, strBuffer.charAt(j));
			strBuffer.setCharAt(j, ch);
			++word;
			--j;
		}
		
	}

}
