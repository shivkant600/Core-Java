package Exception;

public class LoginTestexception {
	public static void main(String[] args) {
		
		
		 String login ="abc";
		 
		 if(login !="sdj") {
			 
			 try {
				 throw new LoginException("invalid login id password");
			 }
			 
			 catch(LoginException e) {
			//	 e.printStackTrace();
				 e.getMessage();
			 } 
		 }
		 
		 else{
				 System.out.println("login successful");
		  }
		 }
		
	}


