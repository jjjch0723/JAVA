
public class week03_3Lottery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int odds = 1;
		final int N = 45;
		final int k = 6;
		
		for(int i =1; i <=k; i++)
			odds = odds * (N - i + 1)/ i;
		
		System.out.println("·Î¶Ç 1µîÈ®·ü : 1/" + odds);
	}

}
