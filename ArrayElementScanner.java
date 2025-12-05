package firstsem;
import java.util.Scanner;
public class ArrayElementScanner {
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the number of elements:");
		int n=scanner.nextInt();
		int[] array=new int[n];
		System.out.println("Enter"+ n +"elements:");
		for(int i=0;i<n;i++) {
		array[i]=scanner.nextInt();
		}
		System.out.println("Array elements");
		for(int i=0;i<n;i++) {
			System.out.println(array[i]+"");
		}
	
	}

}
