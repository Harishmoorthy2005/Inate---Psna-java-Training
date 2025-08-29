import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        
        for(int i=1;i<=n;i++){
            int vale=2,valo=1;
            for(int j=1;j<=i;j++){
                if(i%2!=0){
                    System.out.print(valo);
                    valo=valo+2;
                }
                else{
                    System.out.print(vale);
                    vale=vale+2;
                }
            }
            System.out.println();
        }
    }
}