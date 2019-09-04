package mypracticejava1;

public class Inheritance {
	String icici="deposit";
	String hdfc="statement";
	String abn="loan";
	
	
	
	
	public void icici() {
		System.out.println(icici);
		
	}
	public void hdfc() {
		System.out.println(hdfc);
	}
	public void abn() {
		System.out.println(abn);
	}

	public static void main(String[] args) {
		
             Inheritance p1=new Inheritance();
            p1.abn();
             p1.hdfc();
             p1.icici();
             
             
             
	}

}

