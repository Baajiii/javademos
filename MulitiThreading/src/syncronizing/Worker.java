package syncronizing;

public class Worker implements Runnable {
	displaymessage dm;
	String name;
	
	Worker(displaymessage dm ,String name)
	{
		this.dm=dm;
		this.name=name;
	}

	@Override
	public void run() {
		try {
			dm.sayhello(name);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
