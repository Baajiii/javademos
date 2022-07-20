package dynamic;

public class RuntimeTest {

	public static void main(String[] args) {
		
		MacBookPro pro = new MacBookPro();
//		operateMac(pro);
		pro.start();
		pro.shutdown();
		
		MacBookAir air = new MacBookAir();
		operateMac(air);
//		pro.start();
//		pro.shutdown();
		
	}
	
	static void operateMac(MacBook mac) {
		mac.start();
		mac.shutdown();
	}
	
}