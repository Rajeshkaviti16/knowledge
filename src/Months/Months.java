package Months;

import java.util.Scanner;

public class Months {
    public static void main(String[] args){
        System.out.println("Enter the Number");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        String month;
        switch(num){
            case 0 :  month="Enter the number";
            break;
            case 1: month="January";
            break;
            case 2: month="February";
            break;
            case 3: month="March";
            break;
            case 4: month="April";
                break;
            case 5: month="May";
                break;
            case 6: month="June";
                break;
            case 7: month="July";
                break;
            case 8: month="August";
                break;
            case 9: month="September";
                break;
            case 10: month="October";
                break;
            case 11: month="November";
                break;
            case 12: month="December";
                break;
            default: month="Invalid Input";
            break;
        }
        System.out.println("The month is "+month);
    }
}
