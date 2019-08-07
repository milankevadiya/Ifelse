//Write Java program to allow the user to input his/her age. Then the program will show if the
//person is eligible to vote. A person who is eligible to vote must be older than or equal to 18 years
//old.


import java.util.Scanner;

public class EligbleForVote {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age");
        int a = scanner.nextInt();
        if(a>=18) {
            System.out.println("You are eligble for vote");
        }else{
            System.out.println("you are not eligble for vote. you must be 18 year old");
            }
        }
    }

