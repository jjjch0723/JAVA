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
			System.out.println("������ڸ� �Է��ϼ���! :");
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
					continue; //���� ����, i�� 7 �� ����� �ǳʶپ 8���� ����
				hap += i;	
			}
			System.out.println(strt + "����" +end+ "������ �� �߿� 7�� ����� �� = " + hap);
//------------------------------------------------------------------------------------------------
			
			hap = 0;
			i = 1;
			while(i<=10) {
				if(i%7==0) {
					i++; // i++�� ���������� 1~7���� ���ѷ����� ���� ��
					continue;
				}
				hap += i;
				i++;
			}
			System.out.println("7�� ����� ������ ���� ���� :" + hap);
			
		}

}
