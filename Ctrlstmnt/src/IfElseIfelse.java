import java.util.Scanner;

public class IfElseIfelse {

	public static void main(String[] args) {
			Scanner scn = new Scanner(System.in);
			
			int age, ent;
			
			System.out.print("���� �Է��ϼ��� : ");
			age = scn.nextInt();
			
			if(age < 19)
				ent = 50000;
			else if(age < 66)
				ent = 50000;
			else
				ent = 100000;
			
			System.out.println("���� : " + age + " ����� -> " + ent +"��");
	}

}
