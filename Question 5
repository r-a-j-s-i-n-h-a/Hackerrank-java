/*Q7. Create a class named 'Programming'. While creating an object of the class, if nothing is passed to it,
 then the message "I love programming languages" should be printed. If some String is passed to it, then in place
 of "programming languages" the name of that String variable should be printed.
For example, while creating object if we pass "Java", then "I love Java" should be printed.*/

import java.util.Scanner;

public class Programming {

    public void display1(String s){
        System.out.println("i love programming language ");
    }

public void display(String s){
    System.out.println("i love "+s);
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Programming obj = new Programming();
        if(s.length()>0){
            obj.display(s);
        }
        else{
           obj.display1(s);
        }

    }


}
