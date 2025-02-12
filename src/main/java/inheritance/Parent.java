package inheritance;

public class Parent {
  
	public static String parentName="Molla";
	public static void main(String[] args) {
		
		Parent p = new Parent();
		p.house();
		p.bankOfAmerica();
		car();
	}
	
	public void house() {
		System.out.println("this is parent hose method "+parentName +"'s House");
	}

	public double bankOfAmerica() {
		double checkingAc=5000.00;
		System.out.println("bank of America "+checkingAc);
		return checkingAc;
	}
	
	public static void car() {
		String carName="Camery";
		System.out.println("parents car "+carName);
	}
}
