package week3.day1;

public class AxisBank extends BankInfo {

	@Override
	public void deposit() {
		System.out.println("Method is overridden");
	}
	
	  public static void main(String[] args) {
		  AxisBank obj = new AxisBank();
	      obj.fixed(); 
	      obj.savings(); 
	      obj.deposit();
	 }


}
