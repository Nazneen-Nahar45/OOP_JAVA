public class Product {
    public static int length;
    String name;
    double price;
    String id;
    String catagory;

    public Product(String n,double p,String i,String c)
    {
        name = n;
        id = i;
        catagory = c;
        price = p;

    }
    public void UpdatePrice(double NewPrice) {
        price = NewPrice;
        
    }
    public double GetPrice()
    {
        return price;
    }
    public double GetDiscountedPrice(double DiscountPercentage)
    {
        double dp ;
        dp = price - (price*(DiscountPercentage/100));
        return dp;

    }
    public void display()
    {
        System.out.printf("Name : %s Id : %s Price : %f\n",name,id,price);
    }
}
