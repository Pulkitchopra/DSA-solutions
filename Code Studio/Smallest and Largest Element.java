public class Solution {
	public static ArrayList<Integer> kthSmallLarge(ArrayList<Integer> arr, int n, int k) {

		ArrayList<Integer> ans = new ArrayList();

		Collections.sort(arr);



		ans.add(arr.get(k-1));
		ans.add(arr.get(n-k));


		return ans;



	}
}
