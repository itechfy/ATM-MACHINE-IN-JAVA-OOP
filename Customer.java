/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lit Shah
 */
public class Customer {
    private 
            Account a;
    public 
            Customer(){
            a = new Account();
            }
            void Deposit(){
            a.depositAmount();
            }
            void Withdraw(int withdraw){
            a.withDraw(withdraw);
            }
            void Display(){
            System.out.println(a.getBalance());
            }
            
            
}
