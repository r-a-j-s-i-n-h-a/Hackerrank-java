import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
//End of file
public class Solution {

    public static void main(String[] args) {
        Scanner line = new Scanner(System.in);
        int counter = 1;
        
        while (line.hasNextLine()) {
            String l = line.nextLine();

            System.out.println(counter + " " + l);
            counter++;
        }
    }
}
