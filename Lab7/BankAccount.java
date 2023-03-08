package problem1;

	import java.util.Random;
	public class BankAccount {
		private String memberName ;
		private String accNumber ;
		private double accountBalance ;
		
	  public BankAccount(String memberName , double accountBalance) {
		  this.memberName = memberName ;
		  this.accountBalance = accountBalance ;
		  Random rand = new Random(); 
		  this.accNumber  ="" + rand.nextInt(10) + rand.nextInt(10)+ rand.nextInt(10)+
				  rand.nextInt(10)+ rand.nextInt(10);
	  }

	  public void deposit(double depAmount) {
		  
		  accountBalance += depAmount ;
		  
		 }
	  public void withdraw(double withAmount) {
		  accountBalance -= withAmount ;
	  }
	  public String getMemberName() {
		  return memberName ;
	  }
	public String getAccNum() {
		return accNumber ;
		
	}
	public double getBalance() {
		return accountBalance ;
	}
	public String toString() {
		return "Name : " + memberName + " ; Account Number : " + accNumber + " ; Account Balance :" + accountBalance;
	}
	}


