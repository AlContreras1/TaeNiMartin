package activityi1;

import java.util.Scanner;

public class Activityi1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
            int subjects;
        float Total = 0, Average, Grade;
        
        
        String name;
       
        System.out.println("Enter Student name: ");
           name = input.nextLine();

       
        System.out.println("Enter number of subjects: ");
            subjects = input.nextInt();

      
        for (int i = 1; i <= subjects; i++) {
            System.out.println("Enter Grade for sub" + i + ":");
                 Grade = input.nextInt();
            Total += Grade;
        }

       
        Average = Total / subjects;

      
        System.out.println("Average: " + Average);

      
        if (Average >= 70) {
            System.out.println("Remarks: PASSED");
            } else {
            System.out.println("Remarks: FAILED");
        }
       
    }
}