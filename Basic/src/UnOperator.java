
public class UnOperator {

	public static void main(String[] args) {
		int i, j;
		//���� ������ : ��ȣ, !, ~, ++, --
		// a + b <- ���ϱ� ������ ���� �ΰ�
		// a�� b�� ���մϴ�.
		
		i = 0;
		i = i+1;
		System.out.println(i);
		
		i = 0;
		i += 1;
		System.out.println(i);

		i = 0;
		i++;
		System.out.println(i);

		i = 0;
		++i;
		System.out.println(i);
		
		i = 0;
		j = ++i; //���� ����
		System.out.println("i = " + i  + ", j = " + j);

		i = 0;
		j = i++; //��������
		System.out.println("i = " + i  + ", j = " + j);
		
		
	}

}
