//Autoboxing(coverting int into object)
public class boxing {
	public static void main(String[] args) {
		int x = 3;
		Integer x1 = new Integer(x);
		int c = 20;
		System.out.println(x1 + c);
		//unboxing(coverting object into int)
		Integer c1 = new Integer(52);
		int f = c1;
		System.out.println(f);
	}

}
