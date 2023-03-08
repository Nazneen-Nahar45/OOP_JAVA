package problem1 ;
import java.util.ArrayList ;

public class Bank {
	String bankName;
	ArrayList<BankAccount> acc = new ArrayList<BankAccount>();
	public Bank(String bankName) {
		this.bankName = bankName;
	}

	public void createNewAccount(String name ,  double balance) {
		BankAccount b = new BankAccount(name , balance);
		acc.add(b);
		
		}
	
	 private BankAccount findAccount(String accNum) {
		 for(int i =0 ; i<acc.size(); i++) {
			 BankAccount b = acc.get(i);
			 if(b.getAccNum().equals(accNum))
				 return b ;
			 
		 } 
		 return null ;
			 }
	 public void deposit(String accNum, double depAmount) {
		 BankAccount b = findAccount(accNum);
		 if(b!=null) {
			 b.deposit(depAmount);
		 }
		 
	 }
	 public void withdraw(String accNum, double withAmount) {
		 BankAccount b = findAccount(accNum);
		 if(b!=null) {
			 b.withdraw(withAmount);
		 }
	 }
	 public double getBalance(String accNum) {
		 BankAccount b = findAccount(accNum);
		 if(b!=null) {
			return  b.getBalance() ;
		 }
		 return 0 ;
	 }
	 
	 public void display(String accNum) {
			BankAccount b = findAccount(accNum);
			if(b != null) {
			System.out.println(b);	
			}
		}
		public void display() {
			for(int i = 0; i<acc.size(); i++) {
				BankAccount b = acc.get(i);
				System.out.println(b);
			}
		}
}
