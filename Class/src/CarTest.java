
public class CarTest {

	public static void main(String[] args) {
		Car myCar = new Car("Gray", 10, 2);
		System.out.println(myCar.color+" "+myCar.speed+" "+myCar.gear);
		//°´Ã¼ myCar
		myCar.changeGear(1);
		myCar.speedUp();
		myCar.color = "Black";
		System.out.println(myCar.speed);
		System.out.println(myCar.color);
		
		//°´Ã¼ yourCar
//		Car yourCar = new Car();
//		yourCar.color="White";
//		System.out.println(yourCar.color);
	}

}