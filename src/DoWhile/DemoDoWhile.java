package DoWhile;

import java.util.Scanner;

public class DemoDoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char choose;
        do {
            System.out.println("Menu");
            System.out.println("1. Add");
            System.out.println("2. Sub");
            System.out.println("Choose your option from the menu");
            int option = sc.nextInt();
            System.out.println("Enter your first number");
            int num1 = sc.nextInt();
            System.out.println("Enter your Second number");
            int num2 = sc.nextInt();
            switch (option) {
                case 1:
                    int sum = num1 + num2;
                    System.out.println("Result  " + sum);
                    break;
                case 2:
                    int diff = num1 - num2;
                    System.out.println("Result  " + diff);
                    break;
                default:
                    System.out.println("Invalid Input");
            }
            System.out.println("Do you want continue the process Y/N");
            choose = sc.next().charAt(0);
        }
            while (choose == 'y' || choose == 'Y');
                System.out.println("Program terminate.");
                sc.close();

    }
}