public class Solution {
	public static ArrayList<Integer> countTheNumber(ArrayList<Integer> arr, int n, int k) {


		HashMap<Integer,Integer> map = new HashMap<>();




		ArrayList<Integer> ans = new ArrayList<>();
		
		int b = n/k;

		for(int num: arr){

			if(map.containsKey(num)){

				map.put(num, map.getOrDefault(num, 0) + 1);
			}
			else{
				map.put(num, 1);
			}
		}


		for(int key: map.keySet()){

			if(map.get(key) >= b){
				ans.add(key);
			}
		}

		return ans;
	}
}
