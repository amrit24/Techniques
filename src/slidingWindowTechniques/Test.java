package slidingWindowTechniques;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
   
	private static int maxSubArraySum(int[] arr, int window) {
		int windowSum = 0;
		int i;
		for(i=0;i<window;i++) {
			windowSum+=arr[i];
		}
		
		int max = windowSum;
		
		for(int k=i;k<arr.length;k++) {
			windowSum = windowSum + arr[k] - arr[k-i];
			max = Math.max(windowSum, max);
		}
		
		return max;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter length of array");
		int len = sc.nextInt();
		int[] arr = new int[len];
		System.out.println("Enter array");

		for (int i = 0; i < len; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter window size");
		
		int k = sc.nextInt();

		sc.close();

		System.out.print("Array is : ");
		System.out.println(Arrays.toString(arr));
		
		System.out.println("Maximum sum of window is : " + maxSubArraySum(arr, k));

	}
}
