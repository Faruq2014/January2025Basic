package dataType;

public class NumericData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         System.out.println("hello");
         // full number-- 
         /*
          * byte: 8-bit signed integer (-128 to 127)
			short: 16-bit signed integer (-32,768 to 32,767)
			int: 32-bit signed integer (-2,147,483,648 to 2,147,483,647)
			long: 64-bit signed integer (-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807)
          */
         // we are buying apple, cookies, milk
         int apple=10;
         short coockies=5;
         byte milk=4;
         long tv=1000;
      long  totalSpent= apple+coockies+milk+tv; 
      System.out.println(totalSpent);
        // mix and match data == always pick super data type
         
      
      // decimal data type
      /*
       * float: 32-bit single-precision floating-point number
         double: 64-bit double-precision floating-point number 
       */
      
     double  appleTv= 2000.99;
     float fireTv= 1000.99f;
     double differnce= appleTv-fireTv;
     System.out.println(differnce);
     

	}

}
