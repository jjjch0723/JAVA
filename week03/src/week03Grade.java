import java.util.Scanner;

public class week03Grade {

	public static void main(String[] args) {

	int x;
	
	Scanner grade = new Scanner(System.in);
	
	System.out.print("학점을 입력하시오: ");
	x = grade.nextInt();

	if(x >= 90)
		System.out.println("A");
	else if(x >=80)
		System.out.println("B");
	else if(x >=70)
		System.out.println("C");
	else if(x >=60)
		System.out.println("D");
	else
		System.out.println("F");
	
	grade.close();
	}

}
