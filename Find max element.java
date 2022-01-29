import java.util.Arrays;
  
public class GFG {
    public static void main(String[] args){
        int arr[] = {10, 324, 45, 90, 9808};
        int max = Arrays.stream(arr).max().getAsInt();
        System.out.println("Largest in given array is " +max);
    }
  
}
