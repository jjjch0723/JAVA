import java.util.Scanner;

public class ArrayTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int STUDENT = 5;
		int total = 0;
		Scanner scan = new Scanner(System.in);
		
		int []score = new int [STUDENT]; // �迭�� �ʱ�ȭ
		
		for (int i = 0; i < score.length; i++) {
			System.out.print((i+1) + "�� �л� �����Է�");
			score[i] = scan.nextInt();
		}
		
		for (int i = 0; i < score.length; i++) {
			total += score[i];
		}
		
		System.out.println("��� ������" + total / STUDENT + "�Դϴ�");
	}

}
