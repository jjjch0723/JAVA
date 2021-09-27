import java.util.Scanner;

public class week03Bonus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	final int TargetSales = 1000; //final int 는 가급적 대문자로 숫자의 의미를 전달하기 위해
	int mySales, bonus;
	String result;
	
	Scanner input = new Scanner(System.in);
	System.out.print("실적을 입력하시오(단위: 만원) :");
	mySales = input.nextInt();
	
	if(mySales >= TargetSales) 
		{
			result = "실적달성";
			bonus = (mySales - TargetSales) / 10;
		}
	else
		{
			result = "실적달성못함";
			bonus = 0;
		}
	
	System.out.println(result + "\n" + "보너스:(단위 : 만원)" + bonus);
	input.close();
	}

}
