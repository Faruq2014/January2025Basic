package variable;

public class WhatClassContain {
	// a normal class contain 5 things
	   
	/*
	 * variable
	 * constructor
	 * method
	 * static block/properties
	 * instance block/properties
	 */
	
	
   /*
    * java execution start from main method
    * execution goes  top to bottom
    * and left to right
    */
	
	  String firstName; // instance variable
	  static String lastName="Molla"; // static variable
	  
	  WhatClassContain(){ // constructor
		  
	  }
	  
	  
	   public static void main(String[] args) {
	    	WhatClassContain wcc= new WhatClassContain();
	    	wcc.fullName();

		}

    
    public void fullName() {
    	firstName="Faruq";
    	String fullName= firstName +" "+lastName;
    	
    	System.out.println("my first Name is "+ firstName); 
    	System.out.println("my last Name is "+ lastName);
    	
    	System.out.println("my full name is "+fullName);
    	
    }






















}
