package com.sigma.jan21;

public class Nofundsavailablexceptions {
	
	public class Nofundsavailablexception extends Exception{

		@Override
		public String getMessage() {
			
			return "Insufficient funds";
		}
	 

	}

}
