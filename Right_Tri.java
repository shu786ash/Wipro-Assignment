package Looping_Stmt.java;

public class Right_Tri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//RightAngledTriangle
//		*
//		* *
//		* * *
//		* * * *
//		* * * * *
		//int rows = 5;
//		for(int i = 1;i<=rows;i++) {
//			for(int j = 1;j<=i;j++) {
//				System.out.print("* ");;
//			}
//			System.out.println();
//		}
//		* * * * *
//		* * * *
//		* * *
//		* *
//		*
//		
//         * * * * *
//           * * * *
//             * * *
//               * *
//                 *
		int n = 5;

        for(int i = n; i >= 1; i--) {

            // spaces print
            for(int j = 0; j < n - i; j++) {
                System.out.print("  ");   // 2 spaces for proper alignment
            }

            // stars print
            for(int k = 1; k <= i; k++) {
                System.out.print("* ");
            }

            System.out.println();
        }
		        for(int i = 1; i <= 5; i++) {
		            for(int j = 1; j <= 5 - i; j++) {
		                System.out.print(" ");
		            }
		            for(int k = 0; k < i; k++) {
		                System.out.print("*");
		            }
		            System.out.println();
		        }
	}

}
