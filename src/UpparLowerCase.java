//input any alphabet in uppercase and print it in lowercase

import java.util.Scanner;

public class UpparLowerCase {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter upperCase character");
        char ch = scanner.next().charAt(0);
        int temp = ch;
        temp = temp+32;
        ch = (char)temp;
        System.out.println("entered Uppercase character in lowercase = "+ ch);
    }
}
