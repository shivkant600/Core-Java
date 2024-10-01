

package com.rays.encup;

public class Bank {
   
	
    private double balance; 
 
    private String accountType; 
   
    private String number;

   
    public void setbalance(double balance) {
        this.balance = balance; // Balance ko set karna
    }

    // Balance prapt karne ka method (balance prapt karne ke liye)
    public double getbalance() {
        return this.balance; // Current balance return karna
    }

    // Account type set karne ka method (account type set karne ke liye)
    public void setaccounttype(String accounttype) {
        this.accountType = accounttype; // Account type ko set karna
    }

    // Account type prapt karne ka method (account type prapt karne ke liye)
    public String getaccounttype() {
        return this.accountType; // Current account type return karna
    }

    // Account number set karne ka method (account number set karne ke liye)
    public void setnumber(String number) {
        this.number = number; // Account number ko set karna
    }

    // Account number prapt karne ka method (account number prapt karne ke liye)
    public String getnumber() {
        return this.number; // Current account number return karna
    }
}


















