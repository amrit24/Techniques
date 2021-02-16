package twoPointerTechniques;

import java.util.Scanner;

/*
 * Works for sorted array in ascending aorder
 * Given a sorted array A (sorted in ascending order), having N integers, 
 * find if there exists any pair of elements (A[i], A[j]) such that their sum is equal to X.
 */
public class PairSum {
	
	private static int pairSum(int[] arr, int val) {
		int n = arr.length;
		
		int i= 0; int j=n-1;
		
		while(i<j) {
			if(arr[i] + arr[j] == val) {
				return 1;
			}else if(arr[i] + arr[j] < val) {
				i++;
			}else {
				j--;
			}
		}
		
		return -1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter size of array:");

		int size = sc.nextInt();

		int[] arr = new int[size];

		System.out.println("Enter the array:");

		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
     
		System.out.println("Enter the sum:");

		int val = sc.nextInt();
		
		sc.close();
		
		int result = pairSum(arr, val);
		
		if(result == 1) System.out.println("Pair sum exists");
		else System.out.println("Pair sum doesn't exist");
	}
}







