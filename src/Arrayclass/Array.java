package Arrayclass;

public class Array {

	public static void main(String[] args) {
		
		int ayush_marks[] = new int[3];
		String family_member_name[]= new String[5];
		
		ayush_marks[0]= 40;
		ayush_marks[1]=20;
		ayush_marks[2]=30;
		
		
		family_member_name[0]= "Ayushman Gupta";
		family_member_name[1]= "Rajan Kumar Gupta";
		family_member_name[2]= "Rajni Gupta";
		family_member_name[3]= "Sadhna Gupta";
		family_member_name[4]= "Krishna Shankar Gupta";
		
		System.out.println("so Ayush got "+ ayush_marks[0]);
		System.out.println("Godfather of family is "+ family_member_name[4]);
		
		
		int all_marks = ayush_marks.length;
		int all_family_name = family_member_name.length;
		
		System.out.println("total subject are "+all_marks);
		System.out.println("total person in family are "+all_family_name);
		
		for (int i = 0; i<family_member_name.length; i++) {
			
			System.out.println("sweet name of family's person is "+ family_member_name[i]);
		}
		
		for (int i = 0; i<ayush_marks.length; i++) {
			System.out.println("ayush's marks is "+ayush_marks[i]);
			
		}
		

	}

}
