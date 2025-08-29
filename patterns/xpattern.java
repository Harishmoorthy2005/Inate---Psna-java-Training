import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
         int n1= 2*n-1;
        for(int i=1;i<=n1;i++){
            for(int j=1;j<=n1;j++){
                int si=n1+1;
                if(i==1||i==n1||j==1||j==n1||i==j||i+j==si){
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