package pack1;

public class A {
	class B{
		B(){
		}
		int filed;
		void method1() {
			
		}
	}
	public static void main(String[] args) {
		A a = new A();
		A.B b = a.new B();
		b.filed = 3;
		b.method1();
	}
}
