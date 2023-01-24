public class UapBazar {

	public static void main(String[] args) {
		product pro_obj = new product("Rice","001","Food",100);
		
		System.out.println(pro_obj.price);
		pro_obj.updatePrice(150);
		pro_obj.display();
		double discount= pro_obj.getDiscountedPrice(20);
	    System.out.println("\nDiscount price:"+discount);
		

	}
}
