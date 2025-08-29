import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count=1;
        StringBuilder seen = new StringBuilder();
        for(int i=1;i<=str.length()-1;i++){
            if(str.charAt(i)==str.charAt(i-1)){
                count++;
            }
            else{
            seen.append(str.charAt(i-1)).append(count);
                count=1;
            }
        }
         seen.append(str.charAt(str.length()-1)).append(count);
        
        System.out.println(seen);
    }
}