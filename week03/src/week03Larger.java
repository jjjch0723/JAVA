import java.util.Scanner; //Scanner���̺귯�� ����Ʈ

public class week03Larger {

	public static void main(String[] args) {
		int x,y,max;
		
		Scanner number = new Scanner(System.in); // �Է¹��� ������ ������ ������ �̸� = number
		
		System.out.print("ù��° ����");
		x = number.nextInt(); //�Է��ϱ� ���� �ʿ�
		
		System.out.print("�ι�° ����");
		y = number.nextInt();
		
//		if(x>y)
//			max = x;
//		else
//			max = y;
		
		max = (x>y) ? x : y;//(���ǽ�{ex)x>y}) ? ���� ��� : ������ ��� {ex) x : y} c�������� 
		
		System.out.println("ū ����" + max);
		
		number.close();
	}

}
