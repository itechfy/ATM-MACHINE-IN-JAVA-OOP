/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lit Shah
 */
public class Cash extends Deposit {
    protected 
                    int totalBills;
    public
                    Cash(){
                    totalBills=0;
                    }
                    Cash(int totalNote){
                    totalBills=totalNote;
                    }
            void EnterAmountOfBill(int billAmount){
                
                if(billAmount>500){    
                if(totalBills>0){
                    setDepositAmount(totalBills*billAmount);    
                }
                
                }
            }
         
}
