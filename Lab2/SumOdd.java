import java.util.Scanner;

public class SumOdd{
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);{
            System.out.println("Enter Numbers");
        }
            int n = scan.nextInt();
            int i, sum=0;
            
            for(i=0;i<n;i++){
                int a = scan.nextInt();
                if(a%2!=0) {
                	sum=sum+a;
            }
            
            		
            	}
            System.out.println("Sum: "+sum);
            }
    }
