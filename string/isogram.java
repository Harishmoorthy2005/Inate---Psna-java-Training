import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        char[] c = str.toCharArray();
        Arrays.sort(c);
        boolean flag=false;
        for(int i=0;i<c.length-1;i++){
            if(c[i]==c[i+1]){
                flag=true;
                break;
            }
            
        }
        if(!flag){
            System.out.println("ISOGRAM");
        }
        else{
            System.out.println("NOT ISOGRAM");
        }
        
    }
}