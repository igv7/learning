package example1;

import java.util.ArrayList;
import java.util.List;

public class StreamsExampleApp {

	public static void main(String[] args) {
		List<Person> people = new ArrayList<>();
		for (int i = 0; i < 10000; i++) {
			int cityInx = (int) (Math.random() * 8);
			int genderInx = (int) (Math.random() * 2);
			int letterInx = (int) (Math.random() * 24);
			people.add(new Person("!" + (char) ('a' + letterInx) + "!", (int) (Math.random() * 121),
					Gender.values()[genderInx], City.values()[cityInx], (char) i + ".St"));
		}
		System.out.println(people);
	}

}
