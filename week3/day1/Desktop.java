package week3.day1;

public class Desktop extends Computer {
	
	public void desktopSize() {
		System.out.println("The size of Desktop is Standard");

	}

	public static void main(String[] args) {
		
		Desktop obj = new Desktop();
		obj.computerModel();
		obj.desktopSize();
	}

}
