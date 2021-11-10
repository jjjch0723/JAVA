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
			System.out.println("원하는 좌석번호 입력(종료는 -1) : ");
			int s = scn.nextInt();
			
			if(s == -1)
				break;
			
			if(seats[s-1] == 0) {
				seats[s-1] = 1;
				System.out.println("예약 되었습니다.");
			}
			
			else {
				System.out.println("이미 예약된 좌석입니다");
			}
		}
		
	}

}
