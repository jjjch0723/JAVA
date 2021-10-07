
public class StarWhile2 {

	public static void main(String[] args) {
		//--------------첫번째 큰 for문
		for(int i = 0; i < 6; i++) {
			
			//----------두번째 for문
			for(int j = i; j<=5; j++) {
				System.out.print(" ");
			}
			
			//----------세번째 for문
			for(int j = 0; j < i*2+1; j++) {
				System.out.print("*");
			}
			
			System.out.println(" ");
			//----------큰 for문의 끝
		}
	}

}
