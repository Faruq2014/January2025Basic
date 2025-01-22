package variable;

public class StaticVariable {
	// static variable is inside the class and outside of any method
	// it is own by the class
	// must declare data type == String
	// must have variable name=lastName (camel casing)
	// static variable -- declare value(initialization) is optional-- but prefer
	// any access modifier is allow

	static String lastName="Molla";
	
	public static void main(String[] args) {
		StaticVariable sv= new StaticVariable();
		sv.fima();
		sv.nisa();

	}

	public void fima() {
		System.out.println("my Last name is "+lastName);
	}
	
public void nisa() {
	System.out.println("my Last name is "+lastName);

	}
}
