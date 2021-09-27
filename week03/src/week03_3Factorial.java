import java.util.Scanner;

public class week03_3Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long fact = 1;
		int n;
		
		System.out.print("정수입력");
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		
		for(int i = 1; i<=n; i++)
			fact = fact*i;
		
		System.out.printf("%d!은 %d입니다.", n, fact);
		scan.close();
	}

}
