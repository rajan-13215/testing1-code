package string;

public class stringclassdemo {

	public static void main(String[] args) {
		
		String name = "Chrome webdriver";
		String name1= "Chrome";
//	    Boolean status= name.startsWith("chrome");
//	    System.out.println("status is "+ status);
//	    
//	    String name1 = "firefox webdriver";
//	    Boolean status1= name.endsWith("webdriver");
		
		Boolean status= name.contains(name1);
	    System.out.println("status is "+ status);
	}

}
