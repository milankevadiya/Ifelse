import java.util.Scanner;
//Input any two number and find out its odd or even use turnery operator (? :)

public class EvenOddTurnOperator {
    public static void main (String args[])
    {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter first value");
        int a = scanner.nextInt();
        System.out.println((a%2==0) ?"Entered value is Even":"Entered value is odd" );

        System.out.println("Enter Second value");
        int b = scanner.nextInt();

        System.out.println((b%2==0) ?"Entered value is Even":"Entered value is odd" );
    }
}
