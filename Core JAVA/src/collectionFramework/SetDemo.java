package collectionFramework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {
	public static void main(String[] args) {
//		Set set  = new HashSet();
		HashSet set  = new HashSet();
		set.add(1);
		set.add("java");
		set.add('f');
		set.add(134245);
		set.add(45.3);
		set.add(false);
		System.out.println(set);
		set.add(1);
		System.out.println(set.size());
		set.remove(5);
		Iterator itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
