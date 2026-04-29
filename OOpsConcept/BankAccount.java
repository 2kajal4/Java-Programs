package OOpsConcept;

public class BankAccount {

	private String accHolder;
	private double balance;
	
	BankAccount(String accHolder,double initialBalance){
		this.accHolder=accHolder;
		if(initialBalance>=0)
		{
			this.balance=initialBalance;
		}else {
			this.balance=0;
		}
	}
	
	public void Deposit(double amount) {
		if(amount>0) {
			balance=balance+amount;
			System.out.println(amount+" Deposited successfully");
		}else {
			balance=0;
		}
	}
	
	public void withdraw(double amount) {
		if(amount<=0) {
			System.out.println("Invalid withdrawl Amount");
		}else if(amount>balance) {
			System.out.println("Insufficient Amount");
		}else {
			balance= balance-amount;
		}
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void display() {
		System.out.println("Account Holder name"+accHolder);
		System.out.println("Balance :"+balance);
	}
	
	
	public static void main(String[] args) {
		BankAccount acc=new BankAccount("Kajal", 500);
		
		acc.display();
		
		acc.Deposit(500);
		acc.display();
		acc.withdraw(250);
		acc.display();
		
		
		
		

	}

}
