package pack3;

public class GetterSetterTest {
	public static void main(String[] args) {
		GetterSetter gs = new GetterSetter();
		GetterSetter gs2 =  new GetterSetter();
		gs.setColor("White");
		gs2.setColor("Black");
		System.out.println(gs.getColor());
		System.out.println(gs.fields());
		System.out.println(gs2.fields());
		System.out.println(gs);
		System.out.println(gs2);
		
		
	}
}
