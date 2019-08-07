//Input any alphabet from a to f and print their city name accordingly (use if else) any other
//alphabet should be invalid entry
//
import java.util.Scanner;

public class AlphabetCityName {
    public static void main (String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any alphabet from a to f for get city name");
        char x = scanner.next().charAt(0);
        if (x=='a') {
            System.out.println("Ahmedabad");
        }
        else if (x=='b') {
            System.out.println("Bombay");
        }
        else if (x=='c'){
            System.out.println("Calcutta");
        }
        else if (x=='d'){
            System.out.println("Daman");
        }
        else if (x=='e'){
            System.out.println("edar");
        }
        else if(x=='f'){
            System.out.println("faridapur");
        }
        else {
            System.out.println("invalid alphabet");
        }

        }
    }
