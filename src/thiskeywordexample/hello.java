package thiskeywordexample;

public class hello {

	public static void main(String[] args) {
		
		hello h1= new hello();
		

	}
	
	public hello() {
		
		this(10);
		System.out.println("this constructor is wothout parameter");
	}
	
	public hello(int count ) {
		
		this(10, "ayush");
		System.out.println("this constructor is with "+ count + " Parameter");
	}
	
	public hello (int count, String Name) {
		
		this(132, "Rajan Gupta", 50.67);
		System.out.println("this constructor is with "+ count+ " parameter and name is "+ Name);
	}
	
	public hello (int Rollno, String FName, double marks){
		
		System.out.println("roll no of studenet is "+Rollno+" and name of student is "+FName+" and marks he'll get are "+marks);
	}

}

