public class Solution {
	public static int firstCircularTour(int[] petrol, int[] distance, int n) {


		long deficit = 0;
		long balance = 0;




		int start = 0;
		
		for(int i = 0; i < n; i++){

			balance += petrol[i] - distance[i];

			if(balance < 0){

				deficit += balance;

				start = i + 1;
				balance = 0;
			}
		}


		if(deficit + balance >= 0){
			return start;
		}
		else{
			return -1;
		}
	
	}
}
