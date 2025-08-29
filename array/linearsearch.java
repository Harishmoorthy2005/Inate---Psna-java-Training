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
        int []arr=new int[n];
        
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        boolean isfound=false;
        for(int i=0;i<n;i++){
            if(arr[i]==target){
                isfound=true;
                break;
            }
           
        }
        if(isfound){
            System.out.println("Found");
        }
        else{
            System.out.println("Not found");
        }
    }
}