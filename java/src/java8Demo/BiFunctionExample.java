package java8Demo;



import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

import java8Demo.POJO.Person;
import java8Demo.POJO.PersonRepository;

public class BiFunctionExample {
	static BiFunction<String, String, String> bf1 = (a,b) -> (a+" "+b); //arg,arg,Return type

	static Predicate<Person> p1 = per -> per.getHeight() >= 140;

	static Predicate<Person> p2 = per -> per.getGender().equals("Male");

	static BiFunction<List<Person>, Predicate<Person>, Map<String,Double>> bf2 = (listOfPersons, predicate) -> {
		Map<String,Double> map = new HashMap<String,Double>();
		listOfPersons.forEach(per -> {
			if(p1.and(predicate).test(per))
				map.put(per.getName(), per.getSalary());
		});
		return map;
	};

	public static void main(String[] args) {
		//System.out.println("Result :"+bf1.apply("java", "features"));
		List<Person> personList = PersonRepository.getAllPersons();
		Map<String,Double> map = bf2.apply(personList,p2);
		System.out.println("Result :"+map);
	}
}


//Based on your need and requirement
//1. no return any data -> go for consumer
//2. want to test/validate some data -> predicate-> process data and return true/false
//3. Function is mainly focused for returning some data