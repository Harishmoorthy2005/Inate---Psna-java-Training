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
        char[]c=str.toCharArray();
        HashMap<Character,Integer>seen = new HashMap<>();
        for(char ch:c){
             if (seen.containsKey(ch)) {
                seen.put(ch, seen.get(ch) + 1);
            } else {
                seen.put(ch, 1);
            }
            
        }
        int count=0;
        for(Map.Entry<Character,Integer>entry:seen.entrySet()){
            if(entry.getValue()==2){
                count++;
            }
        }
        System.out.println(count);
    }
}