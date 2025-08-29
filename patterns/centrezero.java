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
        int mid=n/2;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(n%2!=0&&i==mid+1&&i==j){
                    System.out.print("0");
                }
                else if(n%2==0&&i==j&&i==mid+1){
                    System.out.print("0");
                }
                else if(n%2==0&&i==j+1&&i==mid+1){
                    System.out.print("0");
                }
                 else if(n%2==0&&i+1==j&&i==mid){
                    System.out.print("0");
                }
                 else if(n%2==0&&i+1==j+1&&i==mid){
                    System.out.print("0");
                }
                 
                else{
                    System.out.print("1");
                }
                
            }
            System.out.println();
        }
        
    }
}