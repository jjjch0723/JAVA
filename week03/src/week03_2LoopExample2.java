import java.util.Scanner;

public class week03_2LoopExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		int i = 1;
		Scanner gugu = new Scanner(System.in);
		System.out.print("������ �߿��� ����ϰ� ���� ���� �Է��ϼ���");
		
		n = gugu.nextInt();
		while(i <= 9) {
			System.out.println(n + "x" + i + "=" + n*i);
			i++;
		}
		gugu.close();
	}

}
