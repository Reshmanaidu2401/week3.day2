package week3.day2.assignments;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String text = "We learn java basics as part of java sessions in java week1";
		int count=0;
		String[] word = text.split(" ");
		
		String  value="";
		
		Set<String> set = new LinkedHashSet<String>();  
		
		for(String wor: word) {
			
			set.add(wor);
			
		}
		List<String> list = new ArrayList<String>();
		list.addAll(set);
		for (int i = 0; i < set.size(); i++) {
			value = value + list.get(i);
			if (i < set.size() - 1) {
				value = value + " ";
			}
		}
		System.out.println(value);
	}

	}


