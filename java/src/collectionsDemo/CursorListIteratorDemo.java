package collectionsDemo;

import java.util.LinkedList;
import java.util.ListIterator;

public class CursorListIteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stubsdjkfjsedkfjlskdfjk
		LinkedList list = new LinkedList();
//		1l
//		1L
		
		
		list.add("A");
		list.add("B");
		list.add("C");
//		System.out.println(list);
		ListIterator listIterator = list.listIterator();
		listIterator.add("D");
		while(listIterator.hasNext()) {
			System.out.println("***");
			if(listIterator.next().equals("C")){
				listIterator.set("Z");
			}
//			System.out.println(listIterator.next());
		}

System.out.println(list);
	}
//split iterator -> parallel 
}

//iterator -> hasnext, next, remove . forward dirction 
//no replace, no add 

//ListIterator
next, previous...
bidirectional
read, remove, replace add new object


