import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a= sc.nextInt();
    int c=0;
    
int arr[]=new int[a];
for(int i=0;i<a;i++){
    arr[i]=sc.nextInt();
}
for(int j=0;j<a;j++){
        int b=0;
    for(int k=j;k<a;k++){
       b=arr[j]+b;
       if(b<0){
           c++;
       }
        
    }
}
System.out.println(c);
        
    }
}
