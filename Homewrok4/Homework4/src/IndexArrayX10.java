import java.util.Arrays;

public class IndexArrayX10 {

	public static void main(String[] args) {
		int array[] = new int[10];

		for (int index = 0; index < 10; index++) {
			array[index] = index * 10;

		}
		System.out.println(Arrays.toString(array));
	}

}
