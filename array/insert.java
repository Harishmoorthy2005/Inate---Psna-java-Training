import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        int []arr1=new int[n+1];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            
        }
         int ele=sc.nextInt();
        int insert=sc.nextInt();
       
        for(int i=0, j=0; i<arr1.length; i++) {
            if(i==insert-1) {
                arr1[i] = ele;
            } else {
                arr1[i] = arr[j++];
            }
        }
        
        for(int i=0;i<arr1.length;i++){
            
            System.out.print(arr1[i]+" ");
        }
    }
}