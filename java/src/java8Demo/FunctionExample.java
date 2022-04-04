package java8Demo;

import java.util.function.Function;

public class FunctionExample {

	static Function<String, String>  f1 = name -> name.toUpperCase();
	static Function<String, String>  f2 = name -> name.toUpperCase().concat("features");

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(f1.apply("java"));
//		System.out.println(f2.apply("java"));
		System.out.println("and then          "+ f1.andThen(f2).apply("java")); //both JAVAfeatures
		System.out.println("componse result   " + f1.compose(f2).apply("java")); //f2first and JAVAFEATURES
	}

}
