//WAP to input any number and fid our if it is positive , negative or zero

import java.util.Scanner;

public class PositiveNegativeZero {
    public static  void main (String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any value for find it is Positive, Negative or Zero");
        float a =scanner.nextFloat();
        if (a>0) {
            System.out.println("Entered Value is Positive");
        }
        else if(a<0) {
            System.out.println("Entered value is negative");

        }
        else {
            System.out.println("Entered value is Zero");
        }
    }
}
