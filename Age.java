package firstsem;
import java.util.Scanner;
public class Age {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the age: ");
        int age = sc.nextInt();
        if(age>0&&age<=12) {
        	System.out.print("Kid ");
        }
        else if(age>13&&age<=19) {
        	System.out.print(" Teenager");
        }
        else if(age>20&&age<=40) {
        	System.out.print(" Youngster");
        }
        else if(age>40&&age<=50) {
        	System.out.print(" aged man");
        }
        else if(age>55&&age<=70) {
        	System.out.print(" aged man");
        }
        }
        }

