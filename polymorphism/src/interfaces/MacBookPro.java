package interfaces;

public class MacBookPro extends MacBook {

	@Override
	public void start() {
		System.out.println("Inside MacbookPro start()");
	}
	
	@Override
	public void shutdown() {
		System.out.println("Inside MacbookPro shutdown()");
	}
	void method() {
		System.out.println("i am different");
	}
	
}