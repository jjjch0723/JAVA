import java.util.Scanner;

public class RealOperator {

	public static void main(String[] args) {
		int i,j;
		//���� ������ : ���� ���� ���� ����� ����(true, false)
		// == != > >= < <=
		Scanner scn = new Scanner(System.in);
		System.out.print("ù ��° ���� �Է� : ");
		i = scn.nextInt(); //�Է¹����� i�� ����
		System.out.print("�� ��° ���� �Է� : ");
		j = scn.nextInt(); //�Է¹����� i�� ����
		
		System.out.println(i + "==" + j +  "-->" + (i==j));
		System.out.println(i + "!=" + j +  "-->" + (i!=j));
		System.out.println(i + ">" + j +  "-->" + (i>j));
		System.out.println(i + ">=" + j +  "-->" + (i>=j));
		System.out.println(i + "<" + j +  "-->" + (i<j));
		System.out.println(i + "<=" + j +  "-->" + (i<=j));
		
	}

}
