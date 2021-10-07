import java.util.Scanner;

public class ifStmt {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int age;
		
		System.out.print("나이 입력하세요 : ");
		age = scn.nextInt();
		
		int ent = 1000000;
		if(age < 19)
			ent = 50000;
		
		System.out.println("나이 : " + age + " 입장료 -> " + ent +"원");
	}

}
