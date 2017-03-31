public class Coding_1_7 {
	public static void main(String[] arg) {
		int m = 3; // col
		int n = 3; // row

		int[][] metrix = new int[m][n];
		System.out.println("hello");
		
		Coding_1_7.setMetrix(metrix);
	}
	
	public static int[][] setMetrix(int[][] metrix) {
		for (int i = 0; i < metrix.length; i++) {
			for (int j = 0; j < metrix[i].length; j++) {
				if (i == j) {
					metrix[i][j] = 0;
				} else {
					metrix[i][j] = i * j + 1;
				}
				
				System.out.print(metrix[i][j] + " ");
			}
			
			System.out.println();
		}

		return metrix;
	}
}
