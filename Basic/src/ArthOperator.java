import java.util.Scanner;

public class ArthOperator {

	public static void main(String[] args) {
		int i, j;
		//산술 연산자. * / + - 수와 수를 연산해서 수를 내어주는 연산자
		Scanner scn = new Scanner(System.in);
		System.out.print("첫 번째 정수 입력 : ");
		i = scn.nextInt(); //입력받은걸 i에 저장
		System.out.print("두 번째 정수 입력 : ");
		j = scn.nextInt(); //입력받은걸 i에 저장
		System.out.println(i + "X" + j + "=" + (i*j));
		System.out.println(i + "/" + j + "=" + ((double)i/j));
		System.out.println(i + "%" + j + "=" + (i%j));
		System.out.println(i + "+" + j + "=" + (i+j));
		System.out.println(i + "-" + j + "=" + (i-j));
		scn.close();
	}

}
