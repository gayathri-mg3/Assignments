package week2.day4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] a = {1,2,3,4,7,6,8};
		
		List<Integer> list1 = new ArrayList<Integer>();
		for(int i=0; i<a.length; i++) {
			list1.add(a[i]);
		}
		System.out.println("Actual list is: "+list1);
		Collections.sort(list1);
		System.out.println("Sorted list is: "+list1);
		
		for(int i=0; i<list1.size(); i++) {
			if((i+1)!=list1.get(i)) {
				System.out.println("Missing element in the list is: "+(i+1));
				break;
			}
		}
	}

}
