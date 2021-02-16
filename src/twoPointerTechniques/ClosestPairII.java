package twoPointerTechniques;

import java.util.Scanner;

/*
 * Given two sorted arrays and a number x, find the pair whose sum is closest to x and the pair has an element from each array.
 * We are given two arrays ar1[0…m-1] and ar2[0..n-1] and a number x, 
 * we need to find the pair ar1[i] + ar2[j] such that absolute value of (arr1[i] + arr2[j] – x) is minimum.
 * Input:  arr1[] = {1, 4, 5, 7};
           arr2[] = {10, 20, 30, 40};
           x = 32      
   Output:  1 and 30
 */
public class ClosestPairII {
	
	private static void closestPairSum(int[] arr1, int[] arr2,int m, int n, int x) {
		int diff = Integer.MAX_VALUE;
		
		int l = 0; int r = n-1;
		
		int l_index = 0, r_index = 0;
		
		while(l<m && r>=0) {
			
			if(Math.abs(arr1[l] + arr2[r] - x) < diff) {
				l_index = l;
				r_index = r;
				
				diff = Math.abs(arr1[l] + arr2[r] - x);
			}
			
			if(arr1[l] + arr2[r] > x) {
				r--;
			}else {
				l++;
			}
		}
		
		System.out.println("The closest sum pair is :" +arr1[l_index]+ " and "+arr2[r_index]);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter size of array 1:");

		int m = sc.nextInt();

		int[] arr1 = new int[m];

		System.out.println("Enter array 1:");

		for (int i = 0; i < m; i++) {
			arr1[i] = sc.nextInt();
		}
		
		System.out.println("Enter size of array 2:");

		int n = sc.nextInt();

		int[] arr2 = new int[n];

		System.out.println("Enter array 2:");

		for (int i = 0; i < n; i++) {
			arr2[i] = sc.nextInt();
		}
     
		System.out.println("Enter the sum:");

		int x = sc.nextInt();
		
		sc.close();
		
		closestPairSum(arr1, arr2, m, n, x);
	}
}
