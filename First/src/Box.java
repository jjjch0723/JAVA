import java.util.Scanner;

public class Box {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double w, h, area, round;
		
		System.out.print("사각형의 가로를 입력하시오: ");
		w = scanner.nextDouble();
		System.out.print("사각형의 세로를 입력하시오: ");
		h = scanner.nextDouble();
		
		area = w * h;
		round = w*2 + h*2;
		
		System.out.println("사각형의 넓이는 :"+ area);
		System.out.println("사각형의 둘레는 :"+ round);
		scanner.close();
	}
}
