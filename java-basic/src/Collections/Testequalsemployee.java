package Collections;

public class Testequalsemployee {
	public static void main(String[] args) {
		
		Employee e = new Employee(1,"shivam",45000);
		Employee e2 = new Employee(2,"rohit",75000);
		
		System.out.println(e.equals(e2));
		
		
		System.out.println(e.hashCode());
		
		System.out.println(e2.hashCode());
	}

}
