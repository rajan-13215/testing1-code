package exampleofarraylist;

import java.util.ArrayList;

public class rajan {

	public static void main(String[] args) {
		
		ArrayList rajan = new ArrayList();
		
		rajan.add(12);
		rajan.add("ayush");
		rajan.add("Gupta");
		rajan.add("95/100");
		
		System.out.println(rajan);
		System.out.println(rajan.get(0));
		System.out.println(rajan.get(1));
		
		int size= rajan.size();
		System.out.println(size);
		
		for (int i = 0; i <size; i++) {
			
			System.out.println(rajan.get(i));
		}
		
		for (Object finalvalue : rajan) {
			
			System.out.println(finalvalue);
			
		}

		

	}

}
