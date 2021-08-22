package week3.day1;

public class Student extends Department {
	
	public void studentName() {
		System.out.println("The name of the Student is: Indu");

	}
	public void studentDept() {
		System.out.println("The Department of Student is: Mechanical & Engineering");

	}
	public void studentId() {
		System.out.println("The ID of Student is: 12TD944");

	}

	public static void main(String[] args) {
		Student obj = new Student();
		obj.collegeName();
		obj.collegeCode();
		obj.collegeRank();
		obj.deptName();
		obj.studentName();
		obj.studentDept();
		obj.studentId();

	}

}
