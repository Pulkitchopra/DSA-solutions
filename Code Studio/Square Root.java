import java.util.* ;
import java.io.*; 

public class Solution {

	public static int sqrtN(long N) {

		long s = 0;
		
		long e = N;
		long mid = (s + e)/2;
		
		
		long ans = -1;
		
		while(s <= e) {

		long square = mid*mid;
			
			if( square == N) {
				
				return (int) mid;
			}
			if(square < N) {



				s = mid + 1;

				ans = mid;

			}

			else {
				e = mid - 1;
			}
			
			mid = (s + e)/2;
			
		}
		return (int) ans;
			

			
	}
}
