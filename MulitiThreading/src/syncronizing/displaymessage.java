package syncronizing;

public class displaymessage {
	public synchronized void sayhello(String name) throws InterruptedException
	{
		String tname = Thread.currentThread().getName();
		for( int i =0; i<=10; i++)
		{
			System.out.println(tname + " : " + i + " how are u " + name);
			Thread.sleep(1000);
		}
	}

}
