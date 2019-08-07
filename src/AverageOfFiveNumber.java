//WAP input any five number and then find average of five numbers
import java.util.Scanner;

public class AverageOfFiveNumber {
    public static void main (String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any five Number for find average");
        float a = scanner.nextFloat();
        float b = scanner.nextFloat();
        float c = scanner.nextFloat();
        float d = scanner.nextFloat();
        float e = scanner.nextFloat();
        float average;
        System.out.println("Average of five number is "+ (average=(a+b+c+d+e)/5));
    }
}
