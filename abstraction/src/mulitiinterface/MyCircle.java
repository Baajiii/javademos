package mulitiinterface;

public class MyCircle implements Circle, CircleTwo{

	public void calculateArea(){
		System.out.println(CircleTwo.pi);
	}

	
	public void calculateArea(int radius) {
				
	}

}