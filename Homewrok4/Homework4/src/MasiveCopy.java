import java.util.Arrays;

public class MasiveCopy {

	public static void main(String[] args) {
		int[] array = new int[10];

		for (int i = 0; i < array.length; i++) {
			array[i] = i + 1;
		}
		System.out.println(Arrays.toString(array));

		int[] array_cpy = new int[10];

		for (int i = 0; i < array_cpy.length; i++) {

			array_cpy[i] = array[i];
		}
		System.out.println(Arrays.toString(array_cpy));

	}

}
