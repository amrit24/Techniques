package prefixSumTechniques;

import java.util.Arrays;
import java.util.Scanner;

public class EquilibriumIndex {

	private static int equilibriumIndex(int[] arr) {
		//Array is : [0, 1, -2, 1, 1]
		int[] prefixSum = PrefixSum.prefixSum(arr, arr.length);
		int leftSum = 0;
		int sum = prefixSum[arr.length - 1];

		for (int i = 0; i < arr.length; i++) {
			sum-=arr[i];
			if (leftSum == sum) {
				return i;
			}
			leftSum+=arr[i];

		}

		return -1;
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

		int index = equilibriumIndex(arr);

		if (index >= 0) {
			System.out.println("Equilibrium index is " + index);

		} else {
			System.out.println("No equilibrium index");
		}
	}
}
