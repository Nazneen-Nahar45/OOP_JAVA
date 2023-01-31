public class UapHr {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter employee name: ");
        String name = scan.nextLine();
        System.out.println("Enter employee id: ");
        int id = scan.nextInt();
        System.out.println("Enter employee designation: ");
        String designation = scan.next();
        System.out.println("Enter employee salary: ");
        double salary = scan.nextDouble();
        Employee emp = new Employee(name, id, designation, salary);
     
        while (true) {
            System.out.println("\nChoose an action:");
            System.out.println("1. Update salary");
            System.out.println("2. Get salary");
            System.out.println("3. Display employee info");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            int choice = scan.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter updated salary: ");
                    double sal =scan.nextDouble();
                    emp.updateSalary(sal);
                    System.out.println("Salary updated successfully");
                    break;
                case 2:
                    System.out.println("Salary: " + emp.getSalary());
                    break;
                case 3:
                    emp.display();
                    break;
                case 0:
                    System.out.println("Exiting the system...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }

}
