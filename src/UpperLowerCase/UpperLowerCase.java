package UpperLowerCase;
import java.util.Scanner;

//import static javax.swing.text.rtf.RTFAttributes.BooleanAttribute.True;

public class UpperLowerCase {
    public static void main(String[] args) {
        System.out.println("Enter the two Characters");
        Scanner sc = new Scanner(System.in);
        char obj1 = sc.next().charAt(0);
        //char obj2 = sc.next().charAt(0);

        if (Character.isLowerCase(obj1)) {
            System.out.println(Character.toUpperCase(obj1));
        }
        else if (Character.isUpperCase(obj1)) {
            System.out.println(Character.toLowerCase(obj1));
        }
        else{
            System.out.println("Enter valid inputs");
        }
    }
}