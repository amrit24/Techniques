package twoPointerTechniques;

import java.util.Scanner;

/*
 * Given a sorted array and a number x, find a pair in array whose sum is closest to x.
 * Input: arr[] = {10, 22, 28, 29, 30, 40}, 
 *            x = 54
 * Output: 22 and 30
 */
public class ClosestPairI {

	private static void closestPair(int[] arr, int m, int x) {
      int l = 0, l_index = 0;
      int r = m-1, r_index = 0;
      
      int diff = Integer.MAX_VALUE;
      
      while(l<r) {
    	  
    	  if(Math.abs(arr[l] + arr[r] - x ) < diff) {
    		  diff = Math.abs(arr[l] + arr[r] - x );
    		  l_index = l;
    		  r_index = r;
    	  }
    	  
    	  if(arr[l] + arr[r] > x) {
    		  r--;
    	  }else {
    		  l++;
    	  }
      }
      
      System.out.println("The closest pair is "+arr[l_index]+ " and "+arr[r_index]);
      
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

		System.out.println("Enter the sum:");

		int x = sc.nextInt();

		sc.close();
		
		closestPair(arr, m, x);
	}
}
