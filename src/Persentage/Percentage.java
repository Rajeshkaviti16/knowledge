package Persentage;

import java.util.Scanner;

public class Percentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Gender type");
        String str = sc.nextLine();
        System.out.println("Enter the age");
        int age = sc.nextInt();
        if (str.equals( "Male")) {
            if (age > 1 && age <= 60) {
                System.out.println("Percentage is 9.2%");
            } else if (age > 60 && age <= 120) {
                System.out.println("Percentage is 8.3");
            } else {
                System.out.println("Provide valid age");
            }
        } else if (str.equals("Female")) {
            if (age > 1 && age <= 58) {
                System.out.println("Percentage is 8.2%");
            } else if (age > 58 && age <= 120) {
                System.out.println("Percentage is 7.6");
            } else {
                System.out.println("Provide valid age");
            }

        } else {
            System.out.println("Provide the valid Gender");
        }
    }
}
