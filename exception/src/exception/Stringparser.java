package exception;


public class Stringparser {

	public static void main(String[] args) {
		try {
		String s = "abcd";
		int a = Integer.parseInt(s);
		System.out.println("Result: " + a);
		}catch(NumberFormatException e) {
			System.out.println("enter only integer value");
		}
		System.out.println("continue.....");
		
	}
	
}
