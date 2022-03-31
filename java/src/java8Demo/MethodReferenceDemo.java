package java8Demo;

import java.util.ArrayList;
import java.util.List;

public class MethodReferenceDemo {
	 public static void main(String args[]) {
	      List<String> names = new ArrayList<String>();
			
	      names.add("Mahesh");
	      names.add("Suresh");
	      names.add("Ramesh");
	      names.add("Naresh");
	      names.add("Kalpesh");
//	      System.out.println(names);
//	      for(String s : names) {
//	    	  System.out.println(s);
//	      }
	      names.forEach(System.out::println);
			
	      
	   }
}
