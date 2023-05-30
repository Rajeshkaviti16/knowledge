package SwitchCondition;

import java.util.Scanner;

public class ColorCode {
    public static void main(String[] args){
        System.out.println("Enter the ColoCode");
        Scanner sc=new Scanner(System.in);
        char color=sc.next().charAt(0);
        String colorName;
        switch(color){
            case 'R': colorName="RED";
            break;
            case 'B': colorName="BLUE";
            break;
            case 'W': colorName="WHITE";
            break;
            case 'Y': colorName="YELLOW";
            break;
            case 'G': colorName="Green";
            break;
            case 'O': colorName="Orange";
            break;
            default : colorName="Invalid Color";
            break;
        }
        System.out.println("ColorName is "+ colorName);
    }
}
