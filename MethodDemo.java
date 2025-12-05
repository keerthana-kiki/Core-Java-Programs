package firstsem;

public class MethodDemo {
	public static void main(String[]args) {
	boolean value= MethodDemo.canVote(20);
	if(value)
		System.out.println("can Vote");
	else
		System.out.println("cannot Vote");
}
public static boolean canVote(int age) {
	if(age > 18) {
		return true;
	}
	else {
		return false;
	}
}
}
  