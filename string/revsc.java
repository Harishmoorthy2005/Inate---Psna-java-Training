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
        char[] chars=str.toCharArray();
        int left=0;
        int right=str.length()-1;
        while(left<right){
            if(!Character.isLetterOrDigit(chars[left])){
                left++;
            }
            else if(!Character.isLetterOrDigit(chars[right])){
                right--;
            }
            else{
                char temp=chars[left];
                chars[left]=chars[right];
                chars[right]=temp;
                right--;
                left++;
            }
        }
        System.out.println(new String(chars));
    }
    
}