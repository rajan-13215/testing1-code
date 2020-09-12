package superkeywordexample;

public class childclass extends parent {
	
	int marks = 30;
	String Name= "Ayush";

	public static void main(String[] args) {
		
		childclass obj1 = new childclass();
		obj1.showayushresult();
		
	
	}
	
    public void showayushresult() {
    	
		super.showrajanesult();
		System.out.println("my name is "+ Name +" "+" and marks are "+marks);
	}
    
    public void showrajanesult() {
		
		System.out.println("my name is "+ Name+" "+" and marks are "+marks);
	}


}
