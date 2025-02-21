package constructor;

public class FacebookRegistriation {

	/*
	 * build a registration class first name--optional last name-- mandatory
	 * phone-- optional dob--mandatory
	 */

	String fistName;
	String lastName;
	int Phone;
	String dob;

	// mandatory constructor-- 2 args
	public FacebookRegistriation(String lastName, String dob) {
		super();
		this.lastName = lastName;
		this.dob = dob;
	}

	// three arg with dob
	public FacebookRegistriation(String fistName, String lastName, String dob) {
		super();
		this.fistName = fistName;
		this.lastName = lastName;
		this.dob = dob;
	}

	// three arg with phone
	public FacebookRegistriation(String fistName, String lastName, int phone) {
		super();
		this.fistName = fistName;
		this.lastName = lastName;
		Phone = phone;
	}

	// four args
	public FacebookRegistriation(String fistName, String lastName, int phone, String dob) {
		// super();
		this.fistName = fistName;
		this.lastName = lastName;
		Phone = phone;
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "FacebookRegistriation [fistName=" + fistName + ", lastName=" + lastName + ", Phone=" + Phone + ", dob="
				+ dob + "]";
	}

	public static void main(String[] args) {
		// mandatory
		FacebookRegistriation nilima = new FacebookRegistriation("Nilima", "01-10-2010");
		System.out.println(nilima);
		// with dob
		FacebookRegistriation tanvir = new FacebookRegistriation("Tanvir", "Molla", "01-10-2010");
		System.out.println(tanvir);
		// with phone
		FacebookRegistriation sarmin = new FacebookRegistriation("Sharmin", "Molla", 111223333);
		System.out.println(sarmin);

		// four arg
		FacebookRegistriation faruq = new FacebookRegistriation("Faruq", "Molla", 111223333, "01-10-2010");
		System.out.println(faruq);
		
		

	}

}
