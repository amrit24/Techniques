package prefixSumTechniques;

public class IthElementAfterOperations {
	
	public static void main(String[] args) {
		
		int[] arr = new int[10];
		
		 /* operation 1: increament arr[1] to arr[3] by 1*/
		 /* operation 1: increment arr[5][7] by 1 */
		 /* concept : increment arr[L] by 1 and decrement arr[r+1] by 1 */
		
		/* operation 1: increament arr[1] to arr[3] by 1
		 * [0,1,1,1,1,0,0,0,0,0]
		 * */
		arr[1]+=1;
		arr[4]-=1;
		
		/* operation 2: increament arr[5] to arr[7] by 1
		  * [0,1,1,1,0,0,0,0,0,0]
		 * */
		arr[5]+=1;
		arr[8]-=1;
		
		//4th element
		int res = 0;
		for (int i=0;i<4;i++) {
			res+=arr[i];
		}
		
		System.out.println(res);
	}

}
