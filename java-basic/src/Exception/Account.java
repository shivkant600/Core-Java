package Exception;

public class Account {
	private double balance;
	private String name;
	private String accounttype;
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAccounttype() {
		return accounttype;
	}
	public void setAccounttype(String accounttype) {
		this.accounttype = accounttype;
	}
	
	public double deposite(double amount) {
		return  this.balance=this.balance+amount;
	}
	
	
	
	
	public double withdraw(double amount) throws InsufficientFundException {
		
		if(amount>this.balance) {
			throw new InsufficientFundException("insufficient funds transfere");
		}
		
		else {
			return this.balance=this.balance+amount;
		}
		
		
	}

}
