package constructor;

public class UserDefineConstructor {
   
	/*
	 * as soon as user define a constructor- java compiler does not responsible for anything
	 * Constructor over loading rule
	 *    as many as you want
	 *    can not have duplicate signature constructor
	 */
	public static void main(String[] args) {


	}
	//zero arg constructor
	//UserDefineConstructor() == constructor signature
	//UserDefineConstructor== constructor name=always class name
	//()= arguments
	UserDefineConstructor(){
	super();
	}
	// int one arg
	UserDefineConstructor(int applePrice){
	
	}
	//mix data type-- two arg 
	UserDefineConstructor(int applePrice, double mangoPrice){
		
	}
	
	//mix data type -- two arg
	UserDefineConstructor(String Name, double savingAc){
		
	}
	
	
	
	
}
