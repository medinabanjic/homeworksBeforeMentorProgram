//package ba.bitcamp.S04D01;
//
//import java.util.Arrays;
//import java.util.Scanner;
//
//import ba.bitcamp.arrays.MatrixHelp;
//
//public class MultipleArrays {
//
//	// public static void print1DArray(int[] array){
//	//
//	// for (int i = 0; i< array.length; i++){
//	//
//	//
//	// System.out.println(array[i] + " ");
//	// }
//	//
//	// }
//
////	public static void print2DArray(int[][] array, int x) {
////		
////		for (int i = 0; i < array.length; i++) {
////			for (int j = 0; j < array[i].length; j++) {
////				
////				array[i][j] = x;
////				
////				System.out.print(array[i][j] + "\t");
////			}
////			
////			System.out.println();
////		}
////		
////	}
//
//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		System.out.println("Please input n for rows, and m for columns of the table: ");
//		
//		int n = in.nextInt();
//		int m = in.nextInt();
//		
//		System.out.println("Please input index of column: ");
//		int d = in.nextInt();
//		
//		int[][] matrix = new int[n][m];
//		
//		MatrixHelp.getInput(matrix);
//		MatrixHelp.print2DArray(matrix);
//		System.out.println(Arrays.toString(MatrixHelp.printColumn(matrix, d)));
//		in.close();
//	
//	}
//}
