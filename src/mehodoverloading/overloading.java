package mehodoverloading;

public class overloading {

	public static void main(String[] args) {
		
		overloading hello = new overloading();
		
		hello.add(10, 20, 30);
		hello.add(10, 20);
		hello.add(10, 20.0);
		hello.add(20, 20);
		hello.add(20.0, 20.0);
		
		
	}
	
	public void add(int a, int b) {
		
		int c= a+b;
		System.out.println("sum is "+c);
		
		
	}
	
	public void add(int a, int b, int d) {
		
		int c = a+b;
		System.out.println("sum is "+c);
	}
	
	public void add(double a, double b) {
		
		double c = a+b;
		System.out.println("sum is "+c);
	}
	
	public void add(int a, double b) {
		
		double c = a+b;
		System.out.println("sum is "+c);
	}
	
    public void add(double a, int b) {
		
		double c = a+b;
		System.out.println("sum is "+c);
	}
	
	

}
