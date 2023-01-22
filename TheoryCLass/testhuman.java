package code;

public class TestHuman {
	public static void main (String[] args) {
		Human h1 = new Human();
		h1.name = "Ashik" ;
		h1.age = 20 ;
		h1.gender ='M';
		
		Human h2 = new Human();
		h2.name = "Arafat";
		h2.age = 21 ;
		h2.gender = 'M';
		
		h1.eat("burger");
		h2.eat("Biriyani");
		
		h1.grow(2);
		System.out.println(h1.getAge());
		System.out.println(h2.age);
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
