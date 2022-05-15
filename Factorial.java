package week1.day1.assignments;

public class Factorial {
public static void main(String[] args) {
	int inp = 5;
	int fact =1;
	for (int i =inp; i > 0; i--) {
		fact=i*fact;
		}
	System.out.println("Factorial = "+fact);
}
}
