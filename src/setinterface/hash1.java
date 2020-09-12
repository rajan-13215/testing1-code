package setinterface;

import java.util.ArrayList;
import java.util.HashSet;

import thiskeywordexample.hello;

public class hash1 {

	public static void main(String[] args) {

		HashSet<String> hello1 =  new HashSet<>();
		hello1.add("1");
		hello1.add("2");
		hello1.add("Ayushman");
		hello1.add("Gupta");
		
//		System.out.println(hello1);
//		
//		
//		int size =hello1.size();
//		System.out.println(size);
//		
//		for (String value : hello1) {
//			
//			System.out.println(value);
//		}
		
		ArrayList<String> hello1array = new ArrayList<>(hello1);
		System.out.println(hello1array.get(0));
		
		System.out.println(hello1array.size());
		System.out.println(hello1array);
	}
	

}
