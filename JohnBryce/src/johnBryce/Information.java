package johnBryce;

import java.util.ArrayList;
//import java.util.Iterator;
//import java.util.Iterator;

public class Information {
	
	public static double calcAvarege(ArrayList<Person>persons) {
		
		if(persons==null) {
			return -1;
		}
		
		double sum = 0;
		for(Person p: persons) {
			sum+=p.getGrade();
		}
		return sum/persons.size();
		
	}
	
	public static int numberOfPersons(ArrayList<Person>persons) {
		
		if (persons==null) {
			return -1;
		}
		return persons.size();
	}
	
	public static int numberOfPersonsDomain(ArrayList<Person>persons, String domain) {
		
		if (persons==null) {
			return -1;
		}
		int count = 0;
		for(Person p: persons) {
			if (p.getDomain().equals(domain)) {
				count++;
			}
		}
		return count;
	}
	
	public static int maxGrade(ArrayList<Person>persons) {
		
		if (persons==null) {
			return -1;
		}
		int max = 0;
		for(Person p: persons) {
			if (p.getGrade()>max) {
				max=(int) p.getGrade();
			}
		}
		return max;
	}
	
	public static int minGrade(ArrayList<Person>persons) {
		
		if (persons==null) {
			return -1;
		}
		int max = 0;
		int temp = 0;
		int min = 0;
		for(Person p: persons) {
			if (p.getGrade()>max) {
				min=temp;
				temp=max;
				max=(int) p.getGrade();
			}
		}
		return min;
	}

}
