import java.util.Scanner;

public class CircleRound {
	public static void main(String[] args) {
		
		Scanner answer = new Scanner(System.in);// input�� �Է¹��� ������ ������ �̸�
		
		double r, a;
		
		System.out.print("������ �Է� : ");
		r = answer.nextDouble();
		a = 3.14 * r * r;
		//a = Math.PI * r * r;
		
		System.out.print("���� ������ : " + a);
		answer.close();
	}
}
