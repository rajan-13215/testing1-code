package classexample;

public class hello {
	
	int x=10;
	int y=20;
	String name= "rajan";
	String hobby= "dancing";

	public static void main(String[] args) {
		
		System.out.println("Object programme started");
		
		hello rajan=new hello();
		hello rajat=new hello();
		rajan.sum();
		
		System.out.println(rajan.x);
		System.out.println(rajan.y);
		
		System.out.println(rajat.name);
		System.out.println(rajat.hobby);
		
		
		
		System.out.println("object programme ended");
		

	}
	
	public void sum() {
		
		System.out.println("programme started");
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println("value of c = "+c);
		System.out.println("programme ended");
		
		
	}
	

}
