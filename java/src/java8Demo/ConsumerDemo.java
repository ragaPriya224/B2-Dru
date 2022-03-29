package java8Demo;
import java.util.function.Consumer;
public class ConsumerDemo {
	public static void main(String[] args) {
	
		Consumer<String> c1= (s) -> System.out.println(s.toUpperCase());
//		c1.accept("first java feature");
		Consumer<String> c2= (s) -> System.out.println(s.toLowerCase());
//		c2.accept("FIRST JAVA FEATURE");
		c1.andThen(c2).accept("hello TEAM");
	}
}
