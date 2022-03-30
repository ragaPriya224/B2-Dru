package java8Demo;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

import java8Demo.POJO.Person;
import java8Demo.POJO.PersonRepository;

public class BiConsumerPersonExample {
	static List<Person> personList = PersonRepository.getAllPersons();
	static BiConsumer<String, List<String>> hobbies = (name, hobbies) ->
	System.out.println("Name is:" +name + " Hobbies is:" +hobbies );
	static BiConsumer<String, Double> income = (name, salary) ->
	System.out.println("Name is:" +name + " Salary is:" +salary );
	public static void main(String[] args) {
		fetchHobbies();
		fetchSalary();
	}
	//fetch hobbies
	static void fetchHobbies(){
		personList.forEach(per ->{
			hobbies.accept(per.getName(), per.getHobbies());
		});
	}
	//fetch name and salary
	static void fetchSalary() {
		personList.forEach(per ->{
			income.accept(per.getName(), per.getSalary());
		});
	}

}
