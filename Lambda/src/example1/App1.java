package example1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class App1 {

	public static void main(String[] args) {
		//Lambda
		List<String> list = Arrays.asList("David", "Adam", "Evi", "Moses");
		list.sort((s1,s2) ->s1.compareTo(s2));
//		list.sort((s1,s2) ->s1.compareTo(s2)*-1);
//		list.sort((s1,s2) ->s2.compareTo(s1));
		System.out.println(list);
		
		
		
		
		//----
		List<String> list2 = new ArrayList<>();
		list2.add("David");
		list2.add("Adam");
		list2.add("Evi");
		list2.add("Moses");
		
		list2.sort(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		});

		System.out.println(list2);
		
		
		
		
		
		
		
		//Printer//OperatePrinter
		OperatePrinter operatePrinter = new OperatePrinter();
		operatePrinter.runPrinter((s) -> System.out.println(s));;

	}
	
	

}
