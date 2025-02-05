package method;

public class Human {
	
	

	public static void main(String[] args) {
		
		Human taslima= new Human();
		taslima.fullName("Taslim", "Khaled");
		taslima.fullName("Brain", "Smith");
		
		Human nilima= new Human();
		nilima.fullName("Nilima", "Minu");
		
		Human sultan= new Human();
		sultan.fullName("Sultan", "Khan");
		
	}
	
	/*
	public void fullName() {
		//Initialization is = String firstName;
		// declaration   String firstName="Taslima";
		String firstName="Taslima";
		String lastName= "Khaled";
		String fullName= firstName+" "+lastName;
		System.out.println(fullName);
	}
	*/
	
	public void fullName(String firstName ,String lastName ) {
		String fullName= firstName+" "+lastName;
		System.out.println(fullName);
		
	}
}
