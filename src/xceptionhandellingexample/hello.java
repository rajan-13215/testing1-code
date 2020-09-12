package xceptionhandellingexample;

import java.util.InputMismatchException;

public class hello {

	public static void main(String[] args) {
		
		
		try {
			
			int a = 10/0;
			System.out.println(a);
			
		} 
		
		catch (ArithmeticException hello ) {
			
			System.out.println("please correct your input"+ hello.getMessage());
		}
		
		catch (InputMismatchException hello1) {
			System.out.println("please correct your messsage "+hello1.getMessage());
		}
		
        catch (Exception e) {
			
        	System.out.println("wrong");
		}		
		
		finally {
			
			System.out.println(" this will run by force");
		}
	}

}
