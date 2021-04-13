/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lit Shah
 */
public class Deposit{
          protected
                  int depositAmount;
          public
                  Deposit(){
                  depositAmount=0;
                  }
                  void setDepositAmount(int dA){
                  depositAmount+=dA;
                  }
                  int getDepositAmount(){
                  return depositAmount;
                  }
                  
}
