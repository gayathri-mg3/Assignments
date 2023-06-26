package week1.day3;

import java.util.Arrays;

public class MissingElement3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] missing= {1, 2, 3, 4, 6, 7, 8};
Arrays.sort(missing);
for (int i = missing[0]; i < missing.length; i++) {
	if (i != missing[i-1]) {
		System.out.println(i +" is missing element");
		break;
	}
}
	}

}
