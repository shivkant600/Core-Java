package Collections;

public class Employee {
	private int id;
	private String name;
	private int salary;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	public Employee(int id,String name,int salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;
	}

	
	@Override
	public boolean equals(Object obj) {
		Employee e =(Employee) obj;
		
		
		return this.id==e.id && this.name==e.name && this.salary==e.salary;
	}
	
	@Override
	public int hashCode() {
	String value=this.id+this.name+this.salary;
		return value.hashCode();
	}

	
}
