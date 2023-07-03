package week3.day1;

import java.util.LinkedHashSet;
import java.util.Set;

public class ClassActivity1 {

	public static void main(String[] args) {
		
		
String data="GoogleChrome";
String output="";

char[] ch=data.toCharArray();

Set<Character> name=new LinkedHashSet<Character>();

for(Character i: ch) {
	if(!name.add(i)) {
		output=output+i;
		
	}
}
System.out.println(output);
System.out.println(name);
	}

}
