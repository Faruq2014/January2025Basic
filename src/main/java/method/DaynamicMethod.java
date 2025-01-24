package method;

public class DaynamicMethod {
	String firstName="Faruq";
	static String lastName="Molla";

	public static void main(String[] args) {
		DaynamicMethod faruq= new DaynamicMethod();
		faruq.name();
		DaynamicMethod maryam= new DaynamicMethod();
		maryam.name();
		// using dynamic method
		DaynamicMethod brain= new DaynamicMethod();
		brain.fullName("Brain");
		DaynamicMethod taslima= new DaynamicMethod();
		taslima.fullName("Taslima");
		

	}
	public void name() {
		System.out.println(firstName+"  "+lastName);
		
	}
	
	public void fullName(String firstName) {
		
		System.out.println(firstName+"  "+lastName);
	}

}
