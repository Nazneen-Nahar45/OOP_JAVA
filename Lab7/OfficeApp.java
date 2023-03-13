package problem3;
import java.util.Scanner;

public class OfficeApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Company company = new Company("UAP HR");
		
		String name,id,designation;
		double salary;
		exit:
			while(true) {
				System.out.println("\nChoose an option: ");
				System.out.println("1. Add new employee");
				System.out.println("2. Update the salary");
				System.out.println("3. Get the salary");
				System.out.println("4. Details of a specific Employee.");
				System.out.println("5. list of employees with their details.\n0. Exit\n");
				System.out.print("Enter your choice:\n");
                        int choice = scan.nextInt();
				
				switch(choice) {
				case 1:
					System.out.print("Name: ");
					name = scan.next();
					System.out.print("Designation: ");
					designation = scan.next();
					System.out.print("Salary: ");
					salary = scan.nextDouble();
					company.newEmplyee(name, designation, salary);
					
					break;
				case 2:
					System.out.print("ID: ");
					id = scan.next();
					System.out.print("New salary: ");
					salary = scan.nextDouble();
					company.updateSalary(id,salary);
					break;
				case 3:
					System.out.print("ID: ");
					id = scan.next();
					company.getSalary(id);
					break;
				case 4:
					System.out.print("ID: ");
					id = scan.next();
					company.display(id);
					break;
				case 5:
					company.display();
					break;
				case 0:
					break exit;
				}
			}
		
	}

}
