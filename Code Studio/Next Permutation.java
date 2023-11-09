public class Solution {

	public static void reverse(ArrayList<Integer> permutation, int i, int j){





		if(i>=j){
			return;
		}

		int temp = permutation.get(i);

		permutation.set(i, permutation.get(j));

		permutation.set(j, temp);

		i++;
		j--;


		reverse(permutation, i, j);

	}

	public static ArrayList<Integer> nextPermutation(ArrayList<Integer> permutation) {

		int index = -1;

		int n = permutation.size();

		for(int i = n-1; i > 0; i--){

			if(permutation.get(i) > permutation.get(i-1)){
				index = i-1;
				break;
			}
		}

		if(index == -1){

			reverse(permutation, 0, n-1);
			return permutation;


		}

		for(int i = n-1; i >= index; i--){

			if(permutation.get(i) > permutation.get(index)){

				int swap = permutation.get(i);

				permutation.set(i, permutation.get(index));
				permutation.set(index, swap);

				break;
			}
		}
		reverse(permutation, index + 1, n - 1);

		return permutation;
	}
}
