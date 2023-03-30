package employeemanagement;
	
import java.util.ArrayList ;
public abstract class PartTimeEmployee extends Employee  {
	protected ArrayList<DailyRecord> dailyRecords ;
		public PartTimeEmployee(String name , int age , String phoneNum , String designation ) {
			super(name , age , phoneNum , designation);
			this .dailyRecords = new ArrayList<DailyRecord>();
			
		}
		
		public abstract void addRecord(DailyRecord record) ;
		public abstract void addRecord(double hour_Or_Sale) ;
		public ArrayList<DailyRecord> getDailyRecords() {
			return dailyRecords ;
		}
	}


