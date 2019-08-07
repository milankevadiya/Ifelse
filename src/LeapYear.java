import java.util.Scanner;

//WAP to input any year like 1989 and find out if it is leap year

public class LeapYear {
    public static void main (String args[]){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter any of the year of check leap year");
        int a = scanner.nextInt();
        System.out.println((a%4==0)? "Entered year is a leap year":"Entered year is not a leap year");
    }
}
