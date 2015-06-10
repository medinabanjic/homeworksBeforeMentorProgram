package ba.bitcamp.arrays;

public class MatrixHelp {

	public static int matrixFileR(String filename) {

		int rows = 0;

		TextIO.readFile(filename);

//		String matrixRows = TextIO.getln();
//		String[] parts = matrixRows.split(" ");
//		int part1 = Integer.parseInt(parts[0]);
//		rows = part1;
//		TextIO.readStandardInput();

		rows = TextIO.getInt();
		return rows;

	}

	public static int matrixFileC(String filename) {

		int columns = 0;
		TextIO.readFile(filename);

//		String matrixRows = TextIO.getln();
//		String[] parts = matrixRows.split(" ");
//		int part2 = Integer.parseInt(parts[1]);
//		columns = part2;

		columns = TextIO.getInt();
		return columns;

	}

	public static int[][] matrixFile(int[][] array) {

		//while (!TextIO.eof()) {
			TextIO.readFile("src/ba/bitcamp/arrays/Matrix");
			for (int i = 0; i < array.length; i++) {
				for (int j = 0; j < array[i].length; j++) {
					

					array[i][j] = TextIO.getInt();

				}
			//}

		}

		return array;
	}

	/**
	 * This method calculate determinant of matrix.
	 * 
	 * @param array
	 *            - matrix
	 * @return
	 * 
	 *         Returns boolean if the matrix is singular or not.
	 */
	public static boolean isSingular(int[][] array) {
		int matrix = 0;
		int matrix1 = 0;
		int matrix2 = 0;
		boolean isSingular = true;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {

				matrix1 = array[0][0] * array[1][1] * array[2][2] + array[0][1]
						* array[1][2] * array[2][0] + array[0][2] * array[1][0]
						* array[2][1];
				matrix2 = array[2][0] * array[1][1] * array[0][2] - array[2][1]
						* array[2][2] * array[0][0] - array[2][2] * array[1][0]
						* array[0][1];
				matrix = matrix1 - matrix2;

			}
		}

		if (matrix != 0) {

			isSingular = false;
		}

		return isSingular;
	}

	public static int[] printColumn(int[][] array, int index) {
		int[] columnIndexed = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			for (int j = index; j < array[i].length; j += array.length) {

				int column = array[i][j];
				columnIndexed[i] = column;

			}
		}

		return columnIndexed;
	}

	public static void print2DArray(int[][] array) {

		for (int[] row : array) {
			for (int el : row) {
				System.out.printf("%3d", el);
			}
			System.out.println();
		}
		System.out.println();
	}

	public static void getInput(int[][] array) {

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {

				array[i][j] = (int) (Math.random() * 3 - 1);

			}
		}
	}
}
