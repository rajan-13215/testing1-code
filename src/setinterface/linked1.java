package setinterface;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class linked1 {

	public static void main(String[] args) {
		
		LinkedHashSet<String> hello2 = new LinkedHashSet<>();
		hello2.add("1");
		hello2.add("2");
		hello2.add("Ayushman");
		hello2.add("Gupta");
		
        System.out.println(hello2);
        
        int size =hello2.size();
		System.out.println(size);
		
		for (String values : hello2) {
			
			System.out.println(values);
			
			
		}
	}

}
