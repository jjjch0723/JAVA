import java.util.Scanner;

public class Forstmnt {
	public static void main(String[] args) {
		int hap = 0;
		
		for (int i = 1; i <= 10; i++) {
			hap += i;
		}
		System.out.println("1���� 10������ ��" + hap);	
//------------------------------------------------------------------		
		Scanner scn = new Scanner(System.in);
//------------------------------------------------------------------		
		int strt, end;
		hap = 0;
		
		System.out.println("���� ���� :");
		
		strt = scn.nextInt();
		
		System.out.println("���� ���� :");
		
		end = scn.nextInt();
//-------------------------------------------------------------------		
		for (int i = strt; i <= end; i++) {
			hap += i;
		}
		System.out.println(strt + "����" +end+ "������ �� = " + hap);
//--------------------------------------------------------------------
		hap = 0;		//�ʱ�ȭ�Ƚ�Ű�� ���� hap�� ���Ͽ� ��� ����
		for (int i = strt; i <= end; i++) {
			if(i%2==0)
				hap += i;	
		}
		System.out.println(strt + "����" +end+ "������ �� �߿� ¦���� �� = " + hap);
//--------------------------------------------------------------------
		hap = 0;
		for (int i = strt; i <= end; i++) {
			if(i%7==0)
				continue; //���� ����, i�� 7 �� ����� �ǳʶپ 8���� ����
			hap += i;	
		}
		System.out.println(strt + "����" +end+ "������ �� �߿� 7�� ����� �� = " + hap);
//--------------------------------------------------------------------
		hap = 0;
		int i = 0;
		for(i =1; i<=10; i++) {
			hap += i;
			if(hap>30)
				break; //���� Ż��, ���� hap�� 30�̳Ѿ�� ���� ��������
		}
		System.out.println("1���� " + i + "������ �� = " + hap);
	}

}
