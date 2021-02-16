package prefixSumTechniques;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class ZeroSumSubArray {
	
	private static boolean zeroSumSubArrayExists(int[] arr) {
		HashSet<Integer> hs = new HashSet<Integer>();
		int sum = 0;
		
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
			
			if(sum==0 || arr[i]==0 || hs.contains(sum)) {
				return true;
			}
			
			hs.add(sum);
		}
		
		return false;
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

		sc.close();

		System.out.print("Array is : ");
		System.out.println(Arrays.toString(arr));
		
		System.out.println("Zero sum subarray exists : "+zeroSumSubArrayExists(arr));

	}

}
