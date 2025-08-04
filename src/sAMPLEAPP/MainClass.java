
package sAMPLEAPP;

import java.util.Scanner;
import BankingAppNiMartin.BankingApp;

public class MainClass {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        BankingApp bank = new BankingApp();
        int attempt = 4;
        
        System.out.println("WELCOME TO MY SYSTEM! ");
        System.out.println("What Do You Want To Do Today?");
        System.out.println("1. Banking");
        System.out.println("2. Shopping");
        System.out.println("3. Pay Bills");
        
        System.out.print("Enter your choice : ");
        int CHOICE = in.nextInt();
        
            switch( CHOICE ){
                case 1:
            while( attempt != 0 ){
                        
           System.out.print("Enter Account No. : ");
       int ACC = in.nextInt();

       System.out.print("Enter Pin No. : ");
                int PIN = in.nextInt();

            if (bank.verify_account(ACC, PIN)){
                                System.out.println("Login Success!");
                                System.exit(0);
                            }
              else{
                                attempt--;
                                            System.out.println("Invalid Account No/Pin! Left Attempt " + attempt);
                                
                            }
                            
           if ( attempt == 0 ){
                                     System.out.println("Try Again later!");
                            }
                    }
                    break;
                    case 2:
                    break;
                    case 3:
                    break;
                    default:
                 
            }
    }
}