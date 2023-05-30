package Plaindrome;
import java.util.Scanner;

public class DemoPalindrome {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        boolean isPalindrome = true;
        for (int i = 0, j = num.length() - 1; i < j;  i++,j--) {
                if (num.charAt(i) != num.charAt(j)) {
                    isPalindrome = false;
                    break;
                }
        }
        if (isPalindrome) {
            System.out.println(num + " is  palindrome");
        } else {
            System.out.println(num + "  is not palindrome");
        }
    }
}
