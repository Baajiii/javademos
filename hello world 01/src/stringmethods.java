
public class stringmethods {
	public static void main(String[] args) {
		String s = "heLlo woRld Welcome";
		System.out.println(s);
		System.out.println(s.length());
		System.out.println(s.indexOf('l'));
		// print the character at position 3
		System.out.println("character at 3 = " + s.charAt(8));
		//another to find index value
		System.out.println(s.indexOf('o', 2));
		System.out.println(s.substring(1));
		//spliting the string
		String[] s4 = s.split(" ");
		System.out.println(s4[0]);
		System.out.println(s4[1]);
		System.out.println(s4[2]);
		
		String[] s5 = s.split("o");
		System.out.println(s5.length);
		System.out.println(s5[0]);
		System.out.println(s5[1]);
		System.out.println(s5[2]);
		//replaceing a word
		System.out.println(s.replace("h", "r"));
		// converting upper and lower case 
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
	}

}
