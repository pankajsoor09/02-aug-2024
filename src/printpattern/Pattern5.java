package printpattern;

public class Pattern5 {



	public static void main(String[] args) {

		int rows = 5;

		for (int i = 0; i < rows; i++) {// It controls the number of rows in the triangle

			for (int j = 0; j < i; j++) { // Print spaces

				System.out.print("  ");
			}
			for (int j = 0; j < rows - i; j++) {
				System.out.print(" *  ");
			}
			System.out.println();
		}

	}


}
/*output pattern
 
 *   *   *   *   *  
   *   *   *   *  
     *   *   *  
       *   *  
         *  


*/