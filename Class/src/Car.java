
public class Car {
	//field 
	String color;
	int speed;
	int gear;
	//method overloading 메소드 오버로딩
	
	public Car(String color, int speed, int gear) {
		this.color = color;
		this.speed = speed;
		this.gear = gear;
	}
	
//	Car(){
//		
//	}
	
//	Car(String color, int speed, int gear){
//		this.color = color;
//		this.speed = speed;
//		this.gear = gear;
//	}
	
	//method
	void changeGear(int g) {
		gear = g;
	}
	void speedUp() {
		speed += 10;
	}
	void speedDown() {
		speed -= 10;
	}
}