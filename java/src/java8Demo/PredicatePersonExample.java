package java8Demo;

import java.util.List;
import java.util.function.Predicate;

import java8Demo.POJO.Person;
import java8Demo.POJO.PersonRepository;



//heoght gender gonna check
public class PredicatePersonExample {
	static Predicate<Person> heightPredicate = per-> per.getHeight() >= 140;
	static Predicate<Person> genderPredicate = per-> per.getGender().equals("Male" );

	public static void main(String[] args) {
		List<Person> personList = PersonRepository.getAllPersons();
		personList.forEach((per) ->{
			if(heightPredicate.and(genderPredicate).test(per))// based on requirement
				System.out.println(per);
		});
	}
	//BIPREDICATE -> 2 inputs
}
