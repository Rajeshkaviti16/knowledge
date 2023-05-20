package OddEven;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number ");
        int num= sc.nextInt();
        if(num%2==0){
            System.out.println("The Given Number is Even");
        }
        else if(num!=0){
            System.out.println("The Given Number is ODD");
        }
        else {
            System.out.println("The Given number is Zero");

        }
    }
}
