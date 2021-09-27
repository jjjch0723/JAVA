//import java.sql.Date; 안씀..

import java.util.Calendar;

public class week03Welcom {

	public static void main(String[] args) {
		
//		Date date = new Date();
//		int currentHour = date.getHours(); 안씀..
		
		
		Calendar calendar = Calendar.getInstance();
		int currentHour = calendar.get(Calendar.HOUR_OF_DAY);
		int minutes = calendar.get(Calendar.MINUTE);
		int seconds = calendar.get(Calendar.SECOND);
		
		//현재시간 나타내는 출력문
		
		System.out.println("현재시간은 "+ calendar + minutes +  seconds);
		
		//조건문
		
		if (currentHour < 11)
			System.out.println("Good Mornig");
		
		else if (currentHour < 15)
			System.out.println("Good Afternoon");
		
		else if (currentHour < 19)
			System.out.println("Good Evening");
		
		else
			System.out.println("Good Night");
	}

}
