import java.util.Arrays;
import java.util.Scanner;

public class MatrixSpiral {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in, "UTF-8");

		System.out.println("Enter size of matrix");

		System.out.println("Row:");
		int row = input.nextInt();

		System.out.println("Colon:");
		int col = input.nextInt();

		int matrix[][] = new int[row][col];

		int start = 0;
		int end = row;
		int count = 1;

		if (row == col) {
			while (end - start > 0) {
				// top side
				for (int i = start; i < end; i++) {
					matrix[start][i] = count;
					count++;
				}
				// right side
				for (int i = start + 1; i < end; i++) {
					matrix[i][end - 1] = count;
					count++;
				}
				// bottom
				for (int i = end - 2; i >= start; i--) {
					matrix[end - 1][i] = count;
					count++;
				}
				// left side
				for (int i = end - 2; i > start; i--) {
					matrix[i][start] = count;
					count++;
				}
				start++;
				end--;
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