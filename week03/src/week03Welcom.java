//import java.sql.Date; �Ⱦ�..

import java.util.Calendar;

public class week03Welcom {

	public static void main(String[] args) {
		
//		Date date = new Date();
//		int currentHour = date.getHours(); �Ⱦ�..
		
		
		Calendar calendar = Calendar.getInstance();
		int currentHour = calendar.get(Calendar.HOUR_OF_DAY);
		int minutes = calendar.get(Calendar.MINUTE);
		int seconds = calendar.get(Calendar.SECOND);
		
		//����ð� ��Ÿ���� ��¹�
		
		System.out.println("����ð��� "+ calendar + minutes +  seconds);
		
		//���ǹ�
		
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
