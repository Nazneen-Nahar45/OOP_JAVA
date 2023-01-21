import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i=0;
        while(scan.hasNextLine()){
        String str=scan.nextLine();
            if (str.contains("end-of-file")){
                i++;
                System.out.println(i+" "+str);
                break;
            }else{
                i++;
                System.out.println(i+" " +str);       
            }
        }
    }
}