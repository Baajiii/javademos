package anonclass;
public class test {

	public static void main(String[] args) {
		
// tradional method to call  thread
		
		iconnection newcon = new iconnection() {
			
			@Override
			public void connect(String connectionDetails) {
				System.out.println("New connection established using anonymous class - " + connectionDetails);
			}
		};
		
		newcon.connect("ProductionServer");
		// another method to call runnable thread
		
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Anonymous worker in a separate thread");
			}
		});
		t1.start();
		
	}
	
}