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
        int[] arr = new int[n];              
        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        int []arr1= new int[n-1];
        int pos=sc.nextInt();
        if(pos>n||pos<0){
            System.out.println("Deletion not possible.");
            return;
        }
        int i =0,j=0;
         while (i < n) {
            if (i==pos-1) {
                i++; 
                continue;
            }
            arr1[j] = arr[i];
            i++;
            j++;
        }
        for(int k=0;k<arr1.length;k++){
            System.out.print(arr1[k]+" ");
        }
    }
}