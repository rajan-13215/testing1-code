package setinterface;

import java.util.TreeSet;

public class tree1 {

	public static void main(String[] args) {

		TreeSet<String> hello3 = new TreeSet<>();
		hello3.add("1");
		hello3.add("4");
		hello3.add("2");
		hello3.add("Ayushman");
		hello3.add("Gupta");
		
		System.out.println(hello3);
		
		int size =hello3.size();
		System.out.println(size);
		
		for (String values : hello3) {
			
			System.out.println(values);
			
		}
	}

}
