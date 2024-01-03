public class Solution {
	public static ArrayList<Integer> findLeaders(ArrayList<Integer> elements, int n) {
		
		int max = elements.get(n-1);
		ArrayList <Integer> ans = new ArrayList<>();
		ans.add(elements.get(n-1));

		for(int i = n - 2; i >= 0; i--){
			if(elements.get(i) > max){
				ans.add(elements.get(i));
				max = elements.get(i);
			}
		}
		Collections.reverse(ans);
		return ans;
	}
}
