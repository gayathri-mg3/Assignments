package week1.day3;

public class PrintDuplicate4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		int length = arr.length;
		@SuppressWarnings("unused")
		int count;
		for (int i = 0; i < length; i++) {
			count =0;
			for (int j = i+1; j < length; j++) {
				if (arr[i]==arr[j]) {
					System.out.println("Duplicate is "+arr[i]);
					count++; 
				}
			}
			
		}
	}

}
