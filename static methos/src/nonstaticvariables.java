
public class nonstaticvariables {
	int n=1;
	{
		System.out.println("inside block ");
	}
	nonstaticvariables(int x)
	{
		System.out.println("hello");
		this.n = x;
	}
	public static void main(String[] args) {
		System.out.println("inside block 2");
		nonstaticvariables f = new nonstaticvariables(20);
		System.out.println(f.n);
	}

}
