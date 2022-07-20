
public class condition {
	public static void main(String[] args) {
		boolean isAliean = true;
		if(isAliean)
		{
			System.out.println("it is true");
		}
		else
		{
			System.out.println("it is false");
		}
		
		int a = 10, b = 5;
		int c = 20;
		System.out.println(a<b && ++a<c); //logical AND
		System.out.println(a);
		System.out.println(a<b & ++a<c); // bitwidh AND
		System.out.println(a>b && a<c);
	}
}
