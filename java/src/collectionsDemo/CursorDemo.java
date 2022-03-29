package collectionsDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class CursorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//String[] s = {"ankit" ,"purna","supriya","ganesh"};
//for(String i:s) {
//	System.out.println(i);
//}
		
		
		ArrayList al = new ArrayList();
		al.add("ankit");
		al.add("purna");
		al.add("supriya");
		al.add("ganesh");
		al.add(5);
//		for(Object s: al) {
//			System.out.println(s);
//		}
		Iterator i = al.iterator();
		System.out.println(i);
		while(i.hasNext()) {
//		
			if(i.next().equals(5)) {
				i.remove();
			}else {
//				System.out.println(i.next());
			}
			
		}
		System.out.println(al);
		
	}

}
 