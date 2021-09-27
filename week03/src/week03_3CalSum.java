
public class week03_3CalSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		int EvenSum = 0, OddSum = 0;
		
		while(i <= 10) {
			if(i%3 == 0)
				EvenSum = EvenSum + i;
			else
				OddSum += i;
			i++;
		}
		System.out.println("Â¦¼ö ÇÕ°è=" + EvenSum + ", È¦¼ö ÇÕ°è=" + OddSum);
	}

}
