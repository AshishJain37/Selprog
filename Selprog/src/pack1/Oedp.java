package pack1;

public class Oedp {

	public static void main(String[] args) throws InterruptedException {
		
		EtoploginIE obj =new EtoploginIE();
		System.out.println("Calling OE");
		obj.OE();
		
		System.out.println("Calling Dispatcher");
		Dispatcher_etop d =new Dispatcher_etop();
		d.DP();


	}

}
