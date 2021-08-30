package week3.day2;

public class Desktop implements Software, Hardware{

	
	public void desktopModel() {
		System.out.println("Method in Desktop class");

	}
	
	public void hardwareResources() {
		System.out.println("Unimplemented method in hardware class");
		
	}
	public void softwareResources() {
		System.out.println("Unimplemented method in software class");
		
	}
	public static void main(String[] args) {
		Desktop obj = new Desktop();
		obj.desktopModel();
		obj.hardwareResources();
		obj.softwareResources();

	}
	

}
