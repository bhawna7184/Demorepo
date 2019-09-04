package mypracticejava1;

public class Testcar {
	
	
	public static void main(String[] args) {
		
		
	//static polymorphism	
	Bmw b1=new Bmw();
	b1.start();   //reffering to child class
	b1.stop();
	b1.refill();
	b1.safety();
	b1.security();
	
	System.out.println("*****");
	
	
	Car c1=new Car();
	c1.start();
	//c1.safety();
	//c1.security();
	c1.stop();
	c1.refill();
	
	
	System.out.println("******");
	
	Car c2=new Bmw();//child class object can be refferd by parent class reference variable is called dynamic polymorphism 
	
	c2.start();
	c2.stop();
	c2.refill();
	//c2.safety();
	//c2.security();
	
	
			
		
		}
	
	
		
		
		
		
	}


