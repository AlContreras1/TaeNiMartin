
package activityi1;


import java.util.Scanner;


public class Activity2 {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);

     
        System.out.print("Enter Employee Name: ");
        String emName = input.nextLine();
        System.out.print("Enter Hourly Rate: ");
        float hourlyRate = input.nextFloat();
        System.out.print("Enter Total Hours Worked: ");
         float totalHours = input.nextFloat();

       
         float grossWage = hourlyRate * totalHours;
        float sssDeduction = grossWage * 0.10f;
         float netWage = grossWage - sssDeduction;

       
        System.out.println("\n------------ Wage Summary --------------");
        
          System.out.println("Employee Name:   " + emName);
         System.out.println("Hourly Rate:    " + hourlyRate);
          System.out.println("Hours Worked:   " + totalHours);
         System.out.println("Gross Weekly Wage:  " + grossWage);
         System.out.printf("SSS Deduction (10%%): P.2f\n", sssDeduction);
         System.out.println("-------------------------------------------");
          System.out.printf("Net Weekly Wage:   P.2f\n\n " + netWage);
    }
}