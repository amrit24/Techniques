package twoPointerTechniques;

import java.util.Arrays;
import java.util.Scanner;

/*
 * Input : {5, 32, 1, 7, 10, 50, 19, 21, 2}
   Output : 21, 2, 19
            7, 2, 5

   
   Input : {5, 32, 1, 7, 10, 50, 19, 21, 0}
   Output : no such triplet exist
 */
public class TripletSum {
	private static void tripletSum(int[] arr) {
		boolean found = false;
		int n = arr.length;

		Arrays.sort(arr);
		
		for (int i = n-1; i>=0; i--) {
			int l = 0;
			int r = i-1;
			int x = arr[i];

			while (l < r) {

				if (arr[l] + arr[r] == x) {
					System.out.println("Found.Triplet is (" + x + ", " + arr[l] + ", " + arr[r] + ")");
					found = true;
					l++;
					r--;
				} else if (arr[l] + arr[r] < x) {
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
		tripletSum(arr);
	}
}
