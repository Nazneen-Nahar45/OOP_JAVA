public class Doctor {
 public String name ;
 public String specialty ;
 public int rank ;
 public Doctor(String name , String specialty ,int rank) {
	 this.name = name ;
	 this.specialty = specialty ;
	 this.rank = rank ;
	 
 }
 
 public void prescribe(String patient , String med) {
	 System.out.printf("%s prescribe %s to %s\n",name ,med , patient);
	 rank++ ;
	 
 }
 public int getRank() {
	 return rank ;
	 
 }
 public void display() {
	 System.out.println("Name : "+name+", Specialty : "+specialty+" , Rank : "+rank ) ;
 }
}
