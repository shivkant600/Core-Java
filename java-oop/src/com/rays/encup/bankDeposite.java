package com.rays.encup;

public class bankDeposite {
	 private String number;
	 private String accounttype;
	 private double balance;
	 
	 public void setnumber(String number) {
		 this.number=number;
	 }
	 
	 
	 public String getnumber() {
		 
		return this.number;
	 }

	 public void Setaccounttype(String accounttype) {
		 this.accounttype=accounttype;
	 }
	 
	 public String getaccounttype() {
		 return this.accounttype;
				 
	 }
	 
	 public String  getaccount() {
		 return this.accounttype;
	 }
	 
	 public void setbalance(double balance) {
		 this.balance=balance;
	 }
	 
	 public double getbalance() {
		 return this.balance;
	 }
	 
	 
	 public double deposite(double depo) {
		 return this.balance+depo;
		 
	 }
	 
	 public double withdraw(double with) {
		 return this.balance-with;
	 }
	 
}
