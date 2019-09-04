package mypracticejava1;

public class Sample {
	String name="swati";
	int id=1234;
	String address="mass65";
	int passportno=146736398;
    String emailid="abs@gmail.com";
    int rollno=64775;
	
	
	
	public void getname() {
		System.out.print(name);
	}
	public void getid() {
		System.out.println(id);
	}
	public void getaddress() {
		System.out.println(address);
		
	}
	public void getpassportno() {
		System.out.println(passportno);
	}
    public void getemailid() {
			System.out.println(emailid);
		}
    public void getrollno() {
    	System.out.println(rollno);
    }
		
		
	

	public static void main(String[] args) {
		
        Sample obj =new Sample();
        obj.getname();
        obj.getid();
        obj.getaddress();
        obj.getemailid();
        obj.getid();
        obj.getpassportno();
        obj.getrollno();
        
        
        
        
        
        
	}

}
