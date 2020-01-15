import java.io.*;
import java.util.*;

public class Solution {

    public static String palindrome(String A){
        int i = 0,j = A.length()-1;
        while(i<j){
            if (A.charAt(i)!=A.charAt(j)){
               return "No";
            }
        i++;
        j--;
        }
        return "Yes";
    }

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        System.out.println(palindrome(A));
        
    }
}



