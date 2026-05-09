package Array_practice;

public class Single_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] arr = {1,2,3,4,5,6,7,};//length 7 dynamic array
//		//index      0,1,2,3,4,5,6
//		System.out.println(arr[4]);//static array
//		for(int i =0;i<arr.length;i++) {
//			System.out.print(arr[i]+" ");
//		}
//		int[][] a = {
//			    {20, 40},
//			    {50, 60, 70},
//			    {23,34,45}
//			};
//
//			for(int i = 0; i < a.length; i++) {
//			    for(int j = 0; j < a[i].length; j++) {
//			        System.out.print(a[i][j] + " ");
//			    }
//			    System.out.println();
//			}
		int[][] arr = {
	            {1},{1, 2},{1, 2, 3},{1, 2, 3, 4} };
	        for (int i = 0; i < arr.length; i++) {
	            for (int j = 0; j < arr[i].length; j++) {
	                System.out.print(arr[i][j] + " ");
	            }
	            System.out.println();
	        }

	}

}
