package week2.day3.clsactivity;

public class PolymorphismClassActivity {
	
	public void add(int a, int b) {
		System.out.println(a+b);			
	}
	
	public void add(int a, int b, int c) {
		System.out.println(a+b+c);
	}
	
	public void add(int a, float b) {
		System.out.println(a+b);
	}
	public void add(float a, int b) {
		System.out.println(a+b);
	}
	public void add(int age, String name) {
		System.out.println("The age of "+name+" is: "+age);
	}
	public static void main(String[] args) {
		PolymorphismClassActivity addition = new PolymorphismClassActivity();
		
		addition.add(7.5f, 5);
		addition.add(12, 2.5f);
		addition.add(20, 9);
		addition.add(30, 123, 90);
		addition.add(30, "Gayathri");

}
}
