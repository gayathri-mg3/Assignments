package week3.day1;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Name= "PayPal India";
		String output="";
		char[] ch = Name.toCharArray();
		Set<Character> duplicate= new LinkedHashSet<Character>();
		for (Character i : ch) {
			if (duplicate.add(i)) {
				output=output+i;
				
			}
			}
			
		System.out.println(output);
		System.out.println(duplicate);
	}

}
