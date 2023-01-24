public class product {
	
	    
		public String name;
		public String id;
		public String category;
		public double price;
	
		
		public product(String name, String id, String category, double price) {
			this.name = name;
			this.id = id;
			this.category = category;
			this.price = price;
		}
		
		
		void updatePrice(double newPrice) {
			price = newPrice;
		}
		
		
		double getPrice() {
			return price;
		}
		

		public double getDiscountedPrice(double discountPercentage) {
			return price - (price*discountPercentage/100);
		}
		
		
		void display() {
			System.out.printf("Name : "+name+", Catagory: "+category+", id : "+id+", Price: "+price);
		}

}
