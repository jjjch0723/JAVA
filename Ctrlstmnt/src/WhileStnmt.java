import java.util.Scanner;

public class WhileStnmt {

	public static void main(String[] args) {
			Scanner scn = new Scanner(System.in);
			int i, end, hap;
//----------------------------------------------------------------			
			hap = 0;
			
			i=1;
			
			while(i<10) {
				hap += i;
				i++;
			}
						
			System.out.println(hap);
//-----------------------------------------------------------------------------------------------	
			hap = 0;
			
			i=1;
			System.out.println("종료숫자를 입력하세요! :");
			end = scn.nextInt();
			while(i<=end) {
				hap += i;
				i++;
			}
			System.out.println(hap);
			hap = 0;
			int strt;
			for (int i = strt; i <= end; i++) {
				if(i%7==0)
					continue; //조건 생략, i가 7 의 배수면 건너뛰어서 8부터 시작
				hap += i;	
			}
			System.out.println(strt + "부터" +end+ "까지의 수 중에 7의 배수의 합 = " + hap);
//------------------------------------------------------------------------------------------------
			
			hap = 0;
			i = 1;
			while(i<=10) {
				if(i%7==0) {
					i++; // i++를 하지않으면 1~7부터 무한루프를 돌게 됨
					continue;
				}
				hap += i;
				i++;
			}
			System.out.println("7의 배수를 제외한 수의 합은 :" + hap);
			
		}

}
