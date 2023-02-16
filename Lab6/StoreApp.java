import java.util.Scanner;

public class StoreApp {

	public static void main(String[] args) {
		BookStore store = new BookStore("CSE 204 C2 -  Store");
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("please enter 1 to display specific, 2 to order, 3 to sell , 4 to display all, 0 to exit");
			int option = scan.nextInt();

			if(option == 0) break;
			else
				switch(option) {
			
				case 1 : // display specific
					System.out.println("Please enter title, author");
					store.display(scan.next(), scan.next());
					break;
				case 2: // order
					System.out.println("Please enter title, author, copies");
					store.order(scan.next(), scan.next(), scan.nextInt());
					break;
				case 3 : // sell
					System.out.println("Please enter title, author, copies");
					store.sell(scan.next(), scan.next(), scan.nextInt());
					break;
				case 4: // display all
					store.display();
					break;
				default:
					System.out.println("Invalid option");
					break;

				}
		}
	}
}
