package week1.day2.assignments;

public class MyCalculator {
	public static void main(String[] args) {
		Calculator obj = new Calculator();
		System.out.println(obj.add(1,2,3));
		System.out.println(obj.sub(5, 3));
		System.out.println(obj.mul(4.4, 5.2));
		System.out.println(obj.divide(2.3F, 4.2F));
	}
}
