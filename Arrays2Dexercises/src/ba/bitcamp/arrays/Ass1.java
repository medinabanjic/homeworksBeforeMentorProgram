package ba.bitcamp.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ass1 {

	public static void main(String[] args) {
		
//		System.out
//				.println("Please input n for rows and for columns of the matrix: ");
//
//		int n = in.nextInt();
		
//		int rows = MatrixHelp.matrixFileR("src/ba/bitcamp/arrays/Matrix");
//		int columns = MatrixHelp.matrixFileC("src/ba/bitcamp/arrays/Matrix");
//		int[][] matrix = new int[rows][columns];
//
//		MatrixHelp.matrixFile(matrix);
//		
//
//
//		for (int[] row : matrix) {
//			for (int el : row) {
//				System.out.printf("%3d", el);
//			}
//			System.out.println();
//		}
		
		
			TextIO.readFile("src/ba/bitcamp/arrays/Matrix");
			
			int num1 = TextIO.getInt();
			int num2 = TextIO.getInt();
			
		
			int [][] array = new int [num1][num2];
			
			for (int i = 0; i < array.length; i++) {
				for (int j = 0; j < array[i].length; j++) {
					array[i][j] = TextIO.getInt();
					System.out.print(array[i][j] + " ");
					
				}
				System.out.println();	
			}
	}}

	
		
		
	
		
	
//		MatrixHelp.getInput(matrix);
//		MatrixHelp.print2DArray(matrix);
//		System.out.print(MatrixHelp.isSingular(matrix));

		
		

