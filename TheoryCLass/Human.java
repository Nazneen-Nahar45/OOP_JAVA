package code;

public class Human {
  public String name ;
  public char gender ;
  public int age ;
  
  public void eat(String food) {
	  System.out.printf("%s eats %s.\n", name, food) ;
	  
  }
	
	public int getAge() {
		return age ;
	}
	
	public void grow(int y) {
		age+=y ;
	}
	
	
	
	
	
}
