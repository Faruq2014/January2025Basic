package variable;

public class InstanceVariable {
	// Instance variable is inside the class and outside of any method
	// it is own by the class
	// must declare data type == String
	// must have variable name=firstName (camel casing)
	// instance variable -- declare value(initialization) is optional-- not prefer
	// any access modifier is allow
	
	private String firstName;

	public static void main(String[] args) {
		InstanceVariable iv= new InstanceVariable();
		iv.fima();
		iv.nisa();

	}
	
	public void fima() {
		firstName="Fima";
		System.out.println("my first name is "+firstName);
	}
	
	
   public void nisa() {
	   firstName="Nisa";
		System.out.println("my first name is "+firstName);	
	}

}
