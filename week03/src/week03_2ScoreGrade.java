import java.util.Scanner;

public class week03_2ScoreGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score, number;
		char grade;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("성적입력: ");
		score = scan.nextInt();
		number = score/10;
		
		switch (number) 
		{
		case 10 :
		case 9 :
			grade = 'A';
			break;
		case 8 :
			grade = 'B';
			break;
		case 7 :
			grade = 'C';
			break;
		case 6 :
			grade = 'D';
			break;
		default :
			grade = 'F';
			break;
		}
		
		System.out.println("학점 :" + grade);
		scan.close();
	}

}
