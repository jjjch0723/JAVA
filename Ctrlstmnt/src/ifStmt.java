import java.util.Scanner;

public class ifStmt {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int age;
		
		System.out.print("���� �Է��ϼ��� : ");
		age = scn.nextInt();
		
		int ent = 1000000;
		if(age < 19)
			ent = 50000;
		
		System.out.println("���� : " + age + " ����� -> " + ent +"��");
	}

}
