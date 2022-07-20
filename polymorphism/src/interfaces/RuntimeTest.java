package interfaces;

public class RuntimeTest {

	public static void main(String[] args) {
		
		AppleLaptop a1 = new MacBookAir();
		a1.start();
		a1.shutdown();
		
		MacBook m =new MacBookPro();
		//((MacBookPro) m).method();
//		downcasting - explicit
		//MacBook obj = (MacBookAir) m;
		
		MacBook pro = new MacBookPro();
		MacBookPro obj2 = (MacBookPro) pro;
		obj2.method();
	}
}