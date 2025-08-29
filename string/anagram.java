import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String s1=sc.nextLine().replaceAll("\\s","");
        String s2=sc.nextLine().replaceAll("\\s","");
        String s3=s1.toLowerCase();
        String s4=s2.toLowerCase();
      
        if(s1.length()!=s2.length()){
            System.out.println(s1+" and "+s2+" are Not Anagrams.");
            return;
        }
        int[] count=new int[26];
        for(int i=0;i<s1.length();i++){
            count[s3.charAt(i)-'a']++;
            count[s4.charAt(i)-'a']--;
        }
       
        for(int i=0;i<26;i++){
            if(count[i]!=0){
                System.out.println(s1+" and "+s2+" are Not Anagrams.");
                return;
            }
            
        }
        
            System.out.println(s1+" and "+s2+" are Anagrams.");
        
    }
}