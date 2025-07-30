import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner in=new Scanner(System.in);
        long n=in.nextLong();
       long ld,p=1;
        long cpy=n;
        
        while(n>0){
            n=n/10;
            p=p*10;
        }
        p=p/10;
        n=cpy;
        
        while(p>0){
            ld=n/p;
            n=n%p;
            p=p/10;
            if(ld==2 || ld==3 || ld ==5||ld==7)
                 System.out.print(ld+" ");
        }
    }
}
