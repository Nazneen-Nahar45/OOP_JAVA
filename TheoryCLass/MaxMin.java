package problem;

import java.util.Scanner;

public class p1 {
	public static void main(String[] args){
	    Scanner scan = new Scanner(System.in);
	    int a,b,c;
	    a = scan.nextInt();
	    b = scan.nextInt();
	    c = scan.nextInt();
	    if (a == b && a == c) {
	        System.out.println("Equal");
	    }
	    else {
	        System.out.println("Not Equal");
	 
	        int Max;
	        if (a >= b & a >= c) {
	            Max = a;
	        }
	        if (b >= a & b >= c) {
	            Max = b;
	        }
	        else {
	            Max = c;
	        }
	        System.out.println("Max = " + Max);

	    }
	    ///System.out.println(sum);
	}

	}
