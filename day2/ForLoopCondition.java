package week1.day2;

public class ForLoopCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int series=0;
for(int i=30;i>=series;i--) {
	if(i%2!=0) {
		if(i==11) {
			break;
		}
		System.out.println("The Odd numbers are " + i);
	}
}
	}

}
