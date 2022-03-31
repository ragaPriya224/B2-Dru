package java8SelfNotes.FuncInterface;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class BiPredicateExample {
//	Predicate<Integer> lessThan = a -> a>50;//single line no need retunr 
//	Predicate<Integer> gtThan = a -> a<50;//single line no need retunr 
	static BiPredicate<Integer,Integer> biPredicate = (a,b) -> a>=50 &&b<50;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	boolean result = biPredicate.test(100, 45);
	}
//try negate..give opposite result
}
