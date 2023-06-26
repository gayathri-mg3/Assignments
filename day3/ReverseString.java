package week1.day3;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String st="Amazon", nst=" ";
char ch;
System.out.println("Correct Word");
System.out.println("Amazon");
for (int i = 0; i < st.length(); i++) {
	ch=st.charAt(i);
	nst=ch+nst;
	
}
System.out.println("Reverse order:"+nst);
	}

}
