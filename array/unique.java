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
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        LinkedHashMap<Integer,Integer>seen=new LinkedHashMap<>();
        for(int c :arr){
            if (seen.containsKey(c)) {
                seen.put(c,seen.get(c) + 1);
            } else {
                seen.put(c, 1);
            }
        }
            
        
        boolean found=false;
        for (Map.Entry<Integer, Integer> entry : seen.entrySet()) {
              if (entry.getValue() == 1) {
                    System.out.print(entry.getKey()+" ");
                    found = true;
            }
        
          }
        if(!found){
            System.out.println("No unique elements in the array");
        }
        }
    }
