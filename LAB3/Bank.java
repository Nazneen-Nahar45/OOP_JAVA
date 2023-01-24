public class Bank {


		public static void main(String[] args) {
			BankAccount bank_obj = new BankAccount("Nazneen", "21201145", 50000);
			

			bank_obj.withdraw(55000);
			//display balance()			
			System.out.println(bank_obj.balance);
			bank_obj.deposit(10000);
		  //bank_obj.display();
			System.out.println(bank_obj.balance);

		}

	}
