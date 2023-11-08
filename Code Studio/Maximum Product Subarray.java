public class Solution {
	public static int maximumProduct(ArrayList<Integer> arr, int n) {


		int min = arr.get(0);
		int max = arr.get(0);



		int ans = arr.get(0);

		for(int i = 1; i < n; i++){



			int temp = Math.max(arr.get(i), Math.max(max*arr.get(i), min*arr.get(i) ) );

			min = Math.min(arr.get(i), Math.min(max*arr.get(i), min*arr.get(i) ));

			max = temp;
			ans = Math.max(ans, max);
		}




		return ans;

	}
}
