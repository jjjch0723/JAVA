package pack1;

public class OneOneTest {
	public static void main(String[] args) {
		OneOne a11 = new OneOne();
		
		a11.print(); //default�� �޼ҵ� ȣ�� ����
		a11.aa = 6;  //aa �� OneOneŬ�������� default�� �����߱⶧���� ���� ����
		
//		a11.a; --> private int a;��� �����ؼ� ������
	}
}
