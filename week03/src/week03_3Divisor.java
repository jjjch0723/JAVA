import java.util.Scanner;

//��� ���ϱ�
public class week03_3Divisor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scan = new Scanner(System.in);
		 System.out.print("���� ���� �Է�: " );
		 int n = scan.nextInt();
		 
		 System.out.println(n + "�� ����� ������ �����ϴ�.");
		 for(int i = 1; i <= n; ++i)
			 if(n % i ==0)
				 System.out.print(" "+ i);
		 scan.close();
		 
	}

}