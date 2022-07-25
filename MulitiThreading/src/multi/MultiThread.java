package multi;

public class MultiThread extends Thread {
	
	public static void main(String[] args) {
		MultiThread mt = new MultiThread();
		mt.start();
//		the thread work in parallel
		for (int j=1; j<=200; j++) {
			System.out.println("j: " + j + "\t");
		}
	}

	@Override
	public void run() {
		for (int i=1; i<=200; i++) {
			System.out.println("i: " + i + "\t");
		}
	}
	
}