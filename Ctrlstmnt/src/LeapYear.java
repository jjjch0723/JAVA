import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		while(true) {
		Scanner scn = new Scanner(System.in);
		int year;
		
		System.out.print("�⵵�� �Է��ϼ��� :");
		year = scn.nextInt();
		
		if(year%4==0 && year%100 !=0 || year%400==0)
			System.out.println(year + "���� ����(leap year)�Դϴ�.");
		else
			System.out.println(year + "���� ���(common year)�Դϴ�.");
		}
	}

}
