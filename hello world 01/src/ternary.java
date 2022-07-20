
public class ternary {
	public static void main(String[] args) {
		int age = 20;
		boolean candrive = false;
		
		if(age>18)
		{
			candrive = true;
		}
		else
		{
			candrive = false;
		}
		System.out.println(candrive);
		
		//ternary operator 
		candrive = (age>18) ? true : false;
		System.out.println(candrive);
		
		int Age = 19;
		 boolean haslicense = false;
		 boolean Candrive = (Age > 18) ? true : false;
		 boolean canrentcar = Candrive ? (haslicense ? true : false) : false;
		 
		 System.out.println(Age);
		 System.out.println(haslicense);
		 System.out.println(Candrive);
		 System.out.println(canrentcar);
	}

}
