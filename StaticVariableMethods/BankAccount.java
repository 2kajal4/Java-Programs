package StaticVariableMethods;

public class BankAccount {
	int accNo;
	String name;
	static double interestRate=6.5;
	
	BankAccount(int accNo,String name){
		this.accNo=accNo;
		this.name=name;
	}
	
	public void display() {
		System.out.println(accNo+" "+name+ " "+"Inetrest RATE:"+interestRate);
	}

	public static void main(String[] args) {
		BankAccount b1=new BankAccount(101,"kajal");
		BankAccount b2=new BankAccount(102,"Pooja");
		
		b1.display();
		b2.display();
		
		BankAccount.interestRate=7.0;
		
			
		b1.display();
		b2.display();
		

	}

}
