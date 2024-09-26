package com.rays.encup;

public class bankDepositTest {

	public static void main(String[] args) {
		
		bankDeposite b=new bankDeposite();
		
		b.setnumber("dgg5555");
		System.out.println(b.getnumber());
		
		b.Setaccounttype("saving");
		System.out.println(b.getaccounttype());
		
		b.setbalance(1000);
		System.out.println(b.getbalance());
		
		
		System.out.println("------------------------");
		
		System.out.println(b.deposite(500));
		
		System.out.println(b.withdraw(100));
	
	}
}
