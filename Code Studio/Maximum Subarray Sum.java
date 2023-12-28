import java.util.* ;
import java.io.*; 

public class Solution {
	
	public static long maxSubarraySum(int[] arr, int n) {
		

		long sum = 0;
		long maxi = arr[0];
		for(int i = 0; i < n; i++){
			sum = sum + nums[i];
			maxi = Math.max(maxi, sum);
			if(sum < 0){
				sum = 0;
			}
		}
		return maxi;
	}

}
