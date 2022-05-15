package week1.day1.assignments;

public class FibonacciSeries {
	public static void main(String[] args) {
		int a = 0;
		int b = 1; 
		int sum; 
		System.out.println("Fibonacci Series");
		System.out.println(a);
		System.out.println('1');
		for (int i = 0; i < 6; i++) {
			sum = a+b;
			a=b;
			b=sum;
			System.out.println(sum);
		}
	}	

}

