package week1.day2;

public class ArmStringNumber {
	public static void main(String[] args) {
		int inp = 153;
		int num = inp;
		int arm = 0;
		while (num>0) {
			int rem = num%10;
			arm = arm + (rem*rem*rem) ;
			num = num/10;
		}
		if (inp==arm) {
			System.out.println(inp+" is a armstrong number");
		}
		else {
			System.out.println(inp+" is not a armstrong number");
		}
	}
}
