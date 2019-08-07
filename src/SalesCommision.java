//WAP input sales id, seller's name, sales amount, salary basic and then find this sales
//commission

import java.util.Scanner;

public class SalesCommision {
    public  static void main (String args[]){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter Sales id");
        int a= scanner.nextInt();
        System.out.println("Enter Seller Name");
        String name = scanner.next();
        System.out.println("Enter Total Sales amount");
        Double Salesamount = scanner.nextDouble();
        System.out.println("Enter seller's basic salary");
        Double Basicsalary = scanner.nextDouble();
        if(Salesamount>=50000){
            System.out.println("sales commission is "+ (Salesamount*35)/100);
        }
        else if(Salesamount>=30000){
            System.out.println("Sales commission is "+(Salesamount*20)/100);
        }
            else if (Salesamount>=20000){
            System.out.println("Sales Commission is "+ (Salesamount*10)/100);
        }
            else if (Salesamount>=10000){
            System.out.println("Sales Commission is "+ (Salesamount*5)/100);
        }
            else{
            System.out.println("Sales Commission is "+ (Salesamount*2)/100);
        }

    }
}
