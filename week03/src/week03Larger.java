import java.util.Scanner; //Scanner라이브러리 임포트

public class week03Larger {

	public static void main(String[] args) {
		int x,y,max;
		
		Scanner number = new Scanner(System.in); // 입력받을 정수를 저장할 변수의 이름 = number
		
		System.out.print("첫번째 정수");
		x = number.nextInt(); //입력하기 위해 필요
		
		System.out.print("두번째 정수");
		y = number.nextInt();
		
//		if(x>y)
//			max = x;
//		else
//			max = y;
		
		max = (x>y) ? x : y;//(조건식{ex)x>y}) ? 참일 경우 : 거짓일 경우 {ex) x : y} c언어랑같음 
		
		System.out.println("큰 수는" + max);
		
		number.close();
	}

}
