package code;
import java.util.Scanner;
public class Summation {

	    public static void main(String[] args) {
	        int a, rem;
	        int sum = 0;
	        System.out.print("Input a Number : ");
	        Scanner input = new Scanner(System.in);
	        a = input.nextInt();
	        while (a > 0) {
	            rem = a % 10;
	            sum = sum + rem;
	            a = a / 10;

	        }
	        System.out.print("The summation is : ");
	        System.out.println(sum);
	        input.close();
	    }
	}
