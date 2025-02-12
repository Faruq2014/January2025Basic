package inheritance;

public class Child extends Parent{

	public static void main(String[] args) {
		Child c=new Child();
		// child class reference and child class constructor
		c.playStation();// this child method
		
		// parent method
		c.house();
		c.bankOfAmerica();
		car();
		
		// this is not recommended
		Parent p =new Parent();
		// parent class reference and parent class constructor
		p.house();
		p.bankOfAmerica();
		car();
		
		
		Parent pc= new Child();
		// parent class reference and child class constructor
		pc.house();
		pc.bankOfAmerica();
		car();
		
		
	}

	

	

	public void playStation() {
		String ps5="play station five";
		System.out.println("Child has "+ps5);
	}
}
