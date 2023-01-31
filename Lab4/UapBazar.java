import java.util.Scanner;
import javax.swing.JOptionPane;
	
public class UapBazar {
public static void main(String[]args) {
		 Scanner scan = new Scanner(System.in);
	 	 System.out.println("Enter name, id, category, price\n ");
	 	 String name = scan.next();
	 	 String id = scan.next();
	 	 String category = scan.next();
	 	 double price = scan.nextDouble();
	 	 Product p1 = new Product(name, id, category, price);
	 	 
	 	MainLoop :
	   	 while(true) {
	        System.out.printf("Please enter 1 to update price \n2 to get discounted price \n3 to display the product info \n 0 to exit\n");
	        int option= scan.nextInt();
	        switch(option) {
	        case 1 :
	        	
	        	String Upprice = JOptionPane.showInputDialog("Enter the price ");
	        	double update = Double.parseDouble(Upprice) ;
	        	p1.updatePrice(update);
	        	break ;
	        	
	        case 2:
	        String percentage = JOptionPane.showInputDialog("Enter discount percentage");	
	        double discount = Double.parseDouble(percentage);
	        p1.getDiscountedPrice(discount);
	        System.out.println(+discount);
	        
	        break;
	        
	        case 3:
	        p1.display();
	         break;
	         
	        case 0:
	       	 break MainLoop;
	         }
	   	 }
	        }
}
