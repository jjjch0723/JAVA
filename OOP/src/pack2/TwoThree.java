package pack2;

import pack1.OneOne;

public class TwoThree extends OneOne {
	
	public static void main(String[] args) {
		
		OneOne bbaa = new OneOne();
//		bbaa.a; 	private
//		bbaa.aa;	default
//		bbaa.aaa = 5;		  protected
		bbaa.aaaa = 4;		//public
		
		TwoThree bbaaa = new TwoThree();
//		bbaaa.a = 1; 	private
//		bbaaa.aa = 2;	default
		bbaaa.aaa = 5;		//protected  ������ ��ü(5��)�� ����� �ؾߵ�
		bbaaa.aaaa = 6;		//public
	}
}
