package superkeywordconstroctor;

public class child extends Parent {

	public static void main(String[] args) {
		
		child obj1 = new child(10, "Rajan");
		

	}
	
	public child(){
		
		System.out.println("I'm in chiild class");
	}
	
	public child(int marks , String Fname) {
		
		 super(marks, Fname);
		 System.out.println("Assign in Child Class and name is "+Fname+"marks are "+marks);
		
		
	}

}
