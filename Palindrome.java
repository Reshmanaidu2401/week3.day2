package week3.day2.assignments;

public class Palindrome {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="madam";
		
		String reverse="";
		
		for(int i=name.length()-1;i>=0;i--) {
			reverse=reverse + name.charAt(i);
			
		}
		
		if(reverse.equalsIgnoreCase(name))
				
		{
			System.out.println(name +  "is aPalindrome");
		}
		else {
			System.out.println(name + "is not Palindrome");
		}
		

	}

}
