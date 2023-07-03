package week3.day1;

import java.util.HashSet;
import java.util.Set;

public class PrintUniqueCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "BossBaby";
		char[] ca = name.toCharArray();
		Set<Character> name1 = new HashSet<Character>();
		for (Character i : ca) {
			name1.add(i);
		}
		System.out.println(name1);
			
	}

}
