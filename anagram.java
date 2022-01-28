import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
         a=a.toLowerCase(); 
         b=b.toLowerCase();
        int flag=0;
        int l=a.length();
        int m=b.length();
         if(l != m){
            flag=1;
         }
         else{
             
             for(char j='a';j<='z';j++){
                 int x=0;
                 int y=0;
                for(int i=0;i<l;i++){
                    if(a.charAt(i)==j)
                        x++;
                    if(b.charAt(i)==j)
                        y++;
             }
             if(x!=y)
                    {
                        flag=1;
                        break;
                    }
         }
         
    
    }
    if(flag == 1){
                 return false;
             }
         else{
                 return true;
             }
    }
 
    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
