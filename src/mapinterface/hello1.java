package mapinterface;

import java.util.HashMap;
import java.util.Map;

public class hello1 {

	public static void main(String[] args) {
		
		HashMap<String, String> hello1 = new HashMap<String, String>();
		
		hello1.put("Father's Name", "Mr. Krishna Shankar");
		hello1.put("Mother's Name", "Mrs. Sadhna Gupta");
		hello1.put("Sister's Name", "Ms. Rajni Gupta");
		hello1.put("Elder Brother's Name", "Rajan Gupta");
		hello1.put("Younger Brother's Name", "Ayushman Gupta");

		String familydetail = hello1.get("Elder Brother's Name");
		System.out.println(familydetail);
		
		 for(Map.Entry<String, String> Sweetfamily: hello1.entrySet() ) {
			 
			 System.out.println(Sweetfamily.getKey()+" is "+Sweetfamily.getValue());
		 }
		
	}

}
