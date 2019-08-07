//WAP to input student name, roll no, 3 subjects marks..and find out total, percentage and result if
//he is pass or fail on basis of percentage (pass>=35) and also give them grade

import java.util.Scanner;

public class PercentageWiseResult {
    public static float percentage;
    public static int maths;
     static int english;
    public static int science;

    public static void main(String args[]) {


        studenresult();
        Result();

    }

    public static void studenresult() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter student name");
        String name = scanner.next();
        System.out.println("Enter Student Rol no.");
        int rollno = scanner.nextInt();
        System.out.println("Enter marks of subject Maths");
        int maths = scanner.nextInt();
        System.out.println("Enter marks of the subject English");
        int english = scanner.nextInt();
        System.out.println("Enter marks of the subject Science");
        int science = scanner.nextInt();
        int total;
        System.out.println("Total =" + (total = maths + english + science));
        System.out.println("Percentage =" + (percentage = total / 3));
    }

    public static void Result() {
        if (percentage >= 80) {
            System.out.println("Pass grade A+");
        } else if (percentage >= 60) {
            System.out.println("Pass Grade A");
        } else if (percentage >= 50) {
            System.out.println("Pass Grade B");
        } else if (percentage >= 35) {
            System.out.println("Pass Grade C");
        } else {
            System.out.println("Fail");
        }
    }
}