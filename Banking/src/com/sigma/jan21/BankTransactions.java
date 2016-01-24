package com.sigma.jan21;

public class BankTransactions {
private double amount;

public BankTransactions(){
	amount=0;
	
}
public BankTransactions(double amount){
	this.amount=amount;
	
}
public void Deposit(double amount){
	this.amount+=amount;
}

public void withdraw(double amount) throws Nofundsavailablexceptions{
  if(this.amount-amount<=500)
	  throw new Nofundsavailablexceptions()
	  System.out.println("no funds");
  
	//System.out.println("insufficient funds....Please Deposit more funds");
  else
  this.amount-=amount;
 
		
		}	public double getamount() {
			return amount;
		}

		
}



