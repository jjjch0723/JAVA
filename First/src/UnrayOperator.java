
public class UnrayOperator {
	public static void main(String[] args) {
		int x = 1;
		int y = 1;
		
		int nextx = ++x; // 전위연산
		int nexty = y++; // 후위연산
		System.out.println(nextx);
		System.out.println(nexty);
	}
}
