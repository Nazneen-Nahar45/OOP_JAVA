package problem2;

import java.util.ArrayList;

public class Shop {
	public String shopName;
	ArrayList<Product> product = new ArrayList<>();
	
	public Shop(String shopName) {
		this.shopName = shopName;
	}
	public void addProduct(String name,String category,double price,int amount) {
		Product b = findProduct(name,category);
		if(b!=null) {
			int newAmount = b.getAmount()+amount;
			b.updateAmount(newAmount);
		}
		else {
			b = new Product(name,category,price,amount);
			product.add(b);
		}
		System.out.println("Product Add Successful!");
		System.out.println("Product ID: "+b.getId());
			
	}
	private Product findProduct(String name, String category) {
		for(Product p:product) {
			if(p.getName().equals(name) && p.getCategory().equals(category))
				return p;
		}
		return null;
	}
	private Product findProduct(String id) {
		for(Product p:product) {
			if(p.getId().equals(id)) {
				return p;
			}
		}
		return null;
	}
	public void updatePrice(String id,double newPrice) {
		Product p = findProduct(id);
		if(p!=null) {
			p.updatePrice(newPrice);
			System.out.println("Price update successful");
			
		}
		else
			System.out.println("Price update fail!");
	}
	public void discountPrice(String id,double discount) {
		Product p = findProduct(id);
		if(p!=null) 
			 System.out.println("Price after discount: "+p.getDiscountedPrice(discount));
			
	}
	public void display() {
		for(Product p:product) 
			System.out.println(p);
		
	}
	public void display(String id) {
		Product p = findProduct(id);
		if(p!=null)
			System.out.println(p);
		else
			System.out.println("Product couldn't found!");
	}

} 