public class Solution {
	public static int[] firstNegative(int[] arr, int n, int k) {


		Queue<Integer> q = new LinkedList<>();

		int ans[] = new int[n -k + 1];
		int index = 0;	
		
		
		
		
		for(int i = 0; i < k; i++){
			if(arr[i] < 0){
				q.add(i);

			}
		}
		if(q.size() > 0){

			ans[index++] = arr[q.peek()];
		}
		else{
			ans[index++] = 0;
		}



		for(int i = k; i < n; i++){

			if(!q.isEmpty() && i - q.peek() >= k){

				q.poll();
			}
			if(arr[i] < 0){
				
				q.add(i);
			}
			if(q.size() > 0){

				ans[index++] = arr[q.peek()];	
			}








			else{

				ans[index++] = 0;
			}
		}

		return ans;

	}
}
