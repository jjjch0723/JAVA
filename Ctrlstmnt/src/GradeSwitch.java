import java.util.Scanner;

public class GradeSwitch {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int score;
		char grade;
		
		while(true) {
			System.out.print("������ �Է��ϼ��� : ");
			score = scn.nextInt();
			
		if(score > 0 && score <11) {
			switch(score) {
				case 10:
				case 9:
					grade = 'A'; break;
				case 8:
					grade = 'B'; break;
				case 7:
					grade = 'C'; break;
				case 6:
					grade = 'D'; break;
				default :
					grade = 'F'; break;
				}
			System.out.println("������ "+ score + "�̰� �����" + grade + "�Դϴ�");
		}
		else
			System.out.println(score + "�� �߸��� ���� �Դϴ�.");
		}
	}
}
