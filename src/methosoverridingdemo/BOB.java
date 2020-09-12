package methosoverridingdemo;

public class BOB extends RBI {

	public static void main(String[] args) {
       
		BOB loan = new BOB();
		loan.homeloan();

	}
	
     public void homeloan() {
		
		System.out.println("interest rate is 40%");
	}

}
