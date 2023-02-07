public class BankAccount {

	public String name ; 
	public String id ;
	public double balance ; 

 BankAccount(String name , String accNum , double balance ) 
 {
	this.name = name ; 
	this.id = accNum ; 
	this.balance = balance ; 
	
 }

	
	void deposit(double depAmount) {
		System.out.println("After Deposit: ");
		balance += depAmount;
	}
	
	
	void withdraw(double withAmount) {
		if (withAmount<balance) {
			System.out.println("After Withdraw: ");
			balance -= withAmount;
		}
		else {
			System.out.println("Not enough balance");
		}
	}
	
	
	double getBalance() {
		return balance;
	}
	
	
	void display() {
		System.out.println("Name : "+name+", ID :"+id+", Balance :"+balance);
	}
}
