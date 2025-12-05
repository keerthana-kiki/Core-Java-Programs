package firstsem;

public class MultipleOfFive {
	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 12 };
		printmultiple(arr);

	}

	public static int printmultiple(int arr[]) {
		int multiples = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 5 == 0) {
				multiples++;
			}
		}
		System.out.println("Their are of 5 are : " + multiples);
		return multiples;
	}
}


