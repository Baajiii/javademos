
public class casting {
	public static void main(String[] args) {
		int a = 5;
		byte b =10;
		System.out.println(a);
		//converting byte to int
		a = b;
		System.out.println(a);
		a = 15;
		//converting int to byte, here where casting is happen 
		b = (byte)a;
		System.out.println(b);
	}

}
