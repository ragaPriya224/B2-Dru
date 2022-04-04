package java8Demo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;

import java8Demo.POJO.Person;
import java8Demo.POJO.PersonRepository;

//import java8.POJO.Person;
//import java8.POJO.PersonRepository;

public class FunctionPersonExample {

	static Function<String, Integer> f1 = name -> name.length();//input,returntype
	static Predicate<Person> p1 = per -> per.getHeight() >= 140;
	static Predicate<Person> p2 = per -> per.getGender().equals("Male");
	
	static Function<List<Person>, Map<String,Double>> f2 = personList -> {
		Map<String,Double> map = new HashMap<String,Double>();
		personList.forEach(per -> {
			if(p1.and(p2).test(per))
				map.put(per.getName(), per.getSalary());
		});
		return map;
	};

	public static void main(String[] args) {
		//System.out.println(f1.apply("java features"));
		List<Person> personList = PersonRepository.getAllPersons();
		Map<String,Double> map = f2.apply(personList);
		System.out.println("Result :"+map);
	}
}