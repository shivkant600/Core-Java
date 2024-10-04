package Bank;

public class Homeloanbank {
	
	public static void main(String[] args) {
		
		
		Bank[]b=new Bank[3];
		
		b[0]=new AxisBank();
		b[1]=new HdfcBank();
		b[2]=new Icicbank();
		
		System.out.println(b[0].intrestrate);
		
		System.out.println(b[1].intrestrate);
		
		
		System.out.println(b[2].intrestrate);
		
		
	}

}
