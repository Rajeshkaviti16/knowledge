package SumOfNumbers;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args){
        System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
        String num=sc.nextLine();
        int sum=0;
        for(int i=0; i<num.length(); i++){
            int digit=Integer.parseInt(String.valueOf(num.charAt(i)));
            sum=sum+digit;
        }
        System.out.println("Sum of digits "+sum);
    }
}
