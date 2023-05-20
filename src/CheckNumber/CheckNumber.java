package CheckNumber;

import java.util.Scanner;

public class CheckNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int number= sc.nextInt();
        if(number<0){
            System.out.println("The given Number is Negative");
        }
        else if(number>0){
            System.out.println("The Given Number is Positive");
        }
        else{
            System.out.println("The Given Number is Zero");
        }

    }
}
