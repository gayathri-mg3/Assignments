package week1.day3;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicates5 {
	
		public static void main (String args[]) {
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 10, 1, 2, 2, 3, 3, 10, 3, 4, 5, 5));
        System.out.println("ArrayList with duplicates: "+ list);
  
        ArrayList<Integer> newList = removeDuplicates(list);
  
        System.out.println("ArrayList with duplicates removed: " + newList);	
		}

		private static ArrayList<Integer> removeDuplicates(ArrayList<Integer> list) {
			ArrayList<Integer> newList = new ArrayList<Integer>(); 
			for (Integer element:list)
				{
					if (!newList.contains(element)) {
						newList.add(element);
					}
				}
			return newList;
		}
	}


