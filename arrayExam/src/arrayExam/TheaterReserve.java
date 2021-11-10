package arrayExam;

import java.util.Scanner;

public class TheaterReserve {

	public static void main(String[] args) {
		final int SIZE = 10;
		int [] seats = new int[SIZE];
		Scanner scn = new Scanner(System.in);
		
		while(true) {
			System.out.println("---------------------------------");
			for (int i = 0; i < SIZE; i++) {
				System.out.print((i+1) + "         ");
			}
			System.out.println("---------------------------------");
			for (int i = 0; i < SIZE; i++) {
				System.out.print(seats[i] + "         ");
			}
			System.out.println("---------------------------------");
			System.out.println("���ϴ� �¼���ȣ �Է�(����� -1) : ");
			int s = scn.nextInt();
			
			if(s == -1)
				break;
			
			if(seats[s-1] == 0) {
				seats[s-1] = 1;
				System.out.println("���� �Ǿ����ϴ�.");
			}
			
			else {
				System.out.println("�̹� ����� �¼��Դϴ�");
			}
		}
		
	}

}
