
public class People {
	String name;
	int age;
	boolean sex;
	int height;
	
	People(String name){
		this.name = name;
	}
	
	void changeHegiht(int h) {
		height = h;
	}
	void changeAge() {
		age++;
	}

	public People(String name, int age, boolean sex, int height) {
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.height = height;
	}
	
}
