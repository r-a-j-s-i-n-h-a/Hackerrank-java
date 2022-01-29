import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int [n];
        for(int  i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        int largest = arr[0];
        int smallest = arr[0];
        for(int i = 0 ; i < n ; i++){
           if(arr[i] > largest)
            largest = arr[i];
          else if (arr[i] < smallest)
            smallest = arr[i];
        }
        System.out.println(smallest);
        System.out.println(largest);
    
    }
}
