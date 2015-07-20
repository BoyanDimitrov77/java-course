import java.util.Arrays;
import java.util.Scanner;

public class FilMatrixVerticaHorizontal {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in, "UTF-8");

		System.out.println("Enter size of matrix:");

		System.out.println("Row:");
		int row = input.nextInt();
		System.out.println("Colon:");
		int col = input.nextInt();

		int matrix[][] = new int[row][col];
		if (row == col) {

			for (int col1 = 0; col1 < row; col1++) {
				for (int row1 = 0; row1 < col; row1++) {

					matrix[row1][col1] = (col1 * matrix[0].length) + row1 + 1;

				}

			}
			System.out.println(Arrays.deepToString(matrix));
			System.out.println();

			for (int i = 0; i < row; i++) {
				for (int j = 0; j < col; j++) {
					System.out.printf("%d ", matrix[i][j]);
				}
				System.out.println();
			}
		} else {
			System.err.println("Error");

		}

		input.close();

	}

}
