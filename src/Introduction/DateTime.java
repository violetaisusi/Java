package Introduction;

import java.util.*;

/**
 * Calendar - https://docs.oracle.com/javase/7/docs/api/java/util/Calendar.html
 * @author violeta
 *
 */
public class DateTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner in = new Scanner(System.in);
	        String month = in.next();
	        String day = in.next();
	        String year = in.next();
	        
	        System.out.println(getDay(day, month, year));
		
		

	}
	
	public static String getDay(String day, String month, String year) {
		//Java 7
		Calendar calendar = new GregorianCalendar();

		calendar.setTimeZone(TimeZone.getTimeZone("Europe/London"));
		calendar.clear();
		//Months start by 0 !!!!!!!!!!!!!!!!!
		calendar.set(Integer.parseInt(year), Integer.parseInt(month)-1, Integer.parseInt(day));
		
		int dayweek = calendar.get(Calendar.DAY_OF_WEEK);
		String sdayweek="";
		
		if(dayweek==Calendar.MONDAY) sdayweek="MONDAY";
		else if(dayweek==Calendar.TUESDAY) sdayweek="TUESDAY";
		else if(dayweek==Calendar.WEDNESDAY) sdayweek="WEDNESDAY";
		else if(dayweek==Calendar.THURSDAY) sdayweek="THURSDAY";
		else if(dayweek==Calendar.FRIDAY) sdayweek="FRIDAY";
		else if(dayweek==Calendar.SATURDAY) sdayweek="SATURDAY";
		else if(dayweek==Calendar.SUNDAY) sdayweek="SUNDAY";
		
		return sdayweek;
		
        //Java 8
		//LocalDate dt = LocalDate.of(yy, mm, dd);
		//System.out.print(dt.getDayOfWeek());
    }

}
