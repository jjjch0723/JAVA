import java.util.Scanner;

public class week03Bonus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	final int TargetSales = 1000; //final int �� ������ �빮�ڷ� ������ �ǹ̸� �����ϱ� ����
	int mySales, bonus;
	String result;
	
	Scanner input = new Scanner(System.in);
	System.out.print("������ �Է��Ͻÿ�(����: ����) :");
	mySales = input.nextInt();
	
	if(mySales >= TargetSales) 
		{
			result = "�����޼�";
			bonus = (mySales - TargetSales) / 10;
		}
	else
		{
			result = "�����޼�����";
			bonus = 0;
		}
	
	System.out.println(result + "\n" + "���ʽ�:(���� : ����)" + bonus);
	input.close();
	}

}
