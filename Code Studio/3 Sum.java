import java.util.* ;
import java.io.*; 
public class Solution {

	public static ArrayList<ArrayList<Integer>> findTriplets(int[] arr, int n, int K)  {
		Arrays.sort(arr);

		ArrayList <ArrayList <Integer>> ans = new ArrayList<>();

		for(int i=0; i<arr.length; i++){



			for(int j=i+1; j<arr.length; j++){

				for(int m=j+1; m<arr.length;m++){

					if(arr[i] + arr[j] + arr[m] == K){

						ArrayList <Integer> list = new ArrayList<>();

						list.add(arr[i]);

						list.add(arr[j]);
						list.add(arr[m]);




						boolean isDuplicate = false;

						for(ArrayList<Integer>element: ans){
							if(ans.contains(list)){
								isDuplicate = true;
								break;
							}
						}
						if(!isDuplicate)

							ans.add(list);					
					}
					
				}
			}
		}
		return ans;
	}
}
