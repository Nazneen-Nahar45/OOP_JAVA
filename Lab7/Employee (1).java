package problem3;
import java.util.Random;

public class Employee {
	private String name;
	private String id;
	private String designation;
	private double salary;
	
	public Employee(String name,String designation,double salary) {
		this.name = name;
		this.designation = designation;
		this.salary = salary;
		Random rand = new Random();
		this.id = ""+rand.nextInt(10)+rand.nextInt(10)+rand.nextInt(10)+rand.nextInt(10);
		
	}
	public String getName() {
		return name;
	}
	public String getId() {
		return id;
	}
	public String getDesignation() {
		return designation;
	}
	public double getSalary() {
		return salary;
	}
	public void updateSalary(double salary) {
		this.salary = salary; 
	}
	public String toString() {
		return "\nName: "+name+"\nID: "+id+"\nDesignation: "+designation+"\nSalary: "+salary+"\n";
	}
	

	

}
