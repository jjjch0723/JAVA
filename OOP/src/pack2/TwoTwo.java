package pack2;

import pack1.OneOne; //ctrl + shift + o ������ ����Ʈ ��

public class TwoTwo {

	public static void main(String[] args) {
		TwoOne bbb = new TwoOne();
		//bbb.b;	b�� private�̱� ������ ���� �Ұ���
		bbb.bb = 6;
		bbb.print();
		
		OneOne baa = new OneOne();
		//baa.a; a�� private�̱� ������ ���� �Ұ���
		//baa.aa; aa�� default�̱� ������ ���� �Ұ���
		//baa.aaa; aaa�� protected������ ��Ӱ��谡 �ƴ϶� ���� �Ұ���
		baa.aaaa = 6; //aaaa�� public�̱� ������ ���� ����
	}
}
