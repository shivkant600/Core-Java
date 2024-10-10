package Exception;

public class TestAccount {
	public static void main(String[] args) throws InsufficientFundException {
		
		Account a=new Account();
		
		a.setBalance(5000);
		System.out.println("total balance "+a.getBalance());
		
		a.setAccounttype("saving account");
		
		System.out.println("account type "+a.getAccounttype());
		
		a.setName("shivkant123");
		System.out.println("account name "+a.getName());
		
		
		System.out.println("------------");
		
		
		a.deposite(500);
		System.out.println("total amount after deposit"+a.getBalance());
		
		a.withdraw(6000.0);
		
		System.out.println("final amount"+a.getBalance());
		
	}

}
