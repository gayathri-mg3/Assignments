package week2.day4;

public class Automation extends MultipleLanguage{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Automation au=new Automation();
au.Java();
au.python();
au.selenium();
au.ruby();
	}

	@Override
	public void selenium() {
		// TODO Auto-generated method stub
		System.out.println("Selenium Tool");
	}

	@Override
	public void Java() {
		// TODO Auto-generated method stub
		System.out.println("Java Language");
	}

	@Override
	public void ruby() {
		// TODO Auto-generated method stub
		System.out.println("Ruby Language");
	}
	
	

}
