package firstsem;
import java.util.Scanner;
public class DoWhileLoop {
	public static void main(String[]args) {
		Scanner sc= new Scanner(System.in);
		int i=0;
		int pwd=0;
		do{
			System.out.println("password="+pwd);
			if(i==0)
				System.out.println("enter your password: ");
			else
				System.out.println("Incorrect password"+".Enter your password again");
			pwd=sc.nextInt();
			i++;
			if(i==10)
			break;
		}while(pwd!=1234);
			System.out.println("Correct pwd.");
	}

}
