package variable;

public  class BasicsOfVariables {
	// instance variable
	String firstName;
	// static variable
	static String lastName="Molla";
	
	
public static void main(String[] args) {
		
	BasicsOfVariables bv= new BasicsOfVariables();
	bv.fima();
	bv.nisa();
	bv.bankAccount();
	}

   public void fima() {
	     firstName="Fima";
		System.out.println("my first name is "+firstName);
		System.out.println("my Last name is "+lastName);
	   
   }
	
  public void nisa() {
	         firstName="Nisa";
			System.out.println("my first name is "+firstName);
			System.out.println("my Last name is "+lastName);
   }
	
	public void bankAccount() {
		
		final double checkingAc = 4000.99;	
		float savingAc=3000.99f;
		double bankBalance=checkingAc+savingAc;
		System.out.println(bankBalance);
		
		
	}
	
	
	
	
	
	


}
