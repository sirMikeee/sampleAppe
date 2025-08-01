
package sampleappe;

import java.util.*;
import banking.bankingApp;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("WELCOME TO MY SYSTEM!");
        System.out.println("What do you feel like doing today?");
        System.out.println("1. Banking");
        System.out.println("2. Shopping");
        System.out.println("3. Order Food");
        
        System.out.print("Enter choice: ");
        int selection = sc.nextInt();
        
            switch(selection){
                case 1:
                    bankingApp bapp = new bankingApp();
                        System.out.print("Enter account no: ");
                        int acct = sc.nextInt();
                        System.out.print("Enter pin: ");
                        int pin = sc.nextInt();
                        
                            if(bapp.verifyAcc(acct, pin)){
                                System.out.println("LOGIN SUCCESS");
                            }else{
                                System.out.println("INVALID ACCOUNT!");
                            }
                        
                        

                    break;
                case 2:
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Invalid Selection");
            
            }
        
    }
    
}
