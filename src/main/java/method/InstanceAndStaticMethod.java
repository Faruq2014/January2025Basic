package method;

public class InstanceAndStaticMethod {
  // what is instance and static method
	// what is there scope
	// what is accessibility rule
	    // static access directly inside any method
	   // instance to static== class referential variable(knock the door)
	
	public static void main(String[] args) {
		lastName();
		InstanceAndStaticMethod iasm= new InstanceAndStaticMethod();
		// class name (class referential variable)= new class name
		// iasm=class referential variable
		iasm.firstName();

	}
   
	// public = access modifier
	// void = return type
	// firstName= method name
	// ()= parameter
	//firstName()= method signature
	// {}= method scope/ method body/ method area
	// syntax= a line of code that is grammatically right.
	// Argument= few line of code build some sense/requirements
	// logics= one or more arguments build logics
	
	// instance method normally customize method for the class
	String firstName;
	
	public void firstName() {
		firstName="Faruq";
		System.out.println("my first Name is "+ firstName);
	}
	
	// static method has static in front of it
	// static method alway ready to work and common for class
	static String lastName="Molla";
	
	public static void lastName() {
		System.out.println("my last Name is "+ lastName);
	}
}
