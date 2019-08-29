package johnBryce;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		
		ArrayList<Person> persons=new ArrayList<>();
		
		persons.add(new Person(1, "Tal", "aaa", "www1", 70));
		persons.add(new Person(2, "Ben", "bbb", "www1", 80));
		persons.add(new Person(3, "Shay", "ccc", "www2", 100));
		

		System.out.println(Information.calcAvarege(persons));
		System.out.println(Information.numberOfPersons(persons));
		System.out.println(Information.numberOfPersonsDomain(persons, "www1"));
		System.out.println(Information.maxGrade(persons));
		System.out.println(Information.minGrade(persons));
		
	}

}
