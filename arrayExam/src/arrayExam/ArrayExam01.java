package arrayExam;

import java.util.Scanner;

public class ArrayExam01 {
	public static void main(String[] args) {
//		final int Number  = 10; 
		int[] score = {99, 89, 24, 68, 100};
		int hap = 0; 
		double avg = 0.0; 
		
		int min, max;
		
//		Scanner input = new Scanner(System.in);

//		for (int i = 0; i < score.length; i++) {
//			System.out.print((i+1) + "�� �л� ���� : ");
//			score[i] = input.nextInt();
//		}
		min = score[0];
		max = score[0];
		
		for (int i = 0; i < score.length; i++) {
			if(min > score[i])
				min = score[i];
			if(max < score[i])
				max = score[i];
		}
		
		for (int i = 0; i < score.length; i++) {
			hap += score[i];
		}
		
		avg = (double)hap/score.length;
		
		System.out.println("Score�迭�� �ε����� �� : " + hap);
		System.out.println("Score�迭�� �ε����� ��� : " + avg);
		System.out.println("Score�迭�� �ε����� ū�� : " + max);
		System.out.println("Score�迭�� �ε����� ������ : " + min);
	}

}
