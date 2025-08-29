import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <n; j++) {
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i-1);j++){
                if(j==1||j==(2*i-1)||i==n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
           
            System.out.println();
        }
    }
}