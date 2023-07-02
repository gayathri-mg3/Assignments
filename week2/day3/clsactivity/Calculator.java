package week2.day3.clsactivity;

public class Calculator {
	
	public void add(int a, int b) {
		System.out.println(a+b);
	}
	
	public void add(int a, int b, int c) {
		System.out.println(a+b+c);
	}
	
	public void multiply(double a, double b) {
		System.out.println(a*b);
	}
	
	public void multiply(float a, float b) {
		System.out.println(a*b);
	}
	
	public static void main(String[] args) {
		Calculator calculate = new Calculator();
		calculate.add(17, 5);
		calculate.add(2, 50, 17);
		calculate.multiply(25, 9.5);
		calculate.multiply(7.8f, 12.4f);

}
}
