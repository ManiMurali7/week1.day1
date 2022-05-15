package week1.day2;
import java.util.Arrays;
public class SecondLargest {
	public static void main(String[] args) {
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		Arrays.sort(arr);
		int length = arr.length;
		System.out.println(arr[length-2]);
	}
}
