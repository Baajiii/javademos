package tokenizer;

import java.util.StringTokenizer;

public class StringTokenzier {
	static void StringToTokenizer(String a) {
		StringTokenizer st = new StringTokenizer(a);
		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken());
		}
	}
	public static void main(String[] args) {
		String s = "i am the boy which i can run fast";
		StringToTokenizer(s); // method 1
		
		String f = "i-am-the-boy-which-i-can-run-fast";
		StringToTokenizer(f); // method 2 , here we need use delim method
	}
	
	
	
}
