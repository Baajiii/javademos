package list;

import java.util.ArrayList;

public class ListDemo {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(1000000);
		list.add(50);
		list.add(56);
		list.add("hello");
		list.add(85);
		list.add(10.25);
		System.out.println(list);
		
		
		ArrayList<Integer> myInt = new ArrayList<>();
		myInt.add(52);
		myInt.add(new Integer(25));
//		myInt.add("dhvas");
		System.out.println(myInt);
		

		ArrayList<String> myInt1 = new ArrayList<>();
		myInt1.add("shgvas");
		myInt1.add("dhvas");
		System.out.println(myInt1);

	}
	
	
	
	
	
}
