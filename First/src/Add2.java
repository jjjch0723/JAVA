import java.util.Scanner;

public class Add2 {
	public static void main(String[] args) {
		Scanner input =  new Scanner(System.in); //�Է¹������� �ʿ� input�� �ٲܼ�����
		
		int x, y, sum;
		
		
		System.out.print("ù��° ���ڸ� �Է��Ͻÿ� : ");  // �Է� �ȳ� ���
		x = input.nextInt(); // ����ڷκ��� ù ���� ���ڸ� �д´�.
		
		System.out.print("�ι�° ���ڸ� �Է��Ͻÿ� : "); // �Է� �ȳ� ���
		y = input.nextInt(); // ����ڷκ��� �� ��° ���ڸ� �д´�.
		
		sum = x + y;
		
		System.out.println("���� : " +sum);
		
		input.close();
	}
}
