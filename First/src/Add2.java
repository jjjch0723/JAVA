import java.util.Scanner;

public class Add2 {
	public static void main(String[] args) {
		Scanner input =  new Scanner(System.in); //입력받으려면 필요 input만 바꿀수있음
		
		int x, y, sum;
		
		
		System.out.print("첫번째 숫자를 입력하시오 : ");  // 입력 안내 출력
		x = input.nextInt(); // 사용자로부터 첫 번쨰 숫자를 읽는다.
		
		System.out.print("두번째 숫자를 입력하시오 : "); // 입력 안내 출력
		y = input.nextInt(); // 사용자로부터 두 번째 숫자를 읽는다.
		
		sum = x + y;
		
		System.out.println("답은 : " +sum);
		
		input.close();
	}
}
