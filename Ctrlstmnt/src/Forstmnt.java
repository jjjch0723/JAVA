import java.util.Scanner;

public class Forstmnt {
	public static void main(String[] args) {
		int hap = 0;
		
		for (int i = 1; i <= 10; i++) {
			hap += i;
		}
		System.out.println("1부터 10까지의 합" + hap);	
//------------------------------------------------------------------		
		Scanner scn = new Scanner(System.in);
//------------------------------------------------------------------		
		int strt, end;
		hap = 0;
		
		System.out.println("시작 숫자 :");
		
		strt = scn.nextInt();
		
		System.out.println("종료 숫자 :");
		
		end = scn.nextInt();
//-------------------------------------------------------------------		
		for (int i = strt; i <= end; i++) {
			hap += i;
		}
		System.out.println(strt + "부터" +end+ "까지의 합 = " + hap);
//--------------------------------------------------------------------
		hap = 0;		//초기화안시키면 전에 hap과 더하여 결과 나옴
		for (int i = strt; i <= end; i++) {
			if(i%2==0)
				hap += i;	
		}
		System.out.println(strt + "부터" +end+ "까지의 수 중에 짝수의 합 = " + hap);
//--------------------------------------------------------------------
		hap = 0;
		for (int i = strt; i <= end; i++) {
			if(i%7==0)
				continue; //조건 생략, i가 7 의 배수면 건너뛰어서 8부터 시작
			hap += i;	
		}
		System.out.println(strt + "부터" +end+ "까지의 수 중에 7의 배수의 합 = " + hap);
//--------------------------------------------------------------------
		hap = 0;
		int i = 0;
		for(i =1; i<=10; i++) {
			hap += i;
			if(hap>30)
				break; //조건 탈출, 조건 hap이 30이넘어가는 순간 빠져나감
		}
		System.out.println("1부터 " + i + "까지의 합 = " + hap);
	}

}
