package com.rays.encup;

public class bankTest {
	public static void main(String[] args) {
		 Bank b=new Bank();
		 
		 b.setbalance(1000);
		 
		 System.out.println(b.getbalance());
		 
		 b.setaccounttype("saving");
		 System.out.println(b.getaccounttype());
		 
		 b.setnumber("sff555");
		 System.out.println(b.getnumber());
		 
		 
		 
	}

}
