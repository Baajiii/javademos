package linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class demo {
	public static void main(String[] args) {
		List list = new LinkedList();
		list.add(10000);
		list.add(50);
		list.add(56);
		list.add("hello");
		list.add(85);
		list.add(10.25);
		System.out.println(list);
		
		
		List<Integer> myInt = new LinkedList<>();
		myInt.add(52);
		myInt.add(new Integer(25));
//		myInt.add("dhvas");
		System.out.println(myInt);
		

		List<String> myInt1 = new LinkedList<>();
		myInt1.add("shgvas");
		myInt1.add("dhvas");
		System.out.println(myInt1);

	}
	}
// linked list is same as arraylist.

