package collectionsDemo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.SortedSet;
import java.util.TreeSet;

public class CollectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();
//		System.out.println(al.size());
//		System.out.println(al);
		al.add(3);
		al.add(500);
		al.add("hello");
		al.add("world");
		System.out.println(al);
		al.remove(0);
//		al.contains
		
		al.add(1, "working");
		al.set(2, "hi");
		System.out.println(al);
		System.out.println(al.get(2));
//		System.out.println(al);
//		System.out.println(al.);
//		 al.add(10, 100);
//		l.add(3, 500);
//		l.add(5, 300);
//		l.add(8, 200);
//		l.add(9, 700);
//		System.out.println(l);
		LinkedList a = new LinkedList();
		a.addFirst(20);
		a.addLast(40);
		a.getFirst();
		a.getLast();
		a.removeFirst();
		a.removeLast();
		
		HashSet hs = new HashSet();
		hs.add("39");
		hs.add("9");
		hs.add("45");hs.add(null);
		hs.add("z");
		System.out.println(hs.add("z"));
		System.out.println(hs);
//		--------------------
		SortedSet ss = new TreeSet();
		ss.add(101);
		ss.add(100);
		ss.add(103);
		ss.add(104);
		ss.add(107);
		ss.add(110);
		ss.add(115);
		;
		System.out.println(ss);
		System.out.println(ss.first());
		System.out.println(ss.last());
		System.out.println(ss.headSet(104));
		System.out.println(ss.tailSet(104));
		System.out.println(ss.subSet(103, 110));
		
		
	}

}
