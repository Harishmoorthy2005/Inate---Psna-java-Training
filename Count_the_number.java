import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in=new Scanner(System.in);
        long val=in.nextLong();
        int n=in.nextInt();
        long ld;int count=0;
        while(val>0){
             ld=val%10;
            val=val/10;
            if(ld==n){
                count++;
            }
        }
        System.out.println(count);
    }
}
