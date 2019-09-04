package mypracticejava1;

public class overloading {
	
	
	
	
	public void sum() {//zero parameter
		System.out.println("zero input");
	}
	
	public void sum(int h, String b ) {//double parameter
	System.out.println("zero input");
	}
	public void sum(int a) {//single parameter
		System.out.println("one input");
	}
	public void sum(int u, int k) {//two parameter
		//System.out.println("two input");
		System.out.println(u+k);
	}
	
	public static void main(String[] args) {
		
		overloading o1=new overloading();
		
		o1.sum();
		o1.sum(12);
		o1.sum(23,45);
		o1.sum(23, "hdh");
		
		
	
		
	}

}
