package week3.day2.assignments;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String text1 = "stops";
		String text2 = "potss";
		
		if(text1.length()==text2.length()) {
			
			char[] charArray1 = text1.toCharArray();
		    char[] charArray2 = text2.toCharArray();
		    
		      Arrays.sort(charArray1);
		      Arrays.sort(charArray2);
		      
		      boolean equals = Arrays.equals(charArray1, charArray2);
		      
		      if (equals) {
		    	  System.out.println(text1 + " and " + text2 + " are anagram.");
		      }
		      else {
		    	  System.out.println(text1 + " and " + text2 + " is not anagram.");
		      }
		      
		      
		}
		

	}

}
