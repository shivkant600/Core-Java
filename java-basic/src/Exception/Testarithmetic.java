package Exception;

public class Testarithmetic {

	public static void main(String[] args) {
		
		int k=0;
		int i=15;
		
		
		
		try {
			
			double div =i/k;
			System.out.println("divide"+  div);
		}
		
		catch(ArithmeticException e) {
			System.out.println(e.getMessage()+ "  divide by zero");
	}
		
	}
}
