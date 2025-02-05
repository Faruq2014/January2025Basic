package variable;

public class LocalVariable {

	public static void main(String[] args) {
		
		LocalVariable lv= new LocalVariable(); // class referential variable
		lv.bankAccount();
	}
	
	
	public void bankAccount() {
		// must declare data type 
		// must have variable name= camel casing
		// local variable must declare value-- parameter variable is exception
		// only final access modifier is allow
		 final double checkingAc = 4000.99;
		// double is the data type
		// checkingAc is variable name
		//= is the operators (+,-,*,/, %)logical operators( ==, <, >, ||
		// =>)
		// 5000.99 is the value of variable
		
		float savingAc=3000.99f;
		double bankBalance=checkingAc+savingAc;
		System.out.println(bankBalance);
		
		
	}

}
