package problem1;
import java.util.Scanner ;

public class BankApp {
    public static void main(String[] args) {
        Bank bank = new Bank("one bank");
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("1. Create a new account\n");
            System.out.println("2. Deposit money\n");
            System.out.println("3. Withdraw money");
            System.out.println("4. Display balance of a particular account\n");
            System.out.println("5. Display account info of a particular account\n");
            System.out.println("6. Display all accounts info\n");
            System.out.println("0. Exit the system\n");
            System.out.print("Enter your choice:\n");
            int choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.print("Enter member name: ");
                    String name = scanner.next();
                    System.out.print("Enter balance: ");
                    double balance = scanner.nextDouble();
                    bank.createNewAccount(name, balance);
                    
                    break;
                    
                case 2:
                    System.out.print("Enter account number: ");
                    String accNum = scanner.next();
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    bank.deposit(accNum, depositAmount);
                   
                    break;
                    
                case 3:
                    System.out.print("Enter account number: ");
                     accNum = scanner.next();
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    bank.withdraw(accNum, withdrawAmount);
                    
                    break;
                    
                case 4:
                    System.out.print("Enter account number: ");
                    accNum = scanner.next();
                    double balanceOfAccount = bank.getBalance(accNum);
                    System.out.println("Balance of account " + accNum + " is " + balanceOfAccount);
                    break;
                    
                case 5:
                    System.out.print("Enter account number: ");
                    accNum = scanner.next();
                    bank.display(accNum);
                    break;
                    
                case 6:
                    bank.display();
                    break;
                    
                case 0:
                     System.exit(0);
                    
                
            }
        }
    }
}


