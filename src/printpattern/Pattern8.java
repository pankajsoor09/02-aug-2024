package printpattern;

public class Pattern8 {

	public static void main(String[] args) {

		int rows = 5;

		for (int i = 0; i < rows; i++) { // Top half (pyramid)
			for (int j = 0; j < rows - i - 1; j++) {
				System.out.print("  ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print(" *  ");
			}
			System.out.println();
		}

		for (int i = 0; i < rows; i++) {//bottom

			for (int j = 0; j < i; j++) { 

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
 

         *  
       *   *  
     *   *   *  
   *   *   *   *  
 *   *   *   *   *  
 *   *   *   *   *  
   *   *   *   *  
     *   *   *  
       *   *  
         *  

*/