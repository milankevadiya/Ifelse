
//WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross salary

import java.util.Scanner;

public class GrossSalary {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Employee id ");
        int a = scanner.nextInt();
        System.out.println("Enter Employee name");
        String name =scanner.next();
        System.out.println(("Enter basic salary"));
        Double salary = scanner.nextDouble();
        Double HRA,DA,TA,PF,GrossSalary;
        System.out.println("HRA = "+(HRA = (salary*10)/100));
        System.out.println("DA = "+ (DA = (salary*8)/100));
        System.out.println("TA = "+ (TA = (salary*9)/100));
        System.out.println("PF = "+(PF=(salary*20)/100));
        System.out.println("Gross salary = "+(GrossSalary=(salary+HRA+DA+TA+PF)));
    }
}
