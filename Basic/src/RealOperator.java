import java.util.Scanner;

public class RealOperator {

	public static void main(String[] args) {
		int i,j;
		//관계 연산자 : 수와 수를 연산 결과는 논리값(true, false)
		// == != > >= < <=
		Scanner scn = new Scanner(System.in);
		System.out.print("첫 번째 정수 입력 : ");
		i = scn.nextInt(); //입력받은걸 i에 저장
		System.out.print("두 번째 정수 입력 : ");
		j = scn.nextInt(); //입력받은걸 i에 저장
		
		System.out.println(i + "==" + j +  "-->" + (i==j));
		System.out.println(i + "!=" + j +  "-->" + (i!=j));
		System.out.println(i + ">" + j +  "-->" + (i>j));
		System.out.println(i + ">=" + j +  "-->" + (i>=j));
		System.out.println(i + "<" + j +  "-->" + (i<j));
		System.out.println(i + "<=" + j +  "-->" + (i<=j));
		
	}

}
