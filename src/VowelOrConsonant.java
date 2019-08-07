//Write a Java program that takes the user to provide a single character from the
  //      alphabet. Print Vowel or Consonant, depending on the user input

import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter any letter for check Vowel or Consonant");
        char c = scanner.next().charAt(0);
        if (c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
            System.out.println("Input letter is Vowel");
        }else{
            System.out.println("Input letter is Consonant");
        }
    }
}
