public class Solution {


	public static ArrayList<Integer> rotateArray(ArrayList<Integer> arr, int k) {

        int n = arr.size();

        for(int i = 0; i<k; i++){



            int count = arr.get(0);


        for(int j = 0; j<n-1; j++){

            arr.set(j, arr.get(j+1));
        }



        arr.set(n-1, count);

        }



        return arr;

    }
}
