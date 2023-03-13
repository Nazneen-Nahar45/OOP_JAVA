package problem3;
import java.util.ArrayList;

public class Company {
	
	ArrayList<Employee> employee = new ArrayList<>();
	
	String companyName;
	
	public Company(String componyName) {
		this.companyName = companyName;
	}
	public void newEmplyee(String name,String designation,double salary) {
		Employee e = new  Employee(name,designation,salary);
		employee.add(e);
		System.out.println("New Employee ID: "+e.getId());
	}
	private Employee findEmployee(String id) {
		for(Employee e: employee) {
			if(e.getId().equals(id))
				return e;
		}
		return null;
	}
	public void updateSalary(String id,double salary) {
		Employee e = findEmployee(id);
		if(e!=null) {
			e.updateSalary(salary);
			System.out.println("Salary update successful");
		}
		else
			System.out.println("ID number is invalid");
	}
	public void getSalary(String id) {
		Employee e = findEmployee(id);
		if(e!=null) {
			System.out.println("Salary: "+e.getSalary());
		}
		else
			System.out.println("ID number is invalid");
	}
	public void display() {
		for(Employee e: employee)
			System.out.println(e);
	}
	public void display(String id) {
		Employee e = findEmployee(id);
		if(e!=null) {
			
			System.out.println(e);
		}
		else
			System.out.println("ID number is invalid");
	}
	
	

}
