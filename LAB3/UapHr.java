public class UapHr {

	public static void main(String[] args) {
		Employee emp_obj = new Employee("Nazneen" , "21201145" , "Lecturer" , 30000) ;
		emp_obj.display();

		System.out.println("Salary: "+emp_obj.salary);
		emp_obj.updateSalary(40000);
		emp_obj.display();

	}
	}
