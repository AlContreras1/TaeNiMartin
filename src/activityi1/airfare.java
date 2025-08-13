package Activityi1;

import java.util.Scanner;


public class airfare {
   
    public static void main(String[] args) {
 Scanner input = new Scanner(System.in); 
 float result;
 float discount;
 
        System.out.println("Enter Distance(km): ");
       int distance = input.nextInt();
        
        System.out.println("Class (1 or 2): ");
       int ClassType = input.nextInt();
       
       if (ClassType == 1){
           result = 250 * distance;
        if (distance >= 1000){
            discount = result * 0.10f;
            result -= discount;
            
        }
           
           System.out.println("total Fare: " + result);
       }else if (ClassType == 2){
           result = 500 * distance;
           
           if (distance >1000){
               discount = result * 0.10f;
               result -= discount;
           }
           
           System.out.println("total Fare: "+ result);
       }else {
           System.out.println("Invalid Class Selected!");
       }
               
       
       
       
     
        
    }
}