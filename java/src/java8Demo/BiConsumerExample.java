package java8Demo;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample {
	static BiConsumer<Integer,Integer> bc1= (x,y)->
	System.out.println(x+y);
	static BiConsumer<Integer,Integer> bc2= (x,y)->
	System.out.println(x-y);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		bc1.accept(10, 20);
//		bc2.accept(20, 10);
//		bc1.andThen(bc2).accept(20, 10);
		// check 2 list size are same or not
		List<Integer> l1 = Arrays.asList(1,3,8,9);
		List<Integer> l2 = Arrays.asList(1,3,8,9);
		BiConsumer<List<Integer>,List<Integer>> sizeCheck =
				(list1,list2) ->{
					if(list1.size() == list2.size()) {
						System.out.println("list size is same :) ");
					}else {
						System.out.println("Better luck next time :( ");
					}
				};
				sizeCheck.accept(l1, l2);
	}
// consumer 1 input
	//biconsumer 2 input
}
