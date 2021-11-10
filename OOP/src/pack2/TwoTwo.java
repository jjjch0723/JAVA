package pack2;

import pack1.OneOne; //ctrl + shift + o 누르면 임포트 됨

public class TwoTwo {

	public static void main(String[] args) {
		TwoOne bbb = new TwoOne();
		//bbb.b;	b가 private이기 때문에 접근 불가능
		bbb.bb = 6;
		bbb.print();
		
		OneOne baa = new OneOne();
		//baa.a; a가 private이기 때문에 접근 불가능
		//baa.aa; aa가 default이기 때문에 접근 불가능
		//baa.aaa; aaa가 protected이지만 상속관계가 아니라 접근 불가능
		baa.aaaa = 6; //aaaa가 public이기 때문에 접근 가능
	}
}
