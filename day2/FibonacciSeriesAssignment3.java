package week1.day2;

public class FibonacciSeriesAssignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int f1=0,f2=1,f3,count=10;
System.out.println(f1+" "+f2);
for (int i = 2; i < count; i++) 
{
	f3=f1+f2;
	System.out.println(""+f3);
	f1=f2;
	f2=f3;
	
}
	}

}
