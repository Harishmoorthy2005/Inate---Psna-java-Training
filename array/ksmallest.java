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
        int k = sc.nextInt();
        int [] a = new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        if(k>n){
                System.out.println("Out of Range");
            }
        Arrays.sort(a);
        for(int i=0;i<n;i++){
            if(i+1==k){
                System.out.println(a[i]);
            }
           
        }
         
    }
    
}