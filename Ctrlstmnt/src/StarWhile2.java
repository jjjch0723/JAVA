
public class StarWhile2 {

	public static void main(String[] args) {
		//--------------첫번째 큰 for문
		for(int i = 0; i < 6; i++) {
			
			//----------두번째 for문
			for(int j = i; j<=5; j++) {
				System.out.print(" "); //--위에서 부터 6칸 5칸...1칸 띄우기
			}
			
			//----------세번째 for문
			for(int j = 0; j < i*2+1; j++) {
				System.out.print("*"); //--*홀수개 출력
			}
			
			System.out.println(" ");//--> 줄바꾸는 명령
			//----------큰 for문의 끝
		}
	}

}
