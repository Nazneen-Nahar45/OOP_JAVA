package employeemanagement;
	
	public class CommissionEmployee extends PartTimeEmployee{

		public double commission ;
		public double sale  ;
	public CommissionEmployee (String name , int age , String phoneNum , String designation , double commission ) {

		super(name , age , phoneNum , designation);
		this.commission   = commission ;
		
		setId("33-" + getID());
		
	}
	public double getSale() {
		return sale ;
	}
	public void setSale(double sale ) {
		this.sale=sale ;
	}
	public double getSalary(double _sale) {
		return commission * _sale ;
	}
	@Override 
	public void increaseSalary(double amt) {
		commission += amt ;
	}
	public double getSalary() {
		return commission*sale  ;
		
	}
	public void addRecord(DailyRecord record) {
	    dailyRecords.add(record);
		sale += record.hour_Or_Sale;
	}
	
	public void addRecord(double hour_or_sale) {
		DailyRecord record = new DailyRecord( hour_or_sale);
		dailyRecords.add(record);
		sale  += record.hour_Or_Sale;
	}
		
	
	public String toString(boolean details) {
		 if(details == false ) {
			 return super.toString();
			 
		 }
		 return super.toString() + " ; Commission :" + commission ;
	}

	}
