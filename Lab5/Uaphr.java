import javax.swing.JOptionPane; ;
class Uaphr {
	public static void main(String[] args) {
		Employee[] emp = new Employee[10] ;
		    String name , id , designation  ;
		   
		    MainLoop:
			    while(true) {
			    String option = JOptionPane.showInputDialog("\n1 to Add new employee to the system \n2 Update the salary of an Employee\n3 View the salary of an Employee \n4 View the details of an Employee \n5 View the list of employees with their details\n 0 exit");
			    switch(option) {
			    case "1" :
			    	
			    for(int i =0 ; i<emp.length ; i++) {
			    if(emp[i] == null) {
			    	name = JOptionPane.showInputDialog("Please Enter name\n ");
			    id = JOptionPane.showInputDialog("please enter id\n ");
			    designation = JOptionPane.showInputDialog("Enter the Designation\n ") ;
			    String salary = JOptionPane.showInputDialog("Please enter salary\n");
				 double sal = Double.parseDouble(salary) ;
				 Employee Uaphr = new Employee(name , id ,designation ,  sal) ;
				    emp[i] = Uaphr ;
			    break;
			    
			    }
			    } 
			    break ;
			    case "2" :
			    	String emp1 = JOptionPane.showInputDialog("Enter the id ") ;
				    for(int i=0 ; i<emp.length ; i++) {
				   
				    if(emp[i] == null ) break ;
				    if(emp[i].id.equals(emp1)) {
				    String salary = JOptionPane.showInputDialog("enter the new salary") ;
				    double  desalary = Double.parseDouble(salary) ;
				    emp[i].updateSalary( desalary);
				    break ;
				   }
				    }
				    break ;
				   
			    case "3" : 
			    	String emp2 = JOptionPane.showInputDialog("enter the id");
				    for(int i=0 ; i<emp.length ; i++) {
				    if(emp[i]==null)
				    	break ;  
				    if(emp[i].id.equals(emp2)) {
				    
				   System.out.println("Salary: " +emp[i].getSalary());
				   break ; 
				    }
				    }
				    break ;	
			    case "4" :
			    	String emp3 = JOptionPane.showInputDialog("enter id");
				    for(int i=0 ; i<emp.length ; i++) {
				    if(emp[i]==null)
				    	break ;  
				    if(emp[i].id.equals(emp3)) {
				    emp[i].display();
				    break ; 
				    }
				    }
				    break ;
			    case "5" :
			    	for(int i=0 ; i<emp.length ; i++) {
    					if(emp[i]==null) break ; 
    					else
    						emp[i].display();
		    		} break ; 
			  
			    case "0" :
			    	break MainLoop ;
		}    
		    }
	}
} 
