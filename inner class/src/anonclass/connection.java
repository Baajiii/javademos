package anonclass;

public class connection implements iconnection {

	@Override
	public void connect(String connectiondetails) {
		// TODO Auto-generated method stub
		System.out.println("successfully established connection to the server - " + connectiondetails);
	}

}
