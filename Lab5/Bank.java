import javax.swing.JOptionPane ; 
public class Bank {
    public static void main(String[] args) {
    	BankAccount[] accs =new BankAccount[10];
    	String name , id ;
    	MainLoop:
    		while(true) {
    			String option = JOptionPane.showInputDialog("\n1 to create account \n 2 to deposit money \n 3 to withdraw money \n4 to display balance \n 5 to disply specific account \n 6 to display all \n 0 to exit");
    			switch(option) {
    			case "1" : 
    				for(int i =0 ; i<accs.length ; i++) {
    					if(accs[i] == null) {
    						name = JOptionPane.showInputDialog("please enter name ");
    						id = JOptionPane.showInputDialog("please enter id ");
    					String balance = JOptionPane.showInputDialog("Please enter balance");
    						 double ba = Double.parseDouble(balance) ;
    						 BankAccount bank = new BankAccount(name , id , ba) ; 
    						accs[i] = bank ; 
    						break ;
    					}
    				}
    				break ; 
    				
    			case "2" : 
    				String accnum = JOptionPane.showInputDialog("Enter account number") ;
    				for(int i=0 ; i<accs.length ; i++) {
    					
    					if(accs[i] == null ) break ; 
    						if(accs[i].id.equals(accnum)) ;
    						String balance = JOptionPane.showInputDialog("enter amount") ;
    						double  Debalance= Double.parseDouble(balance) ;
    							accs[i].deposit(Debalance);	
    					
    					}
    				break ; 
    				
    			case "3" : 
    				String ab = JOptionPane.showInputDialog("enter amount to withdraw");
    				for(int i=0 ; i<accs.length ; i++) {
    					if(accs[i]==null)break ;  
    						if(accs[i].id.equals(ab));
    						String balance  = JOptionPane.showInputDialog("enter amount");
    						double bal2 = Double.parseDouble(balance);
    						accs[i].withdraw(bal2);
    					
    				
    				}
    				break ; 
    				
    			case "4" : 
    				String acn = JOptionPane.showInputDialog("enter account number");
    				for(int i=0 ; i<accs.length ; i++) {
    					if(accs[i]==null)break ;  
    						if(accs[i].id.equals(acn));
    				double getbal = accs[i].getBalance();
    				System.out.println("Balance : "+getbal) ;
    				
    					
    					
    				}
    				
    				break ; 
    				
    			case "5" : 
    				String acc = JOptionPane.showInputDialog("enter account number");
    				for(int i=0 ; i<accs.length ; i++) {
    					if(accs[i]==null) break ; 
    						if(accs[i].id.equals(acc));
    						accs[i].display();
    						
    				
    					
    				}
    				break ; 
    				
    			case "6" : 
    				for(int i=0 ; i<accs.length ; i++) {
    					if(accs[i]==null) break ; 
    					else
    						accs[i].display();
    						
    					
    				}
    				
    				
    				break ; 
    				
    			case "0" : 
    				break MainLoop ;
    		
    			}
    		}
    	
    }
	
	
	
	
	
	
}
