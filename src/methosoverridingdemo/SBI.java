package methosoverridingdemo;

public class SBI extends RBI {

	public static void main(String[] args) {
		
		SBI loan1 = new SBI();
		loan1.homeloan();
		
		RBI loan2= new RBI();
		loan2.homeloan();

	}
	
    public void homeloan() {
		
		System.out.println("interest rate is 20%");
	}
	
	public void carloan() {
		
		System.out.println("Car loan is 11%");
	}
	
	

}
