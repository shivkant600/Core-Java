package Exception;

public class ExceptionTest {
	public static void main(String[] args) {
		
		
		int i=5;
		String Str=null;
		
		try {
			System.out.println(i/5);
			
			System.out.println(Str.length());
		}
		
		//catch(ArithmeticException a){
			//System.out.println(a.getMessage()+"   arthimaic ");
		//}
		
		
		catch(NullPointerException e){
			System.out.println(e.getMessage()+"  null point");
		}
		
		finally {
			System.out.println("this is finally block");
		}
		System.out.println("hello");
	}

}
