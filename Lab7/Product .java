package problem2;
import java.util.Random;

public class Product {
	private String name;
	private String id;
	private String category;
	private double price;
	private int amount;
	
	public Product(String name,String category,double price,int amount) {
		this.name = name;
		this.category=category;
		this.price = price;
		this.amount= amount;
		Random rand = new Random();
		this.id = ""+rand.nextInt(10)+rand.nextInt(10)+rand.nextInt(10)+rand.nextInt(10);	
	}
	public String getName() {
		return name;
	}
	public String getId() {
		return id;
	}
	public String getCategory() {
		return category;
	}
	public double getPrice() {
		return price;
	}
	public int getAmount() {
		return amount;
	}
	public void updateAmount(int amount) {
		this.amount= amount;
	}
	public void updatePrice(double newPrice) {
		price = newPrice;
	}
	public double getDiscountedPrice(double discount) {
		return price-(price*(discount/100));
	}
	public String toString() {
		return "\nName: "+name+"\nID: "+id+"\nCategory: "+category+"\nPrice: "+price+"\nAmount: "+amount+"\n";
	}

}
