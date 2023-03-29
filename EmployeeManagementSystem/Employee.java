package Employeemanage;
import java.util.Random ;

public abstract class Employee {

	private String  name ; 
	private String id ;
	private int age ;
	private String phoneNum ; 
	private String designation  ;
	
	public Employee (String name , int age , String phoneNum , String designation ) {
		this.name = name;
		this.age = age ;
		this.phoneNum = phoneNum ;
		this.designation = designation ;
		Random rand = new Random() ;
		this.id = ""+rand.nextInt(10)+rand.nextInt(10)+rand.nextInt(10)+rand.nextInt(10);
	}
	public String getName() {
		return name ;
	}
	public String getID() {
		return id ;
	}
	public int getAge() {
		return age ;
	}
	public String getPhoneNum() {
		return phoneNum ;
	}
	public String getDesignation() {
		return designation ;
	}
	public void setId(String id ) {
		this.id = id ;
	}
	public String toString() {
		return "Name : "+name+ "; Id : "+ id +"; Age : "+age+" ; Phone : "+phoneNum+";Designation : "+designation ;
	}
	
	public abstract double getSalary() ;
	
	 public abstract void increaseSalary(double amt) ;
	 
	public abstract String toString(boolean details) ;
	
}