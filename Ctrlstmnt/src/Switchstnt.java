import java.util.Scanner;

public class Switchstnt {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int month, year, days = 0;
		
		
		System.out.print("���� �Է��ϼ��� : ");
		year = scn.nextInt();
		
		System.out.print("���� �Է��ϼ��� : ");
		month = scn.nextInt();
		
		switch(month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			days = 31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			days = 30;
			break;
		case 2:
			if(year%4==0 && year%100 !=0 || year%400==0)
				days = 29;
			else
				days =28;
	
		}
		System.out.print(year + "��" + month+ "��" + days +"���Դϴ�.");
	}
}
