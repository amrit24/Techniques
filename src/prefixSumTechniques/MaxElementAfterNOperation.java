package prefixSumTechniques;

import java.util.Arrays;

/* Problem Statement :
 * Consider an array of size n with all initial values as 0. 
 * Perform given ‘m’ add operations from index ‘a’ to ‘b’ and 
 * evaluate highest element in array. An add operation adds 100 
 * to all elements from a to b (both inclusive). 
 * Input : n = 5 // We consider array {0, 0, 0, 0, 0}
        m = 3.
        a = 2, b = 4.
        a = 1, b = 3.
        a = 1, b = 2.
 *  Output : 300
 *  
 *  Idea behind this : 
 *  What we did was adding 100 at ‘a’ because this will add 100 to all elements while taking prefix sum array. 
 *  Subtracting 100 from ‘b+1’ will reverse the changes made by adding 100 to elements from ‘b’ onward.
 */
public class MaxElementAfterNOperation {
	
	public static void main(String[] args) {
		int[] arr = new int[] {0, 0, 0, 0, 0};
		int[][] opr = {{2,4},{1,3},{1,2}};
		
		for(int i=0;i<3;i++) {
			int a = opr[i][0];
			int b = opr[i][1];
			
			//array index starts at 0 so a is a-1 & b+1 is b
			arr[a-1]+=100;
			arr[b]-=100;
		}
		
	 System.out.println("Array after 3 operation : "+Arrays.toString(arr));
	 
	 int[] prefix = PrefixSum.prefixSum(arr, arr.length);
	 System.out.println("Prefix sum array after 3 operation : "+Arrays.toString(prefix));

	 int max = Integer.MIN_VALUE;
	 for(int j=0;j<5;j++) {
		 max=Math.max(max, prefix[j]);
	 }
	 
	 System.out.println("Max after 3 operation : " +max);
	}

}
