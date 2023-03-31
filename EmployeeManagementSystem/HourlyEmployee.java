package employeemanagement;
public class HourlyEmployee extends PartTimeEmployee {
		 public double hourlyRate ;
		 public double hourWorkedPerMonth ;
		 
		 public HourlyEmployee(String name , int age , String phoneNum , String designation , double hourlyRate , double hourWorkedPerMonth ) {
			
			 super(name,age , phoneNum , designation);
				this.hourlyRate  = hourlyRate ;
				
				setId("22-" + getID());
			}

		 public double getHourWorkedPerMonth() {
			 return hourWorkedPerMonth ;
		 }
		public void setHourWorkedPerMonth(double hourworkedPerMonth ) {
				this.hourWorkedPerMonth  = hourWorkedPerMonth ;
			}
		public double getSalary(int h_Worked) {
			return h_Worked*hourlyRate ;
			
		}
		@Override
		public void addRecord(DailyRecord record) {
		    dailyRecords.add(record);
			hourWorkedPerMonth  += record.hour_Or_Sale;
		}
		

		public void addRecord(double hour_or_sale){
			DailyRecord record = new DailyRecord( hour_or_sale);
			dailyRecords.add(record);
			hourWorkedPerMonth  += record.hour_Or_Sale;
		}
		

		@Override
		public void increaseSalary(double amt) {
			hourlyRate += amt ;
		}
		public double getSalary() {
			return hourWorkedPerMonth*hourlyRate ;
		}
		
		 public String toString(boolean details) {
			 if(details == false ) {
				 return super.toString();
				 
			 }
			 return super.toString() + " ; Rate :" + hourlyRate ;
		 }
		 
		 }
