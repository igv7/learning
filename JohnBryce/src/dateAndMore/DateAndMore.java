package dateAndMore;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateAndMore {

	public static void main(String[] args) {
		
		Date date = new Date();
		
		SimpleDateFormat formatForDate = new SimpleDateFormat("dd/MM/yy   'Time:' HH:mm:ss");
		
		System.out.println("Option 1");
		System.out.println("Date: "+formatForDate.format(date));
		
		System.out.println();
		
		System.out.println("Option 2");
		System.out.printf("Date: "+"%td/%<tm/%<ty" +  "   Time: "+"%<tH:%<tM:%<tS", date);
		
		System.out.println();
		System.out.println();
		System.out.printf("%td/%<tm/%<ty", date);
		System.out.println();
		System.out.printf("%tH:%<tM:%<tS", date);
		
//		long tick = System.currentTimeMillis();
//		System.out.println(tick);
//		System.out.println(new Date());
//		System.out.println(new Date(tick));
//		System.out.println(date.toString());

	}

}
