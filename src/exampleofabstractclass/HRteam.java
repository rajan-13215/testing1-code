package exampleofabstractclass;

public class HRteam extends techteam {

	public static void main(String[] args) {
		
		HRteam hr= new HRteam();
		hr.bonus();
		hr.empname();
		hr.empstuff();
		hr.empsalary();
		
		
		techteam tech= new HRteam();
		tech.empname();
		tech.empstuff();
		tech.empstuff();
	

	}
	
	public void bonus(){
		
		System.out.println("Hi Rajan, As you've completed 1 year you'll get 5000 bonus");
	}

	
	public void empsalary() {
		
		System.out.println(" as per your performance you'll get 7LPA");
		
	}

}
