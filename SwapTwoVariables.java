package firstsem;

public class SwapTwoVariables {
	public static void main(String[]arg) {
		int a=10;
		int b=20;
		System.out.println("Before Swapping: a="+ a + ",b="+b); 
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After Swapping: a="+ a + ",b="+b);
	}

}
