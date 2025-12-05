package firstsem;

public class BubbleSort {
	public static void main(String[] args) {
		int []arr= {6,5,3,8,9,1,5};
		int temp;
		for(int i=0; i < arr.length-1; i++) {
			for(int j=0; j < arr.length-1; j++) {
				if(arr[j]>arr[j+1]) {
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		for(int ele:arr) {
			System.out.println(ele+"");
		}
	}
}
