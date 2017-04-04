public class MatrixWithZeros_1_7 {
	final int defaultRow = 3;
	final int defaultColumn = 3;
	
	int[][] matrix = null;

	public static void main(String[] arg) {
		int row = 0;
		int column = 0;

		if (arg.length > 1) {
			row = Integer.valueOf(arg[0]);
			column = Integer.valueOf(arg[1]);
		}
		
		MatrixWithZeros_1_7 matrix = new MatrixWithZeros_1_7(row, column, 0);
		matrix.print();
		matrix.fillZeros();
		matrix.print();
	}
	
	MatrixWithZeros_1_7(int row, int column, int zeroCount) {
		if (row < 1) {
			row = defaultRow;
		}
		
		if (column < 1) {
			column = defaultColumn;
		}

		setMetrix(row, column, zeroCount);
	}
	
	public void print() {
		System.out.println("start matrix print");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			
			System.out.println();
		}
		System.out.println("end matrix print");
	}

	public void setMetrix(int row, int column, int zeroCount) {
		matrix = new int[row][column];

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (i == 1 && j == 1) {
					matrix[i][j] = 0;
				} else {
					matrix[i][j] = 1;
				}
			}
		}
	}
	
	public void fillZeros() {
		boolean[] rowZeros = new boolean[matrix.length]; 		
		boolean[] columnZeros = new boolean[matrix[0].length];
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				// rowZeros[j] = false;
				// columnZeros[i] = false;

				if (matrix[i][j] == 0) {
					columnZeros[i] = true;
					rowZeros[j] = true;
				}
			}
		}
		/*	
		for (int a = 0; a < rowZeros.length; a++) {
			System.out.println("rowZeros = " + a + " " + rowZeros[a]);
		}		

		for (int b = 0; b < columnZeros.length; b++) {
			System.out.println("columnZeros = " + b + " " + columnZeros[b]);
		}
		*/

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (columnZeros[j] || rowZeros[i]) {
					matrix[i][j] = 0;
				}
			}
		}
	}
}
