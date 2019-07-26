package string;

public class Stingbufr {

	public static void main(String[] args) {
		StringBuffer sb1 =new StringBuffer("Ashish");
		StringBuffer sb2 =new StringBuffer("Ashish");
		StringBuffer sb5 =new StringBuffer("AshishJain");

		System.out.println(sb1+" "+ sb2);
		System.out.println(sb1.toString());  // Ashish
		sb1.append("Jain");// creating new object

		System.out.println(sb1);
		System.out.println(sb5);
		System.out.println("**********************");
		System.out.println(sb1.equals(sb2)); // comparing objects
		System.out.println(sb1==sb2); // comparing objects
		System.out.println(sb1.equals(sb5));
		
		String g=sb2.toString();
		String g1=sb1.toString();
		System.out.println(g1.equals(g));

		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++=");
		String s1 = "GFG"; 
	    StringBuffer sb3 = new StringBuffer("GFG"); 
	    //String s2 = sb3.toString(); 
	    System.out.println(s1.equals(sb3)); 


	}

}
