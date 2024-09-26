package com.rays.encup;

public class Bank {
   private double balance;
   private String accountType;
   private String number;
   
     public void setbalance(double balance) {
    	 this.balance=balance;
     }
   
     public double getbalance() {
    	 return this.balance;
     }
   
   public void setaccounttype(String accounttype) {
	   this.accountType=accounttype;
   }
   
   
   public String getaccounttype() {
	   return this.accountType;
   }
   
   public void setnumber(String number) {
	   this.number=number;
   }
   
   public String getnumber() {
	   return this.number;
   }
   
   
   
   
   
}
