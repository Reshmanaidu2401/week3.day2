package week3.day2.assignments;

public class ReverseEvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String test = "I am a software tester";
		
		String[] word = test.split(" ");
		String  value="";
		
		for (int i=0; i<word.length;i++)
        {
			if (i % 2 == 1)
		        value = value + new StringBuilder(word[i]).reverse().toString() + " ";
		    else
		        value = value + word[i] + " ";
		}
		value = value.trim();
		System.out.println(value);
		
	}

}
