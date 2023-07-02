package week2.day3.assignment1.org.system;

public class Desktop extends Computer{
	
	public void desktopInch() {
		System.out.println("MacBook Air Inch is 13-inch");
	}
		
	public static void main(String args[]) {
		Desktop d=new Desktop();
		d.computerModel();
		d.desktopInch();	
	}

}
