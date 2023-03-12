package problem2;
import java.util.Scanner;

public class BazarApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Shop shop = new Shop("kochukhet Bazar");
		String name,id,category;
		int amount;
		double price;
		
		exit:
		while(true) {
			System.out.println("\nChoose an option:");
			System.out.println("1 Add product.\n2. Update Price.\n3 Discounted price.");
			System.out.println("4 Details of a specific.");
			System.out.println("5 List of products with their details.\n0 exit");
                   System.out.print("Enter your choice:\n");
                   int choice = scan.nextInt();
			switch(choice) {
			case 1:
				System.out.print("Product name: ");
				name = scan.next();
				System.out.print("Catagory: ");
				category = scan.next();
				System.out.print("Price: ");
				price = scan.nextDouble();
				System.out.print("Amount: ");
				amount = scan.nextInt();
				shop.addProduct(name, category, price, amount);
				
				break;
			case 2:
				System.out.print("Product ID: ");
				id = scan.next();
				System.out.print("New Price: ");
				price = scan.nextDouble();
				shop.updatePrice(id, price);
				
				break;
			case 3:
				System.out.print("Product ID: ");
				id = scan.next();
				System.out.print("Discount Percentage: ");
				double percentage = scan.nextDouble();
				shop.discountPrice(id, percentage);
				
				break;
			case 4:
				System.out.print("Product ID: ");
                             id = scan.next();
				shop.display(id);
				break;
			case 5:
				shop.display();
				break;
			case 0:
				break exit;
			}
		}

	}

} 