/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lit Shah
 */
import java.util.Scanner;
public class Account {
    Scanner input = new Scanner(System.in);
    private 
            int totalBalance,note;
            Cash cash;
            Checking chk;
    public
                    
            Account(){
                note=0;
                cash = null;
                chk = null;
                totalBalance = 500;
            }
            void withDraw(int withdrawAmount){
                if(withdrawAmount>=500)
                totalBalance-=withdrawAmount;
            }
            void depositAmount(){
                
                System.out.println("Enter 1 for Check Deposit.\n"
                        + "Enter 2 for Cash Deposit.\n");
                int select = input.nextInt();
                if(select==1){
                    chk = new Checking();
                    System.out.println("Enter Check Amount:");
                    note = input.nextInt();
                    chk.enterAmount(note);
                     setTotalBalance(chk.getDepositAmount());
                }
                if(select==2){
                System.out.println("Enter total cash notes:");
                    note = input.nextInt();
                    cash = new Cash(note);
                    System.out.println("Enter Note Amount:");
                    note = input.nextInt();
                    cash.EnterAmountOfBill(note);
                    setTotalBalance(cash.getDepositAmount());
                }
               
                
            }
            void setTotalBalance(int b){
                totalBalance = b;
            }
            int getBalance(){
                return totalBalance;
            }
       
}
