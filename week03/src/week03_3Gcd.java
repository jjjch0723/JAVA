import java.util.Scanner;

public class week03_3Gcd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x, y, r;
		System.out.print("�ΰ��� ������ �Է��Ͻÿ�(ū��, ������) : ");
		Scanner input = new Scanner(System.in);
		x = input.nextInt();
		y = input.nextInt();
		
		while (y != 0) {
			r = x%y;
			x = y;
			y = r;
		}
		System.out.println("�ִ� ������� " +x);
		input.close();
	}

}
