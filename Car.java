package week1.day1.assignments;

public class Car {

	public void applyBreak() {
		System.out.println("apply break");
	}
	public void applyGear(){
		System.out.println("apply gear");
	}
	public void switchonAc(){
		System.out.println("switchonAc");
	}
	public void applyAcclerate(){
		System.out.println("applyAcclerate");
	}
	public static void main(String[] args) {
		Car obj1 = new Car();
		obj1.applyAcclerate();
		obj1.applyBreak();
		obj1.applyGear();
		obj1.switchonAc();
	}
}
