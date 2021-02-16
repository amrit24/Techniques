package prefixSumTechniques;

import java.util.Arrays;
import java.util.Scanner;

public class PrefixSum {

	public static int[] prefixSum(int[] arr, int len) {
		int[] prefixSum = new int[len];
		prefixSum[0] = arr[0];
		
		if(len==1) return prefixSum;

		for (int i = 1; i < len; i++) {
			prefixSum[i] = arr[i] + prefixSum[i - 1];
		}
		return prefixSum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter lenght of array");
		int len = sc.nextInt();
		int[] arr = new int[len];
		System.out.println("Enter array");

		for (int i = 0; i < len; i++) {
			arr[i] = sc.nextInt();
		}

		sc.close();

		System.out.print("Array is : ");
		System.out.println(Arrays.toString(arr));

		int[] prefixSum = prefixSum(arr, len);

		System.out.print("Prefix sum array is : ");

		System.out.println(Arrays.toString(prefixSum));

	}

}
