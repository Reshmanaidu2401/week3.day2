package week3.day2.assignments;

public class CharOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str = "welcome to chennai";
		int count=0;
		
		
		char[] charArray = str.toCharArray();
		
		for(int i=0;i<charArray.length;i++) {
			
			if (str.charAt(i) == 'e') {
		        count++;
		}
		}
		System.out.println("Total number of CharOccurance"+"is" +count);

	}

}
