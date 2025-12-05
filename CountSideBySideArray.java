package firstsem;

public class CountSideBySideArray {
	public static void main(String[] args) {
		int []arr= {41,5,5,6,8,8,8,9};
		int count =0;
		for(int i=0; i < arr.length-1; i++) {
			if(arr[i]==arr[i+1]) {
				count++;
			}
			
		}
		if (count == 0) {
			System.out.println("There are no matching side by side elements");
		}else {
			System.out.println("Numbers of side by side matches:"+ count);
		}
	}
}
