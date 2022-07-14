
public class strings {
	public static void main(String[] args) {
		String name = "max mike";
		System.out.println(name);
		System.out.println(name.length());
		// string literal method to call string
		String s2 = new String("hello");
		System.out.println(s2);
		// char array method to call string
		char[] c = { 'h', 'i', 'i' };
		String s3 = new String(c);
		System.out.println(s3);
		// byte array method to call string
		byte[] s = {66,65,65,74,73};
		String s4 = new String(s);
		System.out.println(s4);
		//String method has only char array method and byte array method not integer or another datatypes

	}
}
