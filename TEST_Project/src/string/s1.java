package string;

public class s1 {

	public static void main(String[] args) {
		
		//String Literals
		
		String s="Ashish";
		String y="Ashish";
		String z="AshishJain";
		
		System.out.println(s.toString());
		System.out.println(s.concat("Jain"));
		System.out.println(s.equals(y)); // comparing contents
		System.out.println(s==y);// compare objects
		System.out.println(s.hashCode());
		System.out.println(y.hashCode());
		System.out.println(s.toString());
		s=s.concat("Jain");
		System.out.println(s.toString());
		System.out.println(s.equals(z));// this means it is not creating a new object because there a already one i.e. z
		System.out.println(z.hashCode()+" "+s.hashCode());
//		s1 u=new s1();
//		System.out.println(s1);
	System.out.println("---------------------------------------");	
		
	
	// new keyword
		String s1=new String("Ashish");
		String s2=new String("Ashish");
		System.out.println("s1 ="+ s1);
		System.out.println(s1.equals(s2)); // comparing contents
		System.out.println(s1==s2);// comparing object
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		System.out.println("#############################");
		System.out.println(s1.equals(s));// comparing values
		System.out.println(s2.equals(y));
		System.out.println(s==s1);// comparing objects

		//String Intern method for s1 
		System.out.println("INtern Method");

		String g=s1.intern();
		System.out.println(s.equals(g));

		
	}

}
