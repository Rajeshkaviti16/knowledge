package Format;

import java.util.Scanner;

public class DemoFormat {
    public static void main(String[] args){
      /*if(args.length==0){
        System.out.println("Please enter integer number");
            return;
       }*/
       System.out.println("enter the number");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        //int num = Integer.parseInt(args[0]);
        for(int i=1;i<=num;i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
