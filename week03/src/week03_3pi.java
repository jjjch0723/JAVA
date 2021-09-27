import java.util.Scanner;

public class week03_3pi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double bunJa, bunMo, sum;
		int loop_count;
		
		Scanner count = new Scanner(System.in);
		bunMo = 1.0;
		bunJa = 4.0;
		sum =  0.0;
		System.out.print("반복횟수:");
		loop_count = count.nextInt();
		
		while(loop_count > 0) {
			sum = sum + bunJa / bunMo;
			bunJa = -1.0 * bunJa;
			bunMo = bunMo + 2.0;
			loop_count--;
		}
		
		System.out.println("파이는" + sum);
		count.close();
		
	}

}
