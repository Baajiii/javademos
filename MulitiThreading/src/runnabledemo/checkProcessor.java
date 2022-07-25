package runnabledemo;

public class checkProcessor implements Runnable  {

	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		System.out.println(name + ": processor the checks");;
		
	}
	

}
