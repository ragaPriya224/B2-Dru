package java8Demo.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		List<String> cityList = Arrays.asList("hyderabad","bangalore" , "",
				"delhi","tokyo","chicago","","jammukashmir","Chennai","bombay","guwahati","secunderabad");

		//find cities starts with b

		//		List<String> result = cityList.stream().filter(n -> n.startsWith("c")).sorted().collect(Collectors.toList());
		//		System.out.println(result);
		// length >6
		//		List<String> result = cityList.stream().filter(n -> n.length()>6).collect(Collectors.toList());
		//		System.out.println(result);

		// contains abad
		//		List<String> result = cityList.stream().filter(n -> n.contains("abad")).collect(Collectors.toList());
		//		System.out.println(result);
		// -> upper case
		//		List<String> result = cityList.stream().map(n-> n.toUpperCase()).collect(Collectors.toList());
		//		System.out.println(result);
		// add metro 
		//		List<String> result = cityList.stream().map(n-> n.concat(" metro")).collect(Collectors.toList());
		//		System.out.println(result);
		//sort cities
		//		List<String> result = cityList.stream().sorted().collect(Collectors.toList());
		//		System.out.println(result);
		// filter data without ""
		//		List<String> result = cityList.stream().filter(n -> !n.isEmpty()).collect(Collectors.toList());
		//		System.out.println(result);
		//count cities 
		//		long result = cityList.stream().count();
		//		System.out.println(result);
		//count cities with c
		//		long result = cityList.stream().filter(n -> n.startsWith("c")).count();
		//		System.out.println(result);
		// ignore case
		/*ignore case*/
//		long result = cityList.stream().map(n -> n.toLowerCase()).filter(n-> n.startsWith("c")).count();
//		System.out.println(result);
		//count the empty string
		long result = cityList.stream().filter(n -> n.isEmpty()).count();
		System.out.println(result);
	}

}
