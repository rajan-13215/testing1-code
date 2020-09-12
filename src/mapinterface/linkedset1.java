package mapinterface;

import java.util.LinkedHashMap;
import java.util.Map;

public class linkedset1 {

	public static void main(String[] args) {
		
		LinkedHashMap<String, String> hello2 = new LinkedHashMap<>();
		hello2.put("papa's Hobby", "Ayush ko pyar krnaa");
		hello2.put("mummy's hobby", "Ayush ko datna");
		hello2.put("rajni's hobby", "Ayush Ko paresaan krnaa");
		hello2.put("bhai's hobby", "ayush ko pyar krnaa");
		hello2.put("ayush's hobby", "shetani krnaa sabse jyada");
		
		for(Map.Entry<String, String> hobbyoffamily : hello2.entrySet()) {
			
			System.out.println(hobbyoffamily.getKey()+" is "+hobbyoffamily.getValue());
		}
			

	}

}
