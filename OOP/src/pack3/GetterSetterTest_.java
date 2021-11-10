package pack3;

public class GetterSetterTest_ {
	private String color;
	private int speed;
	private int gear;
	
	//getter -> 값을 가져오는것
	//setter -> 값을 변경하는것
	
	//---------------------------------------------------
	public String Color() {
		return color;
	} // color getter
	public int Speed() {
		return speed;
	} // speed getter
	
	//---------------------------------------------------
	public void Speed(int speed) {
		this.speed = speed;
	} // speed setter
	public void Color(String color) {
		this.color =  color;
	} // color setter
	
	//---------------------------------------------------
	public String fields() {
		String str = "Color = " + color +", Speed = " + speed + ", Gear = " + gear;
		return str;
	}
	//---------------------------------------------------
	//field 는 private로 
	
}
