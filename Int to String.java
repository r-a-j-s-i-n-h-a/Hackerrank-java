import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        if(a>= -100 && a<=100){
            //String s=Integer.toString(a); 
            System.out.println("Good job");
        }
        else{
            System.out.println("Wrong answer");
        }
    }
}
