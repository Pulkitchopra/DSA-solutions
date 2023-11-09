public class Solution {
	static int findMinDiff(int n, int m, ArrayList<Integer> chocolates) {

		int min = Integer.MAX_VALUE;

		Collections.sort(chocolates);





		for(int i = 0; i+m-1 < n; i++){
			int difference = chocolates.get(i + m -1) - chocolates.get(i);


			if(difference < min){

				min = difference;
			}
		}
			return min;

	}
}
