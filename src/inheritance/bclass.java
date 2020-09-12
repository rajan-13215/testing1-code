package inheritance;

public class bclass extends aclass {

	public static void main(String[] args) {
		
		bclass hello = new bclass();
		
		hello.add();
		hello.division();
		hello.multi();
		hello.sub();
		
	}
	
	public void multi() {
		
		System.out.println("this perfroms multiplication");
	}
	
	public void division() {
		
		System.out.println("this performs division");
	}

}
