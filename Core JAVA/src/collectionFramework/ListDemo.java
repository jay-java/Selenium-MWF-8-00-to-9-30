package collectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//collection framework -> is framework that provides 
//				an architecture to manipulate group of objects.
//Root INterface -> Iterable
//List,Set,Map
//<generics>
public class ListDemo {
	public static void main(String[] args) {
//		List list = new ArrayList();
		ArrayList list = new ArrayList();
		list.add(1);
		list.add("java");
		list.add('f');
		list.add(134245);
		list.add(45.3);
		list.add(false);
		System.out.println(list);
		list.add(1);
		System.out.println(list.size());
		list.remove(5);
		System.out.println(list);
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
