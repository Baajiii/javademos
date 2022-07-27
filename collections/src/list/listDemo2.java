package list;

import java.util.ArrayList;

public class listDemo2 {
	public static void main(String[] args) {
		ArrayList<Integer> my = new ArrayList();
		for (int i= 0; i< 100;i+=10)
		{
			my.add(i);	
		}System.out.println(my);
		my.add(5);
		System.out.println(my);
		my.add(2, 56);
		System.out.println(my);
		my.set(6, 1000);
		System.out.println(my);
		
	}
}
