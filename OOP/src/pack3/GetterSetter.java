package pack3;

public class GetterSetter {
	private String color;
	private int speed;
	private int gear;
	
	//getter -> ���� �������°�
	//setter -> ���� �����ϴ°�
	
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
	//field �� private�� 
	@Override
	public String toString() {
		return "���� ������ [color=" + color + "]";
	}
	
}
