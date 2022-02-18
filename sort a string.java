import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine().trim());
        while(t-- > 0){
            String s = sc.nextLine().trim();
            Solution obj = new Solution();
            System.out.println(obj.sort(s));
        }
    }
}

class Solution 
{ 
    String sort(String s) 
    {
        
        char ch[] = s.toCharArray();
        Arrays.sort(ch);
        String S = new String(ch);
        return S;
    }
} 
