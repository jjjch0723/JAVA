package pack3;

public class GetterSetter {
	private String color;
	private int speed;
	private int gear;
	
	//getter -> 값을 가져오는것
	//setter -> 값을 변경하는것
	
	//---------------------------------------------------
	public String getColor() {
		return color;
	} // color getter
	public int getSpeed() {
		return speed;
	} // speed getter
	
	//---------------------------------------------------
	public void setSpeed(int speed) {
		this.speed = speed;
	} // speed setter
	public void setColor(String color) {
		this.color =  color;
	} // color setter
	
	//---------------------------------------------------
	public String fields() {
		String str = "Color = " + color +", Speed = " + speed + ", Gear = " + gear;
		return str;
	}
	//---------------------------------------------------
	//field 는 private로 
	@Override
	public String toString() {
		return "차의 색깔은 [color=" + color + "]";
	}
	
}
