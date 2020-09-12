package dimenstionalarray;

public class array2d {

	public static void main(String[] args) {
		
		int ayush_marks[][]= { {60,70}, {71,72}, {67,98}};
		
		
		System.out.println(ayush_marks[0][1]);
		
		for (int i = 0; i < ayush_marks.length; i++) {
			
			for (int j = 0; j < ayush_marks.length; j++) {
				
				System.out.print(ayush_marks[i][j]+" ");
				
			}
			System.out.println();
			
		}

		
	}

}
