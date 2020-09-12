package callingparameter;

public class parameter {

	public static void main(String[] args) {
		
		parameter hello = new parameter();
		
		int result = hello.sum(10, 20);
		System.out.println("sum is "+result);
		
		int result1 = hello.sub(10, 20);
		System.out.println(result1);
		
		String Name = hello.myname("rajni", "Gupta");
		System.out.println(Name);
		
		double value = hello.multi(10.0, 2.0);
		System.out.println(value);
		
		
		

	}
	
	public int sum(int a, int b) {
		
		int c= a+b;
		return c;	
		
	}
	
	public int sub(int x, int y) {
		
		int p= x-y;
		return p;
		
	}
	
	public String myname(String Fname, String Lname) {
		
		String myname= Fname+" "+Lname;
		
		return myname;
	}
	
	public double multi(double g, double h) {
		
		double j=g*h;
		return j;	

}
}
