package week3.day1;

public class Students {
	
	public void getStudentInfo(int id)
	{
		System.out.println("The ID is: "+id);
	}
	
	public void getStudentInfo(int id, String name)
	{
		System.out.println("The ID and Name of Student is: "+id+", "+name);
	}
	
	public void getStudentInfo(String email, String phoneNumber)
	{
		System.out.println("The Email ID of Student is: "+email);
		System.out.println("The PhoneNumber of Student is: "+phoneNumber);
	}
	public static void main(String[] args) {
		
		Students studObj = new Students();
		studObj.getStudentInfo(12);
		studObj.getStudentInfo(12, "Indu");
		studObj.getStudentInfo("indhu23@gmail.com", "2344667");

	}

}






// Create multiple getStudentInfo() method by passing id argument alone, by id & name, by email & phoneNumber