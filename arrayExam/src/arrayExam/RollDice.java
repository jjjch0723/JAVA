package arrayExam;

public class RollDice {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.print(Math.random() + " ");
		}
		System.out.println();
		
		for (int i = 0; i < 10; i++) {
			System.out.print(Math.random()*10 + " ");
		}
		System.out.println();
		
		for (int i = 0; i < 7; i++) {
			System.out.print((int)(Math.random()*45+1) + " ");
		}
		System.out.println();
	}

}
