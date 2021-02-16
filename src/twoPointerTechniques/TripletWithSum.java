package twoPointerTechniques;

import java.util.Arrays;
import java.util.Scanner;

/*
 * Input: array = {12, 3, 4, 1, 6, 9}, sum = 24;
   Output: 12, 3, 9
   Explanation: There is a triplet (12, 3 and 9) present
                in the array whose sum is 24.
 */
public class TripletWithSum {
	private static void tripletWithSum(int[] arr, int sum) {
		boolean found = false;
		int n = arr.length;

		Arrays.sort(arr);
		
		for (int i = 0; i < n - 1; i++) {
			int l = i + 1;
			int r = n - 1;
			int x = arr[i];

			while (l < r) {

				if (x + arr[l] + arr[r] == sum) {
					System.out.println("Found.Triplet is (" + x + ", " + arr[l] + ", " + arr[r] + ")");
					found = true;
					l++;
					r--;
				} else if (x + arr[l] + arr[r] < sum) {
					l++;
				} else {
					r--;
				}
			}
		}

		if (found == false)
			System.out.println("Not found");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter size of array:");

		int m = sc.nextInt();

		int[] arr = new int[m];

		System.out.println("Enter array:");

		for (int i = 0; i < m; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter the sum : ");
		int sum = sc.nextInt();

		sc.close();
        System.out.println("Checking triplet sum = 0 in array:"+Arrays.toString(arr));
        tripletWithSum(arr, sum);
	}
}
