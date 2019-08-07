//Enter any value and the find out if it is number (0-9) or an alphabet or symbol

import java.util.Scanner;

public class AlphabetOrSymbol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any value to find out it is number,alphabet or symbol");
        char c = scanner.next().charAt(0);
        if(c>=48 && c<=57){
            System.out.println("Entered value is Number");
        }
        else if ((c>=65 && c<=90)||(c>=97 && c<=122)){
            System.out.println("Enter value is alphabet");
        }
        else {
            System.out.println("entered value is symbol");
        }

    }
}
