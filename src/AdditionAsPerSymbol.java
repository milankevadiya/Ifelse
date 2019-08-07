//WAP to input enter any two number and ask user to enter their symbol (+, -, /, *) find addition,
//subtraction, multiplication and division according to their symbol (using if else)


import java.util.Scanner;

public class AdditionAsPerSymbol {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first value");
        int a = scanner.nextInt();
        System.out.println("Enter second value");
        int b = scanner.nextInt();
        System.out.println("Enter any symbol for calculation + , - , / ,* ");
        char c = scanner.next().charAt(0);

        if (c == '+') {
            System.out.println("Addition of a and b = " + (a + b));
        } else if (c == '-') {
            System.out.println("Substraction of a and b = " + (a - b));
        } else if (c == '*') {
            System.out.println("Multiplication of a and b = " + (a * b));
        } else {
            System.out.println("Deivision of a and b = " + (a / b));
        }

    }

}

