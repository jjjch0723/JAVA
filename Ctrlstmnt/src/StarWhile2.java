
public class StarWhile2 {

	public static void main(String[] args) {
		//--------------ù��° ū for��
		for(int i = 0; i < 6; i++) {
			
			//----------�ι�° for��
			for(int j = i; j<=5; j++) {
				System.out.print(" "); //--������ ���� 6ĭ 5ĭ...1ĭ ����
			}
			
			//----------����° for��
			for(int j = 0; j < i*2+1; j++) {
				System.out.print("*"); //--*Ȧ���� ���
			}
			
			System.out.println(" ");//--> �ٹٲٴ� ���
			//----------ū for���� ��
		}
	}

}
