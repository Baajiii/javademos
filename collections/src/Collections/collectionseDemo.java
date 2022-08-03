package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import set.StringLengthComparator;

public class collectionseDemo {
	public static void main(String[] args) {
		List<String> l = new ArrayList<>();
		l.add("zebra");
		l.add("apple");
		l.add("xerox");
		l.add("mexico");
		l.add("planet");
		l.add("quiz");
		l.add("yaz");
		System.out.println("before sort : " + l);
		Collections.sort(l);
		System.out.println("Afetr sirt : " + l);
	Collections.sort(l, new StringLengthComparator());
	// String comparator is used to sort the the string according to the string length.
	System.out.println("sorting according to length of the string  : " + l);
//	Collections.sort(l, new StringReverseComparator());
	}

}
