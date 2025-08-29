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
        sc.nextLine(); 
        for (int i=0; i<n; i++) {
            String str = sc.nextLine();
            if (str.equalsIgnoreCase("yes")) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        
    }
}



