package Arguments;

import java.util.Scanner;
public class CommandLineArgument {
    public static void main(String[] args){
        //Scanner sc=new Scanner(System.in);
        //System.out.println("Enter the args");
       // String args=sc.nextBigInteger().toString();
        if (args.length==0){
            System.out.println("NO Values");
        }
        else{
            //for (String i: args){
              //System.out.print(i+",");
            System.out.println(String.join(",",args));
            }
        }
    }
