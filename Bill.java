package firstsem;
import java.util.Scanner;
public class Bill {
	public static void main(String[] args)
	{
		Scanner Scanner = new Scanner(System.in);
		System.out.println("Enter the total bill : ");
		double amount = Scanner.nextDouble();
		double discount = 0;
		if(amount>2000) {
			discount = amount*0.15;		
					}else if (amount > 1000) {
						discount = amount*0.08;
					}
		double finalAmount = amount - discount;
		System.out.println("Bill Amount"+amount);
		System.out.println("Discount"+discount);
		System.out.println("Final Amount"+finalAmount);
	}
	}
