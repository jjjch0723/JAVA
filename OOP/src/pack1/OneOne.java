package pack1;
 // access modify
public class OneOne {
	private int a;
	int aa;
	protected int aaa;
	public int aaaa;
	

	public OneOne(int a, int aa) {
		super();
		this.a = a;
		this.aa = aa;
	}

	public OneOne() {
		super();
	}

	public OneOne(int a) {
		super();
		this.a = a;
	}


	void print() {
		System.out.println("OneOne class에서 만든 객체 입니다.");
	}
}
