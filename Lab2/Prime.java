package code ;

import java.util.Scanner ;

public class Prime {

	
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a Number : ");
        int value, m, count = 0;
        value = input.nextInt();
        m = value / 2;
        for (int i = 1; i <= m; i++) {
            if (value % i == 0) {
                count++;
            }
        }
        if (count < 2) {
            System.out.println("Prime");

        } else {
            System.out.println("Not Prime");
        }
        input.close();
    }


}
