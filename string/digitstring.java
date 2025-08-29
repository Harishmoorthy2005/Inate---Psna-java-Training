import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int u=0;
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(Character.isDigit(c)){
                u=1;
                
                 System.out.print(c);
            }
           
            
        }
        if(u==0){
             System.out.print("0");
        }
       
    }
}