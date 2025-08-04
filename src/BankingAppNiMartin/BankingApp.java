
package BankingAppNiMartin;


public class BankingApp {
    
    int ACCNO = 999;
    float BALANCE;
    int PIN = 999;
    
        public boolean verify_account( int ACC, int PASS){
        
       if (ACCNO == ACC && PIN == PASS ){
                
       return true;
            }
            else{
       return false;
            }

        }
        public void withdraw(){


        }
        public void changepin(){


        }
            
}
