import java.util.Scanner;

public class week03_3NumberGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int answer = 46, tries = 0, guess;
		
		Scanner scan = new Scanner(System.in);
		 
		do {
			System.out.println("정답추측시작!");
			guess = scan.nextInt();
			tries++;
			
			if(guess > answer)
				System.out.println("답보다 높아요");
			if(guess < answer)
				System.out.println("답보다 낮아요");
		}
		while(guess != answer);
		
		System.out.println("정답입니다!, 시도횟수 = " + tries);
		scan.close();
	}

}
