
public class week03_4ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s[] = new int[10];		//heap메모리영역에 만들어짐 
		
		for (int i = 0; i < s.length; i++) {
			s[i] = i;
		}
		
		for (int i = 0; i < s.length; i++) {
			System.out.print(s[i] + " ");
		}
	}

}
