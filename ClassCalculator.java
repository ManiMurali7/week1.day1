package week1.day2;
public class ClassCalculator {
	public int add(int a, int b) { 
		int sum = a + b;
		return sum;
	}
	public double sub(double c, double d) { 
		double diff = c-d;
		return diff;
	}
	public double product(double e, double f) { 
		double prod = e*f;
		return prod;
	}
	public int division(int g, int h) { 
		int quat = g/h;
		return quat;
	}
	public static void main(String[] args) {
		ClassCalculator obj1 = new ClassCalculator();
		int sum = obj1.add(2,5);
		double diff = obj1.sub(3.5,1.8);
		double prod =obj1.product(4.5,9.5);
		int quat =obj1.division(7,4);
		System.out.println(sum);
		System.out.println(diff);
		System.out.println(prod);
		System.out.println(quat);
	}
}
