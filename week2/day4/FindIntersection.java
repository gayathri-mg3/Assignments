package week2.day4;

import java.util.ArrayList;
import java.util.List;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {3,2,11,4,6,7};
		int[] b = {1,2,8,4,9,7};
		
		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		
		for(int i=0; i<a.length; i++) {
			list1.add(a[i]);
		}
		for(int i=0; i<b.length; i++) {
			list2.add(b[i]);
		}
		for(int i=0; i<list1.size(); i++) {
			for(int j=0; j<list2.size(); j++) {
				if(list1.get(i)==list2.get(j)) {
					System.out.print(list1.get(i)+" ");
				}
			}
		}
	}

}
