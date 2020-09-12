package interface1;

public class advancecalc implements calc {

	public static void main(String[] args) {
		
		advancecalc hello = new advancecalc();
		
		System.out.println("sum is "+c);
		System.out.println("full name is "+Fullname);
		
		hello.sin();
		hello.cos();
		hello.add();
		hello.div();

	}
	
	public void sin() {
		
		System.out.println("this performs sin function");
	}
	
	public void cos() {
		
		System.out.println("this performs cos function");
	}

	public void add() {
		
		System.out.println("this performs Addition");
		
	}

	public void div() {
		
		System.out.println("this performs division");
		
	}

}
