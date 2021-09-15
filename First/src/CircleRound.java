import java.util.Scanner;

public class CircleRound {
	public static void main(String[] args) {
		
		Scanner answer = new Scanner(System.in);// input은 입력받은 변수를 저장할 이름
		
		double r, a;
		
		System.out.print("반지름 입력 : ");
		r = answer.nextDouble();
		a = 3.14 * r * r;
		//a = Math.PI * r * r;
		
		System.out.print("원의 면적은 : " + a);
		answer.close();
	}
}
