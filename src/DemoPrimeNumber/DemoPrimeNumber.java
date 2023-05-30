package DemoPrimeNumber;

import java.util.Scanner;

public class DemoPrimeNumber {
    public static void main(String[] args) {
        System.out.println("Enter the Number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean flag = false;
       if(num==2){
            System.out.println("It is Prime Number");
        }
        else if (num == 0 || num==1) {
            System.out.println(num+" It is neither Prime nor composite");
        }
        else {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    System.out.println("It is not a Prime Number");
                    break;
                } else {
                    System.out.println("It is a Prime Number");
                    break;
                }
            }
        }
    }
}
