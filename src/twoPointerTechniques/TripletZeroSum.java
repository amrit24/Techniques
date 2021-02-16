package twoPointerTechniques;

import java.util.Arrays;
import java.util.Scanner;

/*
 * Input : arr[] = {0, -1, 2, -3, 1}
   Output : (0 -1 1), (2 -3 1)

   Explanation : The triplets with zero sum are
                 0 + -1 + 1 = 0 and 2 + -3 + 1 = 0 
 */
public class TripletZeroSum {

	private static void tripletZeroSum(int[] arr) {
		boolean found = false;
		int n = arr.length;

		Arrays.sort(arr);
		
		for (int i = 0; i < n - 1; i++) {
			int l = i + 1;
			int r = n - 1;
			int x = arr[i];

			while (l < r) {

				if (x + arr[l] + arr[r] == 0) {
					System.out.println("Found.Triplet is (" + x + ", " + arr[l] + ", " + arr[r] + ")");
					found = true;
					l++;
					r--;
				} else if (x + arr[l] + arr[r] < 0) {
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

		sc.close();
        System.out.println("Checking triplet sum = 0 in array:"+Arrays.toString(arr));
		tripletZeroSum(arr);
	}
}
