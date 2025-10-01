import java.util.Scanner;
class BankAccount 
{
	private int accountNumber = 0;
	private String accountHolderName;
	private double balance;
	BankAccount()
	{
		accountNumber++;
		accountHolderName = "SAMPLE NAME";
		this.balance = 0.0;
	}
	BankAccount(BankAccount BA)
	{
		accountNumber = BA.accountNumber;
		this.accountHolderName = BA.accountHolderName;
		this.balance = BA.balance;
	}
	void setName(String accountHolderName)
	{
		this.accountHolderName = accountHolderName;
	}
	void displayBalance()
	{
		System.out.println("Account no.: " + accountNumber + "\nBalance: Rs. " + balance);
	}
	double withdraw(double amount)
	{
		balance -= amount;
		System.out.println("Current Balance: Rs. " + balance);
		return balance;
	}
	double deposite(double amount)
	{
		balance += amount;
		System.out.println("Current Balance: Rs. " + balance);
		return balance;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		BankAccount b1 = new BankAccount();
		String name;
		double amt;
		int c;
		do
		{
			System.out.println("1. Add account");
			System.out.println("2. Display Balance");
			System.out.println("3. Deposit");
			System.out.println("4. Withdraw");
			System.out.println("5. Exit");
			System.out.print("Enter your choice: ");
			c = sc.nextInt();
			sc.nextLine();
			switch(c)
			{
				case 1:
					System.out.print("Enter account holder name: ");
					name = sc.nextLine();
					b1.setName(name);
					break;
				case 2:
					b1.displayBalance();
					break;
				case 3:
					System.out.print("Enter amount to deposite: ");
					amt = sc.nextDouble();
					b1.deposite(amt);
					break;
				case 4:
					System.out.println("4. Withdraw");
					System.out.print("Enter amount to withdraw: ");
					amt = sc.nextDouble();
					if(amt > b1.balance)
					{
						System.out.println("Insufficient Balance");
					}
					else
					{
						b1.withdraw(amt);
					}
					break;
			}
		}
		while(c >= 0 && c <= 4);
	}
}