package exampleofarraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class hello {

	public static void main(String[] args) {
		
		ArrayList hello = new ArrayList();
		
		hello.add(27);
		hello.add('R');
		hello.add("Rajan");
		hello.add("32/100");
		hello.add("32/100");
		
		System.out.println(hello);
		System.out.println(hello.get(2));
		System.out.println(hello.get(0));
		System.out.println(hello.get(1));
		System.out.println(hello.get(3));
		System.out.println(hello.get(4));
		
		int sizeofarray= hello.size();
		System.out.println(sizeofarray);
		
//		for (int i = 0; i<sizeofarray; i++) {
//			
//			System.out.println(hello);
//		}
		
		for (int i = 0; i <sizeofarray; i++) {
			
			System.out.println(hello.get(i)); 
		}
		
		for (Object value : hello) {
			
			System.out.println(value);
			
		}
	}

}
