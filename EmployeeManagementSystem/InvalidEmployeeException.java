package employeemanagement;

public class InvalidEmployeeException extends Exception {
	public InvalidEmployeeException(String id) {
		 super(String.format("Employee with Id:%s is not a valid employee.", id));
		}
		
}
