//same as above but pass or fails on the basis of..student needs to pass all the subjects

import java.util.Scanner;

public class PassAllSubject {
    public static float percentage;

    public static void main(String args[]) {
        Student();

    }
        public static void Student() {
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

            if (maths >= 35 && english >= 35 && science >= 35) {
                System.out.println("Pass");
            } else {
                System.out.println("Fail");
            }
        }

    }


