package exception;
import java.util.*;

public class NullpointerDemo {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		try {
			
		String a = s.next();
		System.out.println("String Length: " + a.length());
		}catch(NullPointerException e) {
			System.out.println("Enter value ");
		}
		System.out.println("continue......");
	}

}