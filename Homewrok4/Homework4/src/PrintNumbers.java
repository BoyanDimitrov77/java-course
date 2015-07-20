import java.util.Arrays;

public class PrintNumbers {

	public static void main(String[] args) {
		int matrix[][] = new int[5][6];

		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[0].length; col++) {

				matrix[row][col] = (row * matrix[0].length) + col + 1;

			}

		}
		System.out.println(Arrays.deepToString(matrix));
		int matrix_rev[][] = new int[5][6];

		for (int row = 0; row < matrix_rev.length; row++) {
			for (int col = 0; col < matrix_rev[0].length; col++) {
				matrix_rev[matrix_rev.length - row - 1][matrix_rev[0].length - col - 1] = matrix[row][col];

			}

		}
		System.out.println("Matrix");
		// System.out.println(Arrays.deepToString(matrix_rev));

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.printf("%d ", matrix_rev[i][j]);
			}
			System.out.println();
		}

	}

}
