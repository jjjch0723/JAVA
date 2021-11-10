package pack1;

public class OneOneTest {
	public static void main(String[] args) {
		OneOne a11 = new OneOne();
		
		a11.print(); //default라서 메소드 호출 가능
		a11.aa = 6;  //aa 는 OneOne클래서에서 default로 선언했기때문에 접근 가능
		
//		a11.a; --> private int a;라고 선언해서 사용못함
	}
}
