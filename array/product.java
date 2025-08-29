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
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print(arr[0]*arr[1]+" ");
        for(int i=1;i<n-1;i++){
            System.out.print(arr[i-1]*arr[i+1]+" ");
        }
        System.out.print(arr[n-2]*arr[n-1]+" ");
    }
}