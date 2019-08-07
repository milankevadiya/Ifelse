//WAP to input any two numbers and then print their interchanged value
// import java.util.Scanner;

import java.util.Scanner;

public class InterchangeValue {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter value of a");
        int a = scanner.nextInt();
        System.out.println("Enter value of b");
        int b = scanner.nextInt();
       int temp;
       temp=a;
       a=b;
       b=temp;
        System.out.println("value of a =" + a);
        System.out.println("Value of b =" + b);
    }
}
