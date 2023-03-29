package employeemanagement;
import java.time.LocalDate ;
import java.time.format.DateTimeFormatter ;
public class DailyRecord {
	
	public  double hour_Or_Sale;
    public   LocalDate  date ;
    public DailyRecord(double hour_Or_Sale) {
    	this.hour_Or_Sale =  hour_Or_Sale ;
    }
    
    public DailyRecord(String date, double hour_Or_Sale) {
    	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    	this.date = LocalDate.parse(date,formatter);
 this.hour_Or_Sale = hour_Or_Sale ;
    }
    @Override
    public String toString() {
    	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    	String appTime =date.format(formatter) ;
    	return String.format(appTime, hour_Or_Sale ) ;
    }
}
