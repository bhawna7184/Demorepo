package mypracticejava1;

public class Child extends Inheritance{
	String sbi="insurance";
	String syndicate="goldloan";
	String pnb="carinsurance";
	
	
	public void sbi() {
		System.out.println(sbi);
		
	}
	
	public void syndicate() {
		System.out.println(syndicate);
		
	}
	public void pnb() {
		System.out.println(pnb);
		
	}

	public static void main(String[] args) {
		Child c1=new Child();
		c1.syndicate();
		c1.sbi();
		c1.pnb();
		c1.abn();
		c1.icici();
		c1.hdfc();

	}

}
