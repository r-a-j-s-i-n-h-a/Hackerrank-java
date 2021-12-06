import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        String C=A+B;
        System.out.println(C.length());
        if(A.compareTo(B)>0)
        System.out.println("Yes");
        else
        System.out.println("No");
        char D= (A.charAt(0));
        char E= (B.charAt(0));
        System.out.println(Character.toUpperCase(D)+A.substring(1)+" "+Character.toUpperCase(E)+B.substring(1));
        
    }
}
