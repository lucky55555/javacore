package com.sigma.jan21;

public class BankTest {

	public static void main(String[] args) throws Nofundsavailablexceptions {
		
	BankTransactions b = new BankTransactions();
	
	b.Deposit(1000);
	System.out.println("Balance: "+b.getamount());
	b.Deposit(1000);
	System.out.println("Balance:"+b.getamount());
	b.Deposit(5000);
	System.out.println("Balance:"+b.getamount());
	
	b.withdraw(1000);
	System.out.println("Balance is "+b.getamount());
	
	b.withdraw(2000);
	System.out.println("Balance is "+b.getamount());
	b.withdraw(2000);
	System.out.println("Balance is "+b.getamount());
	}

}
