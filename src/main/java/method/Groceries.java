package method;

public class Groceries {

	public static void main(String[] args) {
		Groceries gs= new Groceries();
		gs.buyGroceries();
		
		double wifeNote=20;
		double returnBack= wifeNote-gs.buyGroceriesOne();
		System.out.println(returnBack);
		
	}
	
	/*
	 * buy groceries and sell it to your wife
	 */
	
	public void buyGroceries() {
		
		double apple=5;
		double milk=5;
		double totalSpend=apple+milk;
		System.out.println(totalSpend);
		double addProfit=5;
		double profit=(totalSpend+ addProfit);
		System.out.println(profit);
		
	}
	
	
	public double buyGroceriesOne() {
		
		double apple=5;
		double milk=5;
		double totalSpend=apple+milk;
		System.out.println(totalSpend);
		double addProfit=5;
		double profit=(totalSpend+ addProfit);
		System.out.println(profit);
		return profit;
		
	}

}
