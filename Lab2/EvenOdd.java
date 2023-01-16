package code;
import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("Input a Number : ");
        n = input.nextInt();
        if (n%2==0) {
            System.out.println("Even");
            
        }
        else{
            System.out.println("Odd");
        }
    }
}



