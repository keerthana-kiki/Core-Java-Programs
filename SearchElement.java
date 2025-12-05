package firstsem;

public class SearchElement {
	public static void main(String[] args) {

		int[] array = { 12, 21, 11, 43, 56, 78, 90 };
		int target = 11;
		boolean flag = false;

		for (int i = 0; i < array.length; i++) {

			int[] arr;
			if (array[i] == target) {
				flag = true;
				break;
			}
		}

		if (flag == true) {
			if (flag == true)
				System.out.println("Target exists in array ");

		} else
			System.out.println("Target not found ");

	}
}
