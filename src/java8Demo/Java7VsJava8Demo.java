package java8Demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Java7VsJava8Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total = 0;
		for(int i = 0; i<=50;i++){
			total +=i;
		}
		System.out.println(total);
		//java8
		int total1 = IntStream.rangeClosed(0,50).sum();
		System.out.println(total1);

		//java7
		List<String> names = Arrays.asList("Sam", "Peter","ballon","Sam");
		List<String> uniqueList = new ArrayList<String>();
		for(String name: names){
			if(!uniqueList.contains(name))
				uniqueList.add(name);
		}
		System.out.println(uniqueList);
		//java8
		List<String> uniqueList1 = names.stream().distinct().collect(Collectors.toList());
		System.out.println(uniqueList1);
	}

}
