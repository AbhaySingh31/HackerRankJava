import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        
        //add two strings lemgth
        System.out.println(A.length()+B.length());
        
        //Comparing lexicographically (Alphabetically) two strings
        int i = A.compareToIgnoreCase(B);
        if(i<=0){
            System.out.println("No");
        }
        else if(i>0){
            System.out.println("Yes");
        }
        
        
        // capitalizing first letter of String
        A = A.substring(0,1).toUpperCase() + A.substring(1);
        B = B.substring(0,1).toUpperCase() + B.substring(1);
        System.out.println(A+" "+B);   
    }
}



