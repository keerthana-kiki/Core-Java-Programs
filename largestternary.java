package firstsem;

public class largestternary {
	public static void main(String[] args) {
		int a=10;
		int b=100;
		int c=300;
		int d=450;
		int e=690;
		String a1 = (a>b)&&(a>c)&&(a>d)&&(a>e) ? "largest"+a : (b>c)&&(b>d)&&(b>e)? "largest"+b : (c>d)&&(c>e) ? "largest"+c:(d>e)? "largest"+d:"largest"+e;
		System.out.println(a1);
	}

}
