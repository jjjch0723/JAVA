import java.util.Scanner;

public class IfElseIfelse {

	public static void main(String[] args) {
			Scanner scn = new Scanner(System.in);
			
			int age, ent;
			
			System.out.print("나이 입력하세요 : ");
			age = scn.nextInt();
			
			if(age < 19)
				ent = 50000;
			else if(age < 66)
				ent = 50000;
			else
				ent = 100000;
			
			System.out.println("나이 : " + age + " 입장료 -> " + ent +"원");
	}

}
