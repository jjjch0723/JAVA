import java.util.Scanner;

public class LogOperator {

	public static void main(String[] args) {
		boolean i,j;
		
		//�� ������ : ������ ���� ���� ����� ����(true, false)
		// == != > >= < <=
		
		Scanner scn = new Scanner(System.in);
		
		System.out.print("ù ��° ���� �Է� : ");
		i = scn.nextBoolean(); 
		// i�� ���� ������� boolean�̾ nextBoolean���
		
		System.out.print("�� ��° ���� �Է� : ");
		j = scn.nextBoolean(); 
		// j�� ���� ������� boolean�̾ nextBoolean���
		
		System.out.println("!" + i + " --> " + (!i)); //�� ����
		System.out.println(i + " && " + j +  " --> " + (i&&j)); // and 
		System.out.println(i + "  || " + j +  " --> " + (i||j)); // or
		
		// ��ȣ -> ����,���� -> ��� -> ����Ʈ -> ���� -> �� -> ���� -> 
	}
}
