import java.util.Scanner;

public class LogOperator {

	public static void main(String[] args) {
		boolean i,j;
		
		//논리 연산자 : 논리값과 논리값 연산 결과는 논리값(true, false)
		// == != > >= < <=
		
		Scanner scn = new Scanner(System.in);
		
		System.out.print("첫 번째 논리값 입력 : ");
		i = scn.nextBoolean(); 
		// i의 변수 저장명이 boolean이어서 nextBoolean사용
		
		System.out.print("두 번째 논리값 입력 : ");
		j = scn.nextBoolean(); 
		// j의 변수 저장명이 boolean이어서 nextBoolean사용
		
		System.out.println("!" + i + " --> " + (!i)); //논리 부정
		System.out.println(i + " && " + j +  " --> " + (i&&j)); // and 
		System.out.println(i + "  || " + j +  " --> " + (i||j)); // or
		
		// 괄호 -> 부정,긍정 -> 산술 -> 쉬프트 -> 관계 -> 논리 -> 삼항 -> 
	}
}
