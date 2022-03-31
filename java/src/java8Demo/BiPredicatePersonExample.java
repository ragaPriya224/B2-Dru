package java8SelfNotes.FuncInterface;

import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

import java8SelfNotes.repository.Person;
import java8SelfNotes.repository.PersonRepository;
//height and gender
public class BiPredicatePersonExample {
	static BiPredicate<Integer,String> heightAndGender = (height,gender) -> height>=50 && gender.equals("Male");

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	List<Person> list = PersonRepository.getAllPersons();
	list.forEach(per ->{
		if(heightAndGender.test(per.getHeight(), per.getGender())) {
			System.out.println(per);
		}
	});
	}
//try negate..give opposite result
}
