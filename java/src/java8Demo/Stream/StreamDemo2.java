package java8Demo.Stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//Stream of 
		//		Stream<Integer> stream = Stream.of(1,2,3,4,5,6,7,8,9);
		//		stream.forEach(p -> System.out.println(p));
		//for array
		//		Stream<Integer> stream = Stream.of( new Integer[]{1,2,3,4,5,6,7,8,9} );
		//		stream.forEach(p -> System.out.println(p));
		//		List<String> memberNamesList = Arrays.asList("hyderabad","bangalore" , "",
		//				"delhi","tokyo","Amazon","chicago","","jammukashmir","Chennai","bombay","Ahmedabad","guwahati","secunderabad");
		//		//double colon 
		//		memberNamesList.stream().filter((s) -> s.startsWith("A"))
		//		.forEach(System.out::println);

		// 1. Integer Stream
		//		IntStream
		//			.range(1, 11) // 10 not included
		//			.forEach(System.out::print); //terminal operation, method references
		//		System.out.println();   //123456789

		// 2. Integer Stream with skip
		//		IntStream
		//			.range(1, 10)
		//			.skip(5)  //skipping till that element
		//			.forEach(x -> System.out.println(x));
		//		System.out.println();

		// 3. Integer Stream with sum
		//		System.out.println(
		//				IntStream
		//				.range(1, 5)
		//				.sum());
		//		System.out.println();

		// 4. Stream.of, sorted and findFirst
		//		Stream.of("Ava", "Aneri", "Alberto")
		//			.sorted() // u can also pass your own comparator
		//			.findFirst()
		//			.ifPresent(System.out::println);

		// 5. Stream from Array, sort, filter and print
		//		String[] names = {"Al", "Ankit", "Kushal", "Brent", "Sarika", "amanda", "Hans", "Shivika", "Sarah"};// obj, floating anythiing
		//		Arrays.stream(names)	// same as Stream.of(names)
		//			.filter(x -> x.startsWith("S"))
		//			.sorted()
		//			.forEach(System.out::println);

		// 6. average of squares of an int array
		//		Arrays.stream(new int[] {2, 4, 6, 8, 10})
		//			.map(x -> x * x) //map each item to integer
		//			.average()
		//			.ifPresent(System.out::println);

		// 7. Stream from List, filter and print
		//		List<String> people = Arrays.asList("Al", "Ankit", "Brent", "Sarika", "amanda", "Hans", "Shivika", "Sarah");
		//		people
		//			.stream()
		//			.map(String::toLowerCase)
		//			.filter(x -> x.startsWith("a"))
		//			.forEach(System.out::println);

		// 8. Stream rows from text file, sort, filter, and print
//		Stream<String> bands = Files.lines(Paths.get("bands.txt"));
//		bands //files.line will give string of stream
//		.sorted()
//		.filter(x -> x.length() > 13)
//		.forEach(System.out::println);
//		bands.close(); //important
		
		// 9. Stream rows from text file and save to List
//		List<String> bands2 = Files.lines(Paths.get("bands.txt"))
//			.filter(x -> x.contains("jit"))
//			.collect(Collectors.toList());
//		bands2.forEach(x -> System.out.println(x));
		
		// 13. Reduction - sum
//		double total = Stream.of(7.3, 1.5, 4.8)
//			.reduce(0.0, (Double a, Double b) -> a + b);
//		System.out.println("Total = " + total);
//		
//		// 14. Reduction - summary statistics
//		IntSummaryStatistics summary = IntStream.of(7, 2, 19, 88, 73, 4, 10)
//			.summaryStatistics();
//		System.out.println(summary);
		
//		https://www.youtube.com/watch?v=t1-YZ6bF-g0
	}

}
