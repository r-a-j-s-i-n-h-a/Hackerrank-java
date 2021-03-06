import java.io.*;
import java.util.*;
class MyCalculator {

    public void longpower(int n,int p) throws Exception {
        if (n < 0 || p < 0) {
            throw new Exception("n or p should not be negative.");
        } else if (n == 0 && p == 0) {
            throw new Exception("n and p should not be zero.");
        } else {
            int result = (int) Math.pow(n, p);
            System.out.println(result);
        }
    }
    }
    public class Solution {

        public static void main(String[] args) throws Exception {
            Scanner sc = new Scanner(System.in);
            for (int i = 0; i <=6; i++) {
                int n = sc.nextInt();
                int p = sc.nextInt();

                MyCalculator obj = new MyCalculator();
                try {
                    obj.longpower(n, p);
                } catch (Exception e) {
                    System.out.println(e);
                }

            }
        }
    }
