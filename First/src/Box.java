import java.util.Scanner;

public class Box {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double w, h, area, round;
		
		System.out.print("�簢���� ���θ� �Է��Ͻÿ�: ");
		w = scanner.nextDouble();
		System.out.print("�簢���� ���θ� �Է��Ͻÿ�: ");
		h = scanner.nextDouble();
		
		area = w * h;
		round = w*2 + h*2;
		
		System.out.println("�簢���� ���̴� :"+ area);
		System.out.println("�簢���� �ѷ��� :"+ round);
		scanner.close();
	}
}
