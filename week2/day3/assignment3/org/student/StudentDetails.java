package week2.day3.assignment3.org.student;

import week2.day3.assignment3.org.department.DepartmentDetails;

public class StudentDetails extends DepartmentDetails{
	
	public void studentName() {
		System.out.println("Student Name is: Gayathri Manoharan");
	}
	
	public void studentDepartment() {
		System.out.println("Student Department Details is: Computer Science");
	}
	
	public void studentID() {
		System.out.println("Student Id is: 10BSC013");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StudentDetails sd=new StudentDetails();
		sd.collegeName();
		sd.collegeCode();
		sd.collegeRank();
		sd.departmentName();
		sd.studentName();
		sd.studentID();
		sd.studentDepartment();

	}

}
