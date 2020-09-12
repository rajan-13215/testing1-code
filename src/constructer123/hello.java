package constructer123;

public class hello {

	public static void main(String[] args) {
		
		hello obj1= new hello(78, 20);
	    obj1.display();
		

	}
	
	public hello(){
		
		System.out.println("1st constructer");
	}
	
	
    public hello(int marks){
		
		System.out.println("total marks is "+marks);
	}
    
    public hello(int marks, int number){
		
		System.out.println("marks are "+marks+ " and "+ number);
	}
    
    public hello(String Name, int number){
    	
    	System.out.println();
    }
	
	
	public void display(){
		
		
		String Fname= "Rajan";
		String Lname= "Gupta";
		
		String fullname= Fname+" "+Lname;
		
		System.out.println("Full name is "+ fullname);
	
	}

}
