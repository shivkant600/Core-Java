package Exception;

public class MUltiexceptionhandling {
	public static void main(String[] args) {
		
		String name ="vijay";
		
		try {
			System.out.println(name.length());
			
			System.out.println(name.charAt(6));
		}
		catch(NullPointerException e) {
			System.out.println(e.getMessage()+"name cannot be null");
			
		}
		
		
		catch(StringIndexOutOfBoundsException e) {
			System.out.println(e.getMessage()+ "  String is small");
		}
		
	}

}
