package constructor;

public class BasicsOfConstructor {
	/*
	 *  class must have constructor
	 *   there are two types of constructor
	 *    default constructor-- provided by java compiler
	 *    user define constructor--provided by user
	 */
	/*how to build a user define constructor
	 *    as soon as you build your own constructor - compiler will not provide anything
	 *     Constructor name is always class name
	 *     it is not void or return type
	 *     you can have as many constructor as you want-with different signature
	 *     Constructor can have access modifier-public,protected, default, private
	 *     when you build private constructor-- be very careful to manage
	 *     
	 * 
	 */
	
	public static void main(String[] args) {
		
		BasicsOfConstructor bc= new BasicsOfConstructor();
		bc.hello();
	}
	// this is constructor
	  BasicsOfConstructor(){
		super()	;
	}
	
	// this is method
	public void BasicsOfConstructor(){
		
	}
	// this is method
		public String BasicsOfConstructor(String fn){
			return null;
			
		}
	
	public void hello() {
		
	}
	

}
