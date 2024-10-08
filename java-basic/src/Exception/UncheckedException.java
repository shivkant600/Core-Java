package Exception;

public class UncheckedException {
	
	public static void main(String[] args) {
		
		
		dad();
	}
	
	
	public  static void dad() {
		try {
			mom();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public static void mom() throws Exception {
		son();
	}
	
	
	
	         public static void son()throws Exception{
	        	 
	        	 
		throw new RuntimeException("make mistake");
	}

}
