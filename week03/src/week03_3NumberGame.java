import java.util.Scanner;

public class week03_3NumberGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int answer = 46, tries = 0, guess;
		
		Scanner scan = new Scanner(System.in);
		 
		do {
			System.out.println("������������!");
			guess = scan.nextInt();
			tries++;
			
			if(guess > answer)
				System.out.println("�亸�� ���ƿ�");
			if(guess < answer)
				System.out.println("�亸�� ���ƿ�");
		}
		while(guess != answer);
		
		System.out.println("�����Դϴ�!, �õ�Ƚ�� = " + tries);
		scan.close();
	}

}
