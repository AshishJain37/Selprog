package string;

public class s2 {
	
	public static void cmp(Object a, Object b) {
		String c=(String)a;
		String d=(String)b;

		System.out.println("Equals methos :" + c.equals(d));
		
	}

	public static void main(String[] args) {
		
		System.out.println("@@@@@ CASE-1 @@@@@");
		
		String a1="Ashish";
		String a2="Ashish";
		cmp(a1, a2);
		System.out.println(a1==a2);
		
		
		
		
		System.out.println("***** CAase-2 *****");
		
		String a3= new String("Ashish");
		String a4 = new String("Ashish");
		cmp(a3, a4);
		System.out.println(a3==a4);

		
		System.out.println("##### Case-3 ####");
		
		String a5="Ashish";
		String a6= new String("Ashish");
		cmp(a5, a6);
		System.out.println(a5==a6);

		
		System.out.println("***** CAase-4 *****");
         StringBuffer a7= new StringBuffer("Ashish");
         StringBuffer a8= new StringBuffer("Ashish");
         System.out.println(a7.equals(a8));
         System.out.println(a7==a8);

         
         System.out.println("$$$$ CAse-5 $$$$$");
         
 		StringBuffer a9 =new StringBuffer("AshishJain");
 		a7.append("Jain");
 		System.out.println(a7.equals(a9));
        System.out.println(a7==a9);
        
        System.out.println("!!!!!!!!! Case-6 !!!!!!!!!");
        System.out.println(a7);
        System.out.println(a3);
        System.out.println(a1);
        
        
        System.out.println("^^^^^^^^^ CAse-7 ^^^^^^^^^^^");
        StringBuffer a10= new StringBuffer("Ashish");
		String a11="Ashish";
		System.out.println(a11.equals(a10));
		//System.out.println(a10==a11);
		
	}

}
