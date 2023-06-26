package week1.day3;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] marks= {2, 3, 5, 2, 6, 8, 3};
Arrays.sort(marks);

for (int i = 0; i < marks.length-1; i++) {
	if(marks[i]==marks[i+1]) {
	System.out.println(marks[i+1]);	
	}
	
}


	}

}
