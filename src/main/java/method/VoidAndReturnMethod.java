package method;

public class VoidAndReturnMethod {
	// there are two types of method
	// void method
	// return method

	static double deductible=200;
	public static void main(String[] args) {
		
		VoidAndReturnMethod vrm= new VoidAndReturnMethod();
		
		// void method-- build method-- can not modify
		vrm.savingAccount();
		
		// return method-- build method--allow to modify
		double ca=vrm.checkingAccount();
		System.out.println(ca-deductible);
		
		

	}
	
	public void savingAccount() {
		double savingAc=400;
		double sa=savingAc-deductible;
		System.out.println(sa);
		
		
	}
	
	public double checkingAccount() {
		double checkingAc=500.99;
		return checkingAc;
		
	}

}
