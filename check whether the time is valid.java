import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in=new Scanner(System.in);
        String str=in.next();
        String[] sep=str.split(":");
        int h=Integer.parseInt(sep[0]);
        int m=Integer.parseInt(sep[1]);
        int s=Integer.parseInt(sep[2]);
        if(h>=0&&h<24 && m>=0&&m<60 &&s>=0&& s<60)
            System.out.println("Valid");
        else  
              System.out.println("Not Valid");
    }
}
