import java.util.Scanner;

public class ArrayTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int STUDENT = 5;
		int total = 0;
		Scanner scan = new Scanner(System.in);
		
		int []score = new int [STUDENT]; // 배열의 초기화
		
		for (int i = 0; i < score.length; i++) {
			System.out.print((i+1) + "번 학생 성적입력");
			score[i] = scan.nextInt();
		}
		
		for (int i = 0; i < score.length; i++) {
			total += score[i];
		}
		
		System.out.println("평균 성적은" + total / STUDENT + "입니다");
	}

}
