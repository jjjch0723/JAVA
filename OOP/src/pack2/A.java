package pack2;

public class A {
	static class C{
		C(){}
		int field1;
		static int field2;
		//--------------------------------------------
		void method1() {};
		static void method2() {};
	}
	public static void main(String[] args) {
		A.C c = new A.C();
		//--------------------------------------------
		c.field1 = 3;
		c.method1();
		//--------------------------------------------
		A.C.field2 = 3;
		A.C.method2();
		
	}
	
}
