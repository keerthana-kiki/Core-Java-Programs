package firstsem;

public class BankAccount {
	
	    private String accountHolderName;
	    private int accountNumber;
	    private int balance;

	    // Constructor
	    public BankAccount(String accountHolderName, int accountNumber, int balance) {
	        this.accountHolderName = accountHolderName;
	        this.accountNumber = accountNumber;
	        this.balance = balance;
	    }

	    // Getters and Setters
	    public int getBalance() { return balance; }
	    public void setBalance(int balance) { this.balance = balance; }
	    public String getAccountHolderName() { return accountHolderName; }
	    public int getAccountNumber() { return accountNumber; }

	    // Deposit method
	    public void deposit(int amount) {
	        balance += amount;
	        System.out.println("Deposited: " + amount);
	    }

	    // Withdraw method
	    public void withdraw(int amount) {
	        if (amount <= balance) {
	            balance -= amount;
	            System.out.println("Withdrew: " + amount);
	        } else {
	            System.out.println("Insufficient funds for withdrawal.");
	        }
	    }

	    public static void main(String[] args) {
	        // Create account
	        BankAccount myAccount = new BankAccount("John Doe", 123456, 6000);

	        // Perform transactions
	        myAccount.withdraw(1500);
	        myAccount.deposit(200);

	        // Get final balance
	        int currentBalance = myAccount.getBalance();
	        System.out.println("Current Balance: " + currentBalance);

	        // Use Ternary Operator to check status
	        String status = (currentBalance >= 5000) ? 
	                        "Minimum Balance Maintained" : 
	                        "Minimum Balance not Maintained";

	        // Display status
	        System.out.println("Status: " + status);
	    }
	}

