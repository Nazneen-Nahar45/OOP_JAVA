public class Employee {
	public String name ;
	public String id ;
	public String designation ;
	public double salary ;
	
	public Employee(String name , String id , String designation , double salary) {
		this.name = name ;
		this.id = id ;
		this.designation = designation ;
		this.salary = salary ;
		
		}
	void updateSalary(double newSal) {
		salary = newSal;
	}
	

	double getSalary() {
		return salary;
	}
	void display() {
		System.out.println("Name: "+name+", Id: "+id+", Designation: "+designation+", Salary: "+salary);
	}
	
}
