
public class staticmethod {
	public static void main(String[] args) {
		System.out.println("inside main");
		staticmethod.method();
	}
	static void method(){
		System.out.println("i am method");
	}
}
