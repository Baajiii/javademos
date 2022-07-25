package exception;

public class Multicatch {
	public static void main(String[] args) {
		try{
			String i = args[0];// give argument value in run configuration
			System.out.println("Input" + i);
			int o = Integer.parseInt(i);// argument value must in number only
			System.out.println("output" + o);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Input is required");
		}catch(NumberFormatException e)
		{
			System.out.println("Input must be number");
		}
		System.out.println("continue.... bhai");
		
	}
}
