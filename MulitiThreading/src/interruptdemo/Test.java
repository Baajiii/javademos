package interruptdemo;

public class Test {

	public static void main(String[] args) {
		
		String tname = Thread.currentThread().getName();
		System.out.println(tname + ": Start");
		Worker w = new  Worker();
		Thread w1 = new Thread(w);
		w1.setName("W1");
		w1.start();
		
		try {
			Thread.sleep(3000);
//			w1.interrupt();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(tname + ": End");
		
	}
	
}