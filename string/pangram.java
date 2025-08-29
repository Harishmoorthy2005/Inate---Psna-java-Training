import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toLowerCase().replaceAll("\\s", "");

        boolean range = isrange(str, 'a', 'z');
        if(range) {
            System.out.println("Pangrams");
        } else {
            System.out.println("Not Pangrams");
        }
    
    }
    public static boolean isrange(String str,char start,char end){
        boolean[] found = new boolean[end - start + 1];
        int count=0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= start && c <= end) {
                int index = c - start;
                if (!found[index]) {
                    found[index] = true;
                    count++;
                    if (count == found.length) { 
                        return true;
                    }
                }
            }
        }
        return false; 
    }
}