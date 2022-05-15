package week1.day2;
import java.util.Arrays;
public class DuplicateArray {
	public static void main(String[] args) {
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		int a;
		int b;
		int flag =0;
		Arrays.sort(arr);
		int length = arr.length;
		for (int i = 0; i <=length-2; i++) {
			a=arr[i];
			b=arr[i+1];
			if (a==b) {
				System.out.println("repeated element = "+a);
				flag = flag + 1;
			}
		}
		System.out.println("Total number of element repeating = "+flag);
	}
}