package inheritance;

public class GrandChild extends Child{

	public static void main(String[] args) {
		// GrandChild reference--  parent and child and GrandChild method available
		GrandChild gc= new GrandChild();		
		gc.house();
		gc.bankOfAmerica();
		car();
		gc.playStation();// child
		gc.genZ(); // grand child method
		
		Child cg= new GrandChild();  // child reference--  parent and child method available
		cg.playStation();// child method
		gc.house();
		gc.bankOfAmerica();
		car();
		
		Parent pg= new GrandChild(); // parent reference-- only parent method available
		pg.house();// parent method
		pg.bankOfAmerica();
		car();
		
	}
	
	public void genZ() {
		System.out.println("I am generation Z");
	}

}
