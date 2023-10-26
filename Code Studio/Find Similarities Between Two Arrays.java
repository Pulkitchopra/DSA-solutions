public class Solution {

	
	public static ArrayList<Integer> findSimilarity(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n, int m) {





		ArrayList<Integer> intersection = new ArrayList<>();
		ArrayList<Integer> union = new ArrayList<>();


		Collections.sort(arr1);
		
		Collections.sort(arr2);

		int i = 0;

		int j = 0;





		while(i < arr1.size() && j < arr2.size()){

			if(arr1.get(i) < arr2.get(j)){

				union.add(arr1.get(i));

				i++;
			}
			else if(arr1.get(i) > arr2.get(j)){

				union.add(arr2.get(j));

				j++;
			}








			else{

				intersection.add(arr1.get(i));
				union.add(arr1.get(i));
				i++;

				j++;
			}
		}


		while(i < arr1.size()){
			union.add(arr1.get(i));
			i++;
		}
		
		
		
		
		
		
		
		
		while(j < arr2.size()){


			union.add(arr2.get(j));
			j++;
		}


		ArrayList<Integer> ans = new ArrayList<>();


		ans.add(intersection.size());

		ans.add(union.size());

		return ans;


	}
}
