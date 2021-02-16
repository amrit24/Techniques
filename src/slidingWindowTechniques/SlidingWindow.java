package slidingWindowTechniques;

import java.util.Arrays;
import java.util.Scanner;

public class SlidingWindow {
	
	private static int windowSum(int[] arr, int k) {
		
		if(k>arr.length) return -1;
		int windowSum = 0;
		
		for(int i=0;i<k;i++) {
			windowSum+=arr[i];
		}
		
		int max = windowSum;
		
		for(int j=k;j<arr.length;j++) {
			windowSum = windowSum + arr[j] - arr[j-k];
			max = Math.max(max, windowSum);
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
		
		System.out.println("Maximum sum of window is : " + windowSum(arr, k));

	}

}
