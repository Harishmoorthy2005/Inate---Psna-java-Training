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
        int counte=0;
        int counto=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            if(arr[i]%2==0){
                counte++;
            }
        }
        System.out.println("Odd = "+(n-counte));
        System.out.println("Even = "+counte);
    }
}