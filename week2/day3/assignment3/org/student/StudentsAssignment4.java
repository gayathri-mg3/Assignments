package week2.day3.assignment3.org.student;

public class StudentsAssignment4 {
	
	public void getStudentInfo(int id) {
		System.out.println("Student ID is: "+id);
	}
	public void getStudentInfo(int id, String name) {
		System.out.println("Student's name is "+name+" Student ID is: "+id);
	}
	public void getStudentInfo(String email, long phoneNumber) {
		System.out.println("Student Mail-ID is: "+email+" and Student mobile number is: "+phoneNumber);
	}
	public static void main(String[] args) {
		StudentsAssignment4 st = new StudentsAssignment4();
		
		st.getStudentInfo(10013);
		st.getStudentInfo(10013, "Gayathri Manoharan");
		st.getStudentInfo("mgayathrisara@gmail.com", 8976543212l);
	}

}
