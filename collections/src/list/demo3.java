package list;

import java.util.ArrayList;
import java.util.List;

public class demo3 {
	@SuppressWarnings("removal")
	public static void main(String[] args) {
		List<Integer> list = new ArrayList();
		for(int i=0;i<500;i+=50)
		{
			list.add(i);
			
		}
		System.out.println(list);
		List<Integer> list2 = new ArrayList();
		list2.add(52);
		list2.add(555);
		list2.add(666);
		list2.add(258);
		System.out.println(list2);
		
		list.addAll(list2);
		System.out.println(list);
		System.out.println("element at the position 5: " + list.get(5));
		list2.addAll(list);
		System.out.println(list2);
		list2.remove(5);
		System.out.println(list2);
		list2.remove(new Integer(350));
		System.out.println(list2);
	}

}
